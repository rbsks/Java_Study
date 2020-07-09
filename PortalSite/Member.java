package com.bit.hgb;

public class Member {
	private long mid; // PK(id)
	private String email; 
	private String pass; // 암호, 해쉬로 표현되있지 않은 것을 평문(plain)라 함
	
	
	public long getMid() {
		return mid;
	}
	
	public void setMid(long mid) {
		this.mid = mid;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", email=" + email + "]";
	}
	
	// 객체간 비교하는 방법
	@Override
	public boolean equals(Object obj) {
		// 참조를 먼저 비교
		if(super.equals(obj)) {
			return true; // 참조가 같으면 
		}
		// 참조가 다를때 필드 값 비교
		Member comp = (Member)obj; // obj를 형변환
		if(this.mid == comp.getMid()) {
			return true;
			
		}
		return false;
		
	}
		
}
