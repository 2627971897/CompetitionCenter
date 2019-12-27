<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>releaseComp</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/releaseCompByCid" onsubmit="return check()">
    <input type="hidden" name="compId" value="${competition.compId}"/>
    <table border="1">
        <tr>
            <td>比赛代码：<br></td>
            <td>${competition.compId}</td>
        </tr>
        <tr>
            <td>比赛名称：<br></td>
            <td>${competition.compName}</td>
        </tr>
        <tr>
            <td>年级范围：<br></td>
            <td>
                <input id="c9" type="checkbox" name="grade" value="9" checked/>全年级
                <input id="c1" type="checkbox" name="grade" value="1" checked/>大一
                <input id="c2" type="checkbox" name="grade" value="2" checked/>大二
                <input id="c3" type="checkbox" name="grade" value="3" checked/>大三
                <input id="c4" type="checkbox" name="grade" value="4" checked/>大四
            </td>
        </tr>
        <tr>
            <td>学院范围：<br></td>
            <td>
                <select name="deptId">
                    <c:forEach items="${deptList}" var="dept">
                        <option value="${dept.deptId}">${dept.deptId} ${dept.deptName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td><input type="button" value="添加扩展信息" onclick="addExtend()"></td>
            <td>注：已有“手机号”为必填项</td>
        </tr>
        <tr colspan="2" id="add">
            <td><input type="submit" value="确认信息并发布"></td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    var index = 1;

    function addExtend() {
        var txt1 = "<tr> <td>扩展信息" + index + "： </td> <td> <input type=\"text\" name=\"myExtend\"/> </td> </tr>";
        $("#add").before(txt1);
        index = index + 1;
    }
    function check(){
        if ($("#c1").prop("checked") == false&&$("#c2").prop("checked") == false
        &&$("#c3").prop("checked") == false&&$("#c4").prop("checked") == false
        &&$("#c9").prop("checked") == false) {
            alert("请选择年级范围！！");
        return false;
    }
    return true;
    }

    $(function(){
        $("#c9").click(function(){
            if ($("#c9").prop("checked") == true) {
                $("#c1").prop("checked", true);
                $("#c2").prop("checked", true);
                $("#c3").prop("checked", true);
                $("#c4").prop("checked", true);
            }else {
                $("#c1").prop("checked", false);
                $("#c2").prop("checked", false);
                $("#c3").prop("checked", false);
                $("#c4").prop("checked", false);
            }
        });
        $("#c1").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
        $("#c2").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
        $("#c3").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
        $("#c4").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
    });

</script>
</html>
