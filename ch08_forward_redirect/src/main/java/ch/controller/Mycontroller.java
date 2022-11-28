package ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jammy
 * @date 2021/6/21-15:57
 *
 * @requestmapping
 * value 所有请求地址的公共部分
 * 位置：放在类的上面
 */
@Controller
@RequestMapping("/test")//以表示这个controller的功能是属于哪个部分的，可加可不加
public class Mycontroller {
    /*
    requestmapping
    属性：method：指定请求方式
     */

    @RequestMapping(value = "/forward.do",method= RequestMethod.POST)

    /**
     * 处理器方法返回ModelAndView，实现转发forward
     * 语法：setViewName（"forward:视图文件完整路径"）
     * forward：不和视图解析器一同使用，就当项目中没有视图解析器
     */
    public ModelAndView doForward(){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("msg","这里是springmvc");
        mv.addObject("fun","这里是springmvc的doSome方法");

        mv.setViewName("forward:/WEB-INF/view/show.jsp");
        return  mv;

    }

    /**
     * 框架对重定向的操作：
     * 1框架会把model的简单类型的数据，转为String，作为show.jsp的get请求的参数
     * 目的是在redirect.do和show.jsp之间可以传递参数
     *
     * 2 在目标show.jsp页面可以使用参数集合对象${param.}获取请求参数
     *
     * 3 不能访问WEB-INF目录
     * @return
     */
    @RequestMapping(value = "/redirect.do",method= RequestMethod.POST)
    //表示如果请求地址中有some.do的，都是由doSome方法来处理
    public ModelAndView doRedirect(){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("msg","这里是springmvc");
        mv.addObject("fun","这里是springmvc的doOther方法");

        mv.setViewName("redirect:/show.jsp");
        return mv;

    }
    @RequestMapping(value = "/first.do")
    //表示如果请求地址中有some.do的，都是由doSome方法来处理
    public ModelAndView doFirst(){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("msg","这里是springmvc");
        mv.addObject("fun","这里是springmvc的doFirst方法");

        mv.setViewName("first");
        return mv;

    }
}
