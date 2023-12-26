package 메서드문제;

import java.util.Scanner;

class TicTacToe {

	Scanner sc = new Scanner(System.in);
	String[][] game;
	int size = 3;
	int turn;
	int win;
	int cnt;
	void creatArr() {
		game = new String[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				game[i][j] = "";
			}
		}
	}
	
	void show() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (game[i][j].equals("")) {
					System.out.print("[ ]");
				} else if (game[i][j].equals("p1")) {
					System.out.print("[O]");
				} else {
					System.out.print("[X]");
				}
			}
			System.out.println();
		}
	}
	
	int getIdx (String msg) {
		int idx = 0;
		while (true) {
			System.out.println(msg);
			idx = sc.nextInt() - 1;
			if (idx < 0 || idx >= size) {
				System.out.println("입력 오류");
				continue;
			}
			break;
		}
		return idx;
	}
	
	int[] idxs() {
		int[] arr = new int[2];
		int idx1 = getIdx("인덱스값1 >>");
		int idx2 = getIdx("인덱스값2 >>");
		arr[0] = idx1;
		arr[1] = idx2;
		return arr;
	}
	
	int player() {
		if (turn % 2 == 0) {
			turn = 1;
		} else {
			turn = 2;
		}
		return turn;
	}
	
	void printPlayer() {
		player();
		System.out.println("player" + turn + "의 차례");
	}
	
	boolean check() {
		if (win == 1) {
			System.out.println("player1 승리");
		} else if (win == 2) {
			System.out.println("player2 승리");
		} else if (cnt == size * size) {
			System.out.println("무승부");
		} else {
			return false;
		}
		return true;
	}
	
	void playGame(int idx1, int idx2) {
		if (turn == 1) {
			game[idx1][idx2] = "p1";
		} else {
			game[idx1][idx2] = "p2";
		}
		cnt++;
	}
	
	boolean isValid(int idx1, int idx2) {
		if (game[idx1][idx2].equals("")) {
			return true;
		} else {
			System.out.println("이미 표시된 영역입니다.");
			return false;
		}
	}
	
	void endGaro() {
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i < size; i++) {
			cnt1 = 0;
			cnt2 = 0;
			for (int j = 0; j < size; j++) {
				if (game[i][j].equals("p1")) {
					cnt1++;
				} else if (game[i][j].equals("p2")) {
					cnt2++;
				}
			}
		}
		if (cnt1 == 3) {
			win = 1;
		} else if (cnt2 == 3) {
			win = 2;
		}
	}
	
	void endSero() {
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i < size; i++) {
			cnt1 = 0;
			cnt2 = 0;
			for (int j = 0; j < size; j++) {
				if (game[j][i].equals("p1")) {
					cnt1++;
				} else if (game[j][i].equals("p2")) {
					cnt2++;
				}
			}
		}
		if (cnt1 == 3) {
			win = 1;
		} else if (cnt2 == 3) {
			win = 2;
		}
	}
	
	void endCross1() {
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i < size; i++) {
			if (game[i][i].equals("p1")) {
				cnt1++;
			} else if (game[i][i].equals("p2")) {
				cnt2++;
			}
		}
		if (cnt1 == 3) {
			win = 1;
		} else if (cnt2 == 3) {
			win = 2;
		}
	}
	void endCross2() {
		int cnt1 = 0;
		int cnt2 = 0;
		int j = 0;
		for (int i = size - 1; i >= 0; i--, j++) {
			if (game[i][j].equals("p1")) {
				cnt1++;
			} else if (game[i][j].equals("p2")) {
				cnt2++;
			}
		}
		if (cnt1 == 3) {
			win = 1;
		} else if (cnt2 == 3) {
			win = 2;
		}
	}
	void run() {
		creatArr();
		while (true) {
			show();
			if (check()) {
				break;
			}
			printPlayer();
			while (true) {
				int[] idx = idxs();
				if (isValid(idx[0], idx[1])) {
					playGame(idx[0], idx[1]);
					break;
				}
			}
			System.out.println();
			endGaro();
			endSero();
			endCross1();
			endCross2();
		}
	}
	
}

public class _문제13메서드틱택토 {
	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();
		t.run();
		
	}
}
