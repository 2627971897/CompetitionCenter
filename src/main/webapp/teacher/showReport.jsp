<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/1/2
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>showReport</title>

    <!-- Styles -->
    <link href="${pageContext.request.contextPath}/assets/css/lib/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/lib/themify-icons.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/lib/menubar/sidebar.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/lib/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/lib/helper.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet">
</head>

<body>

<div class="content-wrap">
    <div class="main">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-8 p-r-0 title-margin-right">
                    <div class="page-header">
                        <div class="page-title">
                            <h1>${competition.compName}</h1>
                        </div>
                    </div>
                </div>
                <!-- /# column -->
            </div>
            <!-- /# row -->
            <section id="main-content">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="card" style="width:1200px;">
                            <div class="card-title">
                                <h4>成绩单 </h4>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-hover ">
                                        <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>比赛</th>
                                            <th>学号</th>
                                            <th>姓名</th>
                                            <th>参赛性质</th>
                                            <c:if test="${competition.isPer != '1'}">
                                                <th>小队名称</th>
                                            </c:if>
                                            <th>分数</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${entryList}" var="entry">
                                            <tr>
                                                <th scope="row"><a style="color: #ff4081" href="${pageContext.request.contextPath}/toEntryInfo?entryId=${entry.entryId}">${entry.entryId}</a></th>
                                                <td>${entry.compName}</td>
                                                <td>${entry.studentId}</td>
                                                <td>${entry.studentName}</td>
                                                <td>
                                                    <c:if test="${entry.isPer == 'N'}">团队</c:if>
                                                    <c:if test="${entry.isPer == 'Y'}">个人</c:if>
                                                </td>
                                                <c:if test="${competition.isPer != '1'}">
                                                    <td>${entry.teamName}</td>
                                                </c:if>
                                                <c:if test="${entry.entryStatus == '404'}">
                                                    <td><span class="badge badge-danger">未参赛</span></td>
                                                </c:if>
                                                <c:if test="${entry.entryStatus != '404'}">
                                                    <td><span class="badge badge-primary">${entry.score}</span></td>
                                                </c:if>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                    <button style="margin-top: 10px" type="button" class="btn btn-dark m-b-10 m-l-5" onclick="myFinish()">导出成绩单</button>
                                </div>
                            </div>
                        </div>
                        <!-- /# card -->
                    </div>
                    <!-- /# column -->
                </div>
                <!-- /# row -->
            </section>
        </div>
    </div>
</div>


<!-- jquery vendor -->
<script src="${pageContext.request.contextPath}/assets/js/lib/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/lib/jquery.nanoscroller.min.js"></script>
<!-- nano scroller -->
<script src="${pageContext.request.contextPath}/assets/js/lib/menubar/sidebar.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/lib/preloader/pace.min.js"></script>
<!-- sidebar -->

<!-- bootstrap -->
<script src="${pageContext.request.contextPath}/assets/js/lib/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/scripts.js"></script>
<!-- scripit init-->


</body>
<script type="text/javascript">
    function myFinish() {
        alert("可惜！还没想好怎么开发 =v= !");
    }
</script>
</html>
