package 기초연습예제;

public class _35B5과일무게 {
	public static void main(String[] args) {
		/*
		[문제]
			귤 6개의 무게는 840g, 사과 3개의 무게는 750g 이다.
			귤 5의 무게가 4의 배수이고, 사과 4개의 무게가 5의 배수인지 여부를
			true 또는 false로 표현하시오.
		[정답]
			true
	 */	
		
		int mandarin6 = 840;
		int apple3 = 750;
		double mandarin5 = mandarin6 * 5 / 6.0;
		double apple4 = apple3 * 4 / 3.0;
		
		boolean result = mandarin5 % 4 == 0 && apple4 % 5 == 0;
		
		System.out.println(result);
		
	}
}
