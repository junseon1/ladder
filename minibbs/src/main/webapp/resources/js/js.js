if(!document.userForm.userID.value){
	alert("ID를 입력하세요");
	return false;
}
$.ajax({
	url : "/user/ExistUser",
	data : $("#userForm").seriallize(),
	dataType:"JSON",
	cache : false,
	async : true,
	type :"POST",
	success : function(obj){
		if(obj == 1){
			alert("중복된 아이디 입니다");
			return false;
		}else{
			Join();//중복된 아이디가 없다면 Join() 함수를 통해 회원가입을 한다
		}
	},
	error : function(xhr, status, error){}
})