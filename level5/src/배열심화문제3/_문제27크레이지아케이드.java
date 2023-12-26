package 배열심화문제3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제27크레이지아케이드 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	맵 크기는 7 * 7
		 	랜덤으로 7~14개의 벽을 설치하고 랜덤으로 플레이어 위치를 선정
		 	a d w s 로 이동가능 e 폭탄설치 q 폭파
		 	폭탄은 차례대로 터지며 폭파 시 십자가 형태로 터짐
		 	폭탄은 처음에 3개만 동시설치 가능 아이템 먹을시 +1
		 	벽 파괴시 랜덤하게 아이템이 생성.
		 	
		 	2단계 : 폭탄이 붙어있으면 폭파시 동시에 폭파
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		final int SIZE = 7;
		int[][] map = new int[SIZE][SIZE];
		int first = 3;
		int[][] copy = null;
		int count = rd.nextInt(8) + 7;
		int[][] bomb = new int[first + count][2];
		for (int i = 0; i < bomb.length; i++) {
			bomb[i][0] = -1;
			bomb[i][1] = -1;
		}
		int index1 = -1;
		int index2 = -1;
		int item = 0;
		int[][] items = new int[count][2];
		int bombCnt = 0;
		System.out.print("벽 개수(7~14) : ");
		int wall = sc.nextInt();
		int idx1 = 0;
		int idx2 = 0;
		boolean run = false;
		boolean run2 = false;
		while (true) {
			for (int i = 0; i < wall;) {
				idx1 = rd.nextInt(SIZE);
				idx2 = rd.nextInt(SIZE);
				if (map[idx1][idx2] == 0) {
					map[idx1][idx2] = 3;
					if (i < count) {
						items[i][0] = idx1;
						items[i][1] = idx2;
					}
					i++;
				}
			}			
			idx1 = 0;
			idx2 = 0;
			while (true) {
				idx1 = rd.nextInt(SIZE);
				idx2 = rd.nextInt(SIZE);
				if (map[idx1][idx2] == 0) {
					map[idx1][idx2] = 2;
					break;
				}
			}			
			break;
		}
		
		int idx = 0;
		while (true) {
			for (int i = 0; i < SIZE; i++) {
				for (int j =0; j < SIZE; j++) {
					if (map[i][j] == 0) {
						System.out.print("+ ");
					} else if (map[i][j] == 2) {
						System.out.print("♤ ");
					} else if (map[i][j] == 4) {
						System.out.print("♥ ");
					} else if (map[i][j] == 3){
						System.out.print("■ ");
					} else {
						System.out.print("◎ ");
					}
				}
				System.out.println();
			}
			if (idx == -1) {
				System.out.println("player is dead");
				break;
			}
			idx = 0;
			System.out.println("e 설치 q 폭파");
			System.out.print("a← d→ w↑ s↓  r 나가기 : ");
			sc.nextLine();
			String ctrl = sc.next();
			int move1 = idx1;
			int move2 = idx2;
			if (ctrl.equals("r")) {
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
			} else if (ctrl.equals("e")) {
				if (bombCnt >= first + item) {
					System.out.println("더이상 설치 불가");
					continue;
				}
				if (bombCnt > 0 && bomb[bombCnt - 1][0] == idx1 && bomb[bombCnt - 1][1] == idx2) {
					System.out.println("설치 불가");
					continue;
				}
				bomb[bombCnt][0] = idx1;
				bomb[bombCnt][1] = idx2;
				bombCnt++;
				copy = new int[bombCnt][];
				for (int i = 0; i < bombCnt; i++) {
					copy[i] = bomb[i];
				}
				System.out.println(Arrays.deepToString(copy));
			} else if (ctrl.equals("q")) {
				run = true;
			}else {
				System.out.println("입력오류");
			}
			if (idx1 < 0 || idx2 < 0 || idx1 >= SIZE || idx2 >= SIZE || map[idx1][idx2] == 3) {
				idx1 = move1;
				idx2 = move2;
				continue;
			}
			if (run) {
				if (bombCnt == 0) {
					run = false;
					continue;
				}
				bombCnt--;
				for (int i = -1; i <= 1; i++) {
					if (bomb[0][1] + i >= 0 && bomb[0][1] + i < SIZE) {
						if (map[bomb[0][0]][bomb[0][1] + i] == 2) {
							idx = -1;
						}
						if (map[bomb[0][0]][bomb[0][1] + i] == 3) {
							map[bomb[0][0]][bomb[0][1] + i] = 1;
						} else {
							if (map[bomb[0][0]][bomb[0][1] + i] != 2) {
								map[bomb[0][0]][bomb[0][1] + i] =0;
							}
						}
					}
					if (bomb[0][0] + i >= 0 && bomb[0][0] + i < SIZE) {
						if (map[bomb[0][0] + i][bomb[0][1]] == 2) {
							idx = -1;
						}
						if (map[bomb[0][0] + i][bomb[0][1]] == 3) {
							map[bomb[0][0] + i][bomb[0][1]] = 1;
						} else {
							if (map[bomb[0][0] + i][bomb[0][1]] != 2) {
								map[bomb[0][0] + i][bomb[0][1]] = 0;
							}
						}
					}
					for (int j = 0; j < items.length; j++) {
						if (map[items[j][0]][items[j][1]] == 1) {
							map[items[j][0]][items[j][1]] = 4;
							if (run2) {
								map[index1][index2] = 0;
								run2 = false;
							}
						} 
					}
				}
				run = false;
				for (int i = 0; i < bomb.length - 1; i++) {
					bomb[i] = bomb[i + 1];
				}
			}
			
			
			if (map[idx1][idx2] == 0) {
				map[idx1][idx2] = 2;
				map[move1][move2] = 0;
			}
			for (int i = 0; i < bombCnt; i++) {
				if (map[bomb[i][0]][bomb[i][1]] != 2) {
					map[bomb[i][0]][bomb[i][1]] = 9;
				}
			}
			if (map[idx1][idx2] == 4) {
				map[idx1][idx2] = 2;
				map[move1][move2] = 0;
				index1 = idx1;
				index2 = idx2;
				run2 = true;
				item++;
			}
			System.out.println(Arrays.deepToString(bomb));
			System.out.println(Arrays.deepToString(map));
		}
		sc.close();
	}
}