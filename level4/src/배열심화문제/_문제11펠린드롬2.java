package 배열심화문제;

import java.util.Arrays;

public class _문제11펠린드롬2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 arr 배열에서 0이나 1을 제외한 나머지 값들이 팰린드롬인지 출력
		 */
		
		int[] arr = {1, 3, 0, 0, 2, 1, 2, 3, 0};
		int idx = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1 && arr[i] != 0) {
				cnt++;
			}			
		}
		int[] copy = new int[cnt];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1 && arr[i] != 0) {
				copy[idx] = arr[i];
				idx++;
			}			
		}
		System.out.println(Arrays.toString(copy));
		int j = copy.length - 1;
		int pass = 0;
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] == copy[j]) {
				pass = 0;
			} else {
				pass = 1;
				break;
			}
			j--;
		}
		System.out.println(pass == 0 ? "펠린드롬이다" : "펠린드롬이 아니다");
	}
}
