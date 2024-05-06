<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
<br><br>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<h1 class="my-5 text-center ">회원목록</h1>
		<form class="my-3 ci">
		<input type="text" placeholder="검색" name="keyword" value="${keyword}"/>
		</form>
		<table class="table">
			<colgroup>
				<col style="width:15%;"/>
				<col style="width:55%;"/>
				<col style="width:15%;"/>
				<col style="width:15%;"/>
			</colgroup>
		<thead>
		<tr>
			<th class="text-center">아이디</th>
			<th class="text-center">유저명</th>
			<th class="text-center">유저패스워드</th>
			<th class="text-center">성별</th>
		</tr>
		</thead>
		<tbody>
	    <c:forEach var="row" items="${data}">
	    <!-- jstl에서 반복문을 사용할때는 forEach구문을 사용한다
	    items에는 컨트롤러에서 전달받은 데이터를 넣어준다 반복 가능한 객체며 어디서 생성한 객체든 무관하다
	    var 는 한행을 나타낸걸 표시
	    반복문안에는 변수.밸류
	    -->
	    <tr class="text-center">
			<td>
			   <a href="${path}/mypage?seq=${row.seq}">
			   ${row.userID}
			   </a>
			</td>
			<td> ${row.userName}</td>
			<td> ${row.userPassword}</td>
			<td> ${row.userGender}</td>
	    </tr>
		</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<th class="text-center">아이디</th>
				<th class="text-center">유저명</th>
				<th class="text-center">유저패스워드</th>
				<th class="text-center">성별</th>
			</tr>
		</tfoot>
		</table>
		<div class="d-flex justify-content-end">
		<div class="my-5 btn-group">
		<a class="btn btn-outline-success" href="${path}/join">회원/관리자 생성</a>
		</div>
		</div>
		
		

		</div>
	</div>
</div>

<%@include file="../include/footer.jsp" %>