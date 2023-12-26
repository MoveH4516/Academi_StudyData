package 배열2문제;

import java.util.Arrays;

public class _문제03뒤의값과교환 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열에서 반복을 순차적으로 진행하되
		 	3번째마다 바로 뒤의 값과 위치를 교환후 출력
		 */
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		int change = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 3 == 2) {
				change = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = change;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
