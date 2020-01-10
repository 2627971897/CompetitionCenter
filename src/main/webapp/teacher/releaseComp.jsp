<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/25
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">



    <title>releaseComp</title>

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
                                <h4>releaseComp</h4>

                            </div>
                            <div class="card-body">
                                <div class="horizontal-form-elements">
                                    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/releaseCompByCid" onsubmit="return check()">
                                        <input type="hidden" name="compId" value="${competition.compId}">
                                        <div class="row">
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">比赛代码</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="text" value="${competition.compId}"
                                                               disabled="">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">比赛名称</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="text" value="${competition.compName}"
                                                               disabled="">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">年级范围</label>
                                                    <div class="col-sm-10">
                                                        <input id="c9" type="checkbox" name="grade" value="9" checked/>全年级
                                                        <input id="c1" type="checkbox" name="grade" value="1" checked/>大一
                                                        <input id="c2" type="checkbox" name="grade" value="2" checked/>大二
                                                        <input id="c3" type="checkbox" name="grade" value="3" checked/>大三
                                                        <input id="c4" type="checkbox" name="grade" value="4" checked/>大四
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">学院范围</label>
                                                    <div class="col-sm-10">
                                                        <select class="form-control" name="deptId">
                                                            <c:forEach items="${deptList}" var="dept">
                                                                <option value="${dept.deptId}">${dept.deptId} ${dept.deptName}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                </div>

                                            </div>
                                            <!-- /# column -->
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <div class="col-sm-10">
                                                        <button type="button" class="btn btn-dark btn-flat btn-addon m-b-10 m-l-5" onclick="addExtend()"><i class="ti-plus"></i>添加扩展信息</button><label style="margin-left: 15px">(注：已有“手机号”为必填项)</label>
                                                    </div>
                                                </div>

                                                <div class="form-group" id="myAdd">
                                                    <div class="col-sm-10">
                                                        <button type="submit" class="btn btn-dark m-b-10 m-l-5">确认信息并发布></button>
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

    input[type="checkbox"]{
        margin-left: 15px;
    }

</style>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

    var index = 1;

    function addExtend() {
        var txt1 = "<div class=\"form-group\">"+
                        "<label class=\"col-sm-2 control-label\">扩展信息" + index + "</label>"+
                        "<div class=\"col-sm-10\">"+
                            "<input class=\"form-control\" type=\"text\" name=\"myExtend\" >"+
                        "</div>"+
                    "</div>";
        $("#myAdd").before(txt1);
        index = index + 1;
    }
    function check(){
        if ($("#c1").prop("checked") == false&&$("#c2").prop("checked") == false
            &&$("#c3").prop("checked") == false&&$("#c4").prop("checked") == false
            &&$("#c9").prop("checked") == false) {
            alert("请选择年级范围！！");
            return false;
        }
        return true;
    }

    $(function(){
        $("#c9").click(function(){
            if ($("#c9").prop("checked") == true) {
                $("#c1").prop("checked", true);
                $("#c2").prop("checked", true);
                $("#c3").prop("checked", true);
                $("#c4").prop("checked", true);
            }else {
                $("#c1").prop("checked", false);
                $("#c2").prop("checked", false);
                $("#c3").prop("checked", false);
                $("#c4").prop("checked", false);
            }
        });
        $("#c1").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
        $("#c2").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
        $("#c3").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
        $("#c4").click(function(){
            if ($("#c1").prop("checked") == true&&$("#c2").prop("checked") == true
                &&$("#c3").prop("checked") == true&&$("#c4").prop("checked") == true) {
                $("#c9").prop("checked", true);
            }else {
                $("#c9").prop("checked", false);
            }
        });
    });
</script>

</html>
