package com.bit.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.bit.test.domain.Emp;

public interface EmpDao {
	
	Integer getAllEmpCount();
	Emp select(@Param("empno") int empno);
	List<Integer> getAllEmpno();
	void insertEmp(Emp emp);
	List<Emp> getAllEmps();
	String[] getColumnNames();
	void updateEmp(Emp emp);
	void deleteEmp(int empno);
}
