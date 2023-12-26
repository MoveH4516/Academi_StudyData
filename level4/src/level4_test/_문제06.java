package level4_test;

import java.util.Arrays;

public class _문제06 {
	public static void main(String[] args) {
		
		
				
				// [문제1] 모든 점수의 총합 출력
				// [정답1] 665
				
				// [문제2] 수학1등 번호 출력
				// [문제2] 1004
				
				// [문제3] 전체1등 번호 출력 
				// [정답3] 1004

				// [문제4] 수학점수가 국어점수 보다 높은 번호 출력 
				// [정답4] 1002
				
				// [문제5] 총 점수가 높은 순서대로 번호들을 출력
				// [정답5] 1004 1001 1003 1005 1002 
		
		int[][] arr = {
				//   번호   국어  수학  영어
					{1001, 100, 20, 32},
					{1002,  40, 43, 12},
					{1003,  60, 21, 42},
					{1004,  76, 54, 55},
					{1005,  23, 11, 76}
				};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}	
		System.out.println(sum);
		System.out.println("=====================");
		int max = 0;
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i][2]) {
				max = arr[i][2];
				idx = i;
			}
		}
		System.out.println(arr[idx][0]);
		System.out.println("=====================");
		max = 0;
		idx = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 1; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if (max < sum) {
				max = sum;
				idx = i;
			}
		}
		System.out.println(arr[idx][0]);
		System.out.println("=====================");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][1] < arr[i][2]) {
				System.out.println(arr[i][0]);
			}
		}
		System.out.println("=====================");
		int[] sum2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 1; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			sum2[i] = sum;
		}		
		idx = 0;
		for (int i = 0; i < sum2.length; i++) {
			max = 0;
			for (int j = i; j < sum2.length; j++) {
				if (max < sum2[j]) {
					max = sum2[j];
					idx = j;
				}
			}
			int temp = sum2[i];
			sum2[i]	= sum2[idx];
			sum2[idx] = temp;
			
			int temp2 = arr[i][0];
			arr[i][0] = arr[idx][0];
			arr[idx][0] =temp2;
			
			System.out.print(arr[i][0] + " ");
		}
		System.out.println(Arrays.toString(sum2));
	}
}
