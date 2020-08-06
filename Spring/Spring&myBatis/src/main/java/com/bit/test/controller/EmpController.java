package com.bit.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bit.test.domain.Emp;
import com.bit.test.service.Empservice;

@Controller
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	private Empservice empservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Emp> getAllEmp(Model model, HttpServletRequest request){
		System.out.println(request.getParameter("emp"));
		return  (List<Emp>) model.addAttribute("empall", empservice.getAllEmps());
		
		
	}
	
	

}
