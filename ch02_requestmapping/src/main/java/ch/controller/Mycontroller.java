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

    @RequestMapping(value = "/some.do",method= RequestMethod.GET)
    //表示如果请求地址中有some.do的，都是由doSome方法来处理
    public ModelAndView doSome(){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("msg","这里是springmvc");
        mv.addObject("fun","这里是springmvc的doSome方法");

        mv.setViewName("show");
        return mv;

    }
    @RequestMapping(value = "/other.do",method= RequestMethod.POST)
    //表示如果请求地址中有some.do的，都是由doSome方法来处理
    public ModelAndView doOther(){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("msg","这里是springmvc");
        mv.addObject("fun","这里是springmvc的doOther方法");

        mv.setViewName("other");
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
