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


    <title>joinCompStep2</title>

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
                            <div class="card-title">
                                <h4>joinCompStep2</h4>
                            </div>
                            <div class="card-body">
                                <div class="horizontal-form-elements">
                                    <form class="form-horizontal" id="myForm" method="post"
                                          action="${pageContext.request.contextPath}/step2Finish">
                                        <div class="row">

                                            <div class="col-lg-6">
                                                <c:forEach items="${competition.competitionExtCustomList}"
                                                           var="competitionExtCustom" varStatus="i">
                                                    <input type="hidden" name="entryExtCustomList[${i.index }].entryId"
                                                           value="${entry.entryId}"/>
                                                    <input type="hidden"
                                                           name="entryExtCustomList[${i.index }].compExtendId"
                                                           value="${competitionExtCustom.compExtendId}"/>

                                                    <div class="form-group">
                                                        <label class="col-sm-2 control-label">${competitionExtCustom.extendKey}</label>
                                                        <div class="col-sm-10">
                                                            <input type="text" class="form-control"
                                                                   name="entryExtCustomList[${i.index }].extendValue">
                                                        </div>
                                                    </div>
                                                </c:forEach>
                                            </div>
                                            <!-- /# column -->
                                            <div class="col-lg-6">
                                                <div class="form-group">
                                                    <div class="col-sm-10">
                                                        <button type="submit" class="btn btn-dark m-b-10 m-l-5">下一步>
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- /# column -->
                                        </div>
                                    </form>
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

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
</html>
