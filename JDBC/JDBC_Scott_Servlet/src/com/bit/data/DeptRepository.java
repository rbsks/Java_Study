package com.bit.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptRepository {
	private Connection connection;
	private List<Dept> depts;

	public DeptRepository() {
		connection = DBConnection.getConnection();
		
	}
	
	
	public List<Dept> empinfoAll() {
		String query = "select * from dept";
		Dept dept = null;
		PreparedStatement stmt = null;
		ResultSet rest = null;
		depts = new ArrayList<Dept>();
		
		try {
			
			stmt = connection.prepareStatement(query);
			rest = stmt.executeQuery(); // java <- DB
			while (rest.next()) {
				dept = new Dept();
				dept.setDeptno(rest.getInt(1));
				dept.setDname(rest.getString(2));
				dept.setLoc(rest.getString(3));
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
		return depts;
	}
	
	
	public Dept empinFind(String req) {
		String query = "select * from dept where deptno = ?";
		Dept dept = null;
		PreparedStatement stmt = null;
		ResultSet rest = null;
		depts = new ArrayList<Dept>();
		
		try {
			
			stmt = connection.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(req));
			rest = stmt.executeQuery(); // java <- DB
			while (rest.next()) {
				dept = new Dept();
				dept.setDeptno(rest.getInt(1));
				dept.setDname(rest.getString(2));
				dept.setLoc(rest.getString(3));
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
		return dept;
	}
	

}
