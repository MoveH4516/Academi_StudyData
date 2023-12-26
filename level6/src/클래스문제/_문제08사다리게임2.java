package 클래스문제;

import java.util.Scanner;

class LadderGame {
	int[][] ladder = {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}
	};
	
	int x = 0;
	int y = 0;
	String[] menu = {"떡볶", "편의점", "마라탕", "김밥", "만두"};
}

public class _문제08사다리게임2 {
	public static void main(String[] args) {
		//System.out.print(" │ ");
		//System.out.print(" ├─");
		//System.out.print("─┤ ");
		LadderGame g = new LadderGame();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 선택(1~5) : ");
		int sel = sc.nextInt() - 1;
		
		System.out.println(" 1  2  3  4  5");
		for (int i = 0; i < g.ladder.length; i++) {
			for (int j = 0; j < g.ladder[i].length; j++) {
				if (g.ladder[i][j] == 0) {
					if (sel == j) {
						System.out.print(" * ");
					} else {
						System.out.print(" │ ");
					}
				} else if (g.ladder[i][j] == 1) {
					if (j < g.ladder[i].length - 1 && g.ladder[i][j + 1] == 1) {
						if (sel == j) {
							System.out.print(" * ");
							sel++;
						} else if (sel == j + 1) {
							System.out.print(" * ");
							sel--;
						} else {
							System.out.print(" ├─");
						}
					} else {
						if (sel == j) {
							System.out.print(" * ");
						} else if (sel == j - 1) {
							System.out.print(" * ");
						} else {
						System.out.print("─┤ ");
						}
					}
				}
			}
			System.out.println();
		}
		int idx = 0;
		for (int j = 0; j < g.menu[idx].length(); j++) {
			for (int i = 0; i < g.menu.length; i++) {
				if (g.menu[i].length() > j) {
					System.out.printf("%s  ", g.menu[i].charAt(j));
				} else {
					System.out.printf("%3s", " ");
				}
			}
			System.out.println();
			idx++;
		}
		sc.close();
	}
}
