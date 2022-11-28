ch11:多个拦截器

11111111拦截器的preHandle()
2222222拦截器的preHandle()
controller========doSome
2222222拦截器的postHandle()
11111111拦截器的postHandle()
2222222拦截器的afterCompletion()
11111111拦截器的afterCompletion()


拦截器和过滤器的区别
1 过滤器是servlet对象，拦截器是框架的对象
2 过滤实现filter接口，拦截器实现HandlerInterceptor接口
3过滤器是用来设置request和response参数的，属性的，侧重对属性进行过滤
  拦截器是用来验证请求的，能截断请求
4 过滤器是在拦截器之前执行的
5 过滤器是tomcat中创建的，拦截器是springmvc容器创建的对象
6过滤器有1个执行时间点，拦截器有3个
7过滤器可以处理jsp，js，html等等
  拦截器是侧重拦截对controller对象如果请求不能能被DispatcherServlet接收，这个请求就不会执行拦截器的内容
8 拦截器拦截普通类方法执行，过滤器过滤servlet响应

























