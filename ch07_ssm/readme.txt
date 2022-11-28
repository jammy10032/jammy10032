ch07:ssm框架整合


步骤
1 创建springdb的数据库，表使用student
2 加入依赖：spring springmvc mybatis jackson mysql druid jsp servlet
3 写web，xml
    1）注册DispatcherServlet,目的：创建springmvc容器，才能创建controller对象
                                                                   创建的是servlet，才能接受用户请求
    2）注册spring的监听器，ContextLoaderListener,目的：创建spring容器对象，才能创建service，dao对象

    3）注册字符集的过滤器，解决post的乱码问题

4 创建包controller service dao bean

5 写spring springmvc mybatis的配置文件
    4)数据库配置属性文件



SpringMVC:视图层，界面层，负责接收请求，显示出理结果
spring：业务层，管理service，dao，工具类对象的
mybatis：持久层，访问数据库的

用户发起请求--SpringMVC接收--spring中的Service对象--MyBatis处理数据

1 第一个容器：springmvc容器，才能创建controller对象
2 第二个容器：管理service，dao，工具类对象的
    把使用的对象交给适合多的容器：把controller还有web开发的相关对象交给springmvc容器，
                                                              这些web用的对象卸载springmvc的配置文件中

                                                              service ，dao随想定义在spring配置文件中

    springmvc是spring的子容器，类似java中的继承，子可以访问父的内容




