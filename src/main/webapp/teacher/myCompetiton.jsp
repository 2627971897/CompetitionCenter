<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/24
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>myCompetition</title>
</head>
<body>
<table border="1">
    <tr>
        <th>id</th>
        <th>申请人</th>
        <th>比赛名称</th>
        <th>提交作品</th>
        <th>申请时间</th>
        <th>当前状态</th>
    </tr>
    <c:forEach items="${competitionList}" var="competition">
    <tr>
        <td>${competition.compId}</td>
        <td>${competition.teacherName}</td>
        <td>${competition.compName}</td>
        <c:if test="${competition.isPro=='Y'}">
            <td>提交</td>
        </c:if>
        <c:if test="${competition.isPro=='N'}">
            <td>不提交</td>
        </c:if>
        <td>${competition.applyTime}</td>
        <c:if test="${competition.compStatus=='1'}">
            <td>待审核</td>
        </c:if>
        <c:if test="${competition.compStatus=='2'}">
            <td>待发布报名信息</td>
        </c:if>
        <c:if test="${competition.compStatus=='3'}">
            <td>正在报名中...</td>
        </c:if>
        <c:if test="${competition.compStatus=='4'}">
            <td>报名截止，待录入成绩</td>
        </c:if>
        <c:if test="${competition.compStatus=='5'}">
            <td>已结束</td>
        </c:if>
    </tr>
    </c:forEach>
</table>
</body>
</html>
