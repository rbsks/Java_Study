<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 사원번호를 입력해라! </h1>
		<form action="/Test" method="get"> 
			<label for="empno"> Empno : </label>
			<input type = "number" id="empno" name="empno">
			<input type = "submit" value = "submit"> 
		</form>
</body>
</html>