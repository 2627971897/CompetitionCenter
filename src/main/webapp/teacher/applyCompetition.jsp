<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/24
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>applyCompetition</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/applyCompetition">
    比赛名称：<input type="text" name="compName"/><br>
    比赛描述：<input type="text" name="compDesc"/><br>
    <input type="radio" name="isPro" value="N" checked/>不提交作品
    <input type="radio" name="isPro" value="Y"/>提交作品<br>
    开始报名时间：<input type="date" name="beginTime" /><br>
    截止报名时间：<input type="date" name="endTime" /><br>
    <input type="submit" value="申请比赛"/><br>
</form>
</body>
</html>
