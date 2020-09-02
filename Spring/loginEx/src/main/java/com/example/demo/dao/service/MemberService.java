package com.example.demo.dao.service;

import com.example.demo.model.dto.MemberDto;

public interface MemberService {
	
	boolean addMember(MemberDto memberDto);
	String checkId(String id);
	MemberDto login(MemberDto memberDto);

}
