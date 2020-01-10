<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/24
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ch">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">



    <title>applyCompetition</title>

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
                                <h4>applyCompetition</h4>

                            </div>
                            <div class="card-body">
                                <div class="horizontal-form-elements">
                                    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/applyCompetition">
                                        <div class="row">
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">比赛名称</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="text" name="compName">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">比赛描述</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="text" name="compDesc">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">是否提交作品</label>
                                                    <div class="col-sm-10">
                                                        <label>
                                                            <input type="radio" name="isPro" value="N" checked/>
                                                            <span class="radio"></span>
                                                            <span class="item" style="font-size: 20px">不提交作品</span>
                                                        </label>
                                                        <label style="margin-left: 20px">
                                                            <input type="radio" name="isPro" value="Y"/>
                                                            <span class="radio"></span>
                                                            <span class="item" style="font-size: 20px">提交作品</span>
                                                        </label>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">可参赛性质</label>
                                                    <div class="col-sm-10">
                                                        <label>
                                                            <input type="radio" name="isPer" value="1" checked/>
                                                            <span class="radio"></span>
                                                            <span class="item" style="font-size: 20px">个人</span>
                                                        </label>
                                                        <label style="margin-left: 20px">
                                                            <input type="radio" name="isPer" value="2"/>
                                                            <span class="radio"></span>
                                                            <span class="item" style="font-size: 20px">团队</span>
                                                        </label>
                                                        <label style="margin-left: 20px">
                                                            <input type="radio" name="isPer" value="3"/>
                                                            <span class="radio"></span>
                                                            <span class="item" style="font-size: 20px">都可</span>
                                                        </label>
                                                    </div>
                                                </div>

                                            </div>
                                            <!-- /# column -->
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">开始报名时间</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="date" name="beginTime" /><br>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="col-sm-2 control-label">截止报名时间</label>
                                                    <div class="col-sm-10">
                                                        <input class="form-control" type="date" name="endTime" /><br>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-10">
                                                        <button type="submit" class="btn btn-dark m-b-10 m-l-5">申请比赛></button>
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
</html>
