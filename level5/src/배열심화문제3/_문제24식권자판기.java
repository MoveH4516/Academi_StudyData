package 배열심화문제3;

import java.util.Scanner;

public class _문제24식권자판기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	식권 자판기 프로그램
		 	1) 관리자 2) 사용자
		 	관리자 - 식권충전 잔돈충전 뒤로가기
		 	사용자 - 구입 -> 입금 -> 구매 매수 -> 잔돈
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] money = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {1, 1, 1, 1, 5, 10};
		
		int tickets = 5;
		int price = 3200;
		
		while (true) {
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 0) {
				System.out.println("종료");
				break;
			}
			if (sel < 0 || sel > 2) {
				System.out.println("정확한 메뉴 번호 선택");
				continue;
			}
			if (sel == 1) {
				while (true) {
					System.out.println("===관리자 모드===");
					System.out.println("1) 식권충전");
					System.out.println("2) 잔돈충전");
					System.out.println("3) 뒤로가기");
					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.printf("==식권충전(%d개)==\n", tickets);
						System.out.print("충전할 식권 개수 : ");
						int num = sc.nextInt();
						if (num < 1) {
							System.out.println("1이상의 숫자 입력");
							continue;
						}
						tickets += num;
						System.out.printf("식권 개수 : %d개\n",tickets);
					} else if (choice == 2) {
						System.out.println("===잔돈 충전===");
						System.out.print("충전할 금액 번호 : ");
						System.out.println("1) 50000 2) 10000 3) 5000 4) 1000 5) 500 6) 100");
						int num = sc.nextInt() - 1;
						if (num < 0 || num >= money.length) {
							System.out.println("번호 오류");
							continue;
						}
						System.out.print("충전할 잔돈 개수 : ");
						int num1 = sc.nextInt();
						if (num1 < 1) {
							System.out.println("1이상의 숫자 입력");
							continue;
						}
						charges[num] += num1;
						for (int i = 0; i < money.length; i++) {
							System.out.printf("%d원 개수 : %d개\n", money[i], charges[i]);
						}
					} else {
						break;
					}
				}
			} else if (sel == 2) {
				while (true) {
					System.out.println("1) 구입");
					System.out.println("2) 뒤로가기");
					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("식권 가격 : " + price + "원");
						System.out.print("구매할 식권 개수 : ");
						int num = sc.nextInt();
						if (num < 1) {
							System.out.println("1이상의 숫자 입력");
							continue;
						}
						if (num > tickets) {
							System.out.println("식권 수량 부족");
							continue;
						}
						System.out.println("총 지불 금액 : " + price * num + "원");
						System.out.print("현금 : ");
						int cash = sc.nextInt();
						if (cash < 1) {
							System.out.println("0보다 큰 수를 입력하세요");
							continue;
						}
						int rest = cash - price * num;
						int print = rest;
						if (rest < 0) {
							System.out.println("현금 부족");
							continue;
						}
						int k = 0;
						while (true) {
							if (rest >= money[k]) {
								for (int i = 0; i < charges[k]; i++) {
									rest -= money[k];
									charges[k]--;
									if (rest < money[k]) {
										k++;
										break;
									}
								}
							} else {
								k++;
							}
							if (rest < money[money.length - 1]) {
								break;
							}
						}
						if (rest == 0) {
							System.out.println("결제 완료");
							System.out.printf("거스름돈 : %d\n", print);
						} else {
							System.out.println("현금 수량 부족 관리자 문의");
						}						
					} else {
						break;
					}
				}
			}
		}
		sc.close();
	}
}
