package com.bit.jdbc.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.jdbc.dao.mapper.EmpDao;
import com.bit.jdbc.dao.service.EmpService;
import com.bit.jdbc.model.dto.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDao dao;
	
	@Override
	public Emp callFindEmpByEmpno(int empno) {
		System.out.println("callFindEmpByEmpno(int empno)......");
		return dao.findEmpByEmpno(empno);
	}

	@Override
	public List<Integer> getAllEmpno() {
		System.out.println("getAllEmpno()......");
		return dao.getAllEmpno();
	}

	@Override
	public void insertEmp(Emp emp) {
		System.out.println("insertEmp(Emp emp)......");
		dao.insertEmp(emp);
	}

	@Override
	public List<Emp> empinfoAll() {
		System.out.println("empinfoAll()......");
		return dao.empinfoAll();
	}

	@Override
	public String[] getColumnNames() {
		System.out.println("getColumnNames()......");
		return dao.getColumnNames();
	}

	@Override
	public void updateEmp(Emp emp) {
		System.out.println("updateEmp(Emp emp)......");
		dao.updateEmp(emp);
	}

	@Override
	public void deleteEmp(int empno) {
		System.out.println("deleteEmp(int empno)......");
		dao.deleteEmp(empno);
	}

}
