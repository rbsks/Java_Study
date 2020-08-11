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
			<th>ENAME</th>
			<th>JOB</th>
		</tr>

		<tr>
			<td>${updateEmp.empno }</td>
			<td>${updateEmp.ename }</td>
			<td>${updateEmp.job }</td>

		</tr>

	</table>
</body>
</html>