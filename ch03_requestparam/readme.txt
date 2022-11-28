ch03:接收请求的参数
使用处理器方法的形参
httpServletRequest
HttpServletResponce
HttpSession
用户提交的数据

 用户提交的数据
 1 逐个接受
 要求：请求处理的参数名和 处理器方法的参数名一样
 2 对象接收


 使用框架提供的过滤器解决post请求的乱码问题CharacterEncodingFilter

需求：用户在页面发起一个请求，请求交给springmvc的控制器对象，并显示处理结果
实现步骤：新建web maven工程
                    加入 spring-webmvc的jar包
                    加入jsp，servlet 的jar包

springmvc请求流程
（1）发起some.do-
（2）tomcat(读取web.xml-------url-patten知道*.do请求是给DispatcherServvlet)
（3）DispatcherServlet(读取springmvc.xml知道 some.do----------doSome())
 （4）转发给Mycontroller的doSome方法
 （5）框架执行 doSome，到的ModelAndView进行处理，转发到show.jsp