package com.bit.Ex;

import java.time.LocalDateTime;

public class Human {
	private int bankingNumber;
	private String name;
	private LocalDateTime time;
	private String money;
	

	public int getBankingNumber() {
		return bankingNumber;
	}
	public void setBankingNumber(int bankingNumber) {
		this.bankingNumber = bankingNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "계좌번호 : " + "100-00" + bankingNumber + "  고객명 : " + name + "   입금일 : " + time + "  입금액 : " + money +"원";
	}
	
	
	
	
}
