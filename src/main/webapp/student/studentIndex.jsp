<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/24
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>studentIndex</title>
</head>
<body>
欢迎你，${student.studentName}||${student.studentId}||${student.deptName}||
${student.studentGrade}级${student.studentMajor}${student.studentClass}班<br>
<input type="button" value="我报名的比赛" onclick="toMyJoinComp()"/><br>
<input type="button" value="快去参加比赛" onclick="toJoiningComp()"/><br>
</body>
<script type="text/javascript">
function toMyJoinComp() {

}
function toJoiningComp() {
    window.location.href="${pageContext.request.contextPath}/toJoiningComp";
}
</script>
</html>
