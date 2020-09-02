package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.dao.service.MemberService;
import com.example.demo.model.dto.MemberDto;

@Controller
public class BbsController {
	

	

	@RequestMapping(value = "bbslistcontroller", method = RequestMethod.GET)
	public String gobbslist() {
	 
	  return"bbslist";
	}
	  
}
