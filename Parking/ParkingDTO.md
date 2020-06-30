``` java  
package com.bit.parking;


public class ParkingDTO {
	private String carNo;
	private long inTime;
	private long outTime;
	private long price;
	
	public String getCarNo() {
		return carNo;
	}
	
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	
	public long getInTime() {
		return inTime;
	}
	
	public void setInTime(long inTime) {
		this.inTime = inTime;
	}
	
	public long getOutTime() {
		return outTime;
	}
	
	public void setOutTime(long outTime) {
		this.outTime = outTime;
	}

	
}
```  
