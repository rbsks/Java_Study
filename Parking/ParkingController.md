``` java  
package com.bit.parking;

public class ParkingController {
	private ParkingDTO[] space;
	
	public ParkingController(int length) {
		space = new ParkingDTO[length];
		
	}
	
	public String getState() {
		
		return this.toString();
	}
	public void insert(String carNo, long inTime, long price) {
		ParkingDTO car = new ParkingDTO();
		car.setCarNo(carNo);
		car.setInTime(inTime);
		
		
		int i = isEmpty();
		if(i >= 0) {
			space[i] = car;
		}
		
	}

	public int isEmpty() {
		for(int i = 0; i < space.length; i++) {
			if(space[i] == null) { // 배열 요소가 객체 이므로 있다 없다를 null이냐 아니냐로 봄
				return i;
			}
		}
		return -1;
	}
	@Override // java 애노테이션 검색해보기
	public String toString() {
		// space 배열 변환기 [][][][][]
		String s = "";
		int count = 0;
		for(ParkingDTO car: space) {
			count++;
			if(car != null) {
				s += "["+car.getCarNo()+"]";
			}else {
				s += "[      ]";
			}
			if(count == (space.length/2)) {
				s += "\n";
			}
		}
		return s;
		//return "CarParking [space=" + Arrays.toString(space) + "]";
	}

	public ParkingDTO getCarByNo(String carNo) {
		for(ParkingDTO car : space) {
			if(car != null) {
				if(car.getCarNo().equals(carNo)) {
					return car;
				}
			}
		}
		return null;
	}
	
	public long calculatePrice(long inTime, long outTime) {
		ParkingDTO park = new ParkingDTO();
	
		long total = 0;
		
		total = (((outTime-inTime)/60000)/1) * 5000+5000;
		
		
		return total;
	}
	
	public void removeCar(ParkingDTO car) {
		int del = -1;
		for(int i = 0; i < space.length; i++) {
			// 참조가 같은 요소를 찾기
			if(space[i] == car) {
				del = i;
				break;	
			}
		}
		// 반복문 내에서 del에 대입하지 않으면 -1이 저장
		if(del >= 0 ) {
			space[del] = null;
		}
	}


}
```  
