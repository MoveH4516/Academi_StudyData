package 기초3개념;

import java.util.Scanner;

public class _07나이입력 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력 하세요.");
		int age = scan.nextInt();
		System.out.println(age + "살이 맞으십니까?");
		
		scan.close();
	}
}
