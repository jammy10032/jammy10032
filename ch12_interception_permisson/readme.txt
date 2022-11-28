ch12:拦截器检查登录的用户是不是能访问系统

步骤：
1 新建maven
2 修改web.xml的中央调度器
3 新建index.jsp发起请求
4 创建Mycontroller处理请求
5 创建结果show.jsp
6 创建login.jsp，模拟登陆（把用户信息放进session中）
   创建logout,jsp,模拟退出系统（从sessionHOngKong删除数据）
7 创建拦截器，从session对象中获取用户登录的数据，验证是否能访问系统
8创建一个验证的jsp，如果验证视图，给出提示
9 创建springmvc文件
    声明扫描器
    声明拦截器





