<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%request.setCharacterEncoding("UTF-8");%>

	사원번호:${param.empno }님의 정보는 다음과 같다.<br>
	<%=request.getParameter("empno")%>
	${empInfo }
	<br> ${empInfo.job }
	<br>
	<%-- <%=((Empinfo) (request.getAttribute("empInfo"))).getJob()%> --%>
</body>
</html>