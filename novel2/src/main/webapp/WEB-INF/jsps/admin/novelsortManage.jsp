<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>分类管理</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/admin.css">
	<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/leftNav.css">


</head>
<body>
	<div class="container-fulid">
		<div class="row" id="top">
			<div class="col-md-1"></div>
			<div class="col-md-11">
				<div class="text-center">
					<span class="title">当前位置: 分类管理</span>



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
						<table class="table table-bordered">

							<thead>
								<tr>
									<td>类型号</td>
									<td>书名</td>
									
									<td>发布时间</td>
									<td>小说数目</td>
									<td>操作</td>


								</tr>
							</thead>
							<tbody>
								<c:forEach items="${allNovelsortList }" var="novelsort">
									<tr>
										<td>${novelsort.id }</td>
										
									
										<td>${novelsort.name }</td>
										<td>${novelsort.publishDate }</td>
										<td>${novelsort.count}</td>
										<td>
											<table class="table">
												<tr>
													<td><a href="#">修改信息</a></td>
													
												</tr>

											</table>


										</td>
										

									</tr>


								</c:forEach>



							</tbody>

						</table>


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
