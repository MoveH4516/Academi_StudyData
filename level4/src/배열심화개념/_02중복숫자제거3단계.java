package 배열심화개념;

import java.util.Arrays;
import java.util.Random;

public class _02중복숫자제거3단계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. arr 배열에 1~10 사이의 랜덤 숫자 5개를 저장
		 	2. 단 중복되는 숫자가 없어야 한다.
		 	3. 이차원 반복문 사용
		 */
		
		Random rd = new Random();
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {			
			arr[i] = rd.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
