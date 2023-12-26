package 기초연습예제;

public class _21A5사과배 {
	public static void main(String[] args) {
	/*
		[문제]
			사과 8개의 무게는 1,056g 이다.
			배는 사과의 117%의 무게를 갖고 있다.
			사과 5개, 배 7개를 구입하였다.
			
			과일 전체의 총 무게를 구하시오.
			단, 소수점 두 자리까지 출력하시오.
		[정답]
			1741.08 g
	 */	
		
		int wApple8 = 1056;
		double wPear8 = wApple8 * 1.17;
		int apple = 5;
		int pear = 7;
		
		double total = apple * wApple8 / 8 + wPear8 / 8 * pear;
		
		System.out.printf("%.2f g", total);
		
	}
}
