package com.team.three.controller;

import com.team.three.dao.service.MemberService;
import com.team.three.model.dto.Member;

public class SignInController {
	private MemberService memberService;

	public String searchMemberByEmail(Member member) {
		memberService.callSearchMemberByMember(member);
		return null;
	}
}
