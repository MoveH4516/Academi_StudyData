package 배열2문제;

import java.util.Arrays;

public class _문제16교차합 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr1 은 앞에서부터 뒤로 반복한다.
		 	arr2 는 뒤에서부터 앞으로 거꾸로 반복한다.
		 	b 에 arr1 과 arr2 각각의 값의 합을 저장 후 출력
		 */
		
		int[] arr1 = {11, 21, 31, 41, 51};
		int[] arr2 = {25, 26, 27, 28, 29};
		
		int[] b = new int[5];
		
		for (int i = 0; i < arr1.length; i++) {
			b[i] = arr1[i];
		}
		int j = arr2.length - 1;
		for (int i = 0; i < arr2.length; i++) {
			b[i] += arr2[j];
			j--;
		}
		System.out.println(Arrays.toString(b));
	}
}
