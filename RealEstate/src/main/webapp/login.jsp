<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/7
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h1 class="text-center">
                房产信息查询系统
            </h1>
            <div class="row clearfix">
                <div class="col-md-12 column">
                </div>
                <p class="navbar-text navbar-right">
                    <span>深思</span> <i class="glyphicon glyphicon-log-in"
                                                             aria-hidden="true"></i>&nbsp;&nbsp;<a
                        href="${pageContext.request.contextPath}/admin/exit"
                        class="navbar-link">退出</a>
                </p>
            </div>
            <div class="row clearfix">
                <div class="col-md-12 column">
                </div>
            </div>
            <div class="row clearfix">
                <div class="col-md-4 column">
                    <div class="page-header">
                        <h1>
                            <a href="biaoge.jsp">房产信息查询</a>
                        </h1>
                    </div>
                </div>
                <div class="col-md-8 column">
                    <div class="jumbotron">
                        <h1>
                            欢迎使用房产查询系统
                        </h1>

                        <p>
                            <a class="btn btn-primary btn-large" href="denglu.jsp">more</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
