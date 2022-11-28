<%--
  Created by IntelliJ IDEA.
  User: Jammy
  Date: 2021/6/21
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>url-patten</title>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <meta http-equiv="Content-Type" content="text/html" ;charset=UTF-8">
</head>
<body>
    <p>处理器方法返回String表示视图名称</p>
    <br/>
    <form  action="some.do" method="get">
        用户名：
        <input type="text" name="name"/>
        年龄
        <input type="text" name="age"/>
        <input type="submit" value="submit"/>
    </form>
    <br/>
    <img src="images/cat.jpg" alt="我是一个静态资源，不可显示">
</body>
</html>
