package level1_Test;

import java.util.Scanner;

public class _문제복기04 {
	public static void main(String[] args) {
		/*
		   [ 문제 4 ]
		   # 영수증 출력[1단계]
		   1. 메뉴판을 출력한다.
		   2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		   3. 현금을 입력받는다.
		   4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		   5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		   
		   10분19초26
		 */
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		
		if (menu < 1 || menu >3) {
			System.out.println("1~3 사이의 숫자를 입력하세요.");
		}else {		
			System.out.print("현금 : ");
			int cash = sc.nextInt();
			if (cash < 0) {
				System.out.println("0보다 큰 수를 입력하세요.");
			}
			
			int price;
			if (menu == 1) {
				price = price1;
				System.out.println("1번 메뉴 선택");
			} else if (menu == 2) {
				price = price2;
				System.out.println("2번 메뉴 선택");
			} else {
				price = price3;
				System.out.println("3번 메뉴 선택");
				}				
			if (cash < price) {
				System.out.println("현금이 부족합니다.");
			} else if (cash == price) {
				System.out.printf("영수증\n낸 금액 : %d", cash);
			} else {
				System.out.printf("영수증\n낸 금액 : %d, 거스름돈 %d\n", cash, cash - price);
			}
		}
		sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		if (pass && menu == 1) {
//			System.out.print("현금 : ");
//			int cash = sc.nextInt();
//			if (cash > price1) {
//				System.out.printf("영수증\n낸 금액 : %d, 거스름돈 %d\n", cash, cash - price1);
//			} else if (cash < price1) {
//				System.out.println("현금이 부족합니다.");
//			} else {
//				System.out.printf("영수증\n낸 금액 : %d", cash);
//			}
//		} else if (pass && menu == 2) {
//			System.out.print("현금 : ");
//			int cash = sc.nextInt();
//			if (cash > price2) {
//				System.out.printf("영수증\n낸 금액 : %d, 거스름돈 %d\n", cash, cash - price2);
//			} else if (cash < price2) {
//				System.out.println("현금이 부족합니다.");
//			} else {
//				System.out.printf("영수증\n낸 금액 : %d", cash);
//			}
//		} else if (pass && menu == 3) {
//			System.out.print("현금 : ");
//			int cash = sc.nextInt();
//			if (cash > price3) {
//				System.out.printf("영수증\n낸 금액 : %d, 거스름돈 %d\n", cash, cash - price3);
//			} else if (cash < price3) {
//				System.out.println("현금이 부족합니다.");
//			} else {
//				System.out.printf("영수증\n낸 금액 : %d", cash);
//			}
//		}
			}

