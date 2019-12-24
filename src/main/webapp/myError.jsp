<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/24
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>error</title>
</head>
<body>
${myError.errorInfo}<br>
<input type="button" onclick="goBack()" value="返回上个页面">
</body>
<script language="javascript">
    function goBack(){
        alert("返回");
        window.history.back(-1);
    }
</script>
</html>
