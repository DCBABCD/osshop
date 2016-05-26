<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/24
  Time: 上午7:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>

    <div class="main-container-inner">
        <a class="menu-toggler" id="menu-toggler" href="#">
            <span class="menu-text"></span>
        </a>

        <div class="sidebar sidebar-fixed" id="sidebar">

            <ul class="nav nav-list">
                <li>
                    <a href="#" class="dropdown-toggle">
                        <i class=""></i>
                        <span class="menu-text">用户管理</span>
                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">
                        <li>
                            <a href="<%=basePath %>admin/user/list.do">
                                <i class="icon-double-angle-right"></i>
                                <span class="url-title">用户列表</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
            <ul class="nav nav-list">
                <li>
                    <a href="#" class="dropdown-toggle">
                        <i class=""></i>
                        <span class="menu-text">商品管理</span>
                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">
                        <li>
                            <a href="<%=basePath %>admin/product/list.do">
                                <i class="icon-double-angle-right"></i>
                                <span class="url-title">商品列表</span>
                            </a>
                        </li>
                        <li>
                            <a href="<%=basePath %>admin/product/product_add.jsp">
                                <i class="icon-double-angle-right"></i>
                                <span class="url-title">添加商品</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
            <ul class="nav nav-list">
                <li>
                    <a href="#" class="dropdown-toggle">
                        <i class=""></i>
                        <span class="menu-text">订单管理</span>
                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">
                        <li>
                            <a href="<%=basePath %>admin/order/order_list.jsp">
                                <i class="icon-double-angle-right"></i>
                                <span class="url-title">订单列表</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>

            <div class="sidebar-collapse" id="sidebar-collapse">
                <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
            </div>

            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
            </script>
        </div>
