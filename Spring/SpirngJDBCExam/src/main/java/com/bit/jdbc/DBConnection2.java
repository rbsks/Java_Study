package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * instance가 한번만 만들어지도록
 * POJO Class
 * @author bitcamp
 *
 */
public  class DBConnection2 {
	private static Connection conn ;
	public final static DBConnection2 instance;
	static {
			instance=new DBConnection2() ;
	}
	public  static  DBConnection2  getInstance() {
		return  instance;
	}
	public static Connection getConnection() {
		return conn;
	}
	private DBConnection2() {
		// TODO Auto-generated constructor stub
		System.out.println("DBConnection 생성자시작 ");
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:admin", 
					  user="scott", 
					  password="tiger";
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				if( conn!=null ) {
					conn.close();
				}
			}catch (SQLException ex) {
				// TODO: handle exception
				System.out.println("connection 장애");
			}
		}finally {
			// 백종원의설탕
		}
		System.out.println("DBConnection 생성자종료 ");
	}
	public DBConnection2(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println("DBConnection (String msg) ");
	}
}














