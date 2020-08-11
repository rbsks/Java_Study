<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>EMPNO</th>
		</tr>

		<c:forEach items="${empnooAll }" var="emp">
			<tr>
				<td>${emp}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>