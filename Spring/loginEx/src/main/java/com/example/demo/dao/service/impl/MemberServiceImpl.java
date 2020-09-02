package com.example.demo.dao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.MemberDao;
import com.example.demo.dao.service.MemberService;
import com.example.demo.model.dto.MemberDto;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao memberDao;

	@Override
	public boolean addMember(MemberDto memberDto) {
		System.out.println("addMember");
		return memberDao.addMember(memberDto);
	}

	@Override
	public String checkId(String id) {
		System.out.println("checkId");
		return memberDao.checkId(id);
	}

	@Override
	public MemberDto login(MemberDto memberDto) {
		System.out.println("login");
		return memberDao.login(memberDto);
	}

}
