<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>

<div class="container w-50 mt-5">
	<div class="row">
		<div class="col-md-12">
		<h1 class="my-5 text-center">상세페이지</h1>
		<table class="table table-borderd text-center">
		<colgroup>
		<col style="width:15%;"/>
		<col style="width:85%;"/>
		</colgroup>
		<tr>
			<th>유저아이디</th><td>${data.userID}</td>
		</tr>
		<tr>
			<th>유저명</th><td>${data.userName}</td>
		</tr>
		<tr>
			<th>패스워드</th><td>${data.userPassword}</td>
		</tr>
		<tr>
			<th>성별</th><td>${data.userGender}</td>
		</tr>
		<tr>
			<th>회원가입일</th>
			<td><fmt:formatDate value="${data.insert_date}" pattern="yyyy.MM.dd HH:mm:ss"/></td>
		</tr>
		
		
		</table>
		
		<form method="POST" action="${path}/delete">
			<div class="d-flex justify-content-end">
				<div class="btn-group my-5">
				<a href="${path}/update?seq=${seq}" class="btn btn-outline-success">
				수정
				</a>
					<input type="hidden" name="seq" value="${seq}"/>
					<input type="submit" class="btn btn-outline-danger" value="삭제">
					<a href="${path}/list" class="btn btn-outline-primary">
					리스트로
					</a>
				</div>
			</div>
		</form>

		
		
		
		
		
		
		
		
		
		
		
		</div>
	</div>
</div>

<%@include file="../include/footer.jsp" %>