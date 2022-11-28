<%@page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
<%--    <meta http-equiv="Content-Type" content="text/html" ;charset=utf-8">--%>
    <title>Title</title>
</head>
<body>
    <p>当出来方法返回ModelAndView实现forward</p>
    <form  action="test/forward.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>

        <input type="submit" value="提交请求"/>
    </form>
    <p>当出来方法返回ModelAndView实现redirect</p>
    <form  action="test/redirect.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>

        <input type="submit" value="提交请求"/>
    </form>

<%--    <p><a href="test/first.do">发起first.do请求</a></p>--%>
</body>
</html>
