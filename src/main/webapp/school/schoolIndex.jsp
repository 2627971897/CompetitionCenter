<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>schoolIndex</title>
</head>
<body>
<input type="button" onclick="toVerifyCompetition()" value="查看正在申请的比赛" />
<input type="button" onclick="toAllCompetition()" value="全部比赛" />
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
