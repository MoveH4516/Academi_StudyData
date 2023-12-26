package 기초2문제;
/*
[문제]
	철수네 반은 학생이 40명이다.
	철수, 영희, 민수는 반장선거에 나갔다.
	민수는 전체 중 40%를 획득했고,
	영희는 9표를 획득했다.
	나머지는 철수가 득표했다.
	철수,영희, 민수는 각각 몇 표를 득표했고,
	철수, 영희, 민수는 각각 전체 득표에서 몇 %를 획득했는지 구하시오.
	소수점 두 자리까지 출력하시오.
[정답]
	민수 40.0% 16.0표
	영희 22.5% 9.0표
	철수 37.5% 15.0표
*/
public class _문제09투표 {
	public static void main(String[] args) {
		
		int classMember = 40;
		double minsuPer = 0.4;
		double yeonghee = 9.0;
		double minsu = classMember * minsuPer;
		double cheolsu = classMember - (yeonghee + minsu);
		
		System.out.printf("민수 %.2f%% %.2f표\n", minsuPer * 100, minsu);
		System.out.printf("영희 %.2f%% %.2f표\n", yeonghee / classMember * 100, yeonghee);
		System.out.printf("철수 %.2f%% %.2f표\n", cheolsu / classMember * 100, cheolsu);
		
	}
}
