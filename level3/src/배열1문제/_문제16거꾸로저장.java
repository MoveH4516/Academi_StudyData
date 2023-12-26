package 배열1문제;

import java.util.Arrays;

public class _문제16거꾸로저장 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	a배열의 값을 b배열에 하나씩 저장하는데
		 	순서를 거꾸로 저장하시오.
		 */
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		int j = a.length;
		for (int i = 0; i < a.length; i++) {
			j--;
			b[i] = a[j];			
		}
		System.out.println(Arrays.toString(b));
		for (int k = 0; k < a.length; k++) {
			b[k] = a[4 - k];
		}
		System.out.println(Arrays.toString(b));
	}
}
