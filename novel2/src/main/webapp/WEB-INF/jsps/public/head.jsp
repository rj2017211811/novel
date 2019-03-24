<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="main">
	<div id="title">
		<div class="container">
			<div class="row">
				
				
				<div class="col-md-3"><h3 class="text-center">小说阅读网</h3></div>
					
			</div>
		


		</div>
	</div>

	<div id="nav">

		<nav class="navbar navbar-default">
			<div id="head-nav" class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>

				</div>


				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">

						<li><a href="${pageContext.request.contextPath }/home.action">首页</a></li>
						<li><a href="#"></a></li>


						<li><a href="#">我的书架</a></li>
						<li><a href="${pageContext.request.contextPath }/xuanhuan.action">玄幻小说</a></li>
						<li><a href="${pageContext.request.contextPath }/xiuzhen.action">修真小说</a></li>
						<li><a href="${pageContext.request.contextPath }/dushi.action">都市小说</a></li>
						<li><a href="${pageContext.request.contextPath }/chuanyue.action">穿越小说</a></li>
						<li><a href="${pageContext.request.contextPath }/wangyou.action">网游小说</a></li>
						<li><a href="${pageContext.request.contextPath }/kehuan.action">科幻小说</a></li>
						<li><a href="#">排行榜</a></li>
						<li><a href="${pageContext.request.contextPath }/allnovel.action">全部小说</a></li>
						<li><a href="${pageContext.request.contextPath }/admin/tomanageNovel.action">管理小说</a></li>
						
					<li>
						<!-- 模态框（Modal） --> <a href="javascript:void(0)"
						class="btn btn-primary btn-lg" data-toggle="modal"
						data-target="#login"  id="notLogin">登录</a> <!-- 模态框（Modal） -->
						<!-- 注册窗口 --> <a
						href="${pageContext.request.contextPath }/users.do?flag=goUsersDetailInfo"
						style="display: none" id="hasLogin">账号</a>
						<div id="register" class="modal fade" tabindex="-1">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-body">
										<button class="close" data-dismiss="modal">
											<span>&times;</span>
									</div>
									<div class="modal-title">
										<h1 class="text-center">注册</h1>
									</div>
									<form class="form-group"
										action="${pageContext.request.contextPath }/register.do?flag=register"
										method="post">
										<div class="form-group">
											<label for="">用户名</label> <input class="form-control"
												type="text" placeholder="6-15位字母或数字" name="username">
										</div>
										<div class="form-group">
											<label for="">密码</label> <input class="form-control"
												type="password" placeholder="至少6位字母或数字" name="password">
										</div>
										<div class="form-group">
											<label for="">再次输入密码</label> <input class="form-control"
												type="password" placeholder="至少6位字母或数字" name="password2">
										</div>
										<div class="form-group">
											<label for="">邮箱</label> <input class="form-control"
												type="text" placeholder="例如:123@123.com" name="email">
										</div>
										<div class="text-right">
											<button class="btn btn-primary" type="submit">提交</button>
											<button class="btn btn-danger" data-dismiss="modal">取消</button>
										</div>
										<a href="" data-toggle="modal" data-dismiss="modal"
											data-target="#login">已有账号？点我登录</a>
									</form>
								</div>
							</div>
						</div> <!-- 登录窗口 -->
						<div id="login" class="modal fade">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-body">
										<button class="close" data-dismiss="modal">
											<span>&times;</span>
										</button>
									</div>
									<div class="modal-title">
										<h1 class="text-center">登录</h1>
									</div>
									<div class="modal-body">
										<form class="form-group"
											action="${pageContext.request.contextPath }/login.do?flag=login"
											method="post">
											<div class="form-group">
												<label for="">用户名</label> <input class="form-control"
													type="text" placeholder="" name="username">
											</div>
											<div class="form-group">
												<label for="">密码</label> <input class="form-control"
													type="password" placeholder="" name="password">
											</div>


											<div class="text-right">
												<button class="btn btn-primary" type="submit">登录</button>
												<button class="btn btn-danger" data-dismiss="modal">取消</button>
												<a href="" data-toggle="modal" data-dismiss="modal"
													data-target="#register">还没有账号？点我注册</a>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					

					</ul>



				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container -->

		</nav>


	</div>
</div>