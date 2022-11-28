package ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jammy
 * @date 2021/6/21-15:57
 */
@Controller
public class Mycontroller {
    //处理用户请求

    /**
     * dosome处理some.do请求
     * @RequestMapping:请求映射，作用是把一个请求地址和一个方法绑在一起
     *                                       一个请求指定一个方法处理
     *                        属性1：value String表示请求的url地址（some.do），必须唯一
     * @return
     *               ModelAndView：表示本次请求 的处理结果
     *                             Model:数据，请求处理完成后，要显示给用户的数据
     *                             View：视图，如jsp等
     *
     */
    @RequestMapping(value = "/some.do")
//    把一个方法和一个请求地址绑在一起
    //表示如果请求地址中有some.do的，都是由doSome方法来处理
    public ModelAndView doSome(){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("msg","这里是springmvc");
        mv.addObject("fun","这里是springmvc的doSome方法");
        //指定视图，指定视图的完整路径
        //相当于request.getRequestDispatcher("/show.jsp").forword(...)
//        mv.setViewName("/show.jsp");
//        mv.setViewName("/WEB-INF/view/show.jsp");
//前缀+逻辑名称+后缀
        mv.setViewName("show");
        return mv;

    }
}
