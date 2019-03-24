<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加分类</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/admin.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/leftNav.css">
<script type="text/javascript">
<!--
	window.onload = function() {
		var tipMessage="${requestScope.tipMessage }";
		if(tipMessage!="")
			window.alert(tipMessage);
	}

	-->
</script>

</head>

<body>
	<div class="container-fulid">
		<div class="row" id="top">
			<div class="col-md-1"></div>
			<div class="col-md-11">
				<div class="text-center">
					<span class="title">当前位置: 添加分类</span>



				</div>
			</div>
		</div>
	</div>


	<div class="container-fulid">
		<div class="row">
			<jsp:include page="/WEB-INF/jsps/admin/leftNav.jsp"></jsp:include>
			<div class="col-md-8">
				<div id="content">
					<div class="text-center" id="sortAdd" style="padding-top: 50px;">
						<form
							action="${pageContext.request.contextPath }/admin/addNovelsort.action"
							method="post" role="form">

							<label class="control-label">分类名称&nbsp;</label><input type="text"
								name="name"> <br> <span class="text-danger">注:请勿重复添加已有的小说类型</span><br>
							<input type="submit" class="btn btn-primary" value="添加">
							<input type="reset" class="btn btn-default" value="重置">


						</form>


					</div>
				</div>

			</div>

		</div>



	</div>






	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>



