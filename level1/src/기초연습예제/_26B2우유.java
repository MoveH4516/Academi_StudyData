package 기초연습예제;

public class _26B2우유 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 우유 4/5L를 6일 동안 똑같이 나눠 마셨다.
			철수가 2일째 우유를 마시고나면 남은 우유는 몇L 인지 구하시오.
			소수점 두 자리까지 출력하시오.
		[정답]
			0.53 L
	 */
		
		double milk = 4.0 / 5;
		int day = 6;
		double milkPerDay = milk / day;
		double result = milk - milkPerDay * 2;
		
		System.out.printf("%.2f L",result);		
	}
}
