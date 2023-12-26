package 배열심화문제3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제23스네이크 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	10 * 10 배열
		 	스네이크는 1 2 3 4 5 ''' 로 표시
		 	머리는 상하좌우로 이동
		 	자기 몸과 부딪히면 사망
		 	랜덤으로 아이템을 생성(8개) 아이템을 먹으면 꼬리 1 증가
		 	아이템을 전부 먹으면 종료
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[10][10];
		int snakeSize = 4;
		int item = -1;
		for (int i = 0; i < snakeSize; i++) {
			map[0][i] = i + 1;
		}
		int cnt = 0;
		while (true) {
			int idx1 = rd.nextInt(10);
			int idx2 = rd.nextInt(10);
			if (map[idx1][idx2] == 0) {
				map[idx1][idx2] = item;
				cnt++;
			}
			if (cnt == 8) {
				break;
			}
		}
		int idx1 = 0;
		int idx2 = 0;
		while (true) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (map[i][j] == 0) {
						System.out.print("[ ]");
					} else if (map[i][j] == item) {
						System.out.print("[♠]");
					} else if (map[i][j] == 1) {
						System.out.print("[●]");
					} else {
						System.out.print("[○]");
					}
				}
				System.out.println();
			}
			System.out.print("     ↑(4)\n");
			System.out.print("←(1) ↓(2) →(3)");
			if (snakeSize == 4 + cnt) {
				System.out.println("아이템 전부 획득");
				break;
			}
			int move = sc.nextInt();
			if (move < 1 || move > 4) {
				System.out.println("입력 오류");
				continue;
			}
			int move1 = idx1;
			int move2 = idx2;
			if (move == 1) {
				idx2--;
			} else if (move == 2) {
				idx1++;
			} else if (move == 3) {
				idx2++;
			} else if (move == 4) {
				idx1--;
			}
			if (idx1 < 0 || idx2 < 0 || idx1 >= 10|| idx2 >= 10) {
				idx1 = move1;
				idx2 = move2;
				continue;
			}			
			if (map[idx1][idx2] != 0 && map[idx1][idx2] != -1) {
				System.out.println("사망");
				break;
			}
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (map[i][j] != 0 && map[i][j] != -1) {
						map[i][j]++;
					}
					if (map[idx1][idx2] == 0) {
						if (map[i][j] == snakeSize + 1) {
							map[i][j] = 0;
						}
					}
				}
			}
			if (map[idx1][idx2] == item) {
				snakeSize++;
			}
			map[idx1][idx2] = 1;
			
			for (int i = 0; i < 10; i++) {
				System.out.println(Arrays.toString(map[i]));
			}
			System.out.println(snakeSize);
		}
		sc.close();
		
	}
}
