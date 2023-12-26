package 클래스문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Game1to50{
	final int SIZE = 25;	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];	
	int gameNum; //전역변수 (new 클래스이름() => heap 메모리방에 생성 )
}

public class _문제05game1to50 {
	public static void main(String[] args) {
		/* 
		 * # 1 to 50
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 4. 숫자 1~25는 front 배열에 저장하고,
		 *    숫자 26~50은 back 배열에 저장한다.
		 */
		Game1to50 g = new Game1to50();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < g.SIZE; i++) {
			g.front[i] = i + 1;
			g.back[i] = g.SIZE + i + 1;
		}
		
		for (int i = 0; i < 500; i++) {
			int idx = rd.nextInt(25);
			int temp = g.front[0];
			g.front[0] = g.front[idx];
			g.front[idx] = temp;
			
			idx = rd.nextInt(25);
			temp = g.back[0];
			g.back[0] = g.back[idx];
			g.back[idx] = temp;
		}
		System.out.println(Arrays.toString(g.front));
		System.out.println(Arrays.toString(g.back));
		g.gameNum = 1;
		while (true) {
			for (int i = 0; i < g.SIZE; i += 5) {
				for (int j = i; j < i + 5; j++) {
					if (g.front[j] == 0) {
						System.out.print("[  ]");
					} else {
						System.out.printf("[%2d]", g.front[j]);
					}
				}
				System.out.println();
			}
			if (g.gameNum == 51) {
				System.out.println("게임 종료");
				break;
			}
			int idx2 = 0;
			for (int i = 0; i < g.SIZE; i++) {
				if (g.front[i] == g.gameNum) {
					idx2 = i;
				}
			}
			System.out.println("치트키 : " + idx2);
			System.out.print("인덱스 입력 : ");
			int idx = sc.nextInt();
			if (idx < 0 || idx > 24) {
				continue;
			}
			if (g.front[idx] == g.gameNum) {
				g.front[idx] = g.back[idx];
				g.back[idx] = 0;
				g.gameNum++;
			}
		}
		sc.close();
	}
}
