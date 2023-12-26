package 기초4문제;

public class _문제24도화지 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	민수네 반 학생은 26명이다.
		 	민수네 반 학생들에게 도화지를 두 장씩 나누어 주려고 한다.
		 	도화지는 열 장씩 묶음으로만 판매하고 열 장에 1200원 이다.
		 	총 얼마가 필요한지 구하시오.
		 */
		
		int classMember = 26;
		int paper = classMember * 2;
		int costPer10 = 1200;
		int setPaper = paper / 10;
		boolean req = paper % 10 == 0;

		if (req) {
			System.out.printf("총 : %d원\n", setPaper * costPer10);
		} else {
			System.out.printf("총 : %d원\n", (setPaper + 1) * costPer10);
		}
		
		if (!req) {
			setPaper += 1;
		}
		System.out.printf("총 : %d원\n", setPaper * costPer10);
		// 꼭 if 안에서 모든걸 해결하려고 하지 않고
		// 말 그대로 조건만 if 안에서 해결하는 식으로 해도 좋다.
	}
}
