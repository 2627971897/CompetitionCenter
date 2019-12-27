<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>competitionInfo</title>
</head>
<body>
比赛代码：${competition.compId}<br>
申请人：${competition.teacherName}<br>
比赛名称：${competition.compName}<br>
比赛描述：${competition.compDesc}<br>
是否提交作品：
<c:if test="${competition.isPro=='Y'}">
    提交
</c:if>
<c:if test="${competition.isPro=='N'}">
    不提交
</c:if><br>
比赛性质：
<c:if test="${competition.isPer=='1'}">
    仅个人
</c:if>
<c:if test="${competition.isPer=='2'}">
    仅团队
</c:if>
<c:if test="${competition.isPer=='3'}">
    都可
</c:if><br>
申请时间：<fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${competition.applyTime}" /><br>
报名开始时间：<fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${competition.beginTime}" /><br>
截止报名时间：<fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${competition.endTime}" /><br>
比赛状态：
<c:if test="${competition.compStatus=='1'}">
    待审核
</c:if>
<c:if test="${competition.compStatus=='2'}">
    待发布报名信息
</c:if>
<c:if test="${competition.compStatus=='3'}">
    正在报名中...
</c:if>
<c:if test="${competition.compStatus=='4'}">
    报名截止，待录入成绩
</c:if>
<c:if test="${competition.compStatus=='9'}">
    审核未通过
</c:if>
<c:if test="${competition.compStatus=='0'}">
    已结束
</c:if><br>
<c:if test="${not empty competition.competitionScopeCustomList}">
    年级范围：
    <c:forEach items="${competition.competitionScopeCustomList}" var="competitionScope">
        <c:if test="${competitionScope.value=='9'}">
            全年级
        </c:if>
        <c:if test="${competitionScope.value=='1'}">
            大一
        </c:if>
        <c:if test="${competitionScope.value=='2'}">
            大二
        </c:if>
        <c:if test="${competitionScope.value=='3'}">
            大三
        </c:if>
        <c:if test="${competitionScope.value=='4'}">
            大四
        </c:if>
    </c:forEach><br>
</c:if>
<c:if test="${not empty competition.competitionObjCustomList}">
    学院范围：
    <c:forEach items="${competition.competitionObjCustomList}" var="competitionObjCustom">
        ${competitionObjCustom.deptName}
    </c:forEach><br>
</c:if>
<c:if test="${not empty competition.competitionExtCustomList}">
    拓展信息：
    <c:forEach items="${competition.competitionExtCustomList}" var="competitionExtCustom">
        ${competitionExtCustom.extendKey}
    </c:forEach><br>
</c:if>
</body>
</html>
