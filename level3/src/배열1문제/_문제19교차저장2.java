package 배열1문제;

import java.util.Arrays;

public class _문제19교차저장2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	배열 d 의 값을 번갈아가면서 배열 e, f 에 저장
		 */
		
		int[] d = {10, 20, 30, 40, 50, 60};
		int[] e = {0, 0, 0};
		int[] f = {0, 0, 0};
		
		for (int i = 0;i < e.length; i++) {
			e[i] = d[2 * i];
			f[i] = d[2 * i + 1];
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}
