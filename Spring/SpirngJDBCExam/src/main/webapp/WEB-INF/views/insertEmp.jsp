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
			<th>DEPTNO</th>
		</tr>

		<tr>
			<td>${insertEmp.empno }</td>
			<td>${insertEmp.ename }</td>
			<td>${insertEmp.job }</td>
			<td>${insertEmp.mgr }</td>
			<td>${insertEmp.hiredate }</td>
			<td>${insertEmp.sal }</td>
			<td>${insertEmp.comm }</td>
			<td>${insertEmp.deptno }</td>
		</tr>

	</table>
</body>
</html>