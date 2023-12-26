package 배열1문제;

import java.util.Random;

public class _문제06배열기본 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 배열에서 랜덤 값 -100~100을 4개 저장 후
		 	그 값 중 홀수만 출력
		 */
		
		Random rd = new Random();
		
		int[] arr = new int[4];
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			int num = rd.nextInt(201) - 100;
			arr[i] = num;
			if (arr[i] % 2 != 0) {
				cnt++;
				System.out.print(cnt == 1? arr[i] : ", " + arr[i]);
			}			
		}

		if (cnt == 0) {
			System.out.print("홀수가 없습니다.");
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
