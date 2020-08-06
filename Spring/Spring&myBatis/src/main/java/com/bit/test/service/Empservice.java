package com.bit.test.service;

import java.util.List;
import com.bit.test.domain.Emp;

public interface Empservice {
	int getAllEmpCount();
//	List<Dept>getAllDepts();
	Emp selectEmp(int empno);
	List<Integer>getAllEmpno();
	void insertEmp(Emp emp);
	List<Emp>getAllEmps();
	void updateEmp(Emp emp);
	void deleteEmp(int empno);
}
