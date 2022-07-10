<%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/10
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (exception != null) {
        out.println("异常的错误信息：" + exception.getMessage());
    }
%>
</body>
</html>
