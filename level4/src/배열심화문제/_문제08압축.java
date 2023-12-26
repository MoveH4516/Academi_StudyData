package 배열심화문제;

import java.util.Arrays;

public class _문제08압축 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열에 중복되는 숫자는 제외하고 숫자 1개씩만 압축해서
		 	b 배열에 저장.
		 */
		
		int[] arr = {1, 1, 1, 3, 3, 3, 3, 2, 2, 3, 3, 3, 4, 5};
		int[] b = null;
		int cnt = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt = 0;
			for (int j = i; j < arr.length && arr[i] != 0; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
				} else {
					break;
				}
			}
			if (cnt > 1) {
				for (int k = i + 1; k < cnt + i; k++) {
					arr[k] = 0;
				}
			}
			if (cnt >= 1) {
				count++;
			}
		}
		b = new int[count];
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				b[a] = arr[i];
				a++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
