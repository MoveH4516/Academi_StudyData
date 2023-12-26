package 배열1문제;

import java.util.Random;

public class _문제13학생성적1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	array 배열에 1~100점 사이의 랜덤 정수를 5개 저장하고 출력
		 [문제2]
		 	전교생의 총점과 평균을 출력
		 [문제3]
		 	성적이 60점 이상이면 합격. 합격생 수 출력
		 */
		
		Random rd = new Random();
		int[] array = new int[5];
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100) + 1;
			System.out.print(array[i] + " ");
			sum += array[i];
			if (array[i] >= 60) {
				cnt++;
			}
		}
		double avg = sum / 5.0;
		System.out.println();
		System.out.println("총점 : " + sum + "  평균 : " + avg);
		System.out.println("합격생 수 : " + cnt);
	}
}
