```java  
package com.bit.Ex;

public class FreeSaving extends Human {
	private String blance;

	
	public String getBlance() {
		return blance;
	}

	public void setBlance(String blance) {
		this.blance = blance;
	}

	@Override
	public String toString() {
		return "계좌번호 :" +"100-00"+getBankingNumber() + "   고객명 :" + getName()+ "   대출일 :" + getTime() + 
				"   대출금액 : "+ getMoney()+"원"+"   잔액 : " + blance+"원";
	}


	
}
```
