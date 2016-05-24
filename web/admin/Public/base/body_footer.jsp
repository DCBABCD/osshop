<%--
  Created by IntelliJ IDEA.
  User: RandolfJay
  Date: 16/5/24
  Time: 上午7:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
</div><!-- /.main-container-inner -->

<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
    <i class="icon-double-angle-up icon-only bigger-110"></i>
</a>
</div><!-- /.main-container -->

<!-- basic scripts -->

<!--[if !IE]> -->
<block name="jquery">
    <script src="<%=JS%>/jquery/jquery-2.0.3.min.js"></script>
    <script src="<%=JS%>/jquery/jquery-migrate-1.2.1.min.js"></script>
</block>
<!-- <![endif]-->

<!--[if IE]>
<script src="<%=JS%>/jquery/jquery-1.10.2.min.js"></script>
<script src="<%=JS%>/jquery/jquery-migrate-1.2.1.min.js"></script>
<![endif]-->

<script type="text/javascript">
    if("ontouchend" in document) document.write("<script src='<%=JS%>/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="<%=JS%>/bootstrap.min.js"></script>
<script src="<%=JS%>/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<!--[if lte IE 8]>
<script src="<%=JS%>/excanvas.min.js"></script>
<![endif]-->

<script src="<%=JS%>/ace-elements.min.js"></script>
<script src="<%=JS%>/ace.min.js"></script>

<!-- inline scripts related to this page -->
<script src="<%=JS%>/oscshop_common.js"></script>
<block name="javascript">

</block>
</body>
</html>

