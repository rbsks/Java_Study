package com.bit.jdbc.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.jdbc.dao.service.EmpService;
import com.bit.jdbc.model.dto.Emp;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "searchEmp", method = RequestMethod.GET)
	public String findEmpByEmpno( Model model, HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Emp emp = empService.callFindEmpByEmpno(empno);
		model.addAttribute("empInfo", emp);
		return "empInfo";
	}
	
	@RequestMapping(value = "empAll", method = RequestMethod.GET)
	public String empinfoAll( Model model, HttpServletRequest request) {
		List<Emp> emp = empService.empinfoAll();
		model.addAttribute("empInfoAll", emp);
		return "empAll";
	}
	
	@RequestMapping(value = "getAllEmpno", method = RequestMethod.GET)
	public String getAllEmpno( Model model, HttpServletRequest request) {
		List<Integer> emp = empService.getAllEmpno();
		model.addAttribute("empnooAll", emp);
		return "getAllEmpno";
	}
	
	/*
	@RequestMapping(value = "insertEmp", method = RequestMethod.GET)
	public String insertEmp( Model model, HttpServletRequest request) {
		Emp emp = new Emp();
		String date = request.getParameter("hiredate");
		Date d = Date.valueOf(date);
		emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
		emp.setEname(request.getParameter("ename"));
		emp.setJob(request.getParameter("job"));
		emp.setMgr(Integer.parseInt(request.getParameter("mgr")));
		emp.setHiredate(d);
		emp.setSal(Integer.parseInt(request.getParameter("sal")));
		emp.setComm(Integer.parseInt(request.getParameter("comm")));
		emp.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		empService.insertEmp(emp);
		model.addAttribute("insertEmp", emp);
		return "insertEmp";
	}*/
	
	@RequestMapping(value = "insertEmp", method = RequestMethod.GET)
	public String insertEmp(@ModelAttribute("emp") Emp emp, BindingResult result, String hiredate, Model model) {
		Date d = Date.valueOf(hiredate);
		emp.setHiredate(d);
		empService.insertEmp(emp);
		model.addAttribute("emp",emp);
		return "insertEmp";
		
	}
	
	@RequestMapping(value = "updateEmp", method = RequestMethod.GET)
	public String  updateEmp( Model model, HttpServletRequest request) {
		Emp emp = new Emp();
		emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
		emp.setEname(request.getParameter("ename"));
		emp.setJob(request.getParameter("job"));
		empService.updateEmp(emp);
		model.addAttribute("updateEmp", emp);
		return "updateEmp";
	}
	
	@RequestMapping(value = "deleteEmp", method = RequestMethod.GET)
	public String deleteEmp( Model model, HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		empService.deleteEmp(empno);
		model.addAttribute("deleteEmp", empno);
		return "deleteEmp";
	}
}
