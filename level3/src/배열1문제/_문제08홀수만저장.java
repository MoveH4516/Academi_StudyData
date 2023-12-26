package 배열1문제;

import java.util.Random;

public class _문제08홀수만저장 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 배열에 랜덤값 -100~100을 4개 저장한 후
		 	그 값 중 홀수만 temp 에 저장 후 arr 와 temp 의 배열을 출력
		 */
		Random rd = new Random();
	 	
		int[] arr = new int[4];
		int[] temp1 = new int[4];
		int[] temp2 = new int[4];
		int cnt = 0;
		for (int i = 0; i < 4; i++ ) {
			int num = rd.nextInt(201) - 100;
			arr[i] = num;
			if (arr[i] % 2 != 0) {
				temp1[i] = arr[i];
				temp2[cnt] = arr[i];
				cnt++;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("================");
		for (int i = 0; i < 4; i++ ) {
			System.out.print(temp1[i] + " ");
		}
		System.out.println();
		System.out.println("================");
		for (int i = 0; i < 4; i++ ) {
			System.out.print(temp2[i] + " ");
		}
		
	}
}
