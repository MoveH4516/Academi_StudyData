package level5_test;

import java.util.Arrays;
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		
		
		/*
		[문제]
			아래 명령어를 선택할 때마다
			block 배열을 90도 회전시키시오.
			
			[1.left_turn] [2.right_turn]
			
			예)
				입력 : 1
				
				4 8 12 16
				3 7 11 15
				2 6 10 14
				1 5 9  13
		 */
		Scanner sc = new Scanner(System.in);
		
		int[][] block = {
				{ 1,  2,  3,  4},
				{ 5,  6,  7,  8},
				{ 9, 10, 11, 12},
				{13, 14, 15, 16},
		};
		int[][] copy = block;
		int size = block.length;
		int k = 0;
		int n = 0;
		while (true) {
			for (int i = 0; i < block.length; i++) {
				System.out.println(Arrays.toString(block[i]));
			}
			System.out.print("1. left 2. right 0. end");
			int sel = sc.nextInt();
			if (sel == 0) {
				break;
			}
			if (sel < 0 || sel > 2) {
				continue;
			}
			copy = block;
			block = new int[size][size];
			if (sel == 1) {
				k = 0;
				for (int j = 0; j < block.length; j++) {
					n = 0;
					for (int i = size - 1; i >= 0; i--) {
						block[i][j] = copy[k][n];
						n++;
					}
					k++;
				}
			} else if (sel == 2) {
				k = 0;
				for (int i = size - 1; i >= 0; i--) {
					n = 0;
					for (int j = 0; j < size; j++) {
						block[j][i] = copy[k][n];
						n++;
					}
					k++;
				}
			}
		}
		sc.close();
	}
}
