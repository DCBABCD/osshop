<%@ page import="java.util.List" %>
<%@ page import="com.osadmin.bean.product" %>
<%@ page import="java.util.Iterator" %><%--
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
                <a href="#">商品管理</a>
            </li>
            <li class="active">商品列表</li>

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
                                <th>商品ID</th>
                                <th>标题</th>
                                <th>库存</th>
                                <th>价格</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <%
                                List<product>list = (List<product>) request.getAttribute("allProduct");
                                Iterator<product>it = list.iterator();
                                product pu = null;
                                while (it.hasNext()){
                                    pu = it.next();

                            %>
                                <tr>
                                    <td><%=pu.getProductID() %></td>
                                    <td><%=pu.getName() %></td>
                                    <td><%=pu.getNum() %> 件</td>
                                    <td><%=pu.getPrice() %> 元</td>

                                    <td>
                                        <a  class="btn btn-xs btn-info" href='/admin/product/edit.do?id=<%=pu.getProductID() %>'>
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