package com.team.three.dao.service.impl;

import java.util.List;

import com.team.three.dao.mapper.MemberDao;
import com.team.three.dao.service.MemberService;
import com.team.three.model.dto.Member;

public class MemberServiceImpl implements MemberService {
	MemberDao memberDao;
	
	@Override
	public void callCreateMember(Member member) {
		memberDao.createMember(member);
	}

	@Override
	public List<Member> callSearchMemberAll() {
		memberDao.searchMemberAll();
		return null;
	}

	@Override
	public Member callSearchMemberByMember(Member member) {
		memberDao.searchMemberByMember(member);
		return null;
	}
	
	@Override
	public void callUpdateMember() {
		memberDao.updateMember();
	}

	@Override
	public void callDeleteMember() {
		memberDao.deleteMember();
	}

}
