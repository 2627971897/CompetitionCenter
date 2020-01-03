<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
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
        <th>参赛性质</th>
        <th>申请时间</th>
        <th>当前状态</th>
    </tr>
    <c:forEach items="${competitionList}" var="competition">
        <tr>
            <td>${competition.compId}</td>
            <td>${competition.teacherName}</td>
            <td>
                <a href="${pageContext.request.contextPath}/toTCompetitionInfo?compId=${competition.compId}">${competition.compName}</a>
            </td>
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
            <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${competition.applyTime}"/></td>
            <c:if test="${competition.compStatus=='1'}">
                <td>待审核</td>
            </c:if>
            <c:if test="${competition.compStatus=='2'}">
                <td>
                    待<a href="${pageContext.request.contextPath}/toReleaseCompByCid?compId=${competition.compId}">发布报名信息</a>
                </td>
            </c:if>
            <c:if test="${competition.compStatus=='3'}">
                <td>正在<a href="${pageContext.request.contextPath}/chooseEntry?compId=${competition.compId}&chooseTerrace=apply">报名</a>中...
                    待<a href="${pageContext.request.contextPath}/toStopSignByCid?compId=${competition.compId}">截止报名</a>
                </td>
            </c:if>
            <c:if test="${competition.compStatus=='4'}">
                <td><a href="${pageContext.request.contextPath}/chooseEntry?compId=${competition.compId}&chooseTerrace=apply">报名</a>截止，
                    待<a href="${pageContext.request.contextPath}/toStopCompByCid?compId=${competition.compId}">比赛截止</a>
                </td>
            </c:if>
            <c:if test="${competition.compStatus=='5'}">
                <td>待<a href="${pageContext.request.contextPath}/toGiveScoreList?compId=${competition.compId}">录入</a>成绩...
                    全部<a href="${pageContext.request.contextPath}/toGiveScoreEnd?compId=${competition.compId}">录入完毕</a>
                </td>
            </c:if>
            <c:if test="${competition.compStatus=='9'}">
                <td>审核未通过</td>
            </c:if>
            <c:if test="${competition.compStatus=='0'}">
                <td>已结束,<a href="${pageContext.request.contextPath}/toShowReport?compId=${competition.compId}">查看成绩单</a>
                </td>
            </c:if>
        </tr>
        </form>
    </c:forEach>
</table>
</body>
</html>
