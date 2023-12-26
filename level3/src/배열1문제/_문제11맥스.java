package 배열1문제;

import java.util.Random;

public class _문제11맥스 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	array 배열에 1~100 사이의 랜덤 숫자를 저장하고,
		 	가장 큰 값의 인덱스와 값을 출력하시오.
		 */
		
		Random rd = new Random();
		
		int[] array = new int[5];
		int max = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100) + 1;
			System.out.println(array[i]);
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("=================");
		System.out.println(max);
		System.out.println(index);
	}
}
