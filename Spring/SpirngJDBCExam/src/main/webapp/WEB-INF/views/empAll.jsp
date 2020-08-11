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
			<th>DNAME</th>
			<th>LOC</th>
		</tr>


		<c:forEach items="${empInfoAll }" var="emp">
			<tr>
				<td>${emp.empno }</td>
				<td>${emp.ename }</td>
				<td>${emp.job }</td>
				<td>${emp.mgr }</td>
				<td>${emp.hiredate }</td>
				<td>${emp.sal }</td>
				<td>${emp.comm }</td>
				<td>${emp.deptno }</td>
				<td>${emp.dname }</td>
				<td>${emp.loc}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>