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
<script type="text/javascript">
<!--
	window.onload = function() {
		var tipMessage = "${requestScope.tipMessage }";
		if (tipMessage != "")
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
					<span class="title">当前位置: 小说管理-修改信息</span>



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
						<form action="${pageContext.request.contextPath }/admin/updateNovel.action" method="post">
						
						<table class="table table-bordered">

							<c:if test="${novel!=null }">
								<tr>
									<th>书号</th>
									<td>${novel.id }
									<input type="hidden" name="id" value="${novel.id }">
										
										</td>
								</tr>
								<tr>
									<th>书名</th>
									<td><input type="text" name="title"
										value="${novel.title }"  class="form-control" style="width:30%;margin:auto;">
										</td>
								</tr>
								<tr>
									<th>作者</th>
									<td><input type="text" name="author"
										value="${novel.author }"  class="form-control" style="width:30%;margin:auto;"></td>
								</tr>
								<tr>
									<th>分类</th>
									<td>
									<select name="novelsort" class="form-control" style="width:30%;margin:auto;">
											<c:forEach items="${novelsortList }" var="novelsort">
													<c:if test="${novel.novelsort.id==novelsort.id }">

														<option value="${novelsort.id }" selected="selected">${novelsort.name }</option>

													</c:if>
													<c:if test="${novel.novelsort.id!=novelsort.id }">
														<option value="${novelsort.id }">${novelsort.name }</option>


													</c:if>


												</c:forEach>


										</select>
									
								</td>
								</tr>
								<tr>
									<th>发布时间</th>
									<td>${novel.publishDate }</td>
								</tr>
								<tr>
									
									<td colspan="2"><input type="submit" value="修改" class="btn btn-primary" >&nbsp;<input type="reset" value="重置" class="btn btn-default"> </td>
								</tr>
							</c:if>

							</tbody>

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
