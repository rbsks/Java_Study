```java  
package com.bit.model.dto_beans;

import java.util.Date;

public class Freesaving extends BankAccount{
	
	private static int freesavingsCount;
	private String fid;
	
	public Freesaving() {
		accountNumber = String.format("100-%03d",++freesavingsCount);
	}

	public Freesaving(String accountNumber, String name, int price, Date createDate, long totalAmount, String fid) {
		super(accountNumber, name, price, createDate, totalAmount);
		this.fid = fid;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	
	
	@Override
	public void bankBookPrint() {
		
	}

	@Override
	public void calc() {
		totalAmount += price;
	}
	
	@Override
	public String toString() {
		
		return "계좌번호 : " +accountNumber + "   고객명 : " + name+ "   입금일 : " + createDate.getTime() + "   입금액 : "+ String.format("%,d", price)+"원" 
				+ "   총액 : " +String.format("%,d", totalAmount)+"원";	
	}





}
```
