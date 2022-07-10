<%--
  Created by IntelliJ IDEA.
  User: ben
  Date: 2022/7/10
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP语法</title>
    <%!
        int i = 1; // 全局变量

        public void show() {
            System.out.println("show");
        }

        public class MyClass {
            {
                System.out.println("全局类");
            }
        }

    %>
    <%
        int j = 2; //局部变量
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    %>
</head>
<body>
<%= i + 1 %> <%-- --%>
<%= j %>
</body>
</html>
