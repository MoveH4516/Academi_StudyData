package 배열심화문제2;

import java.util.Arrays;

public class _문제04배열비교2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열과 result 배열을 비교해서겹치는 값이 있으면
		 	두 배열의 값을 전부 0으로 변경
		 	
		 	겹치는 값이 여러개면 전부 0
		 */
		
		int[][] arr = {
				{1, 3, 4},
				{5, 6, 3},
				{6, 8, 9}
		};
		int[] result = {1, 5, 6, 3, 7};
		int[] copy = new int[result.length];
		for (int i = 0; i < result.length; i++) {
			copy[i] = result[i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int val = arr[i][j];
				for (int k = 0; k < copy.length; k++) {
					if (val == copy[k]) {
						arr[i][j] = 0;
						result[k] = 0;
					}
				}				
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.toString(result));
		
		
	}
}
