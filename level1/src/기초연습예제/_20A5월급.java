package 기초연습예제;

public class _20A5월급 {
	public static void main(String[] args) {
	/*
		[문제]
			내 연봉에서 세금 10%를 제외했더니 1,350만원이다.
			세금을 제외하기 전 내 월급은 얼마인지 구하시오.
		[정답]
			125만원
	 */
		
		int salary = 1350;
		double tax = 0.1;
		int month = 12;
		// before * (1 - tax) = salary
		double before = salary / (1 - tax) / month;
		
		System.out.printf("%.0f만원\n", before);
		
	}
}
