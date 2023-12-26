package 배열심화문제3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제21경마게임 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	말 다섯 마리가 20개의 트랙을 달린다.
		 	매 회 랜덤으로 1~4칸의 거리를 이동할 수 있다.
		 	다섯 말이 모두 도착하면 게임 종료
		 	각 말들의 순위를 출력
		 	말이 동시에 도착하면 등수는 같다.
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int board = 20;
		int size = 5;
		int[][] game = new int[size][board];
		int[] rank = new int[size];
		for (int i = 0; i < size; i++) {
			game[i][0] = 1;
		}
		int[] idx = new int[size];	
		int ranking = 1;
		boolean run = false;
		System.out.print("2등할 말의 번호 : ");
		int num = sc.nextInt() - 1;
		while (true) {
			System.out.println("race");
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < board; j++) {
					if (game[i][j] == 0) {
						System.out.print("-");
					} else {
						System.out.print("말");
						if (game[i][board - 1] == 1) {
							System.out.printf("(%d)", rank[i]);
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
			if (run) {
				break;
			}
			while (true) {
				int cnt = 0;
				for(int i = 0; i < size; i++) {
					game[i][idx[i]] = 0;
					idx[i] += rd.nextInt(4) + 1;
					if (idx[i] >= board) {
						idx[i] = board - 1;
						game[i][idx[i]] = 1;
					}				
				}
				for (int i = 0; i < size; i++) {
					if (idx[num] < idx[i]) {
						cnt++;
					}
				}
				if (cnt == 1) {
					break;
				} else {
					
				}
			}
			System.out.println(Arrays.toString(idx));
			int cnt = 0;
			for (int i = 0; i < size; i++) {
				if (idx[i] == board - 1 && game[i][idx[i]] == 1) {
					if (rank[i] == 0) {
						rank[i] = ranking;
						cnt++;
					}
				}
			}
			 /*
			 1등 한 명 (2명이상 x)
			 선택된 말이 두 번째로 들어와야 한다. (중복포함)
			 
			 *선택된 말보다 말 한 마리만 앞서가도록 조건을 넣어주기*
			 
			 조건
			 움직일 때마다 넣어줘야 하는지 => 1등으로 달리다가 2등이 될 수도 있는데.
			 마지막에만 넣어줘야 하는지 => 선택한 말이 초반에 너무 뒤쳐지면 2등이 불가능.
			 
			 2등으로 들어오지 않는다면 처음부터 초기화 하고 다시 시작?? 너무 비효율, 억지
			 */
			ranking += cnt;
			for (int i = 0; i < size; i++) {
				if (game[i][board - 1] == 1) {
					run = true;
				} else {
					run = false;
					break;
				}
			}
		}
		sc.close();
	}
}
