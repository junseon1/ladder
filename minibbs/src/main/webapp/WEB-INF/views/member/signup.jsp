<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file='../include/header.jsp'%>
<br><br>
<div class="container my-5">
	<div class="row">
		<div class="col-lg-12">
			<div class="card o-hidden border-0 shadow-lg my-5">
				<div class="card-body p-0">
					<div class="row">
						<div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
							<div class="col-lg-7">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-grey-900 mb-4">
										Create an Account!
										</h1>
										<form class="signup" method="post" class="was-validated">
										
											<div class="form-group row mb-3">
												<div class="col-sm-12 mb-3 mb-sm-0">
													<input type="text" 
													class="form-control form-control-user"
													placeholder="아이디"
													name="userId"
													/>
												</div>
											
											</div>
											<div class="form-group mb-3">
												<input 
													type="password"
													class="form-control form-control-user"
													placeholder="비밀번호"
													name="userPass"
													/>
											</div>
												<div class="form-group mb-3">
												<input 
													type="password"
													class="form-control form-control-user"
													placeholder="비밀번호 확인"
													name="userPassRe"
													/>
											</div>
											<div class="form-group row mb-3">
												<div class="col-sm-12 mb-3 mb-sm-0">
													<input type="text" 
													class="form-control form-control-user"
													placeholder="이름"
													name="userName"
												
													
													/>
												</div>
											
											</div>
											<div class="form-group mb-3">
												<input 
													type="text"
													class="form-control form-control-user"
													placeholder="전화번호"
													name="userPhone"
													
													
												/>
											</div>
										
											<div class="form-group mb-3">
											
											<div class="btn-group">
												<label class="btn border-0 active">
													<input type="radio" name="userGender" value="남자" autocomplete="off" checked>남자
												</label>
												<label class="btn border-0">
													<input type="radio" name="userGender" value="여자" autocomplete="off">여자
												</label>
											</div>
											
											</div>
											<div class="form-group mb-3 d-flex" >
												<input type="text" class="form-control form-control-user" name="userAddr1" placeholder="주소(시)"/>
												<a class="btn btn-outline-success">주소 찾기</a>
											</div>
											
											<div class="form-group mb-3">
												<input type="text" class="form-control form-control-user" name="userAddr2"  placeholder="주소(군,구)"/>
											</div>
											
											<div class="form-group mb-3">
												<input type="text" class="form-control form-control-user" name="userAddr3"  placeholder="나머지 이하 주소를 적어주세요"/>
											</div>
											
											<p class="mb-3">
												<!--  <a href="login.jsp" class="btn btn-primary btn-user btn-block">
													Register Account
												</a>-->
												<input type="submit" 
												class="btn btn-primary btn-user btn-block"
												value="회원가입"
												onclick="IDCheck"
												/>
											</p>
											<p class="mb-3">
												<a href="login.jsp" class="btn btn-google btn-user btn-block">
													<i class="fab fa-google fa-fw w-100">
													Register with Google
													</i>
												</a>
											</p>
											<p class="mb-3">
												<a href="login.jsp" class="btn btn-facebook btn-user btn-block">
													<i class="fab fa-facebook fa-fw w-100">
													Register with Facebook
													</i>
												</a>
											</p>
											
										</form>
										<hr>
										<div class="text-center">
											<a class="small" href="/user/forgot.jsp">
											Forgot Password?
											</a>
										</div>
										
										<div class="text-center">
											<a class="small" href="/user/login.jsp">
											Already have an account? Login!
											</a>
										</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</div>
		</div>
	</div>
</div>

	

<%@ include file='../include/footer.jsp'%>
