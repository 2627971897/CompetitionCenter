<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/1/2
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String picRootPath = "http://114.55.146.145/";
%>
<html>
<head>
    <title>giveScoreList</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>比赛</th>
        <th>电话</th>
        <th>参赛性质</th>
        <th>申请时间</th>
        <th>参赛状态</th>
    </tr>
    <c:forEach items="${entryList}" var="entry">
        <tr>
            <td><a href="${pageContext.request.contextPath}/toEntryInfo?entryId=${entry.entryId}">${entry.entryId}</a></td>
            <td>${entry.studentName}</td>
            <td>${entry.compName}</td>
            <td>${entry.phone}</td>
            <c:if test="${entry.isPer == 'N'}">
                <td>团队</td>
            </c:if>
            <c:if test="${entry.isPer == 'Y'}">
                <td>个人</td>
            </c:if>
            <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${entry.entryDate}" /></td>
            <td><c:if test="${entry.entryStatus=='11'}">待审核</c:if>
                <c:if test="${entry.entryStatus=='12'}">审核通过(非作品类)<a href="${pageContext.request.contextPath}/toGiveScore?entryId=${entry.entryId}">录入成绩</a></c:if>
                <c:if test="${entry.entryStatus=='13'}">审核通过(作品类)，待提交作品</c:if>
                <c:if test="${entry.entryStatus=='14'}"><a href="<%=picRootPath %>${entry.proColCustom.proLink}" >作品</a>已提交<a href="${pageContext.request.contextPath}/toGiveScore?entryId=${entry.entryId}">录入成绩</a></c:if>
                <c:if test="${entry.entryStatus=='15'}">成绩已出，结束</c:if>
                <c:if test="${entry.entryStatus=='404'}">未参赛</c:if>
                <c:if test="${entry.entryStatus=='911'}">审核未通过</c:if></td>
        </tr>
    </c:forEach>
</table>
全部<a href="${pageContext.request.contextPath}/toGiveScoreEnd?compId=${competition.compId}">录入完毕</a>
</body>
</html>
