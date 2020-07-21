``` html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Form</title> 
<script>
	function vCode() {
		document.getElementByid("demo").innerHTML="전송되었습니다."
	}
</script>

</head>
<body>
	<form>
		<fieldset style = "background-color:#f5f6f7; margin:auto; border:solid 0">
		<legend style = "margin:auto">회원가입</legend>
		<table style="background-color:#f5f6f7; margin:auto;">
			<tr>
				<td><label for="id">아이디</label></td><br>
				
			</tr>
			<tr>
				<td><input id="id"  type="text" size="35" placeholder="아이디를 입력하시오" required="required" style ="height:40px"></td>
			</tr>
			<tr>
				<td><label for="pwd">비밀번호</label></td>
				
			</tr>
			<tr>
				<td><input id="pwd" type="password" size="35" placeholder="비밀번호를 입력하시오." required="required" style ="height:40px"></td>
			</tr>
			<tr>
				<td><label for="repwd">비밀번호 재확인</label></td>
				
			</tr>
			<tr>
				<td><input id="repwd" type="password" size="35" placeholder="비밀번호를 재입력하시오." required="required" style ="height:40px"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr> 
			<tr>
				<td><label for="name">이름</label></td>
				
			</tr>
			<tr>
				<td><input id="name" size="35" type="text" style ="height:40px"></td> 
			</tr>
			<tr>
				<td><label>성별</label></td>
			
			</tr>
			<tr>
				<td>
				<input type="radio" value="man">남자
				<input type="radio" value="woman">여자
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr> 
			<tr>
				<td><label>생일</label></td>
				
			</tr>
			<tr>
				<td>
				<input type="date" name="date" size="35" style ="height:40px">
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr> 
			<tr>
				<td><label>본인 확인 이메일</label></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="email" name="email" size="35" placeholder="본인확인(이메일)" style ="height:40px">
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><label>휴대전화</label></td>
			</tr>
			 <tr>
			 	<td colspan="2">
			 		<select>
			 		<option>+82</option>
			 		</select>			
			 		
			 	</td>
			 </tr>
			 <tr>
			 	<td colspan="2">
			 	<input type="text" id="phone" size="20" style ="height:40px">
			 	<input id="vcode" type="button" value="인증번호 받기" style ="height:40px">	
			 	</td>
			 </tr>
			 <tr>
			 	<td colspan="2">
			 		<input type="text" id="certification" size="35" placeholder="인증번호" style ="height:40px" >
			 		
			 	</td>
			 </tr>
			 <tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2">
					<input id="account_complete" type="button" value="가입하기" size="35" style ="height:40pt; width:212pt">
				</td>
			</tr>
		</table>
		</fieldset>
	</form>
	
	<script type = "text/javascript">
	vcode.onclick = function(){
		alert("인증번호가 전송되었습니다.");
	}
	account_complete.onclick = function(){
		alert("가입이 완료되었습니다.");
	}
	</script>
</body>
</html> 
```  
#### 결과화면
![image](https://user-images.githubusercontent.com/67041069/88037914-79ec4080-cb80-11ea-9fc0-556b44c49c46.png)  
![image](https://user-images.githubusercontent.com/67041069/88037934-807ab800-cb80-11ea-82a1-78ec6ba40cb2.png)  
![image](https://user-images.githubusercontent.com/67041069/88037953-85d80280-cb80-11ea-90ad-e9491265d393.png)  
