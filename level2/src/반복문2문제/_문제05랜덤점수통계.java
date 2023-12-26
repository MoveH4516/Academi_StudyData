package 반복문2문제;

import java.util.Random;

public class _문제05랜덤점수통계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 10회 반복
		 	2. 1~100 사이의 랜덤 숫자 저장
		 	3. 성적이 60점 이상이면 합격
		 	-----------------------
		 	1. 전교생(10명)의 총점과 평균을 출력
		 	2. 합격자 수를 출력
		 	3. 1등 학생의 번호와 성적 출력
		 */
		Random rd = new Random();
		
		int i = 1;
		int sum = 0;
		int pass = 0;
		double avg = 0;
		int max = 0;
		int cnt = 0;
		while (i <= 10) {
			int score = rd.nextInt(100) + 1;
			System.out.printf("%d번 학생의 점수\t: %d\n", i, score);
			sum = sum + score;		
			if (score >= 60) {
				pass++;
			}
			if (max < score) {
				max = score;
				cnt = i;
			}
			i++;
		}
		avg = 1.0 * sum / i; // 굳이 반복문 안에 들어갈 필요가 없다.
		System.out.printf("총점 : %d 평균 : %.1f\n", sum, avg);
		System.out.printf("합격자 수 : %d명\n", pass);
		System.out.printf("1등 학생의 번호 : %d번 점수 : %d점\n", cnt, max);

	}
}
