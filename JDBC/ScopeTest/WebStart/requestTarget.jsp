<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" name="na1" value="<%=request.getParameter("pageScope") %>"><br>
	<input type="text" name="na1" value="<%=request.getParameter("requestScope") %>">
</body>
</html>