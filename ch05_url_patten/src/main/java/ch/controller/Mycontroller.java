package ch.controller;

import ch.vo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jammy
 * @date 2021/6/21-15:57
 *
 * @requestmapping
 * value 所有请求地址的公共部分
 * 位置：放在类的上面
 */
@Controller

public class Mycontroller {
    /*
    框架获取请求参数
         1)
           String myname=request.gerParameter("name");
           String myage=request.gerParameter("age");
        2)
        框架通过DispatcherServlet调用myController的doOther(name,age)
        框架提供自动类型转换
        3）
        处理流程：
        调用框架的ArrayList<HttpMessageConveter>中每个类的write（）方法，
        检查哪个HttpMessageConveter的实现类能处理String类型的数据-StringHttpMessageConveter

        调用那个类的write（），把字符按照指定编码处理

        调用@ResponseBody把结果输出到浏览器，ajax请求处理完成

     */

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name,Integer age){
        System.out.println("doSome name:"+name+"age:"+age);
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");


        return  mv;

    }

}
