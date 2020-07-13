```java  
package com.bit.Ex;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class view {
	
	Scanner sc;
	private ArrayList<Human> bank;
	private int free;
	private int lon;
	private int savi;
	private DecimalFormat formatter;
	
	public view() { // 생성자 호출시 한번만 실행돼어야 하는 것은 생성자에 넣는다
		sc = new Scanner(System.in);
		bank = new ArrayList<Human>();
		formatter = new DecimalFormat("###,###");
	}
	public void showView() {
		
		while(true) {
			System.out.println("신규 통장개설을 환영합니다.");
			System.out.println("1. 자유저축");
			System.out.println("2. 대출");
			System.out.println("3. 저축(신탁)");
			System.out.println("0. 종료");
			System.out.print("고르시오. ");
			int i = sc.nextInt();
			sc.nextLine();
			if(i==1) {
				FreeSaving fsaving = new FreeSaving();
				System.out.println("자유저축 신규개설");
				System.out.print("고객명 : ");
				String name = sc.nextLine();
				System.out.print("금액 : ");
				double insert = sc.nextDouble();
				sc.nextLine();
				System.out.println("개설완료.");
				
				fsaving.setBankingNumber(free+1);
				fsaving.setName(name);
				fsaving.setTime(LocalDateTime.now());
				fsaving.setMoney(formatter.format(insert));
				fsaving.setBlance(formatter.format(insert));
				bank.add(fsaving);
				System.out.println(fsaving);
				free++;
				System.out.print("계속하시겠습니까?");
				String s = sc.nextLine();
				
				if(s.equals("y")) {
					continue;
				}
				if(s.equals("n")){
					for(int q = 0; q < bank.size(); q++) {
						System.out.println(bank.get(q).toString());
					}
					break;
				}else {
					System.out.println("다시입력해주세요.");
				}
				
		
			}
			if(i==2) {
				Lone lone = new Lone();
				System.out.println("대출 신규개설");
				System.out.print("고객명 : ");
				String name = sc.nextLine();
				System.out.print("금액 : ");
				double insert = sc.nextDouble();
				sc.nextLine();
				System.out.println("기간(년): ");
				double period = sc.nextDouble();
				sc.nextLine();
				System.out.println("개설완료.");
		
				lone.setBankingNumber(lon+1);
				lone.setName(name);
				lone.setTime(LocalDateTime.now());
				lone.setMoney(formatter.format(insert));
				lone.setRate(3);
				lone.setRateMoney(formatter.format(insert*(3.0/100)));
				lone.setPeriod(period);
				lone.setMonthMoney("1");
				bank.add(lone);
				System.out.println(lone);
				lon++;
				System.out.print("계속하시겠습니까?");
				String s = sc.nextLine();
				
				if(s.equals("y")) {
					continue;
				}
				if(s.equals("n")){
					for(int q = 0; q < bank.size(); q++) {
						System.out.println(bank.get(q).toString());
					}
					break;
				}else {
					System.out.println("다시입력해주세요.");
				}
				
				
			}
			if(i==3) {
				Saving sav = new Saving();
				System.out.println("저축(신탁) 신규개설");
				System.out.print("고객명 : ");
				String name = sc.nextLine();
				System.out.print("금액 : ");
				double insert = sc.nextDouble();
				sc.nextLine();
				System.out.println("기간(년): ");
				double period = sc.nextDouble();
				sc.nextLine();
				System.out.println("개설완료.");

				sav.setBankingNumber(savi+1);
				sav.setName(name);
				sav.setMoney(formatter.format(insert));
				sav.setTime(LocalDateTime.now());
				sav.setRate(2.5);
				sav.setRateMoney(formatter.format(insert*(2.5/100)));
				sav.setPeriod(period);
				sav.setMonthMoney("1");
				bank.add(sav);
				System.out.println(sav);
				savi++;
				System.out.print("계속하시겠습니까?");
				String s = sc.nextLine();
				
				if(s.equals("y")) {
					continue;
				}
				if(s.equals("n")){
					for(int q = 0; q < bank.size(); q++) {
						System.out.println(bank.get(q).toString());
					}
					break;
				}else {
					System.out.println("다시입력해주세요.");
				}
				
			}
			if(i==0) {

				for(int q = 0; q < bank.size(); q++) {
					System.out.println(bank.get(q).toString());
				}
				break;
			}
			
			
		} // end while
		sc.close();
	}
	
}
```
