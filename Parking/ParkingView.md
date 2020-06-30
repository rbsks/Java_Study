``` java  
package com.bit.parking;
import java.util.Scanner;

public class ParkingView {
	
	private ParkingController controller;
	private Scanner scanner;
	
	public ParkingView(int length) {
		controller = new ParkingController(20);
		scanner = new Scanner(System.in);
	}
	
	public void showMenu() {
		
		ParkingController service = new ParkingController(20); // 최대 주차 10대
		//System.out.println(service); // println은 객체명을 전달받으면 안에서 .toString이 자동으로 붙어서 출력
		while(true) {
			// 주차장의 현황판
			System.out.println(service+ "\ncmd > ");
			String cmd = scanner.nextLine();
			
			if(cmd.equals("exit")) {
				break;
			}
			if(cmd.equals("in")) {
				System.out.println("차 들어온다. > ");
				if(service.isEmpty() == -1) {
					System.out.println("Full, Sorry");
				}else {
					String carNo = scanner.nextLine();
					long inTime = System.currentTimeMillis();
					long price = 10000;
					service.insert(carNo, inTime, price);
					}
			}
			if(cmd.equals("out")) {
				System.out.println("차 나간다. > ");
				String carNo = scanner.nextLine();
				ParkingDTO car = service.getCarByNo(carNo);
				if(car == null) {
					System.out.println("차량 정보 없음.");
				}else {
					long out = System.currentTimeMillis();
					car.setOutTime(out);
					long inTime = car.getInTime();
					long outTime = car.getOutTime();
					long price = service.calculatePrice(inTime, outTime);
					System.out.println(price);
					service.removeCar(car); // 참조를 비교하는 method 
				}
		
			}
			
		} // end while
		
		System.out.println("terminated");
		
		scanner.close();
	}
}
```  
