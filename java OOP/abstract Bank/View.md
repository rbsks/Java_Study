``` java  
package com.bit.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

	private void inputMember(int i) {
		if (i == 1) {
			FreeSavingsDeposit free = new FreeSavingsDeposit();
			System.out.println("자유저축 신규개설");
			System.out.print("고객명 : ");
			free.name = sc.nextLine();
			System.out.print("금액 : ");
			free.price = sc.nextInt();
			sc.nextLine();
			System.out.print("기간(년) : ");
			free.period = sc.nextInt();
			sc.nextLine();
			System.out.print("이자율(%) : ");
			free.interestRate = sc.nextDouble();
			sc.nextLine();
			free.calc();
			banks.add(free);
			free.bankBookPrint();
		} else if (i == 2) {
			Loans loan = new Loans();
			System.out.println("대출 신규개설");
			System.out.print("고객명 : ");
			loan.name = sc.nextLine();
			System.out.print("금액 : ");
			loan.price = sc.nextInt();
			sc.nextLine();
			System.out.print("기간(년) : ");
			loan.period = sc.nextInt();
			sc.nextLine();
			System.out.print("이자율(%) : ");
			loan.interestRate = sc.nextDouble();
			sc.nextLine();
			loan.calc();
			banks.add(loan);
			loan.bankBookPrint();

		} else if (i == 3) {
			SavingsDeposit save = new SavingsDeposit();
			System.out.println("신탁 신규개설");
			System.out.print("고객명 : ");
			save.name = sc.nextLine();
			System.out.print("금액 : ");
			save.price = sc.nextInt();
			sc.nextLine();
			System.out.print("기간(년) : ");
			save.period = sc.nextInt();
			sc.nextLine();
			System.out.print("이자율(%): ");
			save.interestRate = sc.nextDouble();
			sc.nextLine();
			save.calc();
			banks.add(save);
			save.bankBookPrint();

		}

	}

	private ArrayList<BankAccount> banks;
	private Scanner sc;

	public View() {
		banks = new ArrayList<BankAccount>();
		sc = new Scanner(System.in);

	}

	public void start() {

		while (true) {
			System.out.println("신규 통장개설을 환영합니다.");
			System.out.println("1. 자유저축");
			System.out.println("2. 대출");
			System.out.println("3. 저축(신탁)");
			System.out.println("0. 종료");
			System.out.print("고르시오. ");
			int i = sc.nextInt();
			sc.nextLine();
			if (i == 1) {
				inputMember(i);

			} else if (i == 2) {
				inputMember(i);

			} else if (i == 3) {
				inputMember(i);

			} else if (i == 0) {
				for (int q = 0; q < banks.size(); q++) {
					banks.get(q).bankBookPrint();
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		} // end while
		sc.close();
	}

}
```  
