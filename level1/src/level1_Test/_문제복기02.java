package level1_Test;

import java.util.Scanner;

public class _문제복기02 {
	public static void main(String[] args) {
		/*
		[문제 2]
			1. 숫자 3개를 입력받는다.
			2. 입력받은 3개의 숫자를 비교한다.
			3. 가낭 큰 수(max)를 출력한다.
			
			5분34초61
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		System.out.print("세 번째 숫자 : ");
		int c = sc.nextInt();
				
		boolean req = a == b && b == c;
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		
		if (req) {
			System.out.println("세 숫자 모두 동일합니다.");
		} else {
			System.out.println("가장 큰 숫자 : " + max);
		}
		
		
		if (req) {
			System.out.println("세 숫자 모두 동일합니다.");
		} else if (a >= b && a >= c) {
			System.out.println("가장 큰 숫자 : " + a);
		} else if (b >= a && b >= c) {
			System.out.println("가장 큰 숫자 : " + b);
		} else if ( c >= a && c >= b) {
			System.out.println("가장 큰 숫자 : " + c);
		}
		sc.close();
	}
}
