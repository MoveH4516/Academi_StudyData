package 배열2문제;

import java.util.Arrays;

public class _문제07홀수순차저장 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열 값 중 홀수만 배열 c 에 저장
		 	위치는 뒤에서부터 저장.
		 */
		
		int[] arr = {10, 49, 51, 36, 17};
		int[] c = {0, 0, 0, 0, 0};
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				c[c.length - j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
