package 배열심화문제2;

import java.util.Arrays;

public class _문제11같은수삭제 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. input 의 데이터를 a 배열에 순차적으로 저장
		 	2. 단, 저장하려는 숫자가 현재 숫자와 같으면 둘 다 삭제
		 */
		
		int[] input = {1, 3, 3, 2, 1, 1, 4, 4};
		int[] a = new int[input.length];
		int cnt = 1;
		a[0] = input[0];
		for (int i = 1; i < input.length; i++) {
			a[i] = input[cnt];			
			if (a[i] == a[i - 1]) {
				a[i] = 0;
				a[i - 1] = 0;
				i -= 2;
			}
			System.out.print("a = " + Arrays.toString(a));
			System.out.println();
			cnt++;
			if (cnt == input.length) {
				break;
			}
		}
		
	}
}
