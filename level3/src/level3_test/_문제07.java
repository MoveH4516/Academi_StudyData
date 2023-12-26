package level3_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제07 {
	public static void main(String[] args) {
		/*
		[문제]
			인덱스를 입력받고 해당 인덱스의 값을  0으로 변경
			
			추가조건 : 해당 값 양옆의 값들도 8로 변경 
			단, 0, 4 인덱스일경우는 양옆중 한개만 8로 변경 
			
			(예) 1 ==> {8,0,8,9,9}
			(예) 4 ==> {9,9,9,8,0}
		
		걸린시간 : 4분49초69
		*/
		Scanner sc = new Scanner(System.in);
		int[] arr = {9,9,9,9,9};
		
		System.out.print("인덱스 값 : ");
		int index = sc.nextInt();
		if (index < 0 || index >= arr.length) {
			System.out.println("인덱스 범위 오류");
		} else {
			arr[index] = 0;
			if (index - 1 >= 0) {
				arr[index - 1] = 8;
			}
			if (index + 1 < arr.length) {
				arr[index + 1] = 8;
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
