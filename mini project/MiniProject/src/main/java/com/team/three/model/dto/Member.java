package com.team.three.model.dto;

import java.util.Date;

public class Member {
	private int member_Id;
	private String password;
	private String name;
	private String nickName;
	private Date birth;
	private String email;
	private Country country_Code;
	private String Phone;
	private String grade;

	public Member() {
	}

	public int getMember_Id() {
		return member_Id;
	}

	public void setMember_Id(int member_Id) {
		this.member_Id = member_Id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Country getCountry_Code() {
		return country_Code;
	}

	public void setCountry_Code(Country country_Code) {
		this.country_Code = country_Code;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Member [member_Id=" + member_Id + ", password=" + password + ", name=" + name + ", nickName=" + nickName
				+ ", birth=" + birth + ", email=" + email + ", country_Code=" + country_Code + ", Phone=" + Phone
				+ ", grade=" + grade + "]";
	}
	
	



	
}
