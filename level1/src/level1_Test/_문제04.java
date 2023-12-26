package level1_Test;

import java.util.Scanner;

public class _문제04 {
	public static void main(String[] args) {
		/*
		[문제 4]
			숫자 2개를 입력받는다.
			두 숫자의 곱을 구하시오.
			
			1분53초93
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		
		int c = a * b;
		
		System.out.println(c);
		sc.close();
	}
}
