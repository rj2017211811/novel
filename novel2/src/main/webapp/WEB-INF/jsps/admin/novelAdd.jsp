<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加小说</title>
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
					<span class="title">当前位置: 添加小说</span>



				</div>
			</div>
		</div>
	</div>


	<div class="container-fulid">
		<div class="row">
			<jsp:include page="/WEB-INF/jsps/admin/leftNav.jsp"></jsp:include>
			<div class="col-md-8">
				<div id="content" class="text-center">
					
					<div id="sortAdd" style="padding-top: 50px;">
						<form action="${pageContext.request.contextPath }/admin/addNovel.action" method="post" role="form">
							<table style="margin:auto;">
								<tr>
									<th>书名&nbsp;</th>
									<td><input type="text" name="title"></td>
								</tr>
								<tr>
									<th>作者&nbsp;</th>
									<td><input type="text" name="author"></td>
								</tr>
								<tr>
									<th>类型&nbsp;</th>
									<td><select name="novelsort" class="form-control">
											<c:forEach items="${novelsortList }" var="novelsort">

												<option value="${novelsort.id }">${novelsort.name }</option>
											</c:forEach>


									</select></td>
								</tr>
								<tr>
									<td colspan="2"><span class="text-danger">注:请勿重复添加已有的小说</span></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit"
										class="btn btn-primary" value="添加"> <input
										type="reset" class="btn btn-default" value="重置"></td>
								</tr>

							</table>







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



