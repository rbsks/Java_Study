package com.bit.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto.Empinfo;
import com.bit.util.DBConnection;


public class EmpinfoRepository { // JPA
	
	private Connection conn;
	private List<Empinfo> employees;
	
	public EmpinfoRepository() {
		conn = DBConnection.getConnection();
		employees = new ArrayList<Empinfo>();
	}

	public List<Empinfo> empinfoAll(String req) {
		// connection을 통해서 statement를 받아서 쿼리를 던져서 받는다.
		
		String query = "select * from emp where empno = ?";
		Empinfo emp = null;
		PreparedStatement stmt = null;
		ResultSet rest = null;
		
		try {
			emp = new Empinfo();
			stmt = conn.prepareStatement(query); // java -> DB
			stmt.setInt(1, Integer.parseInt(req));
			rest = stmt.executeQuery(); // java <- DB
			while (rest.next()) {
				emp.setEmpNo(rest.getInt("EMPNO"));
				emp.setEmpName(rest.getString("ENAME"));
				emp.setJob(rest.getString("JOB"));
				emp.setMgr(rest.getInt("MGR"));
				emp.setHireDate(rest.getDate("HIREDATE"));
				emp.setSal(rest.getInt("SAL"));
				emp.setComm(rest.getInt("COMM"));
				emp.setDeptNo(rest.getInt("DEPTNO"));
				employees.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
