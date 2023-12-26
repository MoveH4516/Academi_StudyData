package 배열2문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제09전파 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	인덱스를 입력받고 해당 인덱스의 값을 0으로 변경.
		 	
		 [심화]
		 	인덱스를 입력받고 해당 인덱스의 값을 0으로 변경
		 	해당 값 양 옆의 값들도 0으로 변경 0이나 4일 경우
		 	한 곳만 0으로 변경
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = {9, 9, 9, 9, 9};
		
		System.out.print("인덱스 : ");
		int index = sc.nextInt();
		
		if (index < 0 || index > arr.length - 1) {
			System.out.println("0~4의 값을 입력하세요.");
		} else {
			if (index == 0) {
				arr[index] = 0;
				arr[index + 1] = 0;
			} else if (index == 4) {
				arr[index] = 0;
				arr[index - 1] = 0;
			} else {
				arr[index] = 0;
				arr[index + 1] = 0;
				arr[index - 1] = 0;
			}			
			System.out.println(Arrays.toString(arr));
		}
		sc.close();
	}
}
