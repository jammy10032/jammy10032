package ch.controller;

import ch.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/returnString-view.do")
    public String doReturnString(String name,Integer age){
        System.out.println("doReturnString name:"+name+"age:"+age);

        return "show";

    }

    /**
     *
     * @param response 提供返回的对象，封装的返回的参数信息，作为ajax的success（这里的参数）
     * @param name 接收由ajax提提供的参数：data{name，age}
     * @param age
     * @throws IOException
     */
    @RequestMapping(value = "/returnVoid-ajax.do")
    public void doReturnVoid(HttpServletResponse response, String name, Integer age) throws IOException {
        System.out.println("doReturnVoid name:"+name+"age:"+age);

        //
        Student stu=new Student();
        stu.setName(name);
        stu.setAge(age);

        String json = "";
        if(stu!=null){
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(stu);
            System.out.println("stu转换的json—————"+json);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();



    }

    /**
     * 接受了由ajax发送过来的data数据后，在controller端重新赋值
     * 返回给ajax的参数就是重新赋值过后的
     * 这里也没有提供返回的响应对象
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/returnStudentJson.do")
    @ResponseBody
    public Student doStudentJson( String name, Integer age)  {

        Student stu=new Student();

        stu.setAge(200);
        stu.setName("BBBBB");
        return stu;//会被框架转换为json

    }
    @RequestMapping(value = "/returnStudentJsonList.do")
    @ResponseBody
    public List<Student> doStudentJsonList(String name, Integer age)  {

        List<Student> list=new ArrayList<>();
        Student stu=new Student();
        stu.setName("aaaaaaaaaaaa");
        stu.setAge(111);
        list.add(stu);

        stu=new Student();
        stu.setAge(200);
        stu.setName("BBBBB");
        list.add(stu);
        return list;
//[{"name":"aaaaaaaaaaaa","age":111},{"name":"BBBBB","age":200}]
    }

    /*
    处理器返回的结果是String，表示是数据
    区分返回值是数据还是视图，看有无@ResponseBody注解
    有：返回String就是数据 ，没有就是视图

    解决乱码
          属性：produce
     */
    @RequestMapping(value = "/returnStringData.do",produces = "text/plain;charset=utf-8")

    public @ResponseBody String doStringData(String name,Integer age) {

        return "这里是doStringData返回对象，表示数据";


    }

}
