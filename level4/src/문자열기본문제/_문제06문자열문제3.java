package 문자열기본문제;

import java.util.Arrays;

public class _문제06문자열문제3 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	userData 는 학생번호 데이터
		 	scoreData 는 학생점수 데이터
		 	1등 학생의 번호와 성적 그리고 평균을 출력
		 */
		
		String userData = "1001,1002,1003,1004";
		String scoreData = "10,21,43,12";
		
		String[] user = userData.split(",");
		String[] score = scoreData.split(",");
		System.out.println(Arrays.toString(user));
		System.out.println(Arrays.toString(score));
		
		int max = 0;
		int idx = 0;
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += Integer.parseInt(score[i]);
			if (max < Integer.parseInt(score[i])) {
				max = Integer.parseInt(score[i]);
				idx = i;
			}
		}
		double avg = 1.0 * sum / user.length;
		System.out.printf("1등 %s번 : %d점\n", user[idx], max);
		System.out.printf("평균 : %.1f점", avg);
	}
}
