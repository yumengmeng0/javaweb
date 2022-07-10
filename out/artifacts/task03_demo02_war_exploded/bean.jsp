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

<%
    Student student = new Student();

    student.setId(110);
    student.setName("zhangsan");

%>
<%= "id = " + student.getId()%>
<%= "name = " + student.getName()%>
<br>

<jsp:useBean id="student1" scope="page" class="cn.com.libery.Student"></jsp:useBean>
<jsp:setProperty name="student1" property="id" value="111"></jsp:setProperty>
<jsp:setProperty name="student1" property="name" value="lusi"></jsp:setProperty>
id = <jsp:getProperty name="student1" property="id"/>
name = <jsp:getProperty name="student1" property="name"/>
<br>
<%= "id = " + student1.getId()%>
<%= "name = " + student1.getName()%>
</body>
</html>
