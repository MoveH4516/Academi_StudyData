package 문자열기본;

import java.util.Scanner;

public class _01문자열입력 {
	public static void main(String[] args) {
		// 클래스 기능을 사용하기 위해서는 . 을 통해서 사용할 수 있다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 : ");
		String name2 = sc.nextLine(); // 공백 인식 가능
		System.out.println("name = " + name2);
		
		sc.nextLine(); // 입력값 초기화
		
		System.out.print("이름을 입력 : ");
		String name = sc.next(); // next() >> 공백은 인식하지 못함.
		System.out.println("name = " + name);
		
		System.out.println(name2.length());
		
		
		sc.close();
	}
}
