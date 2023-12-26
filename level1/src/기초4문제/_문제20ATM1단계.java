package 기초4문제;

import java.util.Scanner;

public class _문제20ATM1단계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 이체할 계좌번호를 입력한다.
		 	2. 계좌번호가 일치하면
		 	3. 이체할 금액을 입력받는다.
		 	4. 이체할 금액 <= my money : 이체가능
		 			my money - 이체할 금액
		 			your money + 이체할 금액
		 		이체할 금액 > my money : 이체불가
		 */
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = : " + myMoney + "원");
		System.out.println("yourMoney = : " + yourMoney + "원");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 계좌번호 입력 : ");
		int acc1 = sc.nextInt();
		System.out.print("상대 계좌번호 입력 : ");
		int acc = sc.nextInt();
		boolean accPass1 = acc < 1000 || acc > 9999;
		boolean accPass2 = acc1 < 1000 || acc1 > 9999;
		
		if (acc == yourAcc && acc1 == myAcc) {
			System.out.print("이체할 금액 : ");
			int money = sc.nextInt();
			if (money <= myMoney && money > 0) {
				System.out.println("이체완료");
				myMoney = myMoney - money;
				yourMoney = yourMoney + money;
				System.out.printf("my money - %d원\nyour money + %d원\n",money,money);
				System.out.println("myMoney = : " + myMoney + "원");
				System.out.println("yourMoney = : " + yourMoney + "원");
			}else if (money < 0) {
				System.out.println("0보다 큰 수를 입력해 주세요.");
			}else {
				System.out.println("my money : 이체불가");
			}
		}
		else if (!accPass2 && !accPass1 && acc1 != myAcc) {
			System.out.println("나의 계좌번호가 일치하지 않습니다.");
		}
		else if (!accPass2 && !accPass1 && acc != yourAcc) {
			System.out.println("상대 계좌번호가 일치하지 않습니다.");
		}		
		else if (accPass1 || accPass2) {
			System.out.println("계좌번호는 4자리 수 입니다.");
		}
		
		sc.close();
	}
}
