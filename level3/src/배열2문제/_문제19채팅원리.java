package 배열2문제;

import java.util.Arrays;

public class _문제19채팅원리 {
	public static void main(String[] args) {
		
		/*
		 [문제1]
		 	arr1 배열의 값들을 앞으로 한 칸씩 당기고 맨 뒤에 a 의 값을 저장.
		 	
		 [문제2]
		 	arr2 배열을 뒤로 하나씩 밀어낸 후 맨 낲에 b 의 값을 저장
		 */
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int a = 90;
		
		int[] arr2 = {10, 20, 30, 40, 50};
		int b = 60;
		
		for (int i = 0; i < arr1.length; i++) {			
			if (i == arr1.length - 1) {
				arr1[i] = a;
			} else {
				arr1[i] = arr1[i + 1];
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		for (int i = arr2.length - 1; i >= 0; i--) {
			if (i == 0) {
				arr2[i] = b;
			} else {
				arr2[i] = arr2[i - 1];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
