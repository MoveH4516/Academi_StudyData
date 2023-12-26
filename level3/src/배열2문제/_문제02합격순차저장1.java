package 배열2문제;

import java.util.Arrays;

public class _문제02합격순차저장1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 조건을 모두 만족
		 	1) 아래 배열 a와 b를 비교해서 둘의 합을 배열 c에 저장.
		 	2) 배열 c의 값 중에서 짝수만 배열d에 저장.
		 	3) 배열 d에 저장할 때는 앞에서부터 순차적으로 저장.
		 */
		
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {13, 54, 17, 42, 1};
		int[] c = {0, 0, 0, 0, 0};
		int[] d = {0, 0, 0, 0, 0};
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		for	(int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 0) {
				d[j] = c[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
	}
}
