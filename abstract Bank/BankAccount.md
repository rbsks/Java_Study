``` java  
package com.bit.bank;

import java.util.Calendar;

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
	protected Calendar createDate;

	/**
	 * 이자입금일 : 받는것, 내는것
	 */
	protected Calendar interestDate;
	/**
	 * 이율 : 3.2%, 4.5
	 */
	protected double interestRate;
	/**
	 * 이자 : 10000
	 */
	protected int interest;
	/**
	 * 기간 :년단위
	 */
	protected int period;
	/**
	 * 총금액 : 자유저축 ==> 잔액 대출 ==> 대출금 + 이자액 신탁 ==> 신탁금 + 이자액
	 */
	protected long totalAmount;

	public BankAccount() {
		calc();
	}

// 출력형식메소드  강제성
	abstract public void bankBookPrint();

//연산 
	abstract protected void calc();

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", price=" + price + ", createDate="
				+ createDate + ", interestDate=" + interestDate + ", interestRate=" + interestRate + ", interest="
				+ interest + ", period=" + period + ", totalAmount=" + totalAmount + "]";
	}


}
```  
