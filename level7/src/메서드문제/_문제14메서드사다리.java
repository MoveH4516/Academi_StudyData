package 메서드문제;

import java.util.Scanner;

class GameLadder {
	Scanner sc = new Scanner(System.in);
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
	
	int size = 5;
	String[] menu;
	
	void setMenu() {
		menu = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.print(i + 1 + "번 메뉴 : ");
			menu[i] = sc.next();
			for (int j = 0; j < i; j++) {
				if (menu[i].equals(menu[j])) {
					System.out.println("중복 메뉴 설정 불가");
					i--;
					break;
				}
			}
		}
	}
	//System.out.print(" │ ");
	//System.out.print(" ├─");
	//System.out.print("─┤ ");
	void showLadder(int sel) {
		
		System.out.println(" 1  2  3  4  5");
		for (int i = 0; i < ladder.length; i++) {
			if (ladder[i][sel] == 0) {
				ladder[i][sel] = 2;
			}
			if (ladder[i][sel] == 1) {
				if (sel + 1 < size && ladder[i][sel + 1] == 1) {
					ladder[i][sel] = 2;
					ladder[i][++sel] = 2;
				} else if (sel > 0 && ladder[i][sel - 1] == 1) {
					ladder[i][sel] = 2;
					ladder[i][--sel] = 2;
				}
			}
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) {
					System.out.print(" │ ");
				} else if (ladder[i][j] == 1) {
					if (j + 1 < size && ladder[i][j + 1] == 1) {
						System.out.print(" ├─");
					} else if (j > 0 && ladder[i][j - 1] == 1) {
						System.out.print("─┤ ");
					}
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		printMenu();
	}
	
	void printMenu() {
		int max = 0;
		for (int i = 0; i < size; i++) {
			if (max < menu[i].length()) {
				max = menu[i].length();
			}
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < size; j++) {
				if (menu[j].length() > i) {
					System.out.print(menu[j].charAt(i) + "  ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
	
	int getSel() {
		int idx = 0;
		while (true) {
			System.out.print("번호 입력 : ");
			idx = sc.nextInt() - 1;
			if (idx < 0 || idx >= size) {
				System.out.println("1~5숫자 입력");
				continue;
			}
			break;
		}
		return idx;
	}
	
	void run() {
		setMenu();
		int sel = getSel();
		showLadder(sel);
	}
}

public class _문제14메서드사다리 {
	public static void main(String[] args) {
		
		GameLadder game = new GameLadder();
		game.run();
		
	}
}
