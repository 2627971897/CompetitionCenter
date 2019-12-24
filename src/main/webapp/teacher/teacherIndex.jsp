<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/24
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teacherIndex</title>
</head>
<body>
欢迎您,${teacher.teacherName}<br>
<input type="button" onclick="myCompetition()" value="我注册的比赛" /><br>
<input type="button" onclick="applyCompetition()" value="申请注册比赛" />
</body>
<script language="JavaScript">
    function myCompetition(){
        window.location.href = "${pageContext.request.contextPath}/toMyCompetition"
    }
    function applyCompetition(){
        window.location.href = "${pageContext.request.contextPath}/toApplyCompetition"
    }
</script>
</html>
