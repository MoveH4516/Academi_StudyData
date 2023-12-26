package 배열2문제;

import java.util.Scanner;

public class _문제22숫자이동 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. game 배열에 숫자 2는 플레이어이다.
		 	2. 플레이어는 좌(1), 우(2)로 이동이 가능하다.
		 	3. 단, 벽(숫자1)을 만나면 이동할 수 없다.
		 	4. 벽을 만나면 숫자9를 입력해 벽을 깰 수 있다.
		 	5. 좌, 우 끝에 벽을 만나면 더 이상 움직일 수 없다.
		 */
		Scanner sc = new Scanner(System.in);
		int[] game = { 0, 1, 0, 0, 2, 0, 0, 1, 1 };
		int pIdx = 4;
		int bk = 0;
		int position = 0;

		while (true) {
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 0) {
					System.out.print("_");
				} else if (game[i] == 2) {
					System.out.print("P");
				} else if (game[i] == 1) {
					System.out.print("벽");
				}
			}

			System.out.println();
			System.out.print("1.왼쪽 2.오른쪽");
			int num = sc.nextInt();
			if (num < 1 || num > 3) {
				System.out.println("1~3중에서 선택하세요.");
				continue;
			}
			if (num == 3) {
				System.out.println("종료");
				break;
			}
			game[pIdx] = 0;
			position = pIdx;
			if (num == 1) {
				if (pIdx > 0) {
					pIdx--;
				} else if (pIdx == 0) {
					pIdx = game.length - 1;
				}
			} else if (num == 2) {
				if (pIdx < game.length - 1) {
					pIdx++;
				} else if (pIdx == game.length - 1) {
					pIdx = 0;
				}
			}
			if (game[pIdx] == 1) {
				System.out.println("벽을 부수겠습니까?");
				bk = sc.nextInt();
				if (bk != 9) {
					System.out.println("벽을 부수지 않아 움직일 수 없습니다.");
					pIdx = position;
				}
				bk = 0;				
			}
			game[pIdx] = 2;
		}
		sc.close();
	}
}
