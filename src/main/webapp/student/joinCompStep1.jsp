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



    <title>joinCompStep1</title>

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
                                <h4>joinCompStep1</h4>

                            </div>
                            <div class="card-body">
                                <div class="horizontal-form-elements">
                                    <form class="form-horizontal" id="myForm" method="post" action="${pageContext.request.contextPath}/step1Finish">
                                        <input type="hidden" name="studentId" value="${student.studentId}">
                                        <input type="hidden" name="compId" value="${competition.compId}">
                                        <div class="row">
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">比赛</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="text" value="${competition.compId} ${competition.compName}"
                                                               disabled="">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">学号</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="text" value="${student.studentId}"
                                                               disabled="">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">姓名</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="text" value="${student.studentName}"
                                                               disabled="">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">手机号</label>
                                                    <div class="col-sm-10">
                                                        <input type="text" class="form-control"
                                                               name="phone">
                                                    </div>
                                                </div>

                                            </div>
                                            <!-- /# column -->
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">参赛性质</label>
                                                    <div class="col-sm-10">
                                                        <c:if test="${competition.isPer=='1'}">
                                                            <input type="hidden" name="isPer" value="Y">
                                                            <input class="form-control" type="text" value="仅个人"
                                                                   disabled="">
                                                        </c:if>
                                                        <c:if test="${competition.isPer=='2'}">
                                                            <input type="hidden" name="isPer" value="N">
                                                            <input class="form-control" type="text" value="仅团队"
                                                                   disabled="">
                                                        </c:if>
                                                        <c:if test="${competition.isPer=='3'}">
                                                            <label>
                                                                <input id="perRadio" type="radio" name="isPer" value="Y" checked/>
                                                                <span class="radio"></span>
                                                                <span class="item" style="font-size: 20px">个人</span>
                                                            </label>
                                                            <br>
                                                            <label>
                                                                <input id="teamRadio" type="radio" name="isPer" value="N"/>
                                                                <span class="radio"></span>
                                                                <span class="item" style="font-size: 20px">团队</span>
                                                            </label>

                                                        </c:if>
                                                    </div>
                                                </div>

                                                <c:if test="${competition.isPer=='2'}">
                                                    <div class="form-group">
                                                        <label class="col-sm-2 control-label">小队名称</label>
                                                        <div class="col-sm-10">
                                                            <input type="text" class="form-control"
                                                                   name="teamName">
                                                        </div>
                                                    </div>
                                                </c:if>

                                                <div class="form-group" id="myAdd">
                                                    <div class="col-sm-10">
                                                        <button type="submit" class="btn btn-dark m-b-10 m-l-5">下一步></button>
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

<style>
    /* 把单选框隐藏 */
    label input[type="radio"] {
        display: none;
    }
    /* 自定义单选框初始样式 */
    label .radio {
        display: inline-block;
        position: relative;
        width: 16px;
        height: 16px;
        border-radius: 50%;
        border: 2px solid #777;
        vertical-align: -4px;
    }
    /* 自定义单选框选中样式 初始隐藏*/
    label .radio::after {
        content: "";
        width: 10px;
        height: 10px;
        position: absolute;
        left: 0;
        right: 0;
        top: 0;
        bottom: 0;
        margin: auto;
        background-color: #299;
        border-radius: 50%;
        display: none;
    }
    /* 显示自定义单选框 */
    label input[type="radio"]:checked+.radio::after {
        display: block;
    }
    /* 切换自定义单选框border颜色 */
    label input[type="radio"]:checked+.radio {
        border-color: #299;
    }

    /* 选中时，文本加颜色 */
    label input[type="radio"]:checked~.item {
        color: #199;
    }

</style>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

    $(function () {
        $("#teamRadio").change(function () {
            if ($("#teamRadio").prop("checked") == true){
                var txt1 = "<div id=\"teamName\" class=\"form-group\">" +
                    "<label class=\"col-sm-2 control-label\">小队名称</label>" +
                    "<div class=\"col-sm-10\">" +
                    "<input type=\"text\" class=\"form-control\"" +
                    "name=\"teamName\">" +
                    "</div>" +
                    "</div>"
                $("#myAdd").before(txt1);
            }
        })
        $("#perRadio").change(function () {
            if ($("#perRadio").prop("checked") == true){
                $("#teamName").remove();
            }
        })
    })
</script>

</html>
