package 배열심화문제2;

import java.util.Arrays;
import java.util.Random;

public class _문제09이차원랜덤저장 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	darr 배열에 1~50 사이의 숫자 중 25개만 중복되지 않게 저장 후 출력
		 */
		
		Random rd = new Random();
		int size = 5;
		int[][] darr = new int[size][size];
		
		int[] num = new int[50];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < 100; i++) {
			int rand = rd.nextInt(50);
			int temp = num[0];
			num[0] = num[rand];
			num[rand] = temp;
		}
		int k = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				darr[i][j] = num[k];
				k++;
			}
		}
		System.out.println(Arrays.deepToString(darr));
	}
}
