package 배열심화개념;

import java.util.Arrays;

public class _01정렬 {
	public static void main(String[] args) {
		
		// 내림차순 정렬
		// 차례대로 비교하면서 최댓값과 값교체를 해주면 된다.
		
		int[] score = {10, 50, 30, 40, 80, 19};
		int max = 0;
		int k = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println(Arrays.toString(score));
			for (int j = i; j <score.length; j++) {
				if (max < score[j]) {
					max = score[j];
					k = j;
				}				
			}
			score[k] =score[i];
			score[i] = max;			
			max = 0;			
		}				
	}
}
