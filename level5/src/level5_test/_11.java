package level5_test;

import java.util.Random;
import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		
		/*
		 * # 소코반
		 * 1. 캐릭터가 공을 움직여 골대에 넣으면 종료되는 게임이다.
		 * 2. 벽의 개수를 입력받아 벽을 설치한다.
		 * 3. 공과 골대 그리고 캐릭터의 위치 값을 랜덤으로 설치한다.
		 * 4. 벽(9), 공(3), 캐릭터(2) 그리고 골대(7)의 설치가 끝나면 본격적으로 게임이 시작된다.
		 * 5. 캐릭터튼 상하좌우로 이동이 가능해 이동하면서 공을 밀어내어 골대에 넣어야 한다.
		 * 6. 심화 할 수 있는 사람은 심화까지 하기 
		 * 0 0 0 0 0 0 0 
		 * 0 0 0 9 9 0 0 
		 * 0 0 0 0 0 0 9 
		 * 0 0 0 0 0 0 0  
		 * 0 0 2 3 7 9 0 
		 * 0 0 0 0 0 0 0  
		 * 9 0 0 0 0 0 0
		 * 
		 * 상(1)하(2)좌(3)우(4) 입력 : 4
		 * 
		 * 0 0 0 0 0 0 0 
		 * 0 0 0 9 9 0 0 
		 * 0 0 0 0 0 0 9 
		 * 0 0 0 0 0 0 0  
		 * 0 0 0 2 3 9 0 
		 * 0 0 0 0 0 0 0  
		 * 9 0 0 0 0 0 0
		 * 
		 * 게임종료
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[][] map = new int[7][7];
		int ball = rd.nextInt(3) + 1;
		System.out.println("공의 개수 : " + ball);
		int idx1 = 0;
		int idx2 = 0;
		int idxC1 = 0;
		int idxC2 = 0;
		for (int i = 0; i < ball;) {
			idx1 = rd.nextInt(5) + 1;
			idx2 = rd.nextInt(5) + 1;
			if (map[idx1][idx2] == 0) {
				map[idx1][idx2] = 3;
				i++;
			}
		}
		while (true) {
			idx1 = rd.nextInt(7);
			idx2 = rd.nextInt(7);
			if (map[idx1][idx2] == 0) {
				map[idx1][idx2] = 7;
				break;
			}
		}
		while (true) {
			idxC1 = rd.nextInt(7);
			idxC2 = rd.nextInt(7);
			if (map[idxC1][idxC2] == 0) {
				map[idxC1][idxC2] = 2;
				break;
			}
		}
		while (true) {
			System.out.print("벽의 개수(1~9) : ");
			int wall = sc.nextInt();
			if (wall < 0 || wall > 10) {
				continue;
			}
			for (int i = 0; i < wall;) {
				idx1 = rd.nextInt(7);
				idx2 = rd.nextInt(7);
				if (map[idx1][idx2] == 0) {
					map[idx1][idx2] = 9;
					i++;
				}
			}
			break;
		}
		idx1 = idxC1;
		idx2 = idxC2;
		int bidx1 = 0;
		int bidx2 = 0;
		int cnt = 0;
		while (true) {
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					if (map[i][j] == 0) {
						System.out.print("□ ");
					} else if (map[i][j] == 2) {
						System.out.print("♠ ");
					} else if (map[i][j] == 3) {
						System.out.print("● ");
					} else if (map[i][j] == 9) {
						System.out.print("■ ");
					} else {
						System.out.print("♡ ");
					}
				}
				System.out.println();
			}
			if (cnt == ball) {
				System.out.println("게임종료");
				break;
			}
			System.out.print("     ↑(4)\n");
			System.out.print("←(1) ↓(2) →(3)");
			int sel = sc.nextInt();
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
			if (idx1 < 0 || idx2 < 0 || idx1 >= 7 || idx2 >= 7 || map[idx1][idx2] == 9 || map[idx1][idx2] == 7) {
				idx1 = move1;
				idx2 = move2;
				continue;
			}
			if (map[idx1][idx2] == 3) {
				bidx1 = idx1;
				bidx2 = idx2;
				if (sel == 1) {
					bidx2--;
				} else if (sel == 2) {
					bidx1++;
				} else if (sel == 3) {
					bidx2++;
				} else if (sel == 4) {
					bidx1--;
				}
				if (bidx1 < 0 || bidx2 < 0 || bidx1 >= 7 || bidx2 >= 7 || map[bidx1][bidx2] == 9) {
					bidx1 = idx1;
					bidx2 = idx2;
					idx1 = move1;
					idx2 = move2;
					continue;
				}
				if (map[bidx1][bidx2] == 7) {
					map[bidx1][bidx2] = 7;
					cnt++;
				} else {
					map[bidx1][bidx2] = 3;
				}
			}
			map[idx1][idx2] = 2;
			map[move1][move2] = 0;
		}
		sc.close();
	}
}
