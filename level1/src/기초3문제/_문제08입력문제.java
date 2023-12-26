package 기초3문제;

import java.util.Scanner;

public class _문제08입력문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a + b;
		System.out.println("두 숫자의 합은 " + sum + " 이다.");
		
		int c = scan.nextInt();
		boolean r1 = c % 2 != 0;
		System.out.println(r1);
		
		int d = scan.nextInt();
		boolean r2 = d % 3 == 0 || 45 % d == 0;
		System.out.println(r2);
		
		scan.close();
	}
}
