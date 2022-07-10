<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/10
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>内置对象</title>
</head>
<body>
<%
    // 1. out对象
    out.print("<h1>");
    out.print("Hello World");
    out.print("</h1>");
    int bufferSize = out.getBufferSize();
    System.out.println("out.getBufferSize() = " + out.getBufferSize()); // 8192
    System.out.println("out.getRemaining() = " + out.getRemaining());
    out.clear();
//    out.close(); //不能关闭


    // 2. request对象
    System.out.println("request.getServerName() = " + request.getServerName());

    // 3.response对象
    response.addHeader("refresh", "1"); // 每隔一秒刷新一次
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedDate = simpleDateFormat.format(date);
    // 4.session对象
    session.setAttribute("name", "session对象");

    // 5.application对象
    application.setAttribute("name1", "application对象");
    // 6.pageContext对象
    pageContext.setAttribute("name2", "pageContext对象");

    // 7.exception对象

    int a = 1;
    int b = 0;
    System.out.println("a/b = " + a / b); // 产生异常

%>
<%= formattedDate %>
<%@ page errorPage="error.jsp" %>


</body>
</html>
