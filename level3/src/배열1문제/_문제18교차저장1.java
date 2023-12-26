package 배열1문제;

import java.util.Arrays;

public class _문제18교차저장1 {
	public static void main(String[] args) {
		/*
		[문제]
			배열 a의 값과 b의 값을 번갈아가면서
			배열 c에 저장한다.
		*/
		
		int[] a = {10, 20, 30};
		int[] b = {40, 50, 60};
		int[] c = {0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < a.length; i++) {
			c[2 * i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[2 * j + 1] = b[j];
		}
		System.out.println(Arrays.toString(c));
	}
}
