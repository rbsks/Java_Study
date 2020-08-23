package com.team.three.dao.mapper;

import java.util.List;

import com.team.three.model.dto.Member;

public interface MemberDao {
	void createMember(Member member);
	List<Member> searchMemberAll();
	Member searchMemberByMember(Member member);
	void updateMember();
	void deleteMember();
}
