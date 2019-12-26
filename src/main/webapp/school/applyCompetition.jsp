<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>applyCompetition</title>
</head>
<body>
<input type="button" onclick="toVerifyCompetition()" value="查看正在申请的比赛"/>
<input type="button" onclick="toAllCompetition()" value="全部比赛"/>
<table border="1">
    <tr>
        <th>id</th>
        <th>申请人</th>
        <th>比赛名称</th>
        <th>提交作品</th>
        <th>参赛性质</th>
        <th>申请时间</th>
        <th>当前状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${competitionList}" var="competition">
        <tr>
            <td>${competition.compId}</td>
            <td>${competition.teacherName}</td>
            <td><a href="${pageContext.request.contextPath}/toSCompetitionInfo?compId=${competition.compId}">${competition.compName}</a></td>
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
            <c:if test="${competition.compStatus=='9'}">
                <td>审核未通过</td>
            </c:if>
            <c:if test="${competition.compStatus=='0'}">
                <td>已结束</td>
            </c:if>
            <td><a href="${pageContext.request.contextPath }/auditPassCompOne?compId=${competition.compId}">审核通过</a>>
                <a href="${pageContext.request.contextPath }/auditNoPassCompOne?compId=${competition.compId}">审核不通过</a>></td>
        </tr>
    </c:forEach>
</table>
</body>
<script language="JavaScript">
    function toVerifyCompetition() {
        window.location.href = "${pageContext.request.contextPath}/toVerifyCompetition";
    }

    function toAllCompetition() {
        window.location.href = "${pageContext.request.contextPath}/toAllCompetition";
    }
</script>
</html>
