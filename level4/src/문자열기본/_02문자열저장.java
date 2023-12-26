package 문자열기본;

import java.util.Scanner;

public class _02문자열저장 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "이동현";
		System.out.println(name + "입력>>");
		String copyName = sc.next();
		System.out.println(name.charAt(0)); // 문자열의 n 번째 값을 출력 (한 문자)
		System.out.println("name : " + name);
		System.out.println("copyName : " + copyName);
		System.out.println(name == copyName);
		// 같은 문자열을 넣어주었지만 논리값은 false 가 출력된다.
		
		sc.close();
	}
}
