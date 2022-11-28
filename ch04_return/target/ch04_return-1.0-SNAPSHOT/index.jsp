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
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function(){
            $("button").click(function(){
              $.ajax({
                  // url:"returnStringData.do",//对应servlet（Controller）的地址----------①
                  // url:"returnVoid-ajax.do", //-------------------------------------------------------------②
                  // url:"returnStudentJson.do",//-----------------------------------------------------------③
                  url:"returnStudentJsonList.do",//--------------------------------------------------------④

                  data:{//发送给服务器的数据
                      name:"AAAA",
                      age:11
                  },
                  type:"post",
                  dataType:"text",
                  //resp从服务端返回的是String格式的数据，由Controller方法提供该String数据----①
                  //resp从服务端返回的是json格式的字符串{"name":"AAAA","age":11}-----②
                  //resp从服务端返回的是json格式的字符串{"name":"BBBBB","age":200}-----③
                  ////[{"name":"aaaaaaaaaaaa","age":111},{"name":"BBBBB","age":200}]----④
                  //jQuery会把字符串转化为json对象，赋值给json形参
                  success(resp){
                      // alert(resp.name+"       "+resp.age);
                      // $.each(resp,function(i,n){
                      //     alert(n.name+"        "+n.age)
                      alert("返回的数据是："+resp);
                      // })
                  }
              })
            })
        })
    </script>
</head>
<body>
    <p>处理器方法返回String表示视图名称</p>
    <br/>
    <form  action="returnString-view.do" method="get">
        用户名：
        <input type="text" name="name"/>
        年龄
        <input type="text" name="age"/>
        <input type="submit" value="submit"/>
    </form>
    <br/>
    <button id="btn">发起ajax请求</button>
</body>
</html>
