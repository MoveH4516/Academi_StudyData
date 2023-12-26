package 기초2개념;

public class _01변수 {
	public static void main(String[] args) {
		//변수 (variable) : 변동할 수 있는 단 하나의 값을 저장하는 메모리 공간
		// 자료형 + 변수이름 = 초기값 을 통해서 선언을 해주어야 한다.
		
		int num1 = 1; // 정수형(4byte)
		double num2 = 1.1; // 실수형(8byte)
		float num3 = 153.2f; // 실수형(4byte)
		char c = 'A'; // 문자 하나(2byte)
		String s = "문자 여러개";
		boolean b = true; // 논리형
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(c);
		System.out.println(s);
		System.out.println(b);
	}
}
