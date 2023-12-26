package 반복문2문제;

import java.util.Scanner;

public class _문제12영수증2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 5번 주문을 받는다.
		 	2. 주문이 끝난 후, 돈을 입력받는다.
		 	3. 각 메뉴별 주문 수량과 총 금액을 출력한다.
		 */
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
				
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int price = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int total = 0;
		while (i <= 5) {
			if (i == 1) {
				System.out.println("=== 롯데리아 ===");
				System.out.println("1. 새우버거 : " + price1 + "원");
				System.out.println("2. 치즈버거 : " + price2 + "원");
				System.out.println("3. 콜   라 : " + price3 + "원");
				System.out.println("4. 종   료 ");
			}
			System.out.print("메뉴를 입력하세요. : ");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 4) {
				System.out.println("1~4 숫자를 입력하세요.");
				i = 1;
				continue;
			}
			if (sel == 1) {
				price += price1;
				cnt1++;
			} else if (sel == 2) {
				price += price2;
				cnt2++;
			} else if (sel == 3) {
				price += price3;
				cnt3++;
			} else if (sel == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			if (i == 5) {
				System.out.print("현금을 입력하세요. : ");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("0보다 큰 수를 입력하세요.");
					i = 0;
				}
				total = money;
			}
			if (i == 5 && price > total) {
				i = 0;
				price = 0;
				cnt1 = 0;
				cnt2 = 0;
				cnt3 = 0;
				System.out.println("현금이 부족합니다.");
			}
			if (i == 5 && price < total) {
				System.out.println("===롯데리아 영수증===");
				System.out.println("1. 새우 버거 : " + cnt1 + "개");
				System.out.println("2. 치즈 버거 : " + cnt2 + "개");
				System.out.println("3. 콜    라 : " + cnt3 + "개");
				System.out.println("총 금액 : " + total + "원");
				System.out.println("잔돈 : " + (total - price) + "원");
			} else if (i == 5 && price == total) {
				System.out.println("===롯데리아 영수증===");
				System.out.println("1. 새우 버거 : " + cnt1 + "개");
				System.out.println("2. 치즈 버거 : " + cnt2 + "개");
				System.out.println("3. 콜    라 : " + cnt3 + "개");
				System.out.println("총 금액 : " + total + "원");
			}
			i++;
		}
		sc.close();
	}
}
