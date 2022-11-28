package ch.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author Jammy
 * @date 2021/7/9-16:35
 */
public class MyInterceptor implements HandlerInterceptor {
    private long btime=0;

    @Override
    /**
     * 预处理方法:是整个方法的入口
     * Object handler:被拦截的控制器对象
     *
     * 返回boolean
     * true：
     *拦截器的preHandle()
     * controller========doSome
     * 拦截器的postHandle()
     * 拦截器的afterCompletion()
     * false：
     * 拦截器的preHandle()
     * 在控制器方法执行之前执行的：doSome()
     * 用户的请求先到达此方法
     * 2 在这个方法中可以获取请求信息，验证请求是否合法
     *   可以验证用户是否登录，验证用户是否有权限访问某个链接地址
     *   如果验证失败，可以截断请求，请求不能被处理
     *   如果验证成功，则放行请求，此时控制器方法才能执行
     *
     *
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        btime=System.currentTimeMillis();
        System.out.println("拦截器的preHandle()");
//        给浏览器返回一个结果
//        request.getRequestDispatcher("/tips.jsp").forward(request,response);
        return true;
    }

    @Override
    /**
     * ModelAndView modelAndView：处理器方法的返回值
     * 1 控制器方法执行后才执行
     * 2 能够获取到处理器方法的返回值，可以修改ModelAndView中的数据和视图，
     *   可以影响到最后的而执行结果
     * 3 主要是对原来的结果进行二次修正
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器的postHandle()");

        if(modelAndView!=null){
            modelAndView.addObject("myDate",new Date());
            modelAndView.setViewName("other");
        }

    }

    /**
     *
     * @param request
     * @param response
     * @param handler
     * @param ex:程序中发生的异常
     * @throws Exception
     *
     * 特点：
     * 1 请求处理之后完成的，，框架中规定的是当对视图执行了forward之后，就认为请求处理完成
     * 2一般做资源回收工作的，程序请求过程中创建了一些对象，在这里可以喊出，把占用的内存收回
     */

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器的afterCompletion()");
        long etime=System.currentTimeMillis();
        System.out.println("计算的时间为"+(etime-btime));
    }
}
