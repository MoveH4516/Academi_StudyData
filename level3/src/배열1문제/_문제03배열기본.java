package 배열1문제;

import java.util.Scanner;

public class _문제03배열기본 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	인덱스를 입력받고,
		 	그 인덱스보다 작은 인덱스의 값만 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = {10, 20, 30, 40, 50};
		System.out.print("인덱스 : ");
		int index = sc.nextInt();
		
		for (int i = 0; i < 5; i++) {
			if (i < index) {
				System.out.println(array[i]);
			}
		}
		sc.close();
	}
}
