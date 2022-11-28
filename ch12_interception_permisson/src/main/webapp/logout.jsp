<%--
  Created by IntelliJ IDEA.
  User: Jammy
  Date: 2021/7/9
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ;charset=UTF-8">
    <title>Title</title>
</head>
<body>
    模拟退出，QQ退出系统
    <%
        session.removeAttribute("name");
    %>

</body>
</html>
