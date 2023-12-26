package level3_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제01 {
	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 매출액 : 24000원
		 * 
		 * 걸린시간 : 6분52초64
		 */	
		
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[7];
		int money = 0;
		while (true) {
			System.out.println("1. 영화예매 2. 종료");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			if (num < 0 || num > 2) {
				System.out.println("1 또는 2를 입력하세요");
				continue;
			}
			if (num == 2) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			System.out.print("좌석 번호 : ");
			int input = sc.nextInt();
			if (input < 0 || input > 6) {
				System.out.println("0~6의 숫자만 입력하세요");
				continue;
			}
			if (seat[input] == 1) {
				System.out.println("이미 예매가 완료된 자리입니다.");
			} else if (seat[input] == 0) {
				seat[input] = 1;
				money += 12000;
				System.out.println(Arrays.toString(seat));
			}						
		}
		System.out.println("총 매출액 : " + money + "원");
		sc.close();
	}
}
