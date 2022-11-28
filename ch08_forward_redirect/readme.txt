ch08：转发和重定向


解决jsp路径问题：“/"用还是不用

没有“/"  表示当前页面的地址

有"/" 表示当前地址是服务器的的地址：....localhost:8080
一般要在资源的前面加上：${pageContext.request.contextPath}/...

forward：转发：mv.setViewName("forward:/WEB-INF/view/show.jsp");
redirect：重定向:mv.setViewName("redirect:/show.jsp");

都是关键字，共同特点是不和视图解析器一同工作

jsp界面乱码问题处理
1 在web.xml文件配置filter，这样response和request的编码方式都是utf-8
2 在tomcat的serve.xml文件中添加URIEncoding="utf-8"
3 在index界面的第一行写上<%@page contentType="text/html; charset=UTF-8" language="java" %>


异常处理：
springmvc采用的是统一，全局的异常处理
把controller中的所有异常都集中到一个地方，采用的是aop思想
使用注解
1 @ExceptionHandler
2@ControllerAdvice























