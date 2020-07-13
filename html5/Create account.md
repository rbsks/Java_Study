``` html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Form</title>
</head>
<body>
	<form>
		<fieldset>
		<legend>회원가입</legend>
		<table>
			<tr>
				<td><label for="id">아이디</label></td>
				<td><input id="id" type="text" placeholder="아이디를 입력하시오" required="required"></td>
			</tr>
			<tr>
				<td><label for="pwd">비밀번호</label></td>
				<td><input id="pwd" type="password" placeholder="비밀번호를 입력하시오." required="required"></td>
			</tr>
			<tr>
				<td><label for="repwd">비밀번호 재확인</label></td>
				<td><input id="repwd" type="password" placeholder="비밀번호를 재입력하시오." required="required"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr> 
			<tr>
				<td><label for="name">이름</label></td>
				<td><input id="name" type="text"></td> 
			</tr>
			<tr>
				<td><label>성별</label></td>
				<td>
				<input type="radio" value="man">남자
				<input type="radio" value="woman">여자
				</td>
			</tr>
			<tr>
				<td><label>생일</label></td>
				<td>
					<input type="date" name="date">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="email" name="email" size="35" placeholder="본인확인(이메일)">
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			 <tr>
			 	<td colspan="2">
			 		<select>
			 		<option>+82</option>
			 		</select>			
			 		<input type="text" id="phone" size="35">
			 		<input id="year" type="button" value="인증">
			 	</td>
			 </tr>
			 <tr>
			 	<td colspan="2">
			 		<input type="text" id="certification" size="30" placeholder="인증번호">
			 		<input id="year" type="button" value="확인">
			 	</td>
			 </tr>
		</table>
		</fieldset>
	</form>
</body>
</html>  
```  

![image](https://user-images.githubusercontent.com/67041069/87163574-865fd600-c302-11ea-9aa4-3b9aa9e98f0b.png)  