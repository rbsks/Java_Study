package com.bit.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bit.test.dao.EmpDao;
import com.bit.test.domain.Emp;

@Service("EmpService")
public class EmpServiceImpl {
	
	@Autowired
	private EmpDao empDao;
	
	public List<Emp> getAllEmps(){
		return empDao.getAllEmps();
	}

}
