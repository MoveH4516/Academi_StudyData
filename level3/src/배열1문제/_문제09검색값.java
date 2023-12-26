package 배열1문제;

import java.util.Scanner;

public class _문제09검색값 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	값을입력받고 인덱스를 출력하시오.
	 	 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = {10, 543, 52, 24, 67};
		System.out.print("값 : ");
		int num = sc.nextInt();
		boolean run = true;
		for(int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				System.out.println(i);
				run = false;
			}
		}
		if (run) {
			System.out.println(-1);
		}
		sc.close();
	}
}
