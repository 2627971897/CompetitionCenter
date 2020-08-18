<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/1/2
  Time: 15:17
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

    <title>giveScore</title>

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
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="user-profile">
                                    <div class="row">
                                        <div class="col-lg-7">
                                            <div class="user-profile-name">${entry.studentName}</div>
                                            <div class="user-Location">
                                                <i class="ti-location-pin"></i> ${entry.entryId}
                                            </div>
                                            <div class="user-job-title">${entry.compName}</div>
                                            <div class="custom-tab user-profile-tab">
                                                <ul class="nav nav-tabs" role="tablist">
                                                    <li role="presentation" class="active">
                                                        相关信息
                                                    </li>
                                                </ul>
                                                <div class="tab-content">
                                                    <div role="tabpanel" class="tab-pane active" id="1">
                                                        <div class="contact-information">
                                                            <div class="phone-content">
                                                                <span class="contact-title">电话:</span>
                                                                <span class="phone-number">
                                                                    ${entry.phone}
                                                                </span>
                                                            </div>
                                                            <div class="address-content">
                                                                <span class="contact-title">参赛性质:</span>
                                                                <span class="mail-address">
                                                                    <c:if test="${entry.isPer == 'N'}">团队</c:if>
                                                                    <c:if test="${entry.isPer == 'Y'}">个人</c:if>
                                                                </span>
                                                            </div>
                                                            <div class="email-content">
                                                                <span class="contact-title">申请时间:</span>
                                                                <span class="contact-email"><fmt:formatDate
                                                                        pattern="yyyy-MM-dd HH:mm:SS"
                                                                        value="${entry.entryDate}"/></span>
                                                            </div>
                                                            <div class="skype-content">
                                                                <span class="contact-title">报名状态:</span>
                                                                <span class="contact-skype">
                                                                    <c:if test="${entry.entryStatus=='1'}">刚生成</c:if>
                                                                    <c:if test="${entry.entryStatus=='2'}">待填扩展信息</c:if>
                                                                    <c:if test="${entry.entryStatus=='3'}">待填成员信息</c:if>
                                                                    <c:if test="${entry.entryStatus=='11'}">待审核</c:if>
                                                                    <c:if test="${entry.entryStatus=='12'}">审核通过(非作品类)</c:if>
                                                                    <c:if test="${entry.entryStatus=='13'}">审核通过(作品类)，待提交作品</c:if>
                                                                    <c:if test="${entry.entryStatus=='14'}"><a style="color: #ff4081" href="<%=picRootPath %>${entry.proColCustom.proLink}" >作品</a>已提交</c:if>
                                                                    <c:if test="${entry.entryStatus=='15'}">成绩已出，结束</c:if>
                                                                    <c:if test="${entry.entryStatus=='404'}">未参赛</c:if>
                                                                    <c:if test="${entry.entryStatus=='911'}">审核未通过</c:if>
                                                                </span>
                                                            </div>
                                                            <c:if test="${not empty entry.score}">
                                                                <div class="skype-content">
                                                                    <span class="contact-title">成绩:</span>
                                                                    <span class="contact-skype">
                                                                            ${entry.score}
                                                                    </span>
                                                                </div>
                                                            </c:if>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <!-- 分割单元 -->
                                            <c:if test="${entry.isPer == 'N'}">
                                                <div class="custom-tab user-profile-tab">
                                                    <ul class="nav nav-tabs" role="tablist">
                                                        <li role="presentation" class="active">
                                                            小队信息
                                                        </li>
                                                    </ul>
                                                    <div class="tab-content">
                                                        <div role="tabpanel" class="tab-pane active" id="2">
                                                            <div class="contact-information">
                                                                <div class="phone-content">
                                                                    <span class="contact-title">小队名称:</span>
                                                                    <span class="phone-number">
                                                                            ${entry.teamName}
                                                                    </span>
                                                                </div>
                                                                <c:forEach items="${entry.entrySlaCustomList}" var="entrySla">
                                                                    <div class="phone-content">
                                                                        <span class="contact-title">成员:</span>
                                                                        <span class="phone-number">
                                                                        学号：${entrySla.studentId}
                                                                        &nbsp;&nbsp;姓名：<c:if test="${empty entrySla.studentName}">成员学号信息不存在！</c:if>
                                                                                <c:if test="${not empty entrySla.studentName}">${entrySla.studentName}</c:if>
                                                                        &nbsp;&nbsp;电话：${entrySla.phone}
                                                                    </span>
                                                                    </div>
                                                                </c:forEach>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>
                                            <!-- 分割单元结束 -->

                                            <!-- 分割单元 -->
                                            <c:if test="${not empty entry.entryExtCustomList}">
                                                <div class="custom-tab user-profile-tab">
                                                    <ul class="nav nav-tabs" role="tablist">
                                                        <li role="presentation" class="active">
                                                            拓展信息
                                                        </li>
                                                    </ul>
                                                    <div class="tab-content">
                                                        <div role="tabpanel" class="tab-pane active" id="3">
                                                            <div class="contact-information">
                                                                <c:forEach items="${entry.entryExtCustomList}" var="entryExt">
                                                                    <div class="phone-content">
                                                                        <span class="contact-title">${entryExt.extendKey}</span>
                                                                        <span class="phone-number">${entryExt.extendValue}</span>
                                                                    </div>
                                                                </c:forEach>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>
                                            <!-- 分割单元结束 -->
                                        </div>

                                        <div class="col-lg-5">
                                            <div class="custom-tab user-profile-tab">
                                                <ul class="nav nav-tabs" role="tablist">
                                                    <li role="presentation" class="active" style="font-size: 20px;font-weight: bolder">
                                                        录入成绩处
                                                    </li>
                                                </ul>

                                                <form method="post" action="${pageContext.request.contextPath}/giveScore">
                                                    <input type="hidden" name="entryId" value="${entry.entryId}">
                                                    <div class="form-group">
                                                        <div class="col-sm-10">
                                                            <input class="form-control" type="text" name="score">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="col-sm-10">
                                                            <button type="submit" class="btn btn-dark m-b-10 m-l-5">给分</button>
                                                        </div>
                                                    </div>
                                                </form>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

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
