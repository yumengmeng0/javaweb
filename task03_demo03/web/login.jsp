<%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/10
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="login" method="post">
    用户名：<input type="text" name="userName"><br>
    密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password"><br>
    <span style="color: red"><%= request.getAttribute("error") == null ? "" : request.getAttribute("error")%></span><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
