package com.bit.Ex;


public class Saving extends Human {
	private double rate;
	private String rateMoney;
	private String monthMoney;
	private double period;
	
	
	public double getPeriod() {
		return period;
	}
	public void setPeriod(double period) {
		this.period = period;
	}
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
	public String getMonthMoney() {
		return monthMoney;
	}
	public void setMonthMoney(String monthMoney) {
		this.monthMoney = monthMoney;
	}

	@Override
	public String toString() {
		return "계좌번호 :" +"300-00"+getBankingNumber() + "   고객명 :" + getName()+ "   신탁일 :" + getTime() + "   신탁금액 : "+ getMoney()+"원" 
				+"   이자율 :" + rate + "   이자액 :" + rateMoney +"   기간 : " + period +"년"+ "   만기시 환급금 :" + monthMoney;
	}
	
	
}
