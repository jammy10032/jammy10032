ch_springmvc_hello:第一个springmvc项目
需求：用户在页面发起一个请求，请求交给springmvc的控制器对象，并显示处理结果
实现步骤：新建web maven工程
                    加入 spring-webmvc的jar包
                    加入jsp，servlet 的jar包

springmvc请求流程
（1）发起some.do-
（2）tomcat(读取web.xml-------url-patten知道*.do请求是给DispatcherServlet)

         DispatcherServlet接收some.do请求，把请求转交给处理器映射器
         处理器映射器：springmvc框架中的一种对象，（实现了HandlerMapping的都叫做映射器）
         映射器对象作用：根据请求，从springmvc容器中获取处理器对象（controller对象）
                                        把找到的处理器对象放到一个叫处理器执行链（HandlerExecutionChain）的类保存
         HandlerExecutionChain:类中保存了handler和拦截器对象
（3）DispatcherServlet(读取springmvc.xml知道 some.do----------doSome())

          把HandlerExecutionChain中的处理器对象交给了处理器适配器对象
          处理器适配器：springmvc的一个对象，需要实现    HandlerAdapter
          作用：执行处理器方法（调用MyController的doSome（）得到ModelAndView，返回给DispatcherServlet）

 （4）转发给Mycontroller的doSome方法

          DispatcherServlet把3中获取的ModelAndView交给视图解析器对象
          视图解析器：springmvc的对象，需要实现VIewResoler接口
          作用：组成视图的完整路径 ，使用前缀,后缀，并创建view对象

          InternalResourceView:视图类，表示jsp文件由视图解析器创建。
          这个对象里面，有一个属性：url=/WEB-INF/view/show.jsp

 （5）框架执行 doSome，把得到的ModelAndView进行处理，转发到show.jsp