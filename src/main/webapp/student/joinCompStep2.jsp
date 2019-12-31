<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/27
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>joinCompStep2</title>
</head>
<body>
<form id="myForm" method="post" action="${pageContext.request.contextPath}/step2Finish">
    <c:forEach items="${competition.competitionExtCustomList}" var="competitionExtCustom" varStatus="i">
        <input type="hidden" name="entryExtCustomList[${i.index }].entryId" value="${entry.entryId}" />
        <input type="hidden" name="entryExtCustomList[${i.index }].compExtendId" value="${competitionExtCustom.compExtendId}" />
        ${competitionExtCustom.extendKey}: <input type="text" name="entryExtCustomList[${i.index }].extendValue" /><br>
    </c:forEach>
    <input type="submit" value="下一步>" />
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
</html>
