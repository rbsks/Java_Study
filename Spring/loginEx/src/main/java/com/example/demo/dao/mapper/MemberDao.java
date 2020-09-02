package com.example.demo.dao.mapper;

import com.example.demo.model.dto.MemberDto;

public interface MemberDao {
	
	boolean addMember(MemberDto memberDto);
	String checkId(String id);
	MemberDto login(MemberDto memberDto);
}
