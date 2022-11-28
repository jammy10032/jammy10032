package ch.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jammy
 * @date 2021/7/9-16:35
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
//验证登录的用户信息
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("11111111拦截器的preHandle()");
        String loginName="";
        Object obj = request.getSession().getAttribute("name");
        if(obj!=null){
            loginName=(String)obj;

        }
        if(!"QQ".equals(loginName)){
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;

        }
        return true;
    }


}
