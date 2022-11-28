ch10:拦截器：看作是多个controller的共用功能，集中到拦截器统一处理，使用aop思想

步骤：
1 新建 maven web项目
2 加入依赖
3 创建Controller类
4 创建一个普通类，作为拦截器
  1）实现HandlerInterface接口
  2)实现接口的3个方法
5 创建show.jsp
6创建springmvc的配置文件
  1）组建扫描器，扫描@Controller注解
  2）声明拦截器，并指定拦截器的uri地址

  拦截器：拦截请求，做请求判断处理。需要实现HandlerInterface接口
                  常用在：用户登录处理，权限检查，记录日志

                  使用步骤：
                   1）定义类实现HandlerInterface接口
                   2) 在springmvc文件中，声明拦截器

                   拦截器的执行时间
                    1）在请求处理之前，也就是controller类中的方法 执行之前被拦截
                    2）在控制器方法执行之后也会执行拦截器
                    3）请求处理完成后也会执行拦截器
  过滤器：拦截请求参数































