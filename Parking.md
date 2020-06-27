``` java  
package com.bit.parking;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date; // Date Class는 날짜와 시간에 관한 정보를 표현.

// 각각의 if문 안에 code들 method로 만들기.
// 같은 주차번호가 입력되어있을 때 count안하기.
// 요금정산시 차량 번호가 배열안에 없을 때 다시 입력하라는 문구 띄우기.


public class ParkingMain {
	
	public static void main(String[] args) {
	
		String[] parkingSpot = new String[20];
		long[] parkingreqTime = new long[20];
		long[] parkingresTime = new long[20];
		Scanner sc = new Scanner(System.in);
		int parkingCount = 0;
		String carNumber;
		// SimpleDateFormat Class는 내가 원하는 포맷으로 시간을 출력할 수 있다. 사용하려면 import java.text.SimpleDateFormat; 필요
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss.SS"); // 년-월-일 -오전/오후-시간(0~12)-분-초-미리초
	
		while(true) {
			System.out.println("주차 자리수 : " + (20 - parkingCount));
			System.out.println("주차 요금 1분당 16원 ");
			System.out.println();
			System.out.println("1 : 주차  2 : 요금정산 3: 차량 리스트 4 : 종료");
			
			int select = sc.nextInt();
			String temp = new String();
			
			if(select == 1) {
				sc.nextLine();
				if(parkingCount < parkingSpot.length) {
					System.out.print("차량 번호를 입력해주세요. : ");
					carNumber = sc.nextLine();
					System.out.println();
					parkingSpot[parkingCount] = carNumber;
					long reqTime = System.currentTimeMillis();
					String reqTimestr = dayTime.format(new Date(reqTime));
					parkingreqTime[parkingCount] = reqTime;
					parkingCount++;
				}
			}else if(select == 2) {
				sc.nextLine();
				System.out.print("차량 번호를 입력해주세요. :");
				carNumber = sc.nextLine();
				temp = carNumber;
				
				for(int i = 0; i < parkingSpot.length; i++ ) {
					if(carNumber.equals(parkingSpot[i])) {
						long resTime = System.currentTimeMillis();
						String resTimestr = dayTime.format(new Date(resTime));
						parkingresTime[i] = resTime;
						long carIn = parkingreqTime[i];
						long carOut = parkingresTime[i];
						System.out.println(parkingSpot[i]+"의 "+"주차 시간 : " +  (carOut - carIn)/60000 +"분");
						long price = (carOut - carIn)/60000*16;
						System.out.println("주차 가격 : "+price);
						System.out.println();
						parkingSpot[i] = "";
						parkingCount--;
						break;
					}
				}
			}else if(select == 3) {
				System.out.println("차량 리스트");
				for(int i = 0; i < parkingCount; i++) {
					System.out.println(parkingSpot[i]);
				}
				System.out.println();
				
			}else if(select == 4) {
				System.out.println("주차 프로그램을 종료합니다.");
				break;
			}else if((parkingCount+1) == parkingSpot.length){
				System.out.println("주차 자리가 꽉 찼습니다.");
			}
			
		} // end while
		
	} // end main
	
} // end class
```
