package 반복문2문제;

import java.util.Scanner;

public class _문제07ATM3단계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 입금할 금액을 입력받아 myMoney에 입금
		 	2. 출금할 금액을 입력받아 myMoney에서 출금
		 	3. 잔액을 초과할 경우 출금 불가 출력
		 	4. 이체
		 		yourAcc 계좌번호를 입력받아 이체
		 		잔액을 초과할 경우 이체 불가 출력
		 		이체 후 yourAcc 잔액 증가
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		int yourAcc = 2222;
		int yourMoney = 70000;
		int cnt = 0;
		boolean run =true;
		boolean error = false;
		boolean err = false;
		
		while (run) {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 이체");
			System.out.println("4. 조회");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {			
				System.out.println("입금을 진행합니다.");
				cnt = 1;
			} else if (sel == 2) {				
				System.out.println("출금을 진행합니다.");
				cnt = 1;
			} else if (sel == 3) {
				System.out.println("이체를 진행합니다.");
				cnt = 2;
			} else if (sel == 4) {
				System.out.println("나의 계좌 잔액 : " + myMoney);
				System.out.println("상대 계좌 잔액 : " + yourMoney);
				continue;
			} else if (sel == 0) {
				System.out.println("시스템을 종료합니다.");
				run = false;
				continue;
			}
			if (cnt == 1) {
				System.out.print("계좌번호 : ");
				int acc = sc.nextInt();
				if (acc != myAcc) {
					error = true; 					
				}
			}			
			if (error) {
				System.out.println("계좌번호가 틀렸습니다.");
				error = false;
			} else if (!error && cnt != 2){
				System.out.print("금액을 입력하세요 : ");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("0보다 큰 숫자를 입력하세요.");
					continue;
				} else if (sel == 2 && money > myMoney) {
					System.out.println("잔액 초과");
					continue;
				}
				if (sel == 1) {
					myMoney += money;
					System.out.println("잔액 : " + myMoney);
					continue;
				} else if (sel == 2) {
					myMoney -= money;
					System.out.println("잔액 : " + myMoney);
					continue;
				}
			}
			if (cnt == 2) {
				System.out.print("나의 계좌번호 : ");
				int acc1 = sc.nextInt();
				System.out.print("상대 계좌번호 : ");
				int acc2 = sc.nextInt();
				if (acc1 != myAcc || acc2 != yourAcc) {
					err = true;
				}
			}
			if (err) {
				System.out.println("계좌번호가 일치하지 않습니다.");
				err = false;
			} else if (!err && cnt == 2){
				System.out.print("금액을 입력하세요 : ");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("0보다 큰 숫자를 입력하세요.");
					continue;
				} else if (money >= 1000000) {
					System.out.println("한도 초과");
					continue;
				} else if (money > myMoney) {
					System.out.println("잔액 초과");
					continue;
				}
				if (sel == 3) {
					myMoney -= money;
					yourMoney += money;
					System.out.println("나의 계좌 : " + myMoney);
					System.out.println("상대 계좌 : " + yourMoney);
				}
			}			
		}
		sc.close();
	}
}

