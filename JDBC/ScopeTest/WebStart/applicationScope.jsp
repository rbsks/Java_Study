<%@page import="variable.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	
	<%
		String xxName = new String();
		application.setAttribute("xxName", xxName);
		
		Member member = new Member();
		application.setAttribute("member', member);
		member.setAge(123);
	%> 
	
	jsp명령어를 안쓰면 저렇게 써야한다.
--%>
	<jsp:useBean id="xxName" class="java.lang.String" scope="application"/>
	<jsp:useBean id="member" class="variable.Member" scope="application"/>
	<jsp:setProperty property="age" name="member" value="123"/><!-- useBean id를 불러와age에 값을 준 것 setAttribute랑 같은거-->
</body>
</html> 