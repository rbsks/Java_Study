package com.bit.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpinfoRepository {
	private Connection connection;
	private List<Empinfo> employees;
	private List<Dept> depts;

	public EmpinfoRepository() {
		connection = DBConnection.getConnection();
		
	}
	
	public Empinfo empInfo(int empNo) { //statement 씀
		Empinfo emp = null;
		// connection을 통해서 statment 받아서 쿼리를 던져서 받ㄴ은다
		Statement stmt = null;
		ResultSet rest = null;
		try {
			stmt = connection.createStatement();
			rest = stmt.executeQuery(
					"select * from emp, dept where (emp.deptno=dept.deptno) and emp.empno = " + empNo);
			
			while (rest.next()) {
				emp = new Empinfo();
				emp.setEmpno(rest.getInt(1));
				emp.setEname(rest.getString(2));
				emp.setJob(rest.getString(3));
				emp.setMgr(rest.getInt(4));
				emp.setHiredate(rest.getString(5));
				emp.setSal(rest.getInt(6));
				emp.setComm(rest.getInt(7));
//				emp.setDeptno(rest.getInt(8));
				emp.setDname(rest.getString(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("백종원2");
			try {
				if(rest != null) rest.close();
				if(stmt != null) stmt.close();
			}catch(SQLException ex){
				System.out.println("EmpInfoRepository에서 empInfo1에서 close 할때 ");
				System.out.println(ex.getErrorCode()+ex.getMessage()+ex.getSQLState());
			}
		}
		return emp;
	}
	
	public List<Empinfo> empinfoAll() {
		String query = "select * from emp, dept where emp.deptno=dept.deptno";
		Empinfo emp = null;
		PreparedStatement stmt = null;
		ResultSet rest = null;
		employees = new ArrayList<Empinfo>();
		
		try {
			
			stmt = connection.prepareStatement(query);
			rest = stmt.executeQuery(); // java <- DB
			while (rest.next()) {
				emp = new Empinfo();
				emp.setEmpno(rest.getInt(1));
				emp.setEname(rest.getString(2));
				emp.setJob(rest.getString(3));
				emp.setMgr(rest.getInt(4));
				emp.setHiredate(rest.getString(5));
				emp.setSal(rest.getInt(6));
				emp.setComm(rest.getInt(7));
//				emp.setDeptno(rest.getInt(8));
				emp.setDname(rest.getString(10));
				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rest != null) {
					rest.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException e) {
				System.out.println("EmpInfoRepository에서 empInfo1에서 close 할때 ");
				System.out.println(e.getErrorCode()+e.getMessage()+e.getSQLState());
			}
		}
		return employees;
	}
	
	public List<Empinfo> empCombo(String req) {
		String query = "select * from emp, dept where (emp.deptno=dept.deptno) and emp.deptno = ?";
		Empinfo emp = null;
		Dept dept = null;
		PreparedStatement stmt = null;
		ResultSet rest = null;
		employees = new ArrayList<Empinfo>();
		depts = new ArrayList<Dept>();
		
		try {
			
			stmt = connection.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(req));
			rest = stmt.executeQuery(); // java <- DB
			while (rest.next()) {
				emp = new Empinfo();
				dept = new Dept();
				emp.setEmpno(rest.getInt(1));
				emp.setEname(rest.getString(2));
				emp.setJob(rest.getString(3));
				emp.setMgr(rest.getInt(4));
				emp.setHiredate(rest.getString(5));
				emp.setSal(rest.getInt(6));
				emp.setComm(rest.getInt(7));
				emp.setDeptno(rest.getInt(8));
				emp.setDname(rest.getString(10));
				dept.setLoc(rest.getString(11));
				employees.add(emp);
				depts.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rest != null) {
					rest.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException e) {
				System.out.println("EmpInfoRepository에서 empInfo1에서 close 할때 ");
				System.out.println(e.getErrorCode()+e.getMessage()+e.getSQLState());
			}
		}
		return employees;
	}
}
