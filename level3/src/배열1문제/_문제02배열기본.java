package 배열1문제;

import java.util.Scanner;

public class _문제02배열기본 {
	public static void main(String[] args) {
		/*
		 [문제]
		 	숫자 한 개를 입력받고,
		 	배열 안에서 그 숫자보다 작은 값만 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int[] array = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < 5; i++) {
			if (array[i] < num) {
				System.out.println(array[i]);
			}
		}
		sc.close();
	}
}
