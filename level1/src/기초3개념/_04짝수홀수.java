package 기초3개념;

public class _04짝수홀수 {
	public static void main(String[] args) {
		
		int a = 0;
		a = 3;
		boolean result = a % 2 == 0;
		System.out.println(result); // a가 2의 배수면 true 아니면 false
		// true면 짝수 false면 홀수다
		
		boolean result2 = a % 2 != 0;
		System.out.println(result2);
		
		int b = 0;
		b = 15520;
		boolean result3 = b % 5 == 0; // true면 5의 배수이다. false면 아님
		System.out.println(result3);
	}
}
