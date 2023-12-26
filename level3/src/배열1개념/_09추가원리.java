package 배열1개념;

import java.util.Arrays;
import java.util.Scanner;

public class _09추가원리 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열에 값을 1개씩 입력받아 저장한다.
		 	단, 5개 이상 추가할 수 없다.
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("값 입력 : ");
//			int num = sc.nextInt();
//			arr[i] = num;
//			
//			for (int j = 0; j <= i; j++) {
//				System.out.print(j == i ? arr[j] : arr[j] + ", ");
//			}
//			System.out.println();
//		}
		
		int i = 0;
		while (true) {
			System.out.print("값 입력(-1000입력시 종료) : ");
			int num = sc.nextInt();
			if (num == -1000) {
				System.out.println("-1000 종료");
				System.out.println(Arrays.toString(arr));
				break;
			}
			if (i >= 5) {
				System.out.println("저장 공간 초과");
				break;
			}
			arr[i] = num;
			System.out.print("[");
			for (int j = 0; j <= i; j++) {
				System.out.print(j == i ? arr[j] : arr[j] + ", ");
			}
			System.out.print("]");
			System.out.println();
			i++;
		}
		sc.close();
	}
}
