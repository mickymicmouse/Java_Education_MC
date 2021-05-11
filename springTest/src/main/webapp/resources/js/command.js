/**
 * 
 */

function checkData(){
	var flag = false;
	//alert('welcome');
	
	var userId = document.getElementById("userId").value;
	var password = document.getElementById("password").value;
	
	if (userId != '' && password !=''){
		alert(userId+" "+password);
		flag = true;
	} else{
		alert('아이디 혹은 패스워드를 입력하세요');
	}
	return flag;
}