<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/20
  Time: 上午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>用户注册</h2>
<form action="/registerServlet" method="post">
    name:<input name="name" >
    <br>
    password:<input name="password" type="password" />
    <br>
    tel:<input name="tel" type="text">
    <br>
    <input type="submit" value="注册">
</form>
</body>
</html>
