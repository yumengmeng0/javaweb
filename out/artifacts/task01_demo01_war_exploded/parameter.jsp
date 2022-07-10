<%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/7
  Time: 8:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数的获取和测试</title>
</head>
<body>

<form action="parameterServlet" method="post">
    姓名：<input type="text" name="name"> <br>
    年龄：<input type="text" name="age"> <br>
    爱好：<input type="checkbox" name="hobby" value="Java">Java
    <input type="checkbox" name="hobby" value="C">C
    <input type="checkbox" name="hobby" value="Python">Python <br>
    <input type="submit" value="提交">

</form>

</body>
</html>
