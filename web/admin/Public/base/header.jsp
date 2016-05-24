<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/23
  Time: 下午5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title><%= SITE_NAME%>-后台管理中心</title>

    <meta name="description" content="overview &amp; stats" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link href="<%=CSS %>/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="<%=CSS %>/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="<%=CSS %>/font-awesome-ie7.min.css" />
    <![endif]-->

    <!-- page specific plugin styles -->

    <link type="image/x-icon" href="<?php echo resize(C('SITE_ICON'),16,16); ?>" rel="icon">
    <link type="image/x-icon" href="<?php echo resize(C('SITE_ICON'),16,16); ?>" rel="bookmark">


    <link rel="stylesheet" href="<%=CSS %>/ace.min.css" />
    <link rel="stylesheet" href="<%=CSS %>/ace-rtl.min.css" />
    <link rel="stylesheet" href="<%=CSS %>/ace-skins.min.css" />

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="<%=CSS %>/ace-ie.min.css" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->

    <script src="<%=JS%>/ace-extra.min.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="<%=JS%>/html5shiv.js"></script>
    <script src="<%=JS%>/respond.min.js"></script>
    <![endif]-->

    <block name="css">

    </block>

</head>
