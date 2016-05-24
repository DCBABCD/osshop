<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/19
  Time: 下午3:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>欢迎来到小智零食店</title>
  </head>
  <body>
<h1>小智零食店:),用户:<%=session.getAttribute("name")%></h1>
  <a href="register.jsp">注册</a>
  <a href="login.jsp">登陆</a>
  </body>
</html>
