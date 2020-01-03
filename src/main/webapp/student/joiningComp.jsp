<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/27
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>joinComp</title>
</head>
<body>
<table border="1">
    <tr>
        <th>id</th>
        <th>申请人</th>
        <th>比赛名称</th>
        <th>提交作品</th>
        <th>参赛性质</th>
        <th>申请时间</th>
        <th>当前状态</th>
    </tr>
    <c:forEach items="${competitionList}" var="competition">
        <tr>
            <td>${competition.compId}</td>
            <td>${competition.teacherName}</td>
            <td><a href="${pageContext.request.contextPath}/toStCompetitionInfo?compId=${competition.compId}">${competition.compName}</a></td>
            <c:if test="${competition.isPro=='Y'}">
                <td>提交</td>
            </c:if>
            <c:if test="${competition.isPro=='N'}">
                <td>不提交</td>
            </c:if>
            <c:if test="${competition.isPer=='1'}">
                <td>仅个人</td>
            </c:if>
            <c:if test="${competition.isPer=='2'}">
                <td>仅团队</td>
            </c:if>
            <c:if test="${competition.isPer=='3'}">
                <td>都可</td>
            </c:if>
            <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${competition.applyTime}" /></td>
            <c:if test="${competition.compStatus=='1'}">
                <td>待审核</td>
            </c:if>
            <c:if test="${competition.compStatus=='2'}">
                <td>待发布报名信息</td>
            </c:if>
            <c:if test="${competition.compStatus=='3'}">
                <td>正在<a href="${pageContext.request.contextPath}/toJoinCompStep1?compId=${competition.compId}">报名</a>中...</td>
            </c:if>
            <c:if test="${competition.compStatus=='4'}">
                <td>报名截止，待比赛截止</td>
            </c:if>
            <c:if test="${competition.compStatus=='5'}">
                <td>比赛截止，待录入成绩</td>
            </c:if>
            <c:if test="${competition.compStatus=='9'}">
                <td>审核未通过</td>
            </c:if>
            <c:if test="${competition.compStatus=='0'}">
                <td>已结束</td>
            </c:if>
        </tr>
        </form>
    </c:forEach>
</table>
</body>
</html>
