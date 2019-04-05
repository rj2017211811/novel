<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userInfo</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/myAjax.js"
	charset="utf-8"></script>
<title>${sessionScope.username }的聊天室</title>
<style type="text/css">
#content {
	display: block;
	width: 75%;
	height: 34px;
	padding: 6px 12px;
	font-size: 14px;
	line-height: 1.42857143;
	color: #555;
	background-color: #fff;
	background-image: none;
	border: 1px solid #ccc;
	border-radius: 4px;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow
		ease-in-out .15s;
	-o-transition: border-color ease-in-out .15s, box-shadow ease-in-out
		.15s;
	transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
}
</style>
<script type="text/javascript">
    //定时刷新list列表

   setInterval(function() {
	  $("#message").load(location.href+" #message>*","");
	}, 5000);
   
   setInterval(function() {
		  $("#chatfriend").load(location.href+" #chatfriend>*","");
		}, 5000);
</script>
</head>
<body>
	<%  
    double total = (Runtime.getRuntime().totalMemory()) / (1024.0 * 1024);  
    double max = (Runtime.getRuntime().maxMemory()) / (1024.0 * 1024);  
    double free = (Runtime.getRuntime().freeMemory()) / (1024.0 * 1024);  
    out.println("Java 虚拟机试图使用的最大内存量(当前JVM的最大可用内存)maxMemory(): " + max + "MB<br/>");  
    out.println("Java 虚拟机中的内存总量(当前JVM占用的内存总数)totalMemory(): " + total + "MB<br/>");  
    out.println("Java 虚拟机中的空闲内存量(当前JVM空闲内存)freeMemory(): " + free + "MB<br/>");  
    out.println("因为JVM只有在需要内存时才占用物理内存使用，所以freeMemory()的值一般情况下都很小，<br/>" +  
    "而JVM实际可用内存并不等于freeMemory()，而应该等于 maxMemory()-totalMemory()+freeMemory()。<br/>");  
    out.println("JVM实际可用内存: " + (max - total + free) + "MB<br/>");  
%> 
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-5" class="text-center">

				<div class="form-group" id="chatfriend">
					<span class="form-control">我的聊天室，您正在和 <c:if
							test="${user2.isOnline==true }">
							<font style="color: red">${user2.username }</font>
						</c:if> <c:if test="${user2.isOnline==false }">
							<font>${user2.username }</font>
						</c:if> 聊天
					</span>
				</div>


				<div class="form-group">
					<div id="message" style="border:1px solid black;" >
						<table>
							<c:forEach items="${messageList }" var="message">

								<c:if test="${message.sender.id!=sessionScope.user.id }">
									<!-- <tr> <td colspan="4" class="text-center">${message.sendDate } </td></tr> -->
									<tr>
										<td style="text-align: left"><img alt=""
											src="${pageContext.request.contextPath }/static/images/userhead/${message.sender.photo}"
											width="50px" height="50px" style="border-radius:50px;"/>${message.sender.username }</td>
											
										<td></td>
										<td></td>
									</tr>
									<tr><td></td><td class="text-right">
											<div style="border:1px solid black;border-radius:10px">${message.content }</div></td><td></td></tr>
								</c:if>
								<c:if test="${message.sender.id==sessionScope.user.id }">
									<!-- <tr> <td colspan="4" class="text-center">${message.sendDate } </td></tr> -->
									`	<tr>
										<td></td><td></td><td></td><td style="text-align: right">${message.sender.username }<img alt=""
											src="${pageContext.request.contextPath }/static/images/userhead/${message.sender.photo}"
											width="50px" height="50px" style="border-radius:50px;"/></td>
											
										<td></td>
									</tr>
									<tr><td></td><td></td><td class="text-left">
											<div style="border:1px solid black;border-radius:10px">${message.content }</div></td></tr>
								</c:if>

							</c:forEach>
						</table>
						
					</div>
				</div>
				<div class="form-group">
					<input type="hidden" value="${sessionScope.user.id }"
						name="senderId" id="senderId"> <input type="hidden"
						value="${user2.id }" name="getterId" id="getterId"> <input
						type="text" name="content" class="col-md-9" id="content">
					<button onclick="chat('#senderId','#getterId','#content')"
						class="btn btn-default">发送</button>
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