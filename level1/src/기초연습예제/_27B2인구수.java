package 기초연습예제;

public class _27B2인구수 {
	public static void main(String[] args) {
	/*
		[문제]
			어느 도시에 전체 인구가 400,000 명이다.
			그 중 나이가 19세 이하 인구는 35퍼센트이다.
			그리고 나이가 40세 이상 인구는 25퍼센트이다.
			위 도시의 19세 이하 인구에서 40세 이상 인구 수를 뺀 인구 수를 구하시오.
		[정답]
			40,000명
	 */
	
		int people = 400000;
		double age19Per = 0.35;
		double age40Per = 0.25;
		
		double age19 = people * age19Per;
		double age40 = people * age40Per;
		
		double result = age19 - age40;
		
		System.out.printf(String.format("%,3.0f명",result));		
	}
}
