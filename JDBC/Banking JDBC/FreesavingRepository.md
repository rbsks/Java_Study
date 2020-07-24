```java   
package com.bit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.dto_beans.Freesaving;
import com.bit.util.DBConnection;

public class FreesavningRepository {
	
	private ArrayList<Freesaving> freesaving;
	private Connection conn;
	
	
	public FreesavningRepository() {
		 conn = DBConnection.getConnection();
		 freesaving = new ArrayList<Freesaving>();
	}
	
	public List<Freesaving> bankFreeAllinfo() {
		// connection을 통해서 statement를 받아서 쿼리를 던져서 받는다.
		PreparedStatement stmt = null;
		ResultSet rest = null;
		try {
			stmt = conn.prepareStatement("select freesaving.accountnaumber, freesaving.name, freesaving.price, freesaving.createdate,"
					+ "freesaving.totalamount, freesaving.fid "
					+ " from emp");

			rest = stmt.executeQuery();
			while (rest.next()) {
				freesaving.add(new Freesaving(rest.getString(1), rest.getString(2), rest.getInt(3), rest.getDate(4),
						rest.getLong(5), rest.getString(6)));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getErrorCode() + e.getMessage() + e.getStackTrace());
			return freesaving;
		} finally {
			try {
				if (rest != null) {
					rest.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode() + ex.getMessage() + ex.getStackTrace());

			}
		}
		return freesaving;
	}
	
	
	public void bankFreeInsert(Freesaving free) {
		// connection을 통해서 statement를 받아서 쿼리를 던져서 받는다.
		PreparedStatement stmt = null;
		int rest = 0 ;
		try {
			stmt = conn.prepareStatement("insert into freesaving (ACCOUNTNUMBER, NAME, PRICE, CREATEDATE, TOTALAMOUNT, FID) "
					+ " values( ?, ?, ?, sysdate, ?, PLUS.nextval )");

			stmt.setString(1, free.getAccountNumber());
			stmt.setString(2, free.getName());
			stmt.setInt(3, free.getPrice());
			stmt.setLong(4, free.getTotalAmount());

			rest = stmt.executeUpdate();
			System.out.println(rest);
			if (rest > 0 ) {
				System.out.println("입력 완료.");	
			}
			else {
				System.out.println("입력이 되지 않았습니다.");
			}
		} catch (SQLException e) {
			System.out.println(e.getErrorCode() + e.getMessage() + e.getStackTrace());
			
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode() + ex.getMessage() + ex.getStackTrace());

			}
		}
		
	}

}
```  
