package 기초4문제;
	import java.util.Scanner;
/*
 	[문제]
 		1. 메뉴판을 출력한다.
 		2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 		3. 현금을 입력받는다.
 		4. 입력받은 현금과 메뉴가격을 확인해서 영수증을 출력한다.
 		5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */
public class _문제11영수증 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		
		// 1. 메뉴판을 출력한다.
		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 새우버거 : " + price1 + "원");
		System.out.println("2. 치즈버거 : " + price2 + "원");
		
		System.out.print("메뉴의 번호를 입력하세요. : ");
		int num = scan.nextInt();
		
		boolean check1 = num == 1;
		boolean check2 = num == 2;
		
		if (num == 1 || num == 2) {
			System.out.print("현금을 입력하세요. : ");
			int money = scan.nextInt();
			if (check1 && money >= price1) {
				System.out.printf("영수증 : 새우버거 %d원 거스름돈 %d원\n",price1,money-price1);
			}
			if (check2 && money >= price2) {
				System.out.printf("영수증 : 치즈버거 %d원\n 거스름돈 %d원\n",price2,money-price2);
			}
			if ((check1 && money < price1) || (check2 && money < price2) ) {
				System.out.println("현금이 부족합니다.");
			}
		}
		if (!check1 && !check2) {
			System.out.println("메뉴의 번호를 잘못 입력 하였습니다.");
		}
		scan.close();
	}
}
