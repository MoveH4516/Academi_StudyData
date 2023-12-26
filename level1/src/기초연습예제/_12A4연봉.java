package 기초연습예제;

public class _12A4연봉 {
	public static void main(String[] args) {
		
		/*
		[문제]
			월급이 100원이다. 연봉은 얼마인지 구하시오.
			단, 세금 10%를 제외하고 구하시오.
		[정답]
			1,080원
	 */
		
		int salary = 100;
		int yearToMonth = 12;
		double tax = 0.1;
		
		double yearSalary = salary * yearToMonth * (1 - tax);
		
		System.out.printf("%.0f원\n", yearSalary);
				
	}
}
