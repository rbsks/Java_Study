<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿이 호출한 jsp</title>
</head>
<body>
	사원번호:${param.empno }님의 정보는 다음과 같다.<br>
	<%=request.getParameter("empno")%> ${empInfo }

	<br>
</body>
</html>