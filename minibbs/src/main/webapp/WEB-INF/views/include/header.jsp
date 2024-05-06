<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<title>mini bbs2</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" ></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="${path}/resources/js/js.js"></script>
<link href="${path}/resources/css/custom.css" rel="stylesheet"/>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="${path}">home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="${path}/join">join</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${path}/login">login</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="${path}/ladder">ladder</a>
        </li>
      
      </ul>
		<ul class="navbar-nav me-3 mb-2 mb-lg-0">
			<c:if test="${member == null}">
				<li class="nav-item">
			   		<a class="nav-link" href="${path}/member/signup">SignUp</a>
			    </li>
			    <li class="nav-item">
			    	<a class="nav-link" href="${path}/member/signin">SignIn</a>
			    </li>
			</c:if>
			
			<c:if test="${member != null}">
				<li class="nav-item mx-2">
					<a class="nav-link">${member.userName}님 환영합니다.</a>
				</li>
			    <li class="nav-item">
			    	<a class="nav-link" href="${path}/member/signout">SignOut</a>
			    </li>
			</c:if>
		</ul>
    </div>
  </div>
</nav>