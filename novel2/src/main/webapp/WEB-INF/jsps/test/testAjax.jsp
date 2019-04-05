<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/myAjax.js"
	charset="utf-8"></script>
<script type="text/javascript">
<!--
	-->
</script>


</head>
<body>
	<input type="text" name="username" id="username" onblur="check()">
	<input type="text" id="username1">

	<select name="province" id="province"
		onchange="getProCity('#province')">

		<option value="1">北京</option>
		<option value="2">上海</option>
		<option value="3">山东</option>

	</select>




		<select name="city" id="city">
		</select>
	



	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>