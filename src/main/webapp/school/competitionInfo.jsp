<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>competitionInfo</title>

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
                                        <div class="col-lg-4">
                                            <div class="user-photo m-b-30">
                                                <img class="img-fluid" src="${pageContext.request.contextPath}/assets/images/user-profile.jpg" alt=""/>
                                            </div>
                                        </div>
                                        <div class="col-lg-8">
                                            <div class="user-profile-name">${competition.compName}</div>
                                            <div class="user-Location">
                                                <i class="ti-location-pin"></i> ${competition.compId}
                                            </div>
                                            <div class="user-job-title">${competition.teacherName}</div>
                                            <div class="ratings" style="padding: 0px 15px">
                                                <h7>${competition.compDesc}</h7>
                                            </div>
                                            <div class="custom-tab user-profile-tab">
                                                <ul class="nav nav-tabs" role="tablist">
                                                    <li role="presentation" class="active">
                                                        <a href="#1" aria-controls="1" role="tab" data-toggle="tab">相关信息</a>
                                                    </li>
                                                </ul>
                                                <div class="tab-content">
                                                    <div role="tabpanel" class="tab-pane active" id="1">
                                                        <div class="contact-information">
                                                            <div class="phone-content">
                                                                <span class="contact-title">是否提交作品:</span>
                                                                <span class="phone-number">
                                                                    <c:if test="${competition.isPro=='Y'}">
                                                                        提交
                                                                    </c:if>
                                                                    <c:if test="${competition.isPro=='N'}">
                                                                        不提交
                                                                    </c:if>
                                                                </span>
                                                            </div>
                                                            <div class="address-content">
                                                                <span class="contact-title">参赛性质:</span>
                                                                <span class="mail-address">
                                                                    <c:if test="${competition.isPer=='1'}">
                                                                        仅个人
                                                                    </c:if>
                                                                    <c:if test="${competition.isPer=='2'}">
                                                                        仅团队
                                                                    </c:if>
                                                                    <c:if test="${competition.isPer=='3'}">
                                                                        都可
                                                                    </c:if>
                                                                </span>
                                                            </div>
                                                            <div class="email-content">
                                                                <span class="contact-title">申请时间:</span>
                                                                <span class="contact-email"><fmt:formatDate pattern="yyyy-MM-dd HH:mm:SS" value="${competition.applyTime}"/></span>
                                                            </div>
                                                            <div class="website-content">
                                                                <span class="contact-title">报名开始时间:</span>
                                                                <span class="contact-website"><fmt:formatDate pattern="yyyy-MM-dd" value="${competition.beginTime}"/></span>
                                                            </div>
                                                            <div class="website-content">
                                                                <span class="contact-title">截止报名时间:</span>
                                                                <span class="contact-website"><fmt:formatDate pattern="yyyy-MM-dd" value="${competition.endTime}"/></span>
                                                            </div>
                                                            <div class="skype-content">
                                                                <span class="contact-title">比赛状态:</span>
                                                                <span class="contact-skype">
                                                                    <c:if test="${competition.compStatus=='1'}">
                                                                        待审核
                                                                    </c:if>
                                                                    <c:if test="${competition.compStatus=='2'}">
                                                                        审核通过，待发布报名信息
                                                                    </c:if>
                                                                    <c:if test="${competition.compStatus=='3'}">
                                                                        正在报名中...
                                                                    </c:if>
                                                                    <c:if test="${competition.compStatus=='4'}">
                                                                        报名截止，待比赛截止
                                                                    </c:if>
                                                                    <c:if test="${competition.compStatus=='5'}">
                                                                        比赛截止，待录入成绩
                                                                    </c:if>
                                                                    <c:if test="${competition.compStatus=='9'}">
                                                                        审核未通过
                                                                    </c:if>
                                                                    <c:if test="${competition.compStatus=='0'}">
                                                                        已结束
                                                                    </c:if>
                                                                </span>
                                                            </div>

                                                            <c:if test="${not empty competition.competitionScopeCustomList}">

                                                                <div class="website-content">
                                                                    <span class="contact-title">年级范围:</span>
                                                                    <span class="contact-website">
                                                                        <c:forEach items="${competition.competitionScopeCustomList}" var="competitionScope">
                                                                            <c:if test="${competitionScope.value=='9'}">
                                                                                全年级
                                                                            </c:if>
                                                                            <c:if test="${competitionScope.value=='1'}">
                                                                                大一
                                                                            </c:if>
                                                                            <c:if test="${competitionScope.value=='2'}">
                                                                                大二
                                                                            </c:if>
                                                                            <c:if test="${competitionScope.value=='3'}">
                                                                                大三
                                                                            </c:if>
                                                                            <c:if test="${competitionScope.value=='4'}">
                                                                                大四
                                                                            </c:if>
                                                                        </c:forEach>
                                                                    </span>
                                                                </div>
                                                            </c:if>

                                                            <c:if test="${not empty competition.competitionObjCustomList}">
                                                                <div class="website-content">
                                                                    <span class="contact-title">学院范围:</span>
                                                                    <span class="contact-website">
                                                                        <c:forEach items="${competition.competitionObjCustomList}" var="competitionObjCustom">
                                                                            ${competitionObjCustom.deptName}&nbsp;
                                                                        </c:forEach>
                                                                    </span>
                                                                </div>
                                                            </c:if>

                                                            <c:if test="${not empty competition.competitionExtCustomList}">
                                                                <div class="website-content">
                                                                    <span class="contact-title">拓展信息:</span>
                                                                    <span class="contact-website">
                                                                        <c:forEach items="${competition.competitionExtCustomList}" var="competitionExtCustom">
                                                                            ${competitionExtCustom.extendKey}&nbsp;
                                                                        </c:forEach>
                                                                    </span>
                                                                </div>
                                                            </c:if>

                                                        </div>
                                                    </div>
                                                </div>
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
