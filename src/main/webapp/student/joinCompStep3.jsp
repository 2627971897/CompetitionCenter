<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/28
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>joinCompStep3</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/step3Finish">
    <table border="1">
        <tr>
            <th colspan="2">成员1<input type="hidden" name="entrySlaCustomList[0].entryId" value="${entry.entryId}"></th>
        </tr>
        <tr>
            <td>学号：</td>
            <td><input type="text" name="entrySlaCustomList[0].studentId"></td>
        </tr>
        <tr>
            <td>电话：</td>
            <td><input type="tel" name="entrySlaCustomList[0].phone"></td>
        </tr>
        <tr id="add">
            <td colspan="2"><input type="button" value="添加成员" onclick="add()"></td>
        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    var index = 1;
    function add(){
        var txt1="<tr> <th colspan=\"2\">成员" + (index + 1) + "<input type=\"hidden\" name=\"entrySlaCustomList[" + index + "].entryId\" value=\"${entry.entryId}\"></th> </tr>";
        var txt2="<tr> <td>学号：</td> <td><input type=\"text\" name=\"entrySlaCustomList[" + index + "].studentId\"></td> </tr>";
        var txt3="<tr> <td>电话：</td> <td><input type=\"tel\" name=\"entrySlaCustomList[" + index + "].phone\"></td> </tr>";
        $("#add").before(txt1,txt2,txt3);
        index = index + 1;
    }
</script>
</html>
