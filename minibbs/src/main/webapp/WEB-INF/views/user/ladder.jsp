<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>


<script src="https://code.jquery.com/jquery-3.7.1.min.js" ></script>
<link href="${path}/resources/css/meterial.css" rel="stylesheet"/>
<link href="${path}/resources/css/style.css" rel="stylesheet"/>
<script>

</script>
<br><br><br><br><br>
	 <div class="landing" id="landing">
       <div class="start-form">
            <div class="landing-form">
                <div class="group">      
                  <input type="text" name="member" required>
                  <span class="highlight"></span>
                  <span class="bar"></span>
                  <label>참여자 수</label>
                    <div  id="button" class="button raised green">
                      <div  class="center" >START</div>
                    </div>
                </div>
            </div>
       </div>
    </div>
    <div class="center2">
	    <div id="ladder" class="ladder">
	        <div class="dim"></div>
	        <canvas class="ladder_canvas" id="ladder_canvas"></canvas>
		</div>
		<div class="btn-3" ><span class="bg"></span></div>
		   <div id="btn4" class="center button raised green">다시 셋팅</div>
			<div id="btn2" class="center button raised green">Box 제거</div>
	</div>

<script src="${path}/resources/js/ladder.js"></script>
</body>
</html>
