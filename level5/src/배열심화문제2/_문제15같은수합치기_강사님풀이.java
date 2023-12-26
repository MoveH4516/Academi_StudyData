package 배열심화문제2;

import java.util.Arrays;

public class _문제15같은수합치기_강사님풀이 {
	public static void main(String[] args) {

		int[] input = { 8, 4, 2, 2, 4, 4, 8 };
		int[] arr = new int[input.length];

		int idx = 0;
		arr[idx] = input[0];
		for (int i = 1; i < input.length; i += 1) {
			if (arr[idx] == input[i]) {
				arr[idx] = arr[idx] * 2; // arr[idx]*=2;
				while (idx != 0) {
					// System.out.println(Arrays.toString(arr));
					if (arr[idx] == arr[idx - 1]) {
						arr[idx - 1] = arr[idx] * 2;
						arr[idx] = 0;
						idx -= 1;
					} else {
						break;
					}
				}
			} else {
				idx += 1;
				arr[idx] = input[i];
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
