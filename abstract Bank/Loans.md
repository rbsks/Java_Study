``` java  
package com.bit.bank;

import java.util.Calendar;

public class Loans extends BankAccount{

	private static int freesavingsCount;
	
	public Loans() {
		accountNumber = String.format("200-%03d",++freesavingsCount);
		createDate = Calendar.getInstance();
	}
	
	
//	@Override
//	public String toString() {
//		return "계좌번호 :" +"200-00"+accountNumber + "   고객명 :" + name+ "   대출일 :" + createDate + "   대출금액 : "+ price+"원" 
//				+"   이자율 :" + interestRate + "   이자액 :" + interest + "   기간 : " + period +"년"+ "   월상환액 :" +totalAmount+"원";
//	}

	@Override
	protected void calc() {
		int periodM = period * 12;

		interest = price * (int)(interestRate/100) / periodM;
		totalAmount = interest;
		
		
	}

	@Override
	public void bankBookPrint() {
		String s = "";
		s = "계좌번호 : " +"200-00"+accountNumber + "   고객명 : " + name+ "   대출일 : " + createDate.getTime() + "   대출금액 : "+ String.format("%,d", price)+"원" 
				+"   이자율 : " + String.format("%,d", interestRate) + "   이자액 : " + String.format("%,d", interest) + "   기간 : " + period +"년"+ "   월상환액 : " +String.format("%,d", totalAmount)+"원";
		System.out.println(s);
		
	}

}
```  
