package 배열2문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제13값교체 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	값 2개를 입력받아 arr 배열에서 두 값을 교체
		 	단, 없는 값을 입력했을 시 예외처리
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int val1 = 0;
		int val2 = 0;
		int change = 0;

		System.out.print("값1 입력 : ");
		val1 = sc.nextInt();
		System.out.print("값2 입력 : ");
		val2 = sc.nextInt();
		int index1 = -1;
		int index2 = -1;
		for (int a = 0; a < arr.length; a++) {
			if(val1 == arr[a]) {
				index1 = a;
				break;
			}
		}
		for (int a = 0; a < arr.length; a++) {
			if(val1 == arr[a]) {
				index2 = a;
				break;
			}
		}
		if (index1 == -1 || index2 == -1) {
			System.out.println("입력값 오류");
		} else {
			
			int j = 0;
			int k = 0;
			for (int i = 0; i < arr.length; i++) {
				if (val1 == arr[i]) {
					j = i;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (val2 == arr[i]) {
					k = i;
				}
			}
			change = arr[j];
			arr[j] = arr[k];
			arr[k] = change;
			
			System.out.println(Arrays.toString(arr));
		}
		sc.close();
	}
}
