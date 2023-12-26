package 배열2문제;

import java.util.Arrays;

public class _문제04일이삼일이삼 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 배열에 숫자 1, 2, 3, 1, 2, 3, 1, 2 를
		 	순차적으로 저장하고 출력
		 */
		
		int[] arr = new int[8];
		
		for (int i =0; i < arr.length; i++) {
			if (i % 3 == 0) {
				arr[i] = 1;
			} else if (i % 3 == 1) {
				arr[i] = 2;
			} else {
				arr[i] = 3;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
