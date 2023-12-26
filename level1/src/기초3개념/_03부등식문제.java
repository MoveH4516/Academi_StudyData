package 기초3개념;

public class _03부등식문제 {
	public static void main(String[] args) {
		
		int a = 0;
		// 2 * a > 3 - a
		//3a > 3
		//a > 1
		//a 는 1보다 큰 정수이므로 2를 대입 (3, 4, 5 등 1보다 큰 정수면 모두 true 이다)
		a = 2;
		boolean result = 2 * a > 3 - a;
		System.out.println(result);
		
		a = 7;
		result = 2 * a > 3 - a;
		System.out.println(result);
		
		a = 12;
		result = 2 * a > 3 - a;
		System.out.println(result);
		
		a = 0;
		result = 2 * a > 3 - a;
		System.out.println(result); // a < 1 이므로 false 출력
		
		
	}
}
