<%@ page import="cn.com.libery.Student" %><%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/10
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBean组件的使用</title>
</head>
<body>


<jsp:useBean id="student1" scope="session" class="cn.com.libery.Student"></jsp:useBean>
<%--param是request中的参数--%>
<jsp:setProperty name="student1" property="id" param="id"></jsp:setProperty>
<jsp:setProperty name="student1" property="name" param="name"></jsp:setProperty>
id =
<jsp:getProperty name="student1" property="id"/>
name =
<jsp:getProperty name="student1" property="name"/>

<%
    session.removeAttribute("student1");

%>
id =
<%--<jsp:getProperty name="student1" property="id"/>--%>
</body>
</html>
