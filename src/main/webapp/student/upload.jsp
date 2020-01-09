<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/1/2
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
报名ID：${entry.entryId}<br>
学生姓名：${entry.studentName}<br>
比赛名称：${entry.compName}<br>
电话：${entry.phone}<br>
<c:if test="${not empty entry.entryExtCustomList}">
    拓展信息：<br>
    <c:forEach items="${entry.entryExtCustomList}" var="entryExt">
        ===&nbsp${entryExt.extendKey}：${entryExt.extendValue}<br>
    </c:forEach>
</c:if>
参赛性质：
<c:if test="${entry.isPer == 'N'}">团队</c:if>
<c:if test="${entry.isPer == 'Y'}">个人</c:if><br>
<c:if test="${entry.isPer == 'N'}">
    小队名称：${entry.teamName}<br>
    小队成员：<br>
    <c:forEach items="${entry.entrySlaCustomList}" var="entrySla">
        ===&nbsp学号：${entrySla.studentId}
        ==姓名：<c:if test="${empty entrySla.studentName}">成员学号信息不存在！</c:if><c:if test="${not empty entrySla.studentName}">${entrySla.studentName}</c:if>
        ==电话：${entrySla.phone}<br>
    </c:forEach>
</c:if>
申请时间：<fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${entry.entryDate}" /><br>
报名状态：
<c:if test="${entry.entryStatus=='11'}">待审核</c:if>
<c:if test="${entry.entryStatus=='12'}">审核通过(非作品类)</c:if>
<c:if test="${entry.entryStatus=='13'}">审核通过(作品类)</c:if>
<c:if test="${entry.entryStatus=='14'}">作品已提交</c:if>
<c:if test="${entry.entryStatus=='15'}">成绩已出，结束</c:if>
<c:if test="${entry.entryStatus=='404'}">未参赛</c:if>
<c:if test="${entry.entryStatus=='911'}">审核未通过</c:if><br>
<c:if test="${not empty entry.score}">
    成绩：${entry.score}<br>
</c:if>
========================================================<br>
======================== 提 交 作 品 ========================<br>
========================================================<br>
<form method="post" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data">
    <input type="hidden" name="entryId" value="${entry.entryId}">
    <input type="file" name="file">
    <input type="submit" value="提交作品">
</form>
</body>
</html>
