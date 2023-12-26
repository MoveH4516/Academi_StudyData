package level3_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제09 {
	public static void main(String[] args) {
		/* 
		[문제]
		 * # 틱택토  => 잘 모르면 구글에 틱택토 검색해서 해보기, 무승부도 있음 
		 * === 틱택토 ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]인덱스 입력 : 6
		 * === 틱택토 ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]승리
		 * 
		 * 
		 * 걸린시간 : 58분51초88
		 */
		Scanner sc = new Scanner(System.in);
		int[] game = new int[9];
		boolean win1 = false;
		boolean win2 = false;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		int i = 0;
		while (true) {
			System.out.println("=== 틱택토 ===");
			for (int j = 0; j < game.length; j++) {
				if (game[j] == 0) {
					System.out.printf("[ ]");
				} else if (game[j] == 1) {
					System.out.printf("[O]");
				} else if (game[j] == 2) {
					System.out.printf("[X]");
				}
				if(j % 3 == 2) {
					System.out.println();
				}
			}
			if (win1) {
				System.out.println("p1의 승리");
				break;
			}
			if (win2) {
				System.out.println("p2의 승리");
				break;
			}
			if (i == game.length && !win1 && !win2) {
				System.out.println("무승부");
				break;
			}
			if (i % 2 == 0) {
				System.out.printf("[p1] 인덱스 입력 : ");
			} else {
				System.out.printf("[p2] 인덱스 입력 : ");
			}
			int idx = sc.nextInt();			
			if (idx < 0 || idx > 8) {
				System.out.println("인덱스 범위 오류");
				continue;
			}
			if (game[idx] != 0) {
				System.out.println("이미 입력된 값입니다.");
				continue;
			}
			if (i % 2 == 0) {
				game[idx] = 1;
			} else {
				game[idx] = 2;
			}
			for (int j = 0; j <=6; j += 3) {
				cnt1 = 0;
				cnt2 = 0;
				for (int k = j; k < j + 3; k++) {
					if (game[k] == 1) {
						cnt1++;
					} else if (game[k] == 2) {
						cnt2++;
					}
				}				
			}
			for (int j = 0; j < 3; j++) {
				cnt3 = 0;
				cnt4 = 0;
				for (int k = j; k < game.length; k += 3) {
					if (game[k] == 1) {
						cnt3++;
					} else if (game[k] == 2) {
						cnt4++;
					}
				}
			}
			if (cnt1 == 3 || cnt3 == 3) {
				win1 = true;
			}
			if (cnt2 == 3 || cnt4 == 3) {
				win2 = true;				
			}
			if (game[0] == 1 && game[4] == 1 && game[8] == 1) {
				win1 = true;
			}
			if (game[0] == 2 && game[4] == 2 && game[8] == 2) {
				win2 = true;
			}
			if (game[2] == 1 && game[4] == 1 && game[6] == 1) {
				win1 = true;
			}
			if (game[2] == 2 && game[4] == 2 && game[6] == 2) {
				win2 = true;
			}
			System.out.println(Arrays.toString(game));
			System.out.println(cnt1);
			i++;
		}
		sc.close();
	}
}
