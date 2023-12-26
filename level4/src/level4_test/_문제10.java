package level4_test;

import java.util.Arrays;

public class _문제10 {
	public static void main(String[] args) {
		
		/* [문제]
	     두 배열을 하나로 합치고 오름차순으로정렬하시오.	
		 예) 1,2,3,5,7,8,9,10,12,15,19,20
	 */
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};	
		
		int[] arr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < arr1.length) {
				arr[i] = arr1[i];
			} else {
				arr[i] = arr2[i - arr1.length];
			}						
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			
		}	
		System.out.println(Arrays.toString(arr));
	}
}
