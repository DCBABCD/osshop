<%@ page import="java.util.List" %>
<%@ page import="com.osadmin.bean.user" %>
<%@ page import="java.util.Iterator" %>
<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/23
  Time: 下午6:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../Public/base/header.jsp"%>
<%@include file="../Public/base/body_top.jsp"%>
<%@include file="../Public/base/body_left.jsp"%>


<div class="main-content">
    <div class="breadcrumbs" id="breadcrumbs">
        <script type="text/javascript">
            try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
        </script>

        <ul class="breadcrumb">

            <li>
                <i class="icon-home home-icon"></i>
                <a href="#">用户管理</a>
            </li>
            <li class="active">用户列表</li>

        </ul><!-- .breadcrumb -->


    </div>

    <div class="page-content">

        <block name="content">

            <%--<div class="page-header">--%>
            <%--<a href="{:U('Member/add')}" class="btn btn-primary">新增用户</a>--%>
            <%--</div>--%>

            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>用户ID</th>
                                <th>姓名</th>
                                <th>手机号码</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <%
                                List<user>list = (List<user>) request.getAttribute("allUser");
                                Iterator<user> it = list.iterator();
                                user usr = null;
                                while (it.hasNext()){
                                    usr = it.next();

                            %>
                                <tr>
                                    <td><%=usr.getUserID() %></td>
                                    <td><%=usr.getName() %></td>
                                    <td><%=usr.getTel() %></td>

                                    <td>
                                        <a  class="btn btn-xs btn-info" href='/admin/user/edit.do?id=<%=usr.getUserID() %>'>
                                            <i class="icon-eye-open bigger-120"></i>
                                        </a>
                                    </td>
                                </tr>
                            <% } %>
                            <%----%>
                            <%--<tr>--%>
                            <%--<td colspan="20" class="page">{$page}</td>--%>
                            <%--</tr>--%>

                            </tbody>

                        </table>
                    </div>
                </div>
            </div>
        </block>

    </div><!-- /.page-content -->
</div><!-- /.main-content -->


<%@include file="../Public/base/body_footer.jsp"%>