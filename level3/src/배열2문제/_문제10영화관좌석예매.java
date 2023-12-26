package 배열2문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제10영화관좌석예매 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 사용자로부터 좌석번호를 입력받아 예매하는 시스템
		 	2. 예매가 완료되면 해당 좌석 값을 1로 변경
		 	3. 이미 예매가 완료된 좌석은 재구매 불가
		 	4. 한 좌석당 예매 가격은 12000원
		 	5. 프로그램 종료 후, 해당 영화관의 총 매출액 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[7];
		int price = 0;
		boolean run = true;
		char[] a = {'□'};
		char[] b = {'■'};
		while (run) {
			System.out.println("=더조은 영화=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.println(Arrays.toString(seat));
				for (int j = 0; j < seat.length; j++) {
					if (seat[j] == 1) {
						System.out.print(Arrays.toString(b));
					} else {
						System.out.print(Arrays.toString(a));
					}
				}
				System.out.println();
				System.out.print("좌석 선택 : ");
				int num = sc.nextInt();
				if (num < 0 || num >= seat.length) {
					System.out.println("입력값 오류");
					continue;
				}
				if (seat[num] != 1) {
					seat[num] = 1;
					price += 12000;
				} else {
					System.out.println("이미 예매된 좌석입니다.");
				}
			} else if (sel == 2) {
				run = false;
				System.out.println("시스템 종료");
			} else {
				System.out.println("입력오류");
			}
		}
		System.out.println(Arrays.toString(seat));
		System.out.println("총 금액 : " + price + "원");
		sc.close();
	}
}
