package 배열심화문제;

import java.util.Arrays;

public class _문제03개수찾기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	가장 많이 들어있는 숫자의 개수와
		 	가장 적게 들어있는 숫자의 개수를 합한 값을 출력
		 	
		 	1. 중복값 없는 숫자 구하기
		 	2. 중복값 없는 숫자의 개수 구하기
		 	3. 중복값 없는 숫자의 개수의 min max 구하기
		 */
		
		int[] arr = {1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2};
		int[] copy = null; // 중복없는 arr
		int[] count = null; // 중복없는 arr 숫자 개수
		int[] array = new int[arr.length];
		int k = 0;
		int cnt = 0;
		int cnt1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {					
					cnt++;
					break;
				} 
			}
			if (cnt == 0) {
				cnt1++;
				array[i] = arr[i];
			}
			cnt = 0;
		}
		copy = new int[cnt1];
		count = new int[cnt1];
		for (int i = 0; i < arr.length; i++) {
			if (array[i] != 0) {
				copy[k] = array[i];
				k++;
			}
		}		
		for (int i = 0; i < copy.length; i++) {
			cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (copy[i] == arr[j]) {
					cnt++;
				}
			}
			count[i] = cnt;
		}
		
		int min = count[0];
		int max = 0;
		k = 0;
		int j = 0;
		for (int i = 0; i < count.length; i++) {
			if (min > count[i]) {
				min = count[i];
				k = i;
			}
			if (max < count[i]) {
				max =count[i];
				j = i;
			}
		}	
		System.out.printf("가장 많은 숫자 %d의 개수 : %d\n", copy[j], max);
		System.out.printf("가장 적은 숫자 %d의 개수 : %d\n", copy[k], min);
		System.out.printf("두 개수의 합 : %d\n", min + max);
		for (int i = 0; i < count.length; i++) {
			for (int a = i; a < count.length; a++) {
				
				if (count[i] < count[a]) {
					int temp = count[i];
					count[i] = count[a];
					count[a] = temp;
					temp = copy[i];
					copy[i] = copy[a];
					copy[a] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		System.out.println(Arrays.toString(copy));
		
		System.out.printf("가장 많은 숫자 %d의 개수 : %d\n", copy[0], count[0]);
		System.out.printf("가장 적은 숫자 %d의 개수 : %d\n", copy[copy.length - 1], count[count.length - 1]);		
		System.out.printf("두 개수의 합 : %d\n", count[count.length - 1] + count[0]);
	}
}
