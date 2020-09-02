package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.dao.service.MemberService;
import com.example.demo.model.dto.MemberDto;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberSerivce;
	
	@RequestMapping(value="loginpage", method = RequestMethod.GET)
	public String gologinpage() {
		return "loginpage";
	}
	
	@RequestMapping(value="signupcontroller", method = RequestMethod.GET)
	public String gosignup() {
		return "signup";
	}

	@ResponseBody // ajax를 사용하기 위해서 추가 (데이터를 넘겨주면서 이동)
	@RequestMapping(value="addMemcontroller", method = RequestMethod.POST, produces = "application/String;charset=utf-8") 
	public String addMember(MemberDto memberDto) {
		
		String message= "";
		if(memberSerivce.addMember(memberDto)) {
			message="회원가입 성공";
		}else {
			message="회원가입 실패";
		}
		
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value = "checkidcontroller", method = RequestMethod.GET, produces = "application/String;charset=utf-8")
	public String checkid(String id) {
	 
	  String message= "";
	  if(memberSerivce.checkId(id).equals("1")) {
	    message = "이미 있는 아이디 입니다.";
	  }else {
	    message = "사용 가능한 ID입니다.";
	  }
	  return message;
	}
	
	@ResponseBody
	@RequestMapping(value = "logincontroller", method = RequestMethod.POST, produces = "application/String;charset=utf-8")
	public String login(MemberDto memberDto) {
	 
	  
	  MemberDto member = memberSerivce.login(memberDto);
	  String message = "";
	  if(member.getId().equals(memberDto.getId())) {
	    message = "환영합니다  " + member.getId()+"님";
	  }else {
	    message ="로그인 실패";
	  }
	  return message;
	}

}
