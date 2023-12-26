package 기초연습예제;

public class _34B4연봉비교 {
	public static void main(String[] args) {
		/*
		[문제]
			작년 연봉은 970원이다. 올해는 11% 인상되었다.
			올해 우리 회사 평균 월급은 91원이다.
			올해의 내 연봉이 올해의 우리회사 평균 연봉보다 큰지 여부를
			true 또는 false로 표현하시오.
		[정답]
			false
	 */	
		
		int salaryYear = 970;
		double increase = 0.11;
		int avg = 91;
		double salary = salaryYear * increase / 12.0;
		
		boolean result = salary > avg;
		
		System.out.println(result);
		
	}
}
