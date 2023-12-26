package 이차원배열문제;

import java.util.Arrays;

public class _문제01기본문제1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	배열 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}} 넣어서 만들기
		 
		 	전체 합 출력
		 	4의 배수만 출력
		 	4의 배수 합 출력
		 	4의 배수 개수 출력
		 */
		
		int[][] arr = new int[3][3];
		int num = 10;
		int sum = 0;
		int sum4 = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {			
				arr[i][j] = num;
				sum += arr[i][j];
				num += 10;
				if (arr[i][j] % 4 == 0) {
					sum4 += arr[i][j];
					cnt++;
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println("총합 : " + sum);
		System.out.println("4의 배수 합 : " + sum4);
		System.out.println("4의 배수 개수 : " + cnt);
	}
}
