package 배열2문제;

import java.util.Arrays;
import java.util.Random;

public class _문제05오엠알카드 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. test 배열은 시험문제의 정답지
		 	2. student 배열에 1~5점 사이의 랜덤 숫자 5개를 저장
		 	3. 각 자리 수를 비교해서 점수를 result 배열에 기록
		 		맞으면 true, 틀리면 false
		 	4. 점수는 한 문제당 20점
		 	5. 성적도 함께 출력
		 */
		Random rd = new Random();
		int[] test = {1, 2, 3, 4, 5};
		int[] student = new int[5];
		boolean[] result = new boolean[5];
		int score = 0;
		
		for (int i = 0; i < student.length; i++) {
			student[i] = rd.nextInt(5) + 1;
			if (student[i] == test[i]) {
				result[i] = true;
				score += 20;
			} else {
				result[i] = false;
			}
		}
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(result));
		System.out.println("점수 : " + score + "점");
	}
}
