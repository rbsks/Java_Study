``` java  
package com.bit.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto_deans.Empinfo;
import com.bit.util.DBConnection;

public class EmpinfoRepository { // JPA
	private Connection conn;
	
	
	public EmpinfoRepository() {
		 conn = DBConnection.getConnection();
		 
	}
	public List<Empinfo> empinfoAll() {
		// connection을 통해서 statement를 받아서 쿼리를 던져서 받는다.
		List<Empinfo> temp = new ArrayList<Empinfo>();
		Statement stmt = null;
		ResultSet rest = null;
		try {
			stmt = conn.createStatement(); // java -> DB
			rest = stmt.executeQuery("select emp.empno, emp.ename, dept.dname, dept.loc, emp.job, emp.sal " + 
										" from emp, dept " + 
											" where emp.deptno = dept.deptno"); // java <- DB
			while(rest.next()) {
				temp.add(new Empinfo(rest.getInt(1), rest.getString("ename"), rest.getString("dname"), rest.getString("loc"), rest.getString("job"), rest.getInt(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	public List<Empinfo> empNo(int empno) {
		// connection을 통해서 statement를 받아서 쿼리를 던져서 받는다.
		List<Empinfo> temp = new ArrayList<Empinfo>();
		Statement stmt = null;
		ResultSet rest = null;
		try {
			stmt = conn.createStatement(); // java -> DB
			rest = stmt.executeQuery("select emp.empno, emp.ename, dept.dname, dept.loc, emp.job, emp.sal " + 
										" from emp, dept " + 
											" where emp.deptno = dept.deptno and empno = " + empno); // java <- DB
			while(rest.next()) {
				temp.add(new Empinfo(rest.getInt(1), rest.getString("ename"), rest.getString("dname"), rest.getString("loc"), rest.getString("job"), rest.getInt(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	public List<Empinfo> empSal() {
		// connection을 통해서 statement를 받아서 쿼리를 던져서 받는다.
		List<Empinfo> temp = new ArrayList<Empinfo>();
		Statement stmt = null;
		ResultSet rest = null;
		try {
			stmt = conn.createStatement(); // java -> DB
			rest = stmt.executeQuery("select emp.empno, emp.ename, dept.dname, dept.loc, emp.job, emp.sal " + 
										" from emp, dept " + 
											" where emp.deptno = dept.deptno and emp.sal>=1000"); // java <- DB
			while(rest.next()) {
				temp.add(new Empinfo(rest.getInt(1), rest.getString("ename"), rest.getString("dname"), rest.getString("loc"), rest.getString("job"), rest.getInt(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	public List<Empinfo> empSearch(String name) {
		// connection을 통해서 statement를 받아서 쿼리를 던져서 받는다.
		List<Empinfo> temp = new ArrayList<Empinfo>();
		Statement stmt = null;
		ResultSet rest = null;
		try {
			stmt = conn.createStatement(); // java -> DB
			rest = stmt.executeQuery("select emp.empno, emp.ename, dept.dname, dept.loc, emp.job, emp.sal " + 
										" from emp, dept " + 
											" where emp.deptno = dept.deptno and emp.ename LIKE '%"+name+"%'"); // java <- DB
			while(rest.next()) {
				temp.add(new Empinfo(rest.getInt(1), rest.getString("ename"), rest.getString("dname"), rest.getString("loc"), rest.getString("job"), rest.getInt(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
}
```  
