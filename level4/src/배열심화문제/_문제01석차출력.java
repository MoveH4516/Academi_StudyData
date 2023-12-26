package 배열심화문제;

import java.util.Arrays;

public class _문제01석차출력 {
	public static void main(String[] args) {
		
		int[] num = {1001, 1002, 1003, 1004};
		int[] score = {87, 42, 11, 98};
		int max = 0;
		int change = 0;
		int idx = 0;
		for (int i = 0; i < num.length; i++) {		
			for (int j = i; j < num.length; j++) {
				if (max < score[j]) {
					max = score[j];
					idx = j;
				}
			}
			change = num[idx];
			num[idx] = num[i];
			num[i] = change;
			score[idx] = score[i];
			score[i] = max;
			max = 0;
			System.out.printf("%d번 학생 성적 : %d점 (%d등)\n", num[i], score[i], i + 1);
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(score));	
	}
}
