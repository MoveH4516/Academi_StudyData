package 배열2문제;

import java.util.Arrays;

public class _문제21한줄에저장 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr1 배열과 arr2 배열을 서로 붙여서 temp배열에 저장
		 */
		
		int[] arr1 = {2, 65, 34, 76, 8, 5};
		int[] arr2 = {6, 54, 1, 4};
		int[] temp = null;
		temp = new int[arr1.length + arr2.length];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			temp[i] = arr1[i];
		}
		for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
			temp[i] = arr2[j];
			j++;
		}
		System.out.println(Arrays.toString(temp));
	}
}
