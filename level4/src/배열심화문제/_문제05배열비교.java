package 배열심화문제;

import java.util.Arrays;

public class _문제05배열비교 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 과 b 배열의 값이 서로 겹치면,
		 	각 배열의 겹치는 값을 모두 0으로 변경
		 */
		
		int[] arr = {2, 3, 30, 10};
		int[] b = {10, 3, 20, 10};
		boolean run = false;
		boolean run2 = false;
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (arr[i] == b[j]) {
					if (i != j) {
						b[j] = 0;
						idx1 = i;
					}
					run = true;
				}
				if (b[i] == arr[j]) {
					if (i != j) {
						arr[j] = 0;
						idx2 = i;
					}
					run2 = true;
				}
			}
			
		}
		if (run) {
			arr[idx1] = 0;
			run = false;
		}
		if (run2) {
			b[idx2] = 0;
			run2 = false;
		}
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}
}
