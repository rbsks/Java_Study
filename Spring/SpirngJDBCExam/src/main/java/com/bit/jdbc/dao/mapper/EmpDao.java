package com.bit.jdbc.dao.mapper;

import java.util.List;
import com.bit.jdbc.model.dto.Emp;

/**
 * Mapper.xml과 연동할 java file
 * EmpDao의 구현부는 Mapper.xml이 가지고 있다.(xml 쿼리문을 자바언어로 바꾸는것을 mybatis가 처리)
 * @author bitcamp
 *
 */
public interface EmpDao {
	Emp findEmpByEmpno(int empno);
	List<Integer> getAllEmpno();
	void insertEmp(Emp emp);
	List<Emp> empinfoAll();
	String[] getColumnNames();
	void updateEmp(Emp emp);
	void deleteEmp(int empno);
}
