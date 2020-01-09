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


    <title>joinCompStep3</title>

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
                                <h4>joinCompStep3</h4>
                            </div>
                            <div class="card-body">
                                <div class="horizontal-form-elements">
                                    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/step3Finish">
                                        <div class="row">

                                            <div class="col-lg-6">

                                                <div class="form-group" id="myAdd">
                                                    <table class="table table-hover ">
                                                        <tr>
                                                            <th colspan="2" style="font-weight: bolder">成员1<input type="hidden" name="entrySlaCustomList[0].entryId" value="${entry.entryId}"></th>
                                                        </tr>
                                                        <tr>
                                                            <td>学号：</td>
                                                            <td><input type="text" name="entrySlaCustomList[0].studentId"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>电话：</td>
                                                            <td><input type="tel" name="entrySlaCustomList[0].phone"></td>
                                                        </tr>
                                                    </table>
                                                </div>


                                            </div>
                                            <!-- /# column -->
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <div class="col-sm-10">
                                                        <button type="button" class="btn btn-dark m-b-10 m-l-5" onclick="add()">添加成员</button>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-10">
                                                        <button type="submit" class="btn btn-dark m-b-10 m-l-5">提交</button>
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
<script type="text/javascript">
    var index = 1;
    function add(){
        var txt1="<div class=\"form-group\" id=\"myAdd\">" +
                    "<table class=\"table table-hover \">" +
                        "<tr>" +
                            "<th colspan=\"2\" style=\"font-weight: bolder\">成员" + (index + 1) +
                            "<input type=\"hidden\" name=\"entrySlaCustomList["+ index +"].entryId\" value=\"${entry.entryId}\"></th>" +
                        "</tr>" +
                        "<tr>" +
                            "<td>学号：</td>" +
                            "<td><input type=\"text\" name=\"entrySlaCustomList["+ index +"].studentId\"></td>" +
                        "</tr>" +
                        "<tr>" +
                            "<td>电话：</td>" +
                            "<td><input type=\"tel\" name=\"entrySlaCustomList["+ index +"].phone\"></td>" +
                        "</tr>" +
                    "</table>" +
                "</div>";
        $("#myAdd").after(txt1);
        $("#myAdd").removeAttr("id");
        index = index + 1;
    }
</script>
</html>
