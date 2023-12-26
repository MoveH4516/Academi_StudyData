package 메서드문제;

import java.util.Scanner;

class NumberGame {
	Scanner sc = new Scanner(System.in);
	int[] move = {1, 1, 0, 0, 8, 0, 1, 0, 0, 1};
	int pIdx = 4;
	int pIdxx;
	void showGame() {
		for (int i = 0; i < move.length; i++) {
			if (move[i] == 0) {
				System.out.print("_");
			} else if (move[i] == 1) {
				System.out.print("|");
			} else {
				System.out.print("@");
			}
		}
		System.out.println();
	}
	
	int getSel () {
		int num = 0;
		while(true) {
			num = sc.nextInt();
			if (num < 0 || num > 2) {
				System.out.println("0~2 사이의 숫자 입력");
				continue;
			}
			break;
		}
		return num;
	}
	void showMenu() {
		System.out.println("1. 왼쪽 2. 오른쪽");
		System.out.println("0. 종료");
	}
	
	void goLeft () {
		pIdxx = pIdx;
		if (pIdx == 0) {
			pIdx = move.length - 1;
		} else {
			pIdx--;
		}
		if (move[pIdx] == 1) {
			selectBreak();
		} else {
			move[pIdx] = 8;
			move[pIdxx] = 0;
		}
	}
	
	void goRight () {
		pIdxx = pIdx;
		if (pIdx == move.length - 1) {
			pIdx = 0;
		} else {
			pIdx++;
		}
		if (move[pIdx] == 1) {
			selectBreak();
		} else {
			move[pIdx] = 8;
			move[pIdxx] = 0;
		}
	}
	
	void selectBreak() {
		while (true) {
			System.out.println("벽을 부수겠습니까? (1. yes 2. no)");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 2) {
				System.out.println("입력값 오류");
				continue;
			}
			if (sel == 1) {
				move[pIdx] = 8;
				move[pIdxx] = 0;
			} else {
				pIdx = pIdxx;
			}
			break;
		}
	}
	
	void run() {
		while (true) {
			showGame();
			showMenu();
			int sel = getSel();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				goLeft();
			} else if (sel == 2) {
				goRight();
			}
		}
	}
}

public class _문제11메서드숫자이름 {
	public static void main(String[] args) {
		NumberGame n = new NumberGame();
		n.run();
	}
}
