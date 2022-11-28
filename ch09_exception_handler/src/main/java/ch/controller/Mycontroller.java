package ch.controller;

import ch.exception.AgeException;
import ch.exception.MyUserException;
import ch.exception.NameException;
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

    @RequestMapping(value = "/some.do",method= RequestMethod.POST)
    public ModelAndView doSome(String name,Integer age)throws MyUserException {

        ModelAndView mv=new ModelAndView();//创建返回值


//        根据参数抛出异常
        if(!"AAA".equals(name)){
            throw new NameException("姓名不正确！");
        }
        if(age==null||age>100){
            throw new AgeException();
        }
        mv.addObject("myName",name);
        mv.addObject("myAge",age);

        mv.setViewName("show");
        return  mv;

    }


}
