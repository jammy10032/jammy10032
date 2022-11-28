ch09：异常处理

异常处理：
springmvc采用的是统一，全局的异常处理
把controller中的所有异常都集中到一个地方，采用的是aop思想
使用注解
1 @ExceptionHandler
2@ControllerAdvice

步骤：
1 新建 maven web项目
2 加入依赖
3 新建一个自定义异常类MyUserException,在定义它的子类NameException，AgeException
4 在controller抛出NameException，AgeException
5 创建一个普通类，作用全局异常处理类
  1）在类的上面加入@ControllerAdvice
  2）在类中定义方法，方法的上面加入@ExceptionHandler
6 创建异常处理界面
7 创建springmvc的配置文件
  1）组建扫描器，扫描@Controller注解
  2）组件扫描器，扫描@ControllerAdvice所在的包名9
  3）扫描注解驱动


























