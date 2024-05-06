<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>

<div class="container w-50 mt-5">
	<div class="row">
		<div class="col-md-12">
		<h1 class="my-5 text-center">수정페이지</h1>
		<form method="POST">
		<table class="table table-borderd text-center">
		<colgroup>
		<col style="width:15%;"/>
		<col style="width:85%;"/>
		</colgroup>

		<tr>
			<th>유저id</th>
			<td>
			<input type="text" name="userID" value="${data.userID }" class="form-control" />
			</td>
		</tr>
		<tr>
			<th>유저명</th>
			<td>
			<input type="text" name="userName" value="${data.userName }" class="form-control"/>
			</td>
		</tr>
		<tr>
			<th>패스워드</th>
			<td>
			<input type="text" name="userPassword" value="${data.userPassword}" class="form-control"/>
			</td>
		</tr>
		<tr>
			<th>성별</th>
			<td>
			<input type="text" name="userGender" value="${data.userGender }" class="form-control"/>
			</td>
		</tr>
	
		</table>
		
	
			<div class="d-flex justify-content-end">
				<div class="btn-group my-5">
					<input type="submit" class="btn btn-outline-success" value="수정">
					<a href="${path}/list" class="btn btn-outline-primary">
					취소
					</a>
				</div>
			</div>
		</form>

		
		
		
		
		
		
		
		
		
		
		
		</div>
	</div>
</div>

<%@include file="../include/footer.jsp" %>