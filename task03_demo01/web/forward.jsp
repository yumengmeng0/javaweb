<%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/10
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP页面的转发</title>
</head>
<body>
<jsp:forward page="target.jsp">
    <jsp:param name="name" value="v"/>
</jsp:forward>
</body>
</html>
