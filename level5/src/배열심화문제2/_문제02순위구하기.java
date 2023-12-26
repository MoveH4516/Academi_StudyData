package 배열심화문제2;

import java.util.Arrays;

public class _문제02순위구하기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	각 학번의 석차 출력
		 */
		
		String[] nums = {"1001", "1002", "1003", "1004", "1005"};
		int[] score = {100,54,21,54,10};
		
		int[] rank = new int[score.length];
		
		int cnt = 0;
		
		for (int i = 0; i < nums.length; i++) {
			cnt = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) {
					cnt++;
				}
			}
			rank[i] = cnt;
		}
		System.out.println(Arrays.toString(rank));
	}
}
