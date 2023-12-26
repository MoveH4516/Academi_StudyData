package 기초연습예제;

public class _14A4사과 {
	public static void main(String[] args) {
		/*
		[문제]
			무게가 같은 사과 15개의 무게를 재었더니 25/8kg 이었다.
			사과 한 개의 무게를 구하시오.
			단, 소수점 두 자리까지 출력하시오.
		[정답]
			0.21g
	 */	
		
		int apple = 15;
		double wApple = 25 / 8.0;
		
		double wApplePerOne = wApple / apple;
		System.out.printf("%.2fkg\n", wApplePerOne);
		
	}
}
