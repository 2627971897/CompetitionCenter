<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>allCompetition</title>

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
                            <button type="button" class="btn btn-default btn-outline m-b-10" onclick="toVerifyCompetition()">查看正在申请的比赛</button>
                            <button type="button" class="btn btn-primary m-b-10 m-l-5" onclick="toAllCompetition()">全部比赛</button>
                            <button type="button" class="btn btn-success btn-outline m-b-10 m-l-5" onclick="toSucCompetition()">通过的比赛</button>
                            <button type="button" class="btn btn-danger btn-outline m-b-10 m-l-5" onclick="toFailureCompetition()">未通过的比赛</button>
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
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-hover ">
                                        <thead>
                                        <tr>
                                            <th>id</th>
                                            <th>申请人</th>
                                            <th>比赛名称</th>
                                            <th>提交作品</th>
                                            <th>参赛性质</th>
                                            <th>申请时间</th>
                                            <th>当前状态</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${competitionList}" var="competition">
                                            <tr>
                                                <th scope="row">${competition.compId}</th>
                                                <td>${competition.teacherName}</td>
                                                <td style="width: auto;"><a style="color: #ff4081" href="${pageContext.request.contextPath}/toSCompetitionInfo?compId=${competition.compId}">${competition.compName}</a></td>
                                                <c:if test="${competition.isPro=='Y'}">
                                                    <td>提交</td>
                                                </c:if>
                                                <c:if test="${competition.isPro=='N'}">
                                                    <td>不提交</td>
                                                </c:if>
                                                <c:if test="${competition.isPer=='1'}">
                                                    <td>仅个人</td>
                                                </c:if>
                                                <c:if test="${competition.isPer=='2'}">
                                                    <td>仅团队</td>
                                                </c:if>
                                                <c:if test="${competition.isPer=='3'}">
                                                    <td>都可</td>
                                                </c:if>
                                                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${competition.applyTime}" /></td>
                                                <td>
                                                    <c:if test="${competition.compStatus=='1'}"><span class="badge badge-warning">待审核</span></c:if>
                                                    <c:if test="${competition.compStatus=='2'}"><span class="badge badge-success">待发布报名信息</span></c:if>
                                                    <c:if test="${competition.compStatus=='3'}"><span class="badge badge-primary">正在报名中...</span></c:if>
                                                    <c:if test="${competition.compStatus=='4'}"><span class="badge badge-pink">报名截止，待比赛截止</span></c:if>
                                                    <c:if test="${competition.compStatus=='5'}"><span class="badge badge-info">比赛截止，待录入成绩</span></c:if>
                                                    <c:if test="${competition.compStatus=='9'}"><span class="badge badge-danger">审核未通过</span></c:if>
                                                    <c:if test="${competition.compStatus=='0'}"><span class="badge badge-dark">已结束</span></c:if>
                                                </td>
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
<script type="text/javascript">
    function toVerifyCompetition() {
        window.location.href = "${pageContext.request.contextPath}/toVerifyCompetition";
    }

    function toAllCompetition() {
        window.location.href = "${pageContext.request.contextPath}/toAllCompetition";
    }
    function toSucCompetition() {
        alert("可惜！还没想好怎么开发 =v= !");
    }
    function toFailureCompetition() {
        alert("可惜！还没想好怎么开发 =v= !");
    }
</script>
</html>
