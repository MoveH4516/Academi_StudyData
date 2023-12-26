package 기초4문제;

import java.util.Scanner;

public class _문제21ATM2단계 {
	public static void main(String[] args) {

		/*
		 * [문제] 1. 로그인을 성공할 때 1. 입금 2. 출금 3. 조회
		 */
		Scanner sc = new Scanner(System.in);
		int cash = 20000; // 지갑에 있는 돈
		int balance = 30000; // 통장에 있는 돈
		int account = 11111; // id
		int password = 1234; // pw
		System.out.println("===더조은 ATM===");
		System.out.println("1. 로그인 2. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("로그인을 진행 합니다.");

			System.out.print("ID : ");
			int id = sc.nextInt();
			System.out.print("PW : ");
			int pw = sc.nextInt();
			boolean rogin = id == account && pw == password;

			if (rogin) {
				System.out.println("1.입금 2.출금 3.조회");
				System.out.println("무엇을 진행 하시겠습니까? : ");
				int cho = sc.nextInt();
				if (cho == 1) {
					System.out.println("입금을 진행합니다.");
					System.out.print("입금할 금액 : ");
					int money = sc.nextInt();
					if (money <= 0) {
						System.out.println("0보다 큰 수를 입력하세요.");
					} else if (money > cash) {
						System.out.println(cash + "원 보다 많은 금액을 입력할 수 없습니다.");
					} else {
						cash -= money;
						balance += money;
						System.out.println("cash : " + cash + "원");
						System.out.println("balance : " + balance + "원");
					}
				} else if (cho == 2) {
					System.out.println("출금을 진행합니다.");
					System.out.print("출금할 금액 : ");
					int money1 = sc.nextInt();
					if (money1 <= 0) {
						System.out.println("0보다 큰 수를 입력하세요.");
					} else if (money1 > balance) {
						System.out.println(balance + "원 보다 많은 금액을 입력할 수 없습니다.");
					} else {
						cash += money1;
						balance -= money1;
						System.out.println("cash : " + cash + "원");
						System.out.println("balance : " + balance + "원");
					}
				} else if (cho == 3) {
					System.out.println("조회");
					System.out.println("cash : " + cash + "원");
					System.out.println("balance : " + balance + "원");
				} else {
					System.out.println("1, 2, 3 중에서 선택해 주세요.");
				}
			} else {
				System.out.println("로그인 실패");
			}
		} else if (choice == 2) {
			System.out.println("ATM을 종료합니다.");
		} else {
			System.out.println("1과 2중에서 선택해주세요.");
		}
		sc.close();
	}
}
