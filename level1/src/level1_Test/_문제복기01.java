package level1_Test;

import java.util.Scanner;

public class _문제복기01 {
	public static void main(String[] args) {
		/*
		[문제 1]
			숫자 2개를 입력받는다.
			첫번째 저장한 값고 두번째 저장한 값을 서로 교체해서 다시 저장하시오.
			
			2분21초49
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		int c;
		
		c = a;
		a = b;
		b = c;
		System.out.println("교체된 a의 숫자 : " + a);
		System.out.println("교체된 b의 숫자 : " + b);
		sc.close();
	}
}
