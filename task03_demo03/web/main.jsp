<%@ page import="cn.com.libery.model.User" %><%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/10
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<h1>登录成功，欢迎<%= ((User)session.getAttribute("user")).getUserName()  %>！</h1>
</body>
</html>
