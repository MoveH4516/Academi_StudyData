package level5_test;

import java.util.Random;
import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		
		/*
		[문제]
			1. 10x10 배열을 생성한다.
			2. 스네이크는 1234로 표시한다.
			3. 머리는 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
			4. 자기 몸하고 부딪히면, 사망한다.
			5. 랜덤으로 아이템을 생성해
			   아이템을 먹으면 꼬리가 1개 자란다.
			6. 꼬리는 최대 8개까지 증가할 수 있다.
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[][] map = new int[10][10];
		
		int snakeSize = 4;
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 1; i <= 4; i++) {
			map[idx1][idx2] = i;
			idx2++;
		}
		for (int i = 0; i < 4;) {
			idx1 = rd.nextInt(10);
			idx2 = rd.nextInt(10);
			if (map[idx1][idx2] == 0) {
				map[idx1][idx2] = -1;
				i++;
			}
		}
		idx1 = 0;
		idx2 = 0;
		int cnt = 0;
		while (true) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (map[i][j] == 0) {
						System.out.print("□ ");
					} else if (map[i][j] == -1) {
						System.out.print("♠ ");
					} else if (map[i][j] == 1) {
						System.out.print("● ");
					} else {
						System.out.print("○ ");
					}
				}
				System.out.println();
			}
			if (cnt == 4) {
				System.out.println("아이템 모두 획득 게임종료");
				break;
			}
			System.out.print("     ↑(4)\n");
			System.out.print("←(1) ↓(2) →(3)");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 4) {
				System.out.println("입력오류");
				continue;
			}
			int move1 = idx1;
			int move2 = idx2;
			if (sel == 1) {
				idx2--;
			} else if (sel == 2) {
				idx1++;
			} else if (sel == 3) {
				idx2++;
			} else if (sel == 4) {
				idx1--;
			}
			if (idx1 < 0 || idx2 < 0 || idx1 >= 10 || idx2 >= 10) {
				idx1 = move1;
				idx2 = move2;
				continue;
			}
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (map[i][j] > 0) {
						map[i][j]++;
					}
				}
			}
			if (map[idx1][idx2] == 0) {
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (map[i][j] == snakeSize + 1) {
							map[i][j] = 0;
						}
					}
				}
			} else if (map[idx1][idx2] == -1) {
				snakeSize++;
				cnt++;
			} else {
				System.out.println("몸통박치기 사망 게임종료");
				break;
			}
			map[idx1][idx2] = 1;
		}
		sc.close();
	}
}
