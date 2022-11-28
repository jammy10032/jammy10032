ch06：解决jsp路径问题：“/"用还是不用

没有“/"  表示当前页面的地址

有"/" 表示当前地址是服务器的的地址：....localhost:8080
一般要在资源的前面加上：${pageContext.request.contextPath}/...
