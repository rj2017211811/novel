<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>小说管理</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/admin.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/leftNav.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/myAjax.js"></script>
<script type="text/javascript">
<!--
	window.onload = function() {
		var tipMessage = "${requestScope.tipMessage }";
		if (tipMessage != "")
			window.alert(tipMessage);
	}
	
	function ConfirmDelete(obj)
	{
		if(confirm('您确认要下架该小说吗?'))
		{
			delNovel(obj);
		}
		return false;
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
					<span class="title">当前位置: 小说管理</span>
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

						<table class="table table-responsive">
							<tr>
								<td colspan="6" class="text-left">
									<button class="btn btn-primary" data-toggle="modal"
										data-target="#modal">添加小说</button>
									<div class="modal fade" id="modal" tabindex="-1" role="dialog"
										aria-hiddden="true" aria-labelledby="modalLabel">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<div class="page-header">添加小说</div>
													<form role="form"
														action="${pageContext.request.contextPath }/admin/addNovel.action"
														method="post">
														<div class="form-group">

															<label for="title">书名</label> <input class="form-control"
																id="title" type="text" name="title" placeholder="请输入书名">
														</div>
														<div class="form-group">

															<label for="author">作者</label> <input
																class="form-control" id="author" type="text"
																name="author" placeholder="请输入作者">
														</div>
														<div class="form-group">

															<label for="novelsort">类别</label> <select
																name="novelsort" class="form-control" id="novelsort">
																<c:forEach items="${novelsortList }" var="novelsort">

																	<option value="${novelsort.id }">${novelsort.name }</option>
																</c:forEach>


															</select>
														</div>


														<div class="btn-group">

															<button class="btn btn-default" class="close"
																data-dismiss="modal" aria-hidden="true">关闭</button>
															<button class="btn btn-primary" type="submit">提交</button>
														</div>

													</form>



												</div>
											</div>
										</div>
									</div>





									<button class="btn btn-primary" data-toggle="modal"
										data-target="#modal2">添加分类</button>
									<div class="modal fade" id="modal2" tabindex="-1" role="dialog"
										aria-hiddden="true" aria-labelledby="modalLabel">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<div class="page-header">添加分类</div>
													<form
														action="${pageContext.request.contextPath }/admin/addNovelsort.action"
														method="post" role="form">
														<div class="form-group">

															<label for="name" class="control-label">分类名称&nbsp;</label>
															<input type="text" name="name" class="form-control">
														</div>

														<div class="btn-group">

															<button class="btn btn-default" class="close"
																data-dismiss="modal" aria-hidden="true">关闭</button>
															<button class="btn btn-primary" type="submit">提交</button>
														</div>

													</form>
												</div>
											</div>
										</div>
									</div>

								</td>
							</tr>


							<tr>
								<td>书号</td>
								<td>书名</td>
								<td>作者</td>
								<td>分类</td>
								<td>发布时间</td>
								<td>操作</td>


							</tr>

							<tbody>
								<c:forEach items="${allNovelList }" var="novel">

									<tr>
										<td>${novel.id }</td>
										<td>${novel.title }</td>
										<td>${novel.author }</td>
										<td>${novel.novelsort.name }</td>
										<td>${novel.publishDate }</td>
										<td>
											<table class="table">
												<tr>

													<td><a class="btn btn-danger"
														onclick="return ConfirmDelete(${novel.id})"><span
															class="glyphicon glyphicon-trash" aria-hidden="true">下架小说</span></a></td>
													<td>
											
													
													<a class="btn btn-primary" href="javascript:void(0)"
															data-toggle="modal" data-target="#${novel.id }">
															<span class="glyphicon glyphicon-pencil"
																aria-hidden="true">修改信息</span>
														</a>

														<div class="modal fade" id="${novel.id }" tabindex="-1"
															role="dialog" aria-hiddden="true"
															aria-labelledby="modalLabel">
															<div class="modal-dialog">
																<div class="modal-content">
																	<div class="modal-header">
																		<button class="close" data-dismiss="modal"
																			aria-hidden="true">&times;</button>
																		<div class="page-header">添加分类</div>
																		<form
																			action="${pageContext.request.contextPath }/admin/updateNovel.action"
																			method="post" role="form">

																			<div class="form-group">

																				<label for="id" class="control-label">书号&nbsp;</label>
																				<input type="text" name="id" id="id"
																					value="${novel.id }" readonly="readonly">
																			</div>
																			<div class="form-group">

																				<label for="name" class="control-label">书名&nbsp;</label>
																				<input type="text" name="title"
																					value="${novel.title }">
																			</div>
																			<div class="form-group">

																				<label for="name" class="control-label">作者&nbsp;</label>
																				<input type="text" name="author"
																					value="${novel.author }">
																			</div>
																			<div class="form-group">

																				<label for="name" class="control-label">分类&nbsp;</label>
																				<select name="novelsort"
																					style="width: 30%; margin: auto;">
																					<c:forEach items="${novelsortList }"
																						var="novelsort">
																						<c:if test="${novel.novelsort.id==novelsort.id }">

																							<option value="${novelsort.id }"
																								selected="selected">${novelsort.name }</option>

																						</c:if>
																						<c:if test="${novel.novelsort.id!=novelsort.id }">
																							<option value="${novelsort.id }">${novelsort.name }</option>


																						</c:if>


																					</c:forEach>


																				</select>
																			</div>

																			<div class="btn-group">

																				<button class="btn btn-default" class="close"
																					data-dismiss="modal" aria-hidden="true">关闭</button>
																				<button class="btn btn-primary" type="submit">提交</button>
																			</div>

																		</form>
																	</div>
																</div>
															</div>
														</div></td>

												</tr>

											</table>


										</td>

									</tr>


								</c:forEach>



							</tbody>

						</table>
						<nav aria-label="Page navigation">
							<ul class="pagination">
								<c:if test="${pageNow>1 }">
									<li><a
										href="${pageContext.request.contextPath }/admin/tomanageNovel?pageNow=${pageNow-1}"
										aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
									</a></li>



								</c:if>
								<c:if test="${pageNow<=1 }">
									<li><a href="#" aria-label="Previous"> <span
											aria-hidden="true">&laquo;</span>
									</a></li>



								</c:if>


								<c:forEach begin="1" end="${pageCount }" var="i">
									<li><a
										href="${pageContext.request.contextPath }/admin/tomanageNovel?pageNow=${i}">${i }</a></li>

								</c:forEach>

								<c:if test="${pageNow<pageCount }">
									<li><a
										href="${pageContext.request.contextPath }/admin/tomanageNovel?pageNow=${pageNow+1}"
										aria-label="Next"> <span aria-hidden="true">&raquo;</span>
									</a></li>

								</c:if>
								<c:if test="${pageNow>=pageCount }">
									<li><a href="#" aria-label="Next"> <span
											aria-hidden="true">&raquo;</span>
									</a></li>
								</c:if>
							</ul>
						</nav>


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
