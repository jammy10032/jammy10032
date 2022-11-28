ch05    :研究中央调度器的url-patten设置为“/"

  default作用：
    1 处理静态资源
    2 处理未映射到其他servlet的请求

发起的请求是哪些服务器程序处理的

http://localhost:8080/ch05_url_patten/index.jsp:   tomcat(jsp会转为servlet)
http://localhost:8080/ch05_url_patten/js/jquery-3.6.0.js：tomcat
http://localhost:8080/ch05_url_patten/images/cat.jpg：  tomcat
http://localhost:8080/ch05_url_patten/html/test.html :tomcat

http://localhost:8080/ch05_url_patten/some.do  ：（DispacherServlet)



<servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
            <param-value>0</param-value>
        </init-param>
        <init-param>
            <param-name>listings</param-name>
            <param-value>false</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <!-- 第二种处理静态资源的方式
             框架会创建ResourceHttpRequestHandler对象，
             这个对象处理静态资源的访问不依赖Tomcat

            属性
                   mapping:访问静态资源的uri地址，使用通配符**

                   location静态资源在项目中的目录位置


     -->
        <mvc:resources mapping="/images/**" location="/images/"/>
        <mvc:resources mapping="/html/**" location="/html/"/>
        <mvc:resources mapping="/js/**" location="/js/"/>


