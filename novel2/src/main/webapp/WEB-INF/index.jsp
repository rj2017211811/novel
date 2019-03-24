<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>bootstrap实现导航栏的响应式布局，当在小屏幕、手机屏幕浏览时自动折叠隐藏</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link href="bootstrap.min.css" rel="stylesheet">
<style type="text/css">
.nav-logo {
	float: left;
	height: 40px;
	margin-top: 5px;
	overflow: hidden;
}

.nav-logo a {
	margin: 0;
	padding: 0;
}
</style>
</head>
<body>
	<!--导航-->
	<div class="col-md-2">
		<div class="navbar  navbar-inverse" style="margin:0 auto;padding:0;">



			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navBar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse " id="navBar">
				<ul class="nav nav-pills nav-stacked">
					<li><a
							href="${pageContext.request.contextPath }/admin/novelsort/toadd.action">添加种类</a></li>
						<li><a
							href="${pageContext.request.contextPath }/admin/novel/toadd.action">添加小说</a></li>
						<li><a
							href="${pageContext.request.contextPath }/admin/novel/toupdate.action">修改小说</a></li>
						<li><a href="${pageContext.request.contextPath }/home.action">返回首页</a></li>
						<li><a href="#">作者管理</a></li>
						<li><a href="#">读者管理</a></li>
						<li><a href="#">小说管理</a></li>
						<li><a href="#">分类管理</a></li>
						<li><a href="#">添加分类</a></li>


				</ul>


			</div>
		</div>
	</div>



	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
