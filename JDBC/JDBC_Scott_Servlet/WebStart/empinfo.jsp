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
			<th>MGR</th>
			<th>HIREDATE</th>
			<th>SAL</th>
			<th>COMM</th>
			<th>DNAME</th>
		</tr>

		<tr>
			<td>${empInfo.empno }</td>
			<td>${empInfo.ename }</td>
			<td>${empInfo.job }</td>
			<td>${empInfo.mgr }</td>
			<td>${empInfo.hiredate }</td>
			<td>${empInfo.sal }</td>
			<td>${empInfo.comm }</td>
			<td>${empInfo.dname }</td>
		</tr>

	</table>
</body>
</html>