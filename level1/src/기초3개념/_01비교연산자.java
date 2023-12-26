package 기초3개념;

public class _01비교연산자 {
	public static void main(String[] args) {
		
		//비교연산자 : 결과값이 true, false 로 출력된다.
		// < > <= >= == != 
		// 논리자료형이 출력된다.
		System.out.println(5 < 10); // true 출력
		System.out.println(5 != 10); //true 출력
		System.out.println(5 == 10); //false 출력
		
		System.out.println("--------------");
		int a = 10;
		int b = 3;
		
		System.out.println(a - 7 == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b + 10);
		System.out.println(a < b + 8);
		System.out.println(a > b);

		
	}
}
