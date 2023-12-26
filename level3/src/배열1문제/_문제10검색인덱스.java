package 배열1문제;

import java.util.Scanner;

public class _문제10검색인덱스 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	인덱스를 입력받고 값을 출력
		 */
		Scanner sc = new Scanner(System.in);
		int[] array = {10, 543, 52, 24, 67};
		System.out.print("값 : ");
		int input = sc.nextInt();
		boolean run = true;
		for (int i = 0; i < array.length; i++) {
			if (input == i) {
				System.out.println(array[i]);
				run = false;
			}
		}
		if (run) {
			System.out.println("0~4의 값만 존재합니다.");
		}
		sc.close();
	}
}
