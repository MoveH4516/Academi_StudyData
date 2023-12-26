package 배열심화문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _문제12숫자이동되감기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1)left 2)right 3)up 4)down 5)되감기
		 	
		 	0이 플레이어
		 	번호를 입력받고 해당 위치로 이동
		 	
		 	ex) 1 => left
		 */
		Scanner sc = new Scanner(System.in);
		int[][] game = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 0},
		};
		int[][] move = new int[10000][2]; // 플레이어 좌표 기록 y, x
		
		int x = 3;
		int y = 3;
		move[0][0] = y;
		move[0][1] = x;
		int i = 0;
		while (true) {
			System.out.print("방향 : ");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 6) {
				System.out.println("범위 오류");
				continue;
			}
			if (sel == 6) {
				System.out.println("종료");
				break;
			} else if (sel == 1) {
				y--;
			} else if (sel == 2) {
				y++;
			} else if (sel == 3) {
				x--;
			} else if (sel == 4) {
				x++;
			} else if (sel == 5) {
				if (i == 0) {
					System.out.println("처음엔 되감기를 할 수 없습니다.");
					continue;
				}
				x = move[i - 1][1];
				y = move[i - 1][0];
			}
			if (x < 0 || x >= game.length || y < 0 || y >= game.length) {
				System.out.println("그쪽으로는 이동할 수 없습니다.");
				x = move[i][1];
				y = move[i][0];
				continue;				
			}
			if (sel != 5) {
				i++;
			} else {
				i--;
			}
			move[i][0] = y;
			move[i][1] = x;
			game[move[i - 1][1]][move[i - 1][0]] = game[move[i][1]][move[i][0]];
			game[move[i][1]][move[i][0]] = 0;
			for (int j = 0; j < game.length; j++) {
				System.out.println(Arrays.toString(game[j]));
			}
			
		}
		sc.close();
	}
}
