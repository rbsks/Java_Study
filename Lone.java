package com.bit.Ex;

public class Lone extends Human{
	private double rate;
	private String rateMoney;
	private double period;
	private String monthMoney;
	
	
	
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getRateMoney() {
		return rateMoney;
	}
	public void setRateMoney(String rateMoney) {
		this.rateMoney = rateMoney;
	}
	public double getPeriod() {
		return period;
	}
	public void setPeriod(double period) {
		this.period = period;
	}
	public String getMonthMoney() {
		return monthMoney;
	}
	public void setMonthMoney(String monthMoney) {
		this.monthMoney = monthMoney;
	}

	@Override
	public String toString() {
		return "계좌번호 :" +"200-00"+getBankingNumber() + "   고객명 :" + getName()+ "   대출일 :" + getTime() + "   대출금액 : "+ getMoney()+"원" 
				+"   이자율 :" + rate + "   이자액 :" + rateMoney + "   기간 : " + period +"년"+ "   월상환액 :" + monthMoney;
	}

	
	
	
}
