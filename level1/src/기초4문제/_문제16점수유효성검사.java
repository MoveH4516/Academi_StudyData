package 기초4문제;

import java.util.Scanner;

public class _문제16점수유효성검사 {
	public static void main(String[] args) {
		
		/*
		 [문제0]
		 	1. 점수 2개를 입력받아 평균을 구한다.
		 	2. 평균이 60점 이상이면 합격, 60점 미만이면 불합격이다.
		 	3. 조건1) 입력받은 정수가 음수이거나 100점을 초과하면,
		 		오류 메세지를 출력한다.
		 	4. 조건2) 평균이 60점 이상이어도, 한 과목이라도 50점 미만이면 불합격을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과목1의 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("과목2의 점수 : ");
		int score2 = sc.nextInt();
		double avg = 1.0 * (score1 + score2) / 2;
		boolean pass = score1 < 0 || score1 > 100 || score2 < 0 || score2 > 100;
		boolean scorePass = score1 < 50 || score2 < 50;
		if (!pass) {
			if (avg >= 60 && !scorePass) {
				System.out.println("합격");
			}
			if (avg < 60 || scorePass) {
				System.out.println("불합격");
			}
		}
		if (pass) {
			System.out.println("점수를 잘못 입력 하였습니다.");
		}
		sc.close();
	}
}
