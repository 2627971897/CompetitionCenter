<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>releaseComp</title>
</head>
<body>
<form method="post" action="#">
    <input type="hidden" name="compId" value="${competition.compId}"/>
    比赛代码：${competition.compId}<br>
    比赛名称：${competition.compName}<br>
    年级范围：
    <input type="checkbox" name="grade" value="1" />大一
    <input type="checkbox" name="grade" value="2" />大二
    <input type="checkbox" name="grade" value="3" />大三
    <input type="checkbox" name="grade" value="4" />大四<br>
    学院范围：
    <select name="dept">
        <option value="0">0 全学院</option>
        <option value="1">1 信息科学与工程学院</option>
        <option value="2">2 体育学院</option>
    </select><br>
    <input type="button" value="添加扩展信息"><br>
    扩展信息1：<input type="text" name="extend1"/><br>
</form>
</body>
</html>
