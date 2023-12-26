package 반복문2문제;

public class _문제16학생수 {
	public static void main(String[] args) {
		
		/*
		[문제]
			a중학교에 1학년으로 입학하는 학생들은 
			8줄, 12줄, 18줄로 세워도
			항상 5명이 남는다.
			1학년 전체 학생 수를 구하시오.
			단, 학생 수는 200명 이상 250명 미만이다.
		[정답]
			221명
	 */
		
		for (int i = 200; i < 250; i++) {
			if (i % 8 == 5 && i % 12 == 5 && i % 18 == 5) {
				System.out.println(i + "명");
			}
		}
		
	}
}
