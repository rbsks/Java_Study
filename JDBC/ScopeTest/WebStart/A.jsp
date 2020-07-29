<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="member" class="variable.Member" scope="application"/>
	<%=member %>
	
	<input type="number" name="pageScope" value ="12"><br>
	<form action="requestTarget.jsp">
		<input type="text" name="requestScope">
		<input type="submit" >
	</form>
</body>
</html>