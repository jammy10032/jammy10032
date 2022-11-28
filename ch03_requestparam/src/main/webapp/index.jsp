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
    <meta http-equiv="Content-Type" content="text/html" ;charset=UTF-8">
    <title>Title</title>
</head>
<body>
    <p>发起用户提交的数据</p>
    <br/>
    <form  action="recieveparam.do" method="get">
        用户名：
        <input type="text" name="name"/>
        年龄
        <input type="text" name="age"/>
        <input type="submit" value="submit"/>
    </form>
    <p>请求参数和处理器参数名不一致</p>
    <br/>
    <form  action="recieveparameter.do" method="post">
        用户名：
        <input type="text" name="qname"/>
        年龄
        <input type="text" name="qage"/>
        <input type="submit" value="submit"/>
    </form>
    <p>对象接收参数</p>
    <br/>
    <form  action="recieveObject.do" method="post">
        用户名：
        <input type="text" name="name"/>
        年龄
        <input type="text" name="age"/>
        <input type="submit" value="submit"/>
    </form>

<%--    <p><a href="test/first.do">发起first.do请求</a></p>--%>
</body>
</html>
