package 배열심화문제3;

import java.util.Scanner;

public class _문제08모두의마블 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 그림을 참고해 배열을 생성한다.
		 	2인용 게임으로 한 번씩 주사위를 던진다.
		 	주사위의 숫자만큼 이동하며, 3바퀴를 먼저 돌면 승리한다.
		 	외곽으로만 이동 가능하다.
		 */
		Scanner sc = new Scanner(System.in);
		int[][] map = {
				{1, 2, 3, 4, 5},
				{16, 0, 0, 0, 6},
				{15, 0, 0, 0, 7},
				{14, 0, 0, 0, 8},
				{13, 12, 11, 10, 9}
		};
		
		int p1 = 1;
		int p2 = 1;
		int goal1 = 0;
		int goal2 = 0;
		int dice = 0;
		int cnt = 0;
		while (true) {
			System.out.printf("p1 = %d(%d바퀴)\n", p1 - 1, goal1);
			System.out.printf("p2 = %d(%d바퀴)\n", p2 - 1, goal2);
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 0) {
						System.out.printf("%3s","■");
					} else {
						if (map[i][j] == p1 && p1 == p2) {
							System.out.printf("%3s","*");
						} else if (map[i][j] == p1) {
							System.out.printf("%3s","p1");
						} else if (map[i][j] == p2) {
							System.out.printf("%3s","p2");
						} else {
							System.out.printf("%3s","□");
						}
					}
				}
				System.out.println();
			}
			if (goal1 == 3) {
				System.out.println("p1 승리");
				break;
			}
			if (goal2 == 3) {
				System.out.println("p2 승리");
				break;
			}
			System.out.print("주사위 : ");
			dice = sc.nextInt();
			if (dice < 0 || dice > 6) {
				System.out.println("주사위 오류");
				continue;
			}
			if (cnt % 2 == 0) {
				p1 += dice;
				if (p1 > 16) {
					p1 -= 16;
					goal1++;
				}
			} else {
				p2 += dice;
				if (p2 > 16) {
					p2 -= 16;
					goal2++;
				}
			}		
			cnt++;
		}
		sc.close();
	}
}
