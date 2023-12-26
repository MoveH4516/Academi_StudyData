package 배열심화문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _문제20회전 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 블록 배열을 1 누르면 왼쪽으로 회전, 2 누르면 오른쪽으로 회전
		 */
		Scanner sc = new Scanner(System.in);
		int[][] block = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		for (int i = 0; i < block.length; i++) {
			System.out.println(Arrays.toString(block[i]));
		}
		int rest = 1;
		while (true) {
			System.out.printf("1.left 2.right : ");
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			if (input == 1) {
				rest++;
			} else {
				rest--;
			}
			if (rest == -1) {
				rest = 3;
			}
			int i = 1;
			if (rest % 4 == 1) {
				for (int j = 0; j < block.length; j++) {
					for (int k = 0; k < block[j].length; k++) {
						block[j][k] = i;
						i++;
					}
				}
			} else if (rest % 4 == 2) {
				for (int j = 0; j < block.length; j++) {
					for (int k = block[j].length - 1; k >= 0; k--) {
						block[k][j] = i;
						i++;
					}
				}
			} else if (rest % 4 == 3) {
				for (int j = block.length - 1; j >= 0; j--) {
					for (int k = block[j].length - 1; k >= 0; k--) {
						block[j][k] = i;
						i++;
					}
				}
			} else if (rest % 4 == 0) {
				for (int j = block.length - 1; j >= 0; j--) {
					for (int k = 0; k < block[j].length; k++) {
						block[k][j] = i;
						i++;
					}
				}
			}
			for (int j = 0; j < block.length; j++) {
				System.out.println(Arrays.toString(block[j]));
			}
		}
		sc.close();
	}
}
