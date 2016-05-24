<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/23
  Time: 下午5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
用于定义常用变量
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String SITE_NAME = "长大水果店";
    String COPY = "BladePointStudio";
    String PUBLIC = basePath+"/admin/Public";
    String CSS = basePath+"/admin/Public/css";
    String JS = basePath+"/admin/Public/js";
    String IMAGE = basePath+"/admin/Public/image";
%>
