package level4_test;

import java.util.Arrays;

public class _문제12 {
	public static void main(String[] args) {
		
		/*  [문제]	
	 	아래 배열에서 혼자있는 숫자를 제거한후 나머지값들만 출력해보자.
			 
	  	(예)
			{1,2,3,2,1}  ==>  {1,2,2,1}    // 3이 혼자있음
		    {1,3,4,4,2}  ==>  {4,4}        // 1,2,3 혼자있음
		    {1,1,1,1,1}  ==>  {1,1,1,1,1}  // 없음
	 
	 */

		int[] arr1 = { 1, 2, 3, 2, 1 };
		int[] arr2 = { 1, 3, 4, 4, 2 };
		int[] arr3 = { 1, 1, 1, 1, 1 };
		
		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int one = 0;
		int two = 0;
		for (int i = 0; i < arr1.length; i++) {
			cnt = 0;
			cnt1 = 0;
			cnt2 = 0;
			for (int j = 0; j < arr1.length; j++) {
				if (i != j && arr1[i] == arr1[j]) {
					cnt++;
				}
			}
			for (int j = 0; j < arr1.length; j++) {
				if (i != j && arr2[i] == arr2[j]) {
					cnt1++;
				}
			}
			for (int j = 0; j < arr1.length; j++) {
				if (i != j && arr3[i] == arr3[j]) {
					cnt2++;
				}
			}
			if (cnt == 0) {
				arr1[i] = 0;
				one++;
			}
			if (cnt1 == 0) {
				arr2[i] = 0;
				two++;
			}
			if (cnt2 == 0) {
				arr3[i] = 0;
			}
		}
		
		int[] copy = arr1;
		arr1 = new int[copy.length - one];
		one = 0;
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] != 0) {
				arr1[one] = copy[i];
				one++;
			}
		}
		copy = arr2;
		arr2 = new int[copy.length - two];
		two = 0;
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] != 0) {
				arr2[two] = copy[i];
				two++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		int[][] arr = { arr1, arr2, arr3 };
		System.out.println(Arrays.deepToString(arr));
	}
}
