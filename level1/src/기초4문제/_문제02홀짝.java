package 기초4문제;

import java.util.Scanner;

public class _문제02홀짝 {
	public static void main(String[] args) {
		
		// 사용자에게 정수를 하나 입력 받아서
		// 홀수면 홀수, 짝수면 짝수를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("짝수");
		}
		
		if (a % 2 != 0) {
			System.out.println("홀수");
		}
		
		sc.close();
		
	}
}
