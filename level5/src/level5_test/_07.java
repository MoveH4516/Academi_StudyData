package level5_test;

import java.util.Random;

public class _07 {
	public static void main(String[] args) {
		
		/*
		[문제]
			말 다섯 마리가 20개의 트랙을 달린다.
			매 회 랜덤으로 1~4칸의 거리를 이동할 수 있다.
			다섯 말이 모두 도착하면 게임은 끝난다.
			각 말들의 순위를 출력하시오.
			단, 말이 동시에 도착하면 등수는 같다.
		 */
		Random rd = new Random();
		int[][] horse = new int[5][20];
		for (int i = 0; i < 5; i++) {
			horse[i][0] = 1;
		}
		int[] move = new int[5];
		int[] rank = new int[5];
		int count = 0;
		int cnt = 0;
		while (true) {
			System.out.println("RACE");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 20; j++) {
					if (horse[i][j] == 0) {
						System.out.print("_");
					} else {
						System.out.print("말");
						if (j == 19) {
							System.out.printf("(" + rank[i] + "등)");
						}
					}
					
				}
				System.out.println();
			}
	        try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			if (cnt == 5) {
				break;
			}
			for (int i = 0; i < 5; i++) {
				horse[i][move[i]] = 0;
				move[i] += rd.nextInt(4) + 1;
				if (move[i] > 19) {
					move[i] = 19;
				}
				horse[i][move[i]] = 1;
			}
			count = cnt;
			cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (move[i] == 19) {
					if (rank[i] == 0) {
						rank[i] = 1 + count;
					}
					cnt++;
				}
			}
		}
		
	}
}
