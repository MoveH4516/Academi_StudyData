package 배열1문제;

import java.util.Random;

public class _문제12민 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	array 배열에 -100 ~ 100 사이의 랜덤 숫자를 저장하고,
		 	가장 작은 값의 인덱스와 값을 출력.
		 */
		
		Random rd = new Random();
		int[] array = new int[5];
		int min = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(201) - 100;
			System.out.println(array[i]);
			if (i == 0) {
				min = array[i];
			}
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		System.out.println("==========");
		System.out.println(min);
		System.out.println(index);
	}
}
