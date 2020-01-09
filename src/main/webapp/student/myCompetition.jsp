<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/30
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>myCompetition</title>

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
                            <h1>Hello, ${student.studentName}</h1>
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
                                <h4>我参加的比赛 </h4>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-hover ">
                                        <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>姓名</th>
                                            <th>比赛</th>
                                            <th>参赛性质</th>
                                            <th>参赛状态</th>
                                            <th>申请时间</th>
                                            <th>电话</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${entryList}" var="entry">
                                            <tr>
                                                <th scope="row"><a style="color: #ff4081" href="${pageContext.request.contextPath}/toMyCompInfo?entryId=${entry.entryId}">${entry.entryId}</a></th>
                                                <td>${entry.studentName}</td>
                                                <td style="width: auto;">${entry.compName}</td>
                                                <c:if test="${entry.isPer == 'N'}">
                                                    <td>团队</td>
                                                </c:if>
                                                <c:if test="${entry.isPer == 'Y'}">
                                                    <td>个人</td>
                                                </c:if>
                                                <td>
                                                    <c:if test="${entry.entryStatus=='1'}"><span class="badge badge-primary">刚生成</span></c:if>
                                                    <c:if test="${entry.entryStatus=='2'}"><span class="badge badge-primary">待填扩展信息</span></c:if>
                                                    <c:if test="${entry.entryStatus=='3'}"><span class="badge badge-primary">待填成员信息</span></c:if>
                                                    <c:if test="${entry.entryStatus=='11'}"><span class="badge badge-primary">待审核</span></c:if>
                                                    <c:if test="${entry.entryStatus=='12'}"><span class="badge badge-primary">审核通过(非作品类)，待出分</span></c:if>
                                                    <c:if test="${entry.entryStatus=='13'}">审核通过(作品类)=<a style="color: #ff4081" href="${pageContext.request.contextPath}/toUpload?entryId=${entry.entryId}">提交作品</a></c:if>
                                                    <c:if test="${entry.entryStatus=='14'}"><span class="badge badge-primary">作品已提交，待出分</span></c:if>
                                                    <c:if test="${entry.entryStatus=='15'}"><span class="badge badge-primary">成绩已出，结束</span></c:if>
                                                    <c:if test="${entry.entryStatus=='404'}"><span class="badge badge-primary">未参赛</span></c:if>
                                                    <c:if test="${entry.entryStatus=='911'}"><span class="badge badge-primary">审核未通过</span></c:if>
                                                </td>
                                                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${entry.entryDate}" /></td>
                                                <td class="color-primary">${entry.phone}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
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

</html>
