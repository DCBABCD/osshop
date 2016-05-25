<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/25
  Time: 上午8:02
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
            <li class="active">添加商品</li>

        </ul><!-- .breadcrumb -->
        <button name="send" id="send" form="form-goods" type="submit" style="float:right;margin-top: 3px;"  class="btn btn-sm btn-primary">提交</button>
    </div>
    <div class="row">
        <div class="col-xs-12">
            <div class="panel-body">
                <form id="myform" action="<%=basePath %>/admin/product/add.do" method="post" enctype="multipart/form-data" id="form-goods" class="form-horizontal">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tab-general" data-toggle="tab">基本信息</a></li>
                        <li><a href="#tab-image" data-toggle="tab">商品图片</a></li>
                    </ul>
                    <div class="tab-content">
                        <!-- 常规 START -->
                        <div class="tab-pane active" id="tab-general">

                            <div class="form-group required">
                                <label class="col-sm-2 control-label" for="input-name2">商品名称：</label>
                                <div class="col-sm-10">
                                    <input id="input-name" class="form-control" type="text" placeholder="商品名称" value="" name="name">
                                </div>
                            </div>

                            <div class="form-group required">
                                <label class="col-sm-2 control-label" for="input-name2">商品价格：</label>
                                <div class="col-sm-10">
                                    <input id="input-price" class="form-control" type="text" placeholder="商品价格" value="" name="price">
                                </div>
                            </div>

                            <div class="form-group required">
                                <label class="col-sm-2 control-label" for="input-name2">商品颜色：</label>
                                <div class="col-sm-10">
                                    <input id="input-color" class="form-control" type="text" placeholder="商品颜色" value="" name="color">
                                </div>
                            </div>

                            <div class="form-group required">
                                <label class="col-sm-2 control-label" for="input-name2">商品尺寸：</label>
                                <div class="col-sm-10">
                                    <input id="input-size" class="form-control" type="text" placeholder="商品尺寸" value="" name="size">
                                </div>
                            </div>

                            <div class="form-group required">
                                <label class="col-sm-2 control-label" for="input-name2">商品库存：</label>
                                <div class="col-sm-10">
                                    <input id="input-name2" class="form-control" type="text" placeholder="商品库存" value="" name="num">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="input-description">商品详情：</label>
                                <div class="col-sm-10">
                                    <textarea name="detail" id="description"></textarea>
                                </div>
                            </div>

                        </div>
                        <!-- 常规 END -->
                        <!-- 图片 START -->
                        <div class="tab-pane" id="tab-image">
                            <div class="table-responsive">
                                <table id="images" class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <td class="text-left">图片编号</td>
                                        <td class="text-right">上传图片</td>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <tr id="gallery-image-row1">
                                        <td class="text-left">图片一</td>
                                        <td class="text-right"><input type="file" name="image_01" value="" class="form-control" /></td>
                                        </tr>
                                        <tr id="gallery-image-row2">
                                        <td class="text-left">图片二</td>
                                        <td class="text-right"><input type="file" name="image_02" value="" class="form-control" /></td>
                                        </tr>
                                        <tr id="gallery-image-row3">
                                        <td class="text-left">图片三</td>
                                        <td class="text-right"><input type="file" name="image_03" value="" class="form-control" /></td>
                                        </tr>
                                        <tr id="gallery-image-row4">
                                        <td class="text-left">图片四</td>
                                        <td class="text-right"><input type="file" name="image_04" value="" class="form-control" /></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <!-- 图片 END -->
                    </div>
                </form>
            </div>
        </div>
    </div>
</block>

    <style>
        .table thead > tr > td, .table tbody > tr > td {
            vertical-align: middle;
        }
        .table thead td span[data-toggle="tooltip"]:after, label.control-label span:after {
            font-family: FontAwesome;
            color: #1E91CF;
            content: "\f059";
            margin-left: 4px;
        }
    </style>
    <%@include file="../Public/base/body_footer.jsp"%>
    <script src="<%=PUBLIC %>/ckeditor/ckeditor.js"></script>
    <script src="<%=PUBLIC %>/fileupload/jquery.ui.widget.js"></script>
    <script src="<%=PUBLIC %>/fileupload/jquery.fileupload.js"></script>
    <script>
        CKEDITOR.replace('description', {
            filebrowserImageUploadUrl: '<%=basePath %>/ckeditor/uploader',
            toolbar: [
                [ 'Source', 'Bold', 'Italic', 'Underline', 'Strike', 'Subscript', 'Superscript', '-', 'RemoveFormat' ],
                [ 'FontSize', 'TextColor', 'BGColor' ],
                [ 'JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock','Image','Format']
            ]
        });
        $("#send").click(function(){
            $("#myform").submit();
        });
    </script>

    </div>

