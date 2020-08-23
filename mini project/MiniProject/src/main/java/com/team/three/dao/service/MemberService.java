package com.team.three.dao.service;

import java.util.List;

import com.team.three.model.dto.Member;

public interface MemberService {
	void callCreateMember(Member member);
	List<Member> callSearchMemberAll();
	Member callSearchMemberByMember(Member member);
	void callUpdateMember();
	void callDeleteMember();
}
