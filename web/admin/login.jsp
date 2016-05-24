<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/23
  Time: 下午4:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Public/base/base.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>登录 - 后台管理系统</title>

    <meta name="description" content="User login page" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- basic styles -->

    <link href="<%=CSS %>/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="<%=CSS %>/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="<%=CSS %>/font-awesome-ie7.min.css" />
    <![endif]-->

    <!-- ace styles -->

    <link rel="stylesheet" href="<%=CSS %>/ace.min.css" />
    <link rel="stylesheet" href="<%=CSS %>/ace-rtl.min.css" />
    <link type="image/x-icon" href="<%=IMAGE %>/ypci.jpg" rel="icon">
    <link type="image/x-icon" href="<%=IMAGE %>/ypci.jpg" rel="bookmark">
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="<%=CSS %>/ace-ie.min.css" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="<%=JS %>/html5shiv.js"></script>
    <script src="<%=JS %>/respond.min.js"></script>
    <![endif]-->
</head>

<body class="login-layout">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center">
                        <h1>
                            <i class="icon-leaf green"></i>
                            <span class="red"><%=SITE_NAME %></span>
                            <span class="white">网站管理</span>
                        </h1>
                        <h4 class="blue">&copy; <%=COPY%></h4>
                    </div>

                    <div class="space-6"></div>

                    <div class="position-relative">
                        <div id="login-box" class="login-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header blue lighter bigger">
                                        <i class="icon-coffee green"></i>
                                        请输入你的登录信息
                                    </h4>

                                    <div class="space-6"></div>

                                    <form action="<%=basePath %>/admin/login.do" method="post" class="login-form">
                                        <fieldset>
                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input name="name" type="text" class="form-control" placeholder="用户名" />
															<i class="icon-user"></i>
														</span>
                                            </label>

                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" name="password" class="form-control" placeholder="密码" />
															<i class="icon-lock"></i>
														</span>
                                            </label>

                                            <div class="space"></div>

                                            <div class="clearfix">
                                                <label class="inline">
                                                    <input type="checkbox" class="ace" />
                                                    <span class="lbl"> 记住我</span>
                                                </label>

                                                <button type="submit"  class="login-btn width-35 pull-right btn btn-sm btn-primary">
                                                    <i class="icon-key"></i>
                                                    登录
                                                </button>
                                                <div class="check-tips" style="color:red;"></div>
                                            </div>

                                            <div class="space-4"></div>
                                        </fieldset>
                                    </form>




                                </div><!-- /widget-main -->


                            </div><!-- /widget-body -->
                        </div><!-- /login-box -->



                    </div><!-- /position-relative -->
                </div>
            </div><!-- /.col -->
        </div><!-- /.row -->
    </div>
</div><!-- /.main-container -->

<!-- basic scripts -->


<script src="<%=JS %>/jquery/jquery-2.0.3.min.js"></script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    function show_box(id) {
        jQuery('.widget-box.visible').removeClass('visible');
        jQuery('#'+id).addClass('visible');
    }
</script>
<script type="text/javascript">

    //表单提交


    $("form").submit(function(){

      );


</script>
</body>
</html>

