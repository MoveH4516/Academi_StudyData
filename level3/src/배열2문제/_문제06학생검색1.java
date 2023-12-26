package 배열2문제;

import java.util.Arrays;

public class _문제06학생검색1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 배열은 3명의 학생 데이터이다.
		 	각 학생은 3개씩 데이터로 표현한다.
		 	맨 앞은 번호, 그 다음은 국어점수, 그 다음은 수학점수이다.
		 	
		 	ex) 1001번, 국어20, 수학30
		 	
		 	아래 학생 3명 중 국어 점수가 수학 점수보다 높은 학생번호를
		 	answer 배열에 저장하고 출력
		 */
		
		int[] arr = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		int[] answer = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i+=3) {
			if (arr[i + 1] > arr[i + 2]) {
				answer[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
