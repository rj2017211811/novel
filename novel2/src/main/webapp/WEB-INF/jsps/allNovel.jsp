<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/head.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/foot.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/allNovel.css">
</head>
<body>

	<jsp:include page="/WEB-INF/jsps/public/head.jsp"></jsp:include>
	<div class="container-fulid" style="background-color: #E9FAFF;">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-7">
				<div>
					<div class="category"
						style="background-color: #F6F8FE; line-height: 30px; font-weight: bold;">
						&nbsp;小说列表</div>
					<div>
						<table class="table">

							<!--   -->
							<c:forEach begin="0" var="i" end="${allNovelList.size()-1 }"
								step="5">
								<tr>

									<td><a href="#">${allNovelList.get(i).title }</a></td>
									<c:if test="${i+1<allNovelList.size() }">
										<td><a href="#">${allNovelList.get(i+1).title }</a></td>
										<c:if test="${i+2<allNovelList.size() }">
											<td><a href="#">${allNovelList.get(i+2).title }</a></td>
											<c:if test="${i+3<allNovelList.size() }">
												<td><a href="#">${allNovelList.get(i+3).title }</a></td>
												<c:if test="${i+4<allNovelList.size() }">
													<td><a href="#">${allNovelList.get(i+4).title }</a></td>

												</c:if>


											</c:if>


										</c:if>


									</c:if>
								</tr>




							</c:forEach>

						</table>

					</div>

				</div>


			</div>
			<div class="col-md-2"></div>
		</div>
		
	</div>
	<jsp:include page="/WEB-INF/jsps/public/foot.jsp"></jsp:include>


	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>