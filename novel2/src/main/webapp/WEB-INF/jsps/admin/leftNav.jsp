<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-md-2">
	<div class="navbar  navbar-inverse " id="left">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navBar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<div class="collapse navbar-collapse " id="navBar">
			<ul class=" nav-stacked list-unstyled">
				<li><a href="${pageContext.request.contextPath }/home.action">返回首页</a></li>

				


				<li><a href="${pageContext.request.contextPath }/admin/tomanageWriter.action">作者管理</a></li>
				<li><a href="${pageContext.request.contextPath }/admin/tomanageReader.action">读者管理</a></li>
				<li><a href="${pageContext.request.contextPath }/admin/tomanageNovel.action">小说管理</a></li>
				<li><a href="${pageContext.request.contextPath }/admin/tomanageNovelsort.action">分类管理</a></li>
				<li><a href="#">评论管理</a></li>
				


			</ul>


		</div>
	</div>

</div>