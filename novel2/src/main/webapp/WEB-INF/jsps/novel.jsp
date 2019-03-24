<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${type }小说_好看的${type }小说</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/head.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/foot.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/novel.css">
</head>
<body>

	<jsp:include page="/WEB-INF/jsps/public/head.jsp"></jsp:include>
	<div id="main" style="background-color: #E9FAFF;">
		<div class="row">
			<div class="col-md-2"></div>
			<div id="content" class="col-md-8">

				<div class="row" class="novel1">
					<c:forEach var="i" begin="0" end="2">
						<div class="col-md-4">
							<div class="row">

								<div class="col-md-4">
									<img alt=""
										src="${pageContext.request.contextPath }/static/images/10489s.jpg"
										class="image1">
								</div>
								<div class="col-md-8">
									<font class="bookName">&nbsp;${novelrecommendList.get(i).title }</font><br><font
										class="author">&nbsp;&nbsp;${novelrecommendList.get(i).author }</font>
									<hr>
									<p class="introduction">${novelrecommendList.get(i).description }</p>
								</div>

							</div>
						</div>

					</c:forEach>
					<div class="col-md-2"></div>





				</div>

				<br>

				<div class="row" class="novel1">
					<c:forEach var="i" begin="3" end="5">
						<div class="col-md-4">
							<div class="row">

								<div class="col-md-4">
									<img alt=""
										src="${pageContext.request.contextPath }/static/images/10489s.jpg"
										class="image1">
								</div>
								<div class="col-md-7">
									<font class="bookName">&nbsp;${novelrecommendList.get(i).title }</font><br><font
										class="author">&nbsp;&nbsp;${novelrecommendList.get(i).author }</font>
									<hr>
									<p class="introduction">${novelrecommendList.get(i).description }</p>
								</div>

							</div>
						</div>

					</c:forEach>
					<div class="col-md-2"></div>





				</div>



			</div>

		</div>

		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-6">
				<div class="row">
					<div class="col-md-12">
						<table class="table ">
							<thead>
								<tr class="font5">
									<th colspan="4">好看的${type }小说最近更新列表</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach begin="0" end="6">
									<tr class="font6">

										<td>[都市小说]</td>
										<td><small><a href="">我就是豪门</a></small></td>
										<td><small><a href="">第三百八十四章 白莲</a></small></td>
										<td><span class="font4">绝境中的人</span></td>
									</tr>
								</c:forEach>



							</tbody>

						</table>


					</div>
				</div>
			</div>
			<div class="col-md-2">
				<div class="row">
					<div class="col-md-12">

						<table class="table table-bordered">
							<thead>
								<tr class="font5">
									<th colspan="3">好看的${type }小说</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${novelLatestList }" var="novel">

									<tr class="font6">

										<td>[${novel.novelsort.name }]</td>
										<td><small><a href="">${novel.title }</a></small></td>

										<td><span class="font4">${novel.author }</span></td>
									</tr>
								</c:forEach>




							</tbody>

						</table>

					</div>
				</div>
			</div>
		</div>

	</div>
	<jsp:include page="/WEB-INF/jsps/public/foot.jsp"></jsp:include>


	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>