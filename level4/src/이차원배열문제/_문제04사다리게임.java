package 이차원배열문제;

import java.util.Scanner;

public class _문제04사다리게임 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 인덱스 0~4를 하나 선택
		 	2. 숫자 0 을 만나면 그냥 아래로
		 	3. 숫자 1을 만나면 오른쪽으로 이동 후 아래로
		 	4. 숫자 2를 만나면 왼쪽으로 이동 후 아래로
		 	5. 오늘의 메유 출력
		 */
		//System.out.print(" │ ");
		//System.out.print(" ├─");
        //System.out.print("─┤ "); 
		Scanner sc = new Scanner(System.in);
		String[] menu = {"떡라면", "돈까스", "치킨", "쫄면", "된장찌개"};
		
		int[][] ladder = {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,0,0},
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}
		};

		int i = 0;
		int j = 0;
		System.out.print("0~4 선택 : ");
		int sel = sc.nextInt();
		System.out.println("(0)(1)(2)(3)(4)");
		for (i = 0; i < ladder.length; i++) {
			for (j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) {
					if (sel == j) {
						System.out.print(" * ");
					} else {
						System.out.print(" │ ");						
					}
				} else if (ladder[i][j] == 1) {
					if (sel == j) {
						System.out.print(" * ");
						sel++;
					} else if (sel == j + 1) {
						System.out.print(" * ");
						sel--;
					} else {
						System.out.print(" ├─");											
					}
				} else if (ladder[i][j] == 2) {
					if (sel == j) {
						System.out.print(" * ");
					} else if (sel == j - 1) {
						System.out.print(" * ");
					} else {
						System.out.print("─┤ ");										
					}
				}
			}
			System.out.println();
		}
		String str = "";
		for (int k = 0; k < menu.length; k++) {
			str += menu[k].charAt(0) + "  ";
		}
		System.out.println(str);
	}
}
