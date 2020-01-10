<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/23
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="cn">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <!-- Loding font -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,700" rel="stylesheet">

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">

    <title>login</title>
</head>
<body>

<!-- Backgrounds -->

<div id="login-bg" class="container-fluid">

    <div class="bg-img"></div>
    <div class="bg-color"></div>
</div>

<!-- End Backgrounds -->

<div class="container" id="login">
    <div class="row justify-content-center">
        <div class="col-lg-8">
            <div class="login">

                <h1>Login</h1>

                <!-- Loging form -->
                <form method="post" action="${pageContext.request.contextPath}/chooseLogin">
                    <input id="radio-1" name="chooseTerrace" value="student" type="radio" checked>
                    <label for="radio-1" class="radio-label">学生端</label>&nbsp;&nbsp;

                    <input id="radio-2" name="chooseTerrace" value="teacher" type="radio">
                    <label for="radio-2" class="radio-label">教师端</label>&nbsp;&nbsp;

                    <input id="radio-3" name="chooseTerrace" value="school" type="radio">
                    <label for="radio-3" class="radio-label">学校端</label>
                    <div class="form-group">
                        <input type="text" name="loginId" class="form-control" id="studentId" aria-describedby="emailHelp" placeholder="用户名">

                    </div>
                    <div class="form-group">
                        <input type="password" name="loginPwd" class="form-control" id="exampleInputPassword1" placeholder="密码">
                    </div>
                    <br>
                    <button type="submit" class="btn btn-lg btn-block btn-success">登录</button>
                </form>
                <!-- End Loging form -->

            </div>
        </div>

    </div>

</div>
</body>
</html>
