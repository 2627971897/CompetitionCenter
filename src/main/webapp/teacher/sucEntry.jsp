<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/31
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sucEntry</title>
</head>
<body>
<input type="button" onclick="toApplyEntry()" value="正在申请中"/>
<input type="button" onclick="toSucEntry()" value="通过的申请"/>
<input type="button" onclick="toAllEntry()" value="全部申请"/>
<input type="button" onclick="toFailureEntry()" value="未通过的申请"/>
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
                <c:if test="${entry.entryStatus=='12'}">审核通过(非作品类)</c:if>
                <c:if test="${entry.entryStatus=='13'}">审核通过(作品类)</c:if>
                <c:if test="${entry.entryStatus=='14'}">作品已提交</c:if>
                <c:if test="${entry.entryStatus=='15'}">成绩已出，结束</c:if>
                <c:if test="${entry.entryStatus=='404'}">未参赛</c:if>
                <c:if test="${entry.entryStatus=='911'}">审核未通过</c:if></td>
        </tr>
    </c:forEach>
</table>
</body>
<script type="text/javascript">
    function toApplyEntry() {
        window.location.href = "${pageContext.request.contextPath}/chooseEntry?compId=${competitionForEntry.compId}&chooseTerrace=apply";
    }
    function toSucEntry() {
        window.location.href = "${pageContext.request.contextPath}/chooseEntry?compId=${competitionForEntry.compId}&chooseTerrace=suc";
    }
    function toAllEntry() {
        window.location.href = "${pageContext.request.contextPath}/chooseEntry?compId=${competitionForEntry.compId}&chooseTerrace=all";
    }
    function toFailureEntry() {
        window.location.href = "${pageContext.request.contextPath}/chooseEntry?compId=${competitionForEntry.compId}&chooseTerrace=failure";
    }
</script>
</html>
