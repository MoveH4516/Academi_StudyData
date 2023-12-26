package 배열심화문제2;

import java.util.Arrays;

public class _문제03배열비교1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr b c 배열에 공통적으로 존재하는 값을 result 배열에 순차적으로 저장
		 */
		
		int[][] arr = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		int[] b = {23, 40, 30, 50};
		int[] c = {4, 34, 40, 50};
		int[] result = new int[4];
		int k = 0;
		int[] arr1 = new int[arr.length * arr[0].length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[k] = arr[i][j];
				k++;
			}
		}
		int cnt = 0;
		for (int i = 0; i < arr1.length; i++) {
			cnt = 0;
			for (int j = 0; j < b.length; j++) {
				if (arr1[i] == b[j]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				arr1[i] = 0;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			cnt = 0;
			for (int j = 0; j < c.length; j++) {
				if (arr1[i] == c[j]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				arr1[i] = 0;
			}
		}
		k = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				result[k] = arr1[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
