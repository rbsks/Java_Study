package com.bit.jdbc.dao.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit.jdbc.model.dto.Emp;

/**
 * Service class는 Dao class가 가지고 있는 메소드를 호출하기 위한 class
 * @author bitcamp
 *
 */

public interface EmpService {
	Emp callFindEmpByEmpno(int empno); // Emp findEmpByEmpno(int empno);
	List<Integer> getAllEmpno();
	void insertEmp(Emp emp);
	List<Emp> empinfoAll();
	String[] getColumnNames();
	void updateEmp(Emp emp);
	void deleteEmp(int empno); 
}
