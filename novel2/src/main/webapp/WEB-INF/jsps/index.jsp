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
	href="${pageContext.request.contextPath }/static/css/index.css">
</head>
<body>

	<jsp:include page="/WEB-INF/jsps/public/head.jsp"></jsp:include>
	<div id="main" style="background-color: #E9FAFF;">
		<div class="row">
			<div class="col-md-2"></div>
			<div id="content" class="col-md-6">
				
				<div class="row" class="novel1">
					<div class="col-md-6">
						<div class="row">

							<div class="col-md-4">
								<img alt=""
									src="${pageContext.request.contextPath }/static/images/10489s.jpg"
									class="image1">
							</div>
							<div class="col-md-7">
								<font class="bookName">&nbsp;${novelrecommendList.get(0).title }</font><br><font
									class="author">&nbsp;&nbsp;${novelrecommendList.get(0).author }</font>
								<hr>
								<p class="introduction">${novelrecommendList.get(0).description }</p>
							</div>

						</div>

					</div>

					<div class="col-md-6">
						<div class="row">

							
							<div class="col-md-4">
								<img alt=""
									src="${pageContext.request.contextPath }/static/images/10489s.jpg"
									class="image1">
							</div>
							<div class="col-md-7">
								<font class="bookName">&nbsp;${novelrecommendList.get(1).title }</font><br><font
									class="author">&nbsp;&nbsp;${novelrecommendList.get(1).author }</font>
								<hr>
								<p class="introduction">${novelrecommendList.get(1).description }</p>
							</div>


						</div>

					</div>
				</div>+
				
				<br>
				<div class="row" class="novel1">
					<div class="col-md-6">
						<div class="row">

							
							<div class="col-md-4">
								<img alt=""
									src="${pageContext.request.contextPath }/static/images/10489s.jpg"
									class="image1">
							</div>
							<div class="col-md-7">
								<font class="bookName">&nbsp;${novelrecommendList.get(2).title }</font><br><font
									class="author">&nbsp;&nbsp;${novelrecommendList.get(2).author }</font>
								<hr>
								<p class="introduction">${novelrecommendList.get(2).description }</p>
							</div>


						</div>

					</div>
					<div class="col-md-6">
						<div class="row">

							
							<div class="col-md-4">
								<img alt=""
									src="${pageContext.request.contextPath }/static/images/10489s.jpg"
									class="image1">
							</div>
							<div class="col-md-7">
								<font class="bookName">&nbsp;${novelrecommendList.get(3).title }</font><br><font
									class="author">&nbsp;&nbsp;${novelrecommendList.get(3).author }</font>
								<hr>
								<p class="introduction">${novelrecommendList.get(3).description }</p>
							</div>


						</div>

					</div>
				</div>



			</div>
			<div class="col-md-2">
				<div id="tip">

					<table class="table table-bordered">
						<thead>
							<tr>
								<th class="font1">公告牌</th>
						</thead>
						<tbody>
							<tr>
								<td class="font2">[公告]&nbsp;<small><a href="">发现章节未及时更新请联系我们</a></small></td>
							</tr>
						</tbody>

					</table>



				</div>
				<div id="recommend">
					<table class="table ">
						<thead>
							<tr>
								<th colspan="3" class="font1">上周强推</th>
							</tr>

						</thead>
						<tbody>
							<c:forEach begin="0" end="5">
								<tr>
									<td class="font2">玄幻</td>
									<td class="font2"><small><a href="">牧神记</a></small></td>

									<td class="font2">宅猪</td>
								</tr>
							</c:forEach>


						</tbody>

					</table>

				</div>

			</div>
		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-4">
						<table class="table ">
							<thead>
								<tr class="font3">
									<th colspan="2">玄幻小说</th>
								</tr>
							</thead>
							<tbody>

								<c:if test="${xuanhuanNovelList.size()>0 }">
									<c:forEach begin="0" end="${xuanhuanNovelList.size()-1 }"
										step="2" var="i">
										<tr class="font2">


											<td><small><a href="">${xuanhuanNovelList.get(i).title }</a></small>&nbsp;/<span
												class="font4">${xuanhuanNovelList.get(i).author }</span></td>
											<c:if test="${i+1<xuanhuanNovelList.size() }">
												<td><small><a href="">${xuanhuanNovelList.get(i+1).title }</a></small>&nbsp;/<span
													class="font4">${xuanhuanNovelList.get(i+1).author }</span></td>
											</c:if>

										</tr>
									</c:forEach>

								</c:if>






							</tbody>

						</table>


					</div>
					<div class="col-md-4">
						<table class="table ">
							<thead>
								<tr class="font3">
									<th colspan="2">修真小说</th>
								</tr>
							</thead>
							<tbody>
								<c:if test="${xiuzhenNovelList.size()>0}">
									<c:forEach begin="0" end="${xiuzhenNovelList.size()-1 }"
										step="2" var="i">
										<tr class="font2">


											<td><small><a href="">${xiuzhenNovelList.get(i).title }</a></small>&nbsp;/<span
												class="font4">${xiuzhenNovelList.get(i).author }</span></td>
											<c:if test="${i+1<xiuzhenNovelList.size() }">
												<td><small><a href="">${xiuzhenNovelList.get(i+1).title }</a></small>&nbsp;/<span
													class="font4">${xiuzhenNovelList.get(i+1).author }</span></td>
											</c:if>

										</tr>
									</c:forEach>
								</c:if>


							</tbody>

						</table>


					</div>
					<div class="col-md-4">
						<table class="table ">
							<thead>
								<tr class="font3">
									<th colspan="2">都市小说</th>
								</tr>
							</thead>
							<tbody>
								<c:if test="${cityNovelList.size()>0 }">
									<c:forEach begin="0" end="${cityNovelList.size()-1 }" step="2"
										var="i">
										<tr class="font2">


											<td><small><a href="">${cityNovelList.get(i).title }</a></small>&nbsp;/<span
												class="font4">${cityNovelList.get(i).author }</span></td>
											<c:if test="${i+1<cityNovelList.size() }">
												<td><small><a href="">${cityNovelList.get(i+1).title }</a></small>&nbsp;/<span
													class="font4">${cityNovelList.get(i+1).author }</span></td>
											</c:if>

										</tr>
									</c:forEach>

								</c:if>


							</tbody>

						</table>


					</div>

				</div>
			</div>


		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-4">
						<table class="table">
							<thead>
								<tr class="font3">
									<th colspan="2">网游小说</th>
								</tr>
							</thead>
							<tbody>
								<c:if test="${wangyouNovelList.size()>0 }">
									<c:forEach begin="0" end="${wangyouNovelList.size()-1 }"
										step="2" var="i">
										<tr class="font2">


											<td><small><a href="">${wangyouNovelList.get(i).title }</a></small>&nbsp;/<span
												class="font4">${wangyouNovelList.get(i).author }</span></td>
											<c:if test="${i+1<wangyouNovelList.size() }">
												<td><small><a href="">${wangyouNovelList.get(i+1).title }</a></small>&nbsp;/<span
													class="font4">${wangyouNovelList.get(i+1).author }</span></td>
											</c:if>

										</tr>
									</c:forEach>

								</c:if>


							</tbody>

						</table>


					</div>
					<div class="col-md-4">
						<table class="table">
							<thead>
								<tr class="font3">
									<th colspan="2">穿越小说</th>
								</tr>
							</thead>
							<tbody>
								<c:if test="${chuanyueNovelList.size()>0 }">
									<c:forEach begin="0" end="${chuanyueNovelList.size()-1 }"
										step="2" var="i">
										<tr class="font2">


											<td><small><a href="">${chuanyueNovelList.get(i).title }</a></small>&nbsp;/<span
												class="font4">${chuanyueNovelList.get(i).author }</span></td>
											<c:if test="${i+1<chuanyueNovelList.size() }">
												<td><small><a href="">${chuanyueNovelList.get(i+1).title }</a></small>&nbsp;/<span
													class="font4">${chuanyueNovelList.get(i+1).author }</span></td>
											</c:if>

										</tr>
									</c:forEach>
								</c:if>


							</tbody>

						</table>


					</div>
					<div class="col-md-4">
						<table class="table ">
							<thead>
								<tr class="font3">
									<th colspan="2">科幻小说</th>
								</tr>
							</thead>
							<tbody>
								<c:if test="${kehuanNovelList.size()>0 }">
								
									<c:forEach begin="0" end="${kehuanNovelList.size()-1 }" step="2"
									var="i">
									<tr class="font2">


										<td><small><a href="">${kehuanNovelList.get(i).title }</a></small>&nbsp;/<span
											class="font4">${kehuanNovelList.get(i).author }</span></td>
										<c:if test="${i+1<kehuanNovelList.size() }">
											<td><small><a href="">${kehuanNovelList.get(i+1).title }</a></small>&nbsp;/<span
												class="font4">${kehuanNovelList.get(i+1).author }</span></td>
										</c:if>

									</tr>
								</c:forEach>
								</c:if>

								
							</tbody>

						</table>


					</div>

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
									<th colspan="4">最近更新小说列表</th>
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
									<th colspan="3">最新入库小说</th>
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