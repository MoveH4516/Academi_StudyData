package 기초연습예제;

public class _33B4어떤수a {
	public static void main(String[] args) {
		/*
		[문제]
			어떤 수를 a라고 했을 때
			7 * 2 - a의 값은 -5와 같다.
			어떤 수 a는 홀수인지 여부를
			true 또는 false로 표현하시오.
		[정답]
			true
	 */
	
		int a;
		a = 7 * 2 + 5;
		
		boolean result = a % 2 != 0;
		
		System.out.println(result);
		
	}
}
