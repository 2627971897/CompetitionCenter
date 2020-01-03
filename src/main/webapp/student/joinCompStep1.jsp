<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/27
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>joinComp</title>
</head>
<body>
<form id="myForm" method="post" action="${pageContext.request.contextPath}/step1Finish">
    <input type="hidden" name="studentId" value="${student.studentId}">
    <input type="hidden" name="compId" value="${competition.compId}">
比赛：${competition.compId}&nbsp${competition.compName}<br>
学号：${student.studentId}<br>
姓名：${student.studentName}<br>
手机号:<input type="text" name="phone" /><br>
参赛性质：
<c:if test="${competition.isPer=='1'}">
    <input type="hidden" name="isPer" value="Y">
    仅个人<br>
</c:if>
<c:if test="${competition.isPer=='2'}">
    <input type="hidden" name="isPer" value="N">
    仅团队<br>
    <div id="teamName">小队名称：<input type="text" name="teamName" /></div>
</c:if>
<c:if test="${competition.isPer=='3'}">
    <input id="perRadio" type="radio" name="isPer" value="Y" checked/>个人
    <input id="teamRadio" type="radio" name="isPer" value="N"/>团队<br id="add">
</c:if>
    <input type="submit" value="下一步>" />
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

    $(function () {
        $("#teamRadio").change(function () {
            if ($("#teamRadio").prop("checked") == true){
                var txt1 = "<div id=\"teamName\">小队名称：<input type=\"text\" name=\"teamName\" /></div>"
                $("#add").after(txt1);
            }
        })
        $("#perRadio").change(function () {
            if ($("#perRadio").prop("checked") == true){
                $("#teamName").remove();
            }
        })
    })
</script>
</html>
