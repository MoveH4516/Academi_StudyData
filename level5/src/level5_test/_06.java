package level5_test;

import java.util.Arrays;
import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		// 식권 자판기 프로그램 		
		// 1) 관리자   2) 사용자 
		//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
		//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
	    //	       2)뒤로가기
		// 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
		//화면 
		// 식권 가격 : 3200원 
		// 식권 	  : ??매  (매진시 매진) 
		// 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
		// 1000원 : ?? 매		//  500원 : ?? 개	 
		Scanner sc = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격

		while(true) {
			System.out.println("[0]종료");
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 0) {
				System.out.println("종료");
				break;
			}
			if (sel < 0 || sel > 2) {
				continue;
			}
			if(sel == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.print("충전할 식권 개수 : ");
						int tick = sc.nextInt();
						if (tick < 1) {
							System.out.println("1이상 숫자 입력");
						}
						tickets += tick;
						System.out.println("식권 : " + tickets + "개");
					} else if (choice == 2) {
						for (int i = 0; i < money.length; i++) {
							System.out.printf("[%d] %d원 %d개\n", i + 1,money[i], charges[i]);
						}
						System.out.print("잔돈 충전할 금액 번호 : ");
						int num = sc.nextInt();
						if (num < 1 || num > money.length) {
							System.out.println("번호 오류");
							continue;
						}
						System.out.print("충전할 잔돈 개수 : ");
						int cnt = sc.nextInt();
						charges[num - 1] += cnt;
					} else if (choice == 3) {
						break;
					}
				}
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.print("구매할 식권 개수 : ");
						int cnt = sc.nextInt();
						if (cnt < 1) {
							System.out.println("1 이상의 숫자 입력");
							continue;
						}
						if (cnt > tickets) {
							System.out.println("재고 부족");
							continue;
						}
						int cash = price * cnt;
						System.out.print("현금입력 : ");
						int won = sc.nextInt();
						if (won < 0) {
							System.out.println("0보다 큰 숫자 입력");
							continue;
						}
						if (won < cash) {
							System.out.println("잔액 부족");
							continue;
						}
						int give = won;
						for (int i = 0; i < money.length; i++) {
							if (give >= money[i]) {
								charges[i] += give / money[i];
								give %= money[i];
							}
						}
						int rest = won - cash;
						int[] copy = charges;
						charges = new int[money.length];
						for (int i = 0; i < charges.length; i++) {
							charges[i] = copy[i];
						}
						for (int i = 0; i < money.length;) {
							if (copy[i] == 0) {
								i++;
								continue;
							}
							if (rest >= money[i]) {
								rest -= money[i];
								copy[i]--;
							} else if (rest < money[i]) {
								i++;
							}
							if (i == money.length) {
								break;
							}
						}
						if (rest != 0) {
							System.out.println("잔돈 재고 부족 업체 문의");
							continue;
						} else {
							for (int i = 0; i < charges.length; i++) {
								charges[i] = copy[i];
							}
							System.out.println(Arrays.toString(charges));
							System.out.println("결제완료");
							System.out.println("===영수증===");
							System.out.println("구매 수량 : " + cnt + "개");
							System.out.println("구매 금액 : " + cash + "원");
							System.out.println("현금 : " + won + "원");
							System.out.println("잔돈 : " + (won - cash) + "원");
						}
					} else if (choice == 2) {
						break;
					}
				}
			}
		}
		sc.close();
	}
}
