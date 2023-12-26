package 예외처리;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 >> ");
		try {
			int age = sc.nextInt();
			System.out.println("나이 : " + age);
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
		}
		sc.close();
	}
}
