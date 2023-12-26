package 반복문응용문제;

import java.util.Scanner;

public class _05다음소수찾기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	숫자 한 개를 입력받아 입력받은 숫자보다 큰 첫 번째 소수를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		int cnt = 0;
		for (int i = input + 1; i > input; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println(i);
				break;
			}
			cnt = 0;
		}
		sc.close();
	}
}
