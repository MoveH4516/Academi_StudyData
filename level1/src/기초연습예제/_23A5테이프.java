package 기초연습예제;

public class _23A5테이프 {
	public static void main(String[] args) {
		/*
		[문제]
			색테이프 23m를 5명이 남김없이 똑같이 나누어 가졌습니다.
			한명이 가진 색 테이프의 길이를 구하시오.
			단, 소수점 자리는 두 자리까지 구하시오.
		[정답]
			4.60m
	 */	
		
		int tape = 23;
		int people = 5;
		double answer = tape * 1.0 / people;
		
		System.out.printf("%.2fm", answer);
		
	}
}
