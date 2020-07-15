``` java  
package com.bit.bank;

import java.util.Calendar;

public class SavingsDeposit extends BankAccount{

	private static int freesavingsCount;
	
	public SavingsDeposit() {
		accountNumber = String.format("300-%03d",++freesavingsCount);
		createDate = Calendar.getInstance();
	}
	
//	@Override
//	public String toString() {
//		return "계좌번호 :" +"300-00"+accountNumber + "   고객명 :" + name+ "   신탁일 :" + createDate + "   신탁금액 : "+ price+"원" 
//				+"   이자율 :" + interestRate + "   이자액 :" + interest + "   기간 : " + period +"년"+ "   만기시 환급금 :" +totalAmount+"원";
//	}

	@Override
	protected void calc() {
		int d = createDate.get(Calendar.MONTH);
		int temp = d;
		int month = 0;
		int periodM = period * 12;
		if ( d != temp ) {
			month++;
		}
		
		interest = (int)((price * (interestRate/100)) * (periodM - month ) / periodM);
		totalAmount = price + interest;
	}

	@Override
	public void bankBookPrint() {
		String s = "";
		s = "계좌번호 : " +accountNumber + "   고객명 : " + name+ "   신탁일 : " + createDate.getTime() + "   신탁금액 : "+ String.format("%,d", price)+"원" 
				+"   이자율 : " + String.format("%,f", interestRate) + "   이자액 : " + String.format("%,d", interest) + "   기간 : " + period +"년"+ "   만기시 환급금 : " +String.format("%,d", totalAmount)+"원";
		System.out.println(s);
		
	}

}
```  
