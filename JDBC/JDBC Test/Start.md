``` java  
package com.bit.start;

import java.sql.Connection;
import java.util.List;
import com.bit.model.dao.EmpinfoRepository;
import com.bit.model.dto_deans.Empinfo;
import com.bit.util.DBConnection;

public class Start {

	public static void main(String[] args) {
		
		Connection conn = DBConnection.getConnection();
		System.out.println(conn);
		EmpinfoRepository service = new EmpinfoRepository();
		List<Empinfo> empinfos = service.empinfoAll();
    
    // 사원 전부 전부 출력
		System.out.println("사원 정보");
		for(Empinfo empinfo : empinfos) {
			System.out.println(empinfo);
		}
		System.out.println();
		
    // 사원번호 7521 정보 출력
		System.out.println("사원번호 7521 정보");
	    System.out.println(service.empNo(7521));
	    System.out.println();
	    
      
      // 급여 1000달러 이하 사원 정보 출력, 급여 평균
	    int i = 0;
	    int total = 0;
	    double avg = 0;
	    empinfos = service.empSal();
	    System.out.println("급여 1000달러 이상 사원 정보");
	    for(Empinfo emp :  empinfos) {
	    	System.out.println(emp);
	      	total += emp.getEmpSal();
	    	i++;
	    }
	    avg = total / i;
	    System.out.println("급여액 평균 : " + avg);
	    
      // 입력한 사원 정보 출력
	    System.out.println(service.empSearch("JAMES"));
	    System.out.println(service.empSearch("WARD"));
	}

}
```  
