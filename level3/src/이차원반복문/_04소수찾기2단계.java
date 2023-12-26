package 이차원반복문;

import java.util.Scanner;

public class _04소수찾기2단계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	소수찾기
		 	정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i == 2 ? i : ", " + i);
			}
			cnt = 0;
		}
		sc.close();
	}
}
