package com.team.three.controller;

import com.team.three.dao.service.MemberService;
import com.team.three.model.dto.Member;

public class SignUpController {
	private MemberService memberService;
	
	public String createMember(Member member) {
		memberService.callCreateMember(member);
		return null;
	}
}
