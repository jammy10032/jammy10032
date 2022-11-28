package ch.handler;

import ch.exception.AgeException;
import ch.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jammy
 * @date 2021/7/9-14:14
 */
@ControllerAdvice
//控制器增强：给控制器增强功能----异常处理的功能
//位置：在类的上面
//在springmvc的配置文件中声明组件扫描器，指定@ControllerAdvice所在的包名
public class GlobalExceptionHandler {

//    定义方法：处理发生的异常，（和控制器的方法一样）

    /*
    形参 ：表示controller抛出的异常，通过形参获取异常信息

    @ExceptionHandler(异常的class)：表示异常的类型，表示当此类发生异常时，由当前方法来处理

     */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception e){
//        处理NameException的异常
        /**
         * 异常处理：
         * 把异常记录下来，记录到数据库，日志文件
         * 记录日志发生的时间，那个方法发生的，异常错误内容
         * 发送通知，把异常的信息通过邮件，短信，微信发给相关人员
         * 给用户友好提示
         */
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","姓名必须是AAA");
        mv.addObject("exception",e);

        mv.setViewName("nameError");
        return mv;

    }
    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception e){
//        处理NameException的异常
        /**
         * 异常处理：
         * 把异常记录下来，记录到数据库，日志文件
         * 记录日志发生的时间，那个方法发生的，异常错误内容
         * 发送通知，把异常的信息通过邮件，短信，微信发给相关人员
         * 给用户友好提示
         */
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","年龄不能这么大");
        mv.addObject("exception",e);

        mv.setViewName("ageError");
        return mv;

    }
    @ExceptionHandler
//    处理其它异常，只能有一个
    public ModelAndView doOtherException(Exception e){

        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","这是其它异常");
        mv.addObject("exception",e);

        mv.setViewName("defaultError");
        return mv;

    }


}
