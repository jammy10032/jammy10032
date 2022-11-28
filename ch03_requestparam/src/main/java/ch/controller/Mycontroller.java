package ch.controller;

import ch.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

public class Mycontroller {
    /*
    框架获取请求参数
         1)
           String myname=request.gerParameter("name");
           String myage=request.gerParameter("age");
        2)
        框架通过DispatcherServlet调用myController的doOther(name,age)
        框架提供自动类型转换

     */
//请求参数和处理器方法形参一样
    @RequestMapping(value = "/recieveparam.do")
    //表示如果请求地址中有recieveparam.do的，都是由doOther方法来处理
    public ModelAndView doOther(String name,int age){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("myname",name);
//        相当于myname=name;
        mv.addObject("myage",age);

        mv.setViewName("show");
        return mv;

    }
    /*
    @RequestParam:用在逐个接受参数的请求
    解决请求参数名和处理器形参名不一致
    位置：形参前
    属性：value ：请求中传入参数的名称
                 required：表示请求中是否必须有参数
                                    true：必须有参数，请求中不传入参数的话就会 报404
                                    false：可以没有参数，没有参数的话，默认值是null
     */
    @RequestMapping(value = "/recieveparameter.do")
    //表示如果请求地址中有some.do的，都是由doSome方法来处理
    public ModelAndView doRecieveparameter(@RequestParam(value = "qname",required = false) String name,
                                                                                            @RequestParam(value = "qage",required = false)  Integer age){

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("myname",name);
        mv.addObject("myage",age);

        mv.setViewName("show");
        return mv;

    }
    @RequestMapping(value = "/recieveObject.do")
    /*
    类似于set注入
     */
    public ModelAndView doRecieveObject(Student stu){
        System.out.println("recieveStudent name:"+stu.getName()+"age"+stu.getAge());

        ModelAndView mv=new ModelAndView();//创建返回值
        //添加数据,相当于request.setAttribute("msg","这里是springmvc")
        mv.addObject("myname",stu.getName());
        mv.addObject("myage",stu.getAge());
        mv.addObject("myStudent",stu);

        mv.setViewName("show");
        return mv;

    }

}
