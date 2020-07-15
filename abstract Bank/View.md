``` java  
package com.bit.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	
	private ArrayList<BankAccount> banks;
	private Scanner sc;
	public View() {
		banks = new ArrayList<BankAccount>();
		sc = new Scanner(System.in);
		
	}
	
	public void start() {
		
		

		while(true) {
			System.out.println("신규 통장개설을 환영합니다.");
			System.out.println("1. 자유저축");
			System.out.println("2. 대출");
			System.out.println("3. 저축(신탁)");
			System.out.println("0. 종료");
			System.out.print("고르시오. ");
			int i = sc.nextInt();
			sc.nextLine();
			if( i == 1 ) {
				FreeSavingsDeposit free = new FreeSavingsDeposit();
				
			}
			else if( i == 2 ) {
				Loans loan = new Loans();
				
			}
			else if( i == 3 ) {
				SavingsDeposit saving = new SavingsDeposit();
				
			}
			else if( i == 0 ) {
				for(int q = 0; q < banks.size(); q++) {
					banks.get(q).bankBookPrint();
				}
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		} // end while
		sc.close();
	}

}
```  
