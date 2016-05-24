<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/24
  Time: 上午7:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body class="navbar-fixed">
<div class="navbar navbar-default navbar-fixed-top" id="navbar">

    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="{:U('Index/index')}" class="navbar-brand">
                <small>
                    <!--
                    <i class="icon-leaf"></i>
                    -->
                    <%=SITE_NAME %> 后台管理
                </small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->

        <div class="navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">

                <li class="light-blue">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">

								<span class="user-info">
									<%=session.getAttribute("user")%>
								</span>

                        <i class="icon-caret-down"></i>
                    </a>

                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">


                        <li class="divider"></li>

                        <li>
                            <a target="_blank" href="__ROOT__/">网站前台</a>
                            <a href="{:U('Public/clear')}">清空缓存</a>
                            <a href="{:U('Public/logout')}">退出系统</a>
                        </li>
                    </ul>
                </li>
            </ul><!-- /.ace-nav -->
        </div><!-- /.navbar-header -->
    </div><!-- /.container -->
</div>

