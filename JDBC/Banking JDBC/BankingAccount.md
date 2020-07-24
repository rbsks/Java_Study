``` java  
package com.bit.model.dto_beans;

import java.util.Date;

public abstract class BankAccount {

	/*
	 * 총금액v
	 */
	/**
	 * 계좌번호
	 */
	protected String accountNumber;
	/**
	 * 고객명
	 */
	protected String name;
	/**
	 * 금액 : 대출 - 대출금 , 신탁 - 신탁금액, 자유저축-???
	 */
	protected int price;
	/**
	 * 날짜 : 개설일 , 통장생성일
	 */
	protected Date createDate;
	/**
	 * 총금액 : 자유저축 ==> 잔액 대출 ==> 대출금 + 이자액 신탁 ==> 신탁금 + 이자액
	 */
	protected long totalAmount;

	public BankAccount() {
		//calc();
	}
	
	

	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public long getTotalAmount() {
		return totalAmount;
	}



	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}



	// 출력형식메소드  강제성
	abstract public void bankBookPrint();

	//연산 
	abstract protected void calc();
	
	
	

	public BankAccount(String accountNumber, String name, int price, Date createDate, long totalAmount) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.price = price;
		this.createDate = createDate;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", price=" + price + ", createDate="
				+ createDate + ", totalAmount=" + totalAmount + "]";
	}

	

}
```
