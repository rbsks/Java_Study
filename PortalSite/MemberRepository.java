package com.bit.hgb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// 멤버들을 저장하고 CRUD를 하는 객체
public class MemberRepository {
	// 멤버들을 처리할 때 필요한 반환의 형식들을 생각
	private ArrayList<Member> members; // 바로 new해서 생성하지말기 프레임워크와 충돌이 난다.
	private MemberFile mfile;
	
	public MemberRepository()  {
		mfile = new MemberFile();
		try {
			mfile.load("member.csv");
			members = mfile.getTable();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public MemberRepository(ArrayList<Member> repo) {
		members = repo;
	}
	
	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMember(ArrayList<Member> member) {
		this.members = member;
		
	}

	public void add(Member save) {
		if(save != null) {
			members.add(save);
		}else {
			System.out.println("Member repo save : null");
		}
		
	}
	
	
	public ArrayList<Member> getMembers(String key) {
		ArrayList<Member> rst = new ArrayList<Member>();
		for(Member member : members) {
			if(member.getEmail().contains(key)) {
				rst.add(member);
			}
			
		}
		
		return rst;
	}


	public Member findOne(long id) {
		for(Member member : members) {
			if(member.getMid() == id) {
				return member;
			}
		}
		return null;
	}

	public void memberSave() {
		try {
			mfile.save("member.csv");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Member> findAll() {		
		return members;
	}

}
