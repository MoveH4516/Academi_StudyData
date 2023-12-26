package 배열1문제;

import java.util.Random;

public class _문제04배열기본 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	array 배열에 -100~100 사이의 랜덤 값 5개를 저장 후,
		 	모든 값을 출력
		 */
		
		Random rd = new Random();
		int[] array = new int[5];
		
		for (int i = 0; i < 5; i++) {
			int num = rd.nextInt(201) - 100;
			System.out.println("랜덤 숫자 : " + num);
			array[i] = num;
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
	}
}
