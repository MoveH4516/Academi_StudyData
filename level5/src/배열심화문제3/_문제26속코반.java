package 배열심화문제3;

import java.util.Random;
import java.util.Scanner;

public class _문제26속코반 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	캐릭터가 공을 밀어서 골대에 넣으면 종료되는 게임
		 	캐릭터는 상하좌우로 움직이며 벽을 만나면 움직일 수 없다.
		 	
		 	공의 개수는 1~3으로 랜덤
		 	공은 맨 끝 배열에 위치할 수 없다.(테두리 부분)
		 	벽은 15개 미만
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		final int SIZE = 9;
		
		int[][] map = new int[SIZE][SIZE];
		System.out.print("벽 개수 : ");
		int wall = sc.nextInt();
		int idx1 = 0;
		int idx2 = 0;
		map[4][4] = 2;
		int ball = 0;
		while (true) {
			for (int i = 0; i < wall;) {
				idx1 = rd.nextInt(SIZE);
				idx2 = rd.nextInt(SIZE);
				if (map[idx1][idx2] == 0) {
					map[idx1][idx2] = 9;
					i++;
				}
			}
			ball = rd.nextInt(3) + 1;
			System.out.println("공의 개수 : " + ball + "개");
			for (int i = 0; i < ball;) {
				idx1 = rd.nextInt(SIZE - 2) + 1;
				idx2 = rd.nextInt(SIZE - 2) + 1;
				if (map[idx1][idx2] == 0) {
					map[idx1][idx2] = 3;
					i++;
				}
			}
			idx1 = 0;
			idx2 = 0;
			while (true) {
				idx1 = rd.nextInt(SIZE);
				idx2 = rd.nextInt(SIZE);
				if (map[idx1][idx2] == 0) {
					map[idx1][idx2] = 7;
					break;
				}
			}			
			break;
		}
		idx1 = 4;
		idx2 = 4;
		int cnt = 0;
		while (true) {
			System.out.println("--------game--------");
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == 0) {
						System.out.print("+ ");
					} else if (map[i][j] == 2) {
						System.out.print("♤ ");
					} else if (map[i][j] == 3) {
						System.out.print("● ");
					} else if (map[i][j] == 9){
						System.out.print("■ ");
					} else {
						System.out.print("♣ ");
					}
				}
				System.out.println();
			}
			if (ball == cnt) {
				System.out.println("게임 종료");
				break;
			}
			System.out.print("a← d→ w↑ s↓  q 나가기 : ");
			sc.nextLine();
			String ctrl = sc.next();
			int move1 = idx1;
			int move2 = idx2;
			if (ctrl.equals("q")) {
				System.out.println("나가기");
				break;
			} else if (ctrl.equals("a")) {
				idx2--;
			} else if (ctrl.equals("d")) {
				idx2++;
			} else if (ctrl.equals("w")) {
				idx1--;
			} else if (ctrl.equals("s")) {
				idx1++;
			} else {
				System.out.println("입력오류");
			}
			if (idx1 < 0 || idx2 < 0 || idx1 >= SIZE || idx2 >= SIZE || map[idx1][idx2] == 7 || map[idx1][idx2] == 9) {
				idx1 = move1;
				idx2 = move2;
				continue;
			}
			if (map[idx1][idx2] == 0) {
				map[idx1][idx2] = 2;
				map[move1][move2] = 0;
			}
			if (map[idx1][idx2] == 3) {
				int bidx1 = idx1;
				int bidx2 = idx2;
				int bmove1 = bidx1;
				int bmove2 = bidx2;
				if (ctrl.equals("a")) {
					bidx2--;
				} else if (ctrl.equals("d")) {
					bidx2++;
				} else if (ctrl.equals("w")) {
					bidx1--;
				} else if (ctrl.equals("s")) {
					bidx1++;
				}
				if (bidx1 < 0 || bidx2 < 0 || bidx1 >= SIZE || bidx2 >= SIZE || map[bidx1][bidx2] == 9 || map[bidx1][bidx2] == 3) {
					idx1 = move1;
					idx2 = move2;
					bidx1 = bmove1;
					bidx2 = bmove2;
					continue;
				}
				if (map[bidx1][bidx2] == 7) {
					map[bidx1][bidx2] = 7;
					cnt++;
				} else {
					map[bidx1][bidx2] = 3;
				}
				map[idx1][idx2] = 2;
				map[move1][move2] = 0;
			}
			
		}
		sc.close();
	}
}
