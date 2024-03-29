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
    <div class="page-header">
        <h1>
            用户管理
            <small>
                <i class="icon-double-angle-right"></i>
                用户详情
            </small>
        </h1>
    </div>
    <ul class="nav nav-tabs">

        <li class="active"><a href="#tab-member" data-toggle="tab">会员资料</a></li>

        <li><a href="#tab-shipping" data-toggle="tab">收货地址</a></li>

    </ul>
    <form class="form-horizontal" id="validation-form"  method="post" action='{$action}'>
        <div class="tab-content">
            <notempty name="Think.get.id">
                <input name="member_id" type="hidden" value="{$Think.get.id}" />
            </notempty>
            <div class="tab-pane active" id="tab-member">
                <table class="table table-binfoed">
                    <tr>
                        <td>ID</td>
                        <td>{$data.info.member_id}</td>
                    </tr>

                    <tr>
                        <td>用户名</td>
                        <td>{$data.info.uname}</td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td><input id="pwd" name="pwd" type="text" style="width:400px;" value="<?php echo think_ucenter_decrypt($data['info']['pwd'],C('PWD_KEY')); ?>" /></td>
                    </tr>
                    <tr>
                        <td>电子邮件</td>
                        <td><input name="email" type="text" style="width:400px;" value="{$data.info.email|default=''}" /></td>

                    </tr>
                    <tr>
                        <td>联系电话</td>
                        <td><input name="telephone" type="text" style="width:400px;" value="{$data.info.telephone|default=''}" /></td>

                    </tr>

                    <tr>
                        <td>登录IP地址</td>
                        <td>{$data.info.ip_region}</td>
                    </tr>
                    <tr>
                        <td>登录次数</td>
                        <td>{$data.info.login_count}</td>
                    </tr>
                    <tr>
                        <td>创建时间</td>
                        <td>{$data.info.create_time|toDate='Y/m/d H:i:s'}</td>
                    </tr>
                    <tr>
                        <td>最近登录时间</td>
                        <td>{$data.info.last_login_time|toDate='Y/m/d H:i:s'}</td>
                    </tr>
                    <tr>
                        <td>状态</td>
                        <td>
                            <label class="radio-inline">
                                <input type="radio" checked="checked" value="1" name="status">启用</label>
                            <label class="radio-inline">
                                <input type="radio" value="0" name="status">停用</label>
                        </td>
                    </tr>
                </table>
                <div class="form-group">

                    <div style="margin-left:20px;">
                        <input name="send" type="submit" value="提交" class="btn btn-primary" />
                    </div>
                </div>
            </div>
            <div class="tab-pane" id="tab-shipping">
                <table class="table table-binfoed">
                    <volist name="data.address" id="vo">
                        <tr>
                            <td>收货人姓名: {$vo.name}</td>
                            <td>所在地:</td>
                            <td>
                                <?php echo get_area_name($vo['province_id']); ?>，
                                <?php echo get_area_name($vo['city_id']); ?>，
                                <?php echo get_area_name($vo['country_id']); ?>
                            </td>
                            <td>地址:</td>
                            <td>{$vo.address}</td>
                            <td>联系电话:</td>
                            <td>{$vo.telephone}</td>
                        </tr>
                    </volist>
                </table>
            </div>

        </div>
    </form>
</div>




<%@include file="../Public/base/body_footer.jsp"%>