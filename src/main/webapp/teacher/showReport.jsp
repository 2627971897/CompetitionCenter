<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/1/2
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showReport</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>比赛</th>
        <th>学号</th>
        <th>姓名</th>
        <c:if test="${competition.isPer != '1'}">
            <th>小队名称</th>
        </c:if>
        <th>分数</th>
    </tr>
    <c:forEach items="${entryList}" var="entry">
        <tr>
            <td>${entry.entryId}</td>
            <td>${entry.compName}</td>
            <td>${entry.studentId}</td>
            <td>${entry.studentName}</td>
            <c:if test="${competition.isPer != '1'}">
                <td>${entry.teamName}</td>
            </c:if>
            <c:if test="${entry.entryStatus == '404'}">
                <td>未参赛</td>
            </c:if>
            <c:if test="${entry.entryStatus != '404'}">
                <td>${entry.score}</td>
            </c:if>
        </tr>
    </c:forEach>
</table>
<a href="#">导出成绩单</a>
</body>
</html>
