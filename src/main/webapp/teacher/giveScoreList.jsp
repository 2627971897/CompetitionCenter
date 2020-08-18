<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/1/2
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String picRootPath = "http://62.234.125.134/";
%>
<html lang="ch">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>giveScoreList</title>

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
            <section id="main-content">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="card" style="width:1200px;">
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-hover ">
                                        <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>姓名</th>
                                            <th>比赛</th>
                                            <th>电话</th>
                                            <th>参赛性质</th>
                                            <th>申请时间</th>
                                            <th>当前状态</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${entryList}" var="entry">
                                            <tr>
                                                <th scope="row"><a style="color: #ff4081" href="${pageContext.request.contextPath}/toEntryInfo?entryId=${entry.entryId}">${entry.entryId}</a></th>
                                                <td>${entry.studentName}</td>
                                                <td style="width: auto;">${entry.compName}</td>
                                                <td>${entry.phone}</td>
                                                <c:if test="${entry.isPer == 'N'}">
                                                    <td>团队</td>
                                                </c:if>
                                                <c:if test="${entry.isPer == 'Y'}">
                                                    <td>个人</td>
                                                </c:if>
                                                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${entry.entryDate}"/></td>
                                                <td>
                                                    <c:if test="${entry.entryStatus=='1'}"><span class="badge badge-primary">刚生成</span></c:if>
                                                    <c:if test="${entry.entryStatus=='2'}"><span class="badge badge-primary">待填扩展信息</span></c:if>
                                                    <c:if test="${entry.entryStatus=='3'}"><span class="badge badge-primary">待填成员信息</span></c:if>
                                                    <c:if test="${entry.entryStatus=='11'}"><span class="badge badge-primary">待审核</span></c:if>
                                                    <c:if test="${entry.entryStatus=='12'}"><span class="badge badge-success">审核通过(非作品类)</span></c:if>
                                                    <c:if test="${entry.entryStatus=='13'}"><span class="badge badge-info">审核通过(作品类)，待提交作品</span></c:if>
                                                    <c:if test="${entry.entryStatus=='14'}"><a style="color: #ff4081" href="<%=picRootPath %>${entry.proColCustom.proLink}" >作品</a>已提交，待<a style="color: #ff4081" href="${pageContext.request.contextPath}/toGiveScore?entryId=${entry.entryId}">录入成绩</a></c:if>
                                                    <c:if test="${entry.entryStatus=='15'}"><span class="badge badge-dark">成绩已出，结束</span></c:if>
                                                    <c:if test="${entry.entryStatus=='404'}"><span class="badge badge-danger">未参赛</span></c:if>
                                                    <c:if test="${entry.entryStatus=='911'}"><span class="badge badge-warning">审核未通过</span></c:if>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                    <button style="margin-top: 10px" type="button" class="btn btn-dark m-b-10 m-l-5" onclick="myFinish()">全部录入完毕</button>
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
<script type="text/javascript">
    function myFinish() {
        window.location.href="${pageContext.request.contextPath}/toGiveScoreEnd?compId=${competition.compId}";
    }
</script>

</body>
</html>
