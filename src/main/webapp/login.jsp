<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/23
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/chooseLogin">
    <input type="radio" name="chooseTerrace" value="student" checked/>学生端
    <input type="radio" name="chooseTerrace" value="teacher" />教师端<br>
    学号：<input type="text" name="loginId" /><br>
    密码：<input type="password" name="loginPwd"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
