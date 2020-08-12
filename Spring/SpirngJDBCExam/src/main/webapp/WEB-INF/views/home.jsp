<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

	<h3>전체 사원 정보</h3>
	<form action="/empAll" method="get" >
		<label for="EMP">전체 사원 정보</label>
		<input type="submit" id="EMP" name="EMP"><br><br>
	</form>
	
	<h3>사원 정보</h3>
	<form action="/searchEmp" method="get" >
		<label for="empno">ID: </label>
		<input type="number" id="empno" name="empno"><br><br>
		<input type="submit" value="Go~~!!"><br><br>
	</form>
	
	<h3>전체 사원 번호</h3>
	<form action="/getAllEmpno" method="get" >
		<label for="EMP">전체 사원 번호</label>
		<input type="submit" id="EMPALL" name="EMPALL"><br><br>
	</form>
	
	<h3>사원 입력</h3>
	<form action="/insertEmp" method="get" enctype="multipart/form-data" >
		<label for="empno">EMPNO: </label>
		<input type="number" id="empno" name="empno" value="${emp.empno }"><br>
		<label for="ename">ENAME: </label>
		<input type="text" id="ename" name="ename" value="${emp.ename }"><br>
		<label for="job">JOB: </label>
		<input type="text" id="job" name="job" value="${emp.job }"><br>
		<label for="mgr">MGR: </label>
		<input type="number" id="mgr" name="mgr" value="${emp.mgr }"><br>
		<label for="hiredate">HIREDATE: </label>
		<input type="date" id="hiredate" name="hiredate" value="${emp.hiredate}"><br>
		<label for="sal">SAL: </label>
		<input type="number" id="sal" name="sal" value="${emp.sal }"><br>
		<label for="comm">COMM: </label>
		<input type="number" id="comm" name="comm" value="${emp.comm }"><br>
		<label for="deptno">DEPTNO: </label>
		<input type="number" id="deptno" name="deptno" value="${emp.deptno }"><br>
		<input type="submit" value="Go~~!!"><br><br>
	</form> 
	
	<h3>사원 정보 수정</h3>
	<form action="/updateEmp" method="get" >
		<label for="empno">EMPNO: </label>
		<input type="number" id="empno" name="empno"><br>
		<label for="ename">ENAME: </label>
		<input type="text" id="ename" name="ename"><br>
		<label for="job">JOB: </label>
		<input type="text" id="job" name="job"><br>
		<input type="submit" id="EMPUPDATE" name="EMPUPDATE"><br><br>
	</form>
	
	<h3>퇴사</h3>
	<form action="/deleteEmp" method="get" >
		<label for="empno">EMPNO: </label>
		<input type="number" id="empno" name="empno">
		<input type="submit" id="empdelete" name="empdelete"><br><br>
	</form>

</body>
</html>
