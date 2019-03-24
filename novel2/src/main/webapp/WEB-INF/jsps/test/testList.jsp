<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/static/bootstrap/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<h1>测试</h1>
	<table class="table">
		<tr><th>id</th><th>name</th></tr>
	
	<c:forEach items="${testList }" var="test">
		<tr><td>${test.id }</td><td>${test.name }</td></tr>
	
	</c:forEach>
	
	</table>
	</div>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/jquery-3.3.1/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/bootstrap/js/bootstrap.js"></script>	
</body>
</html>