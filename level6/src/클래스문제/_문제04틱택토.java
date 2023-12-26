package 클래스문제;

import java.util.Scanner;

class Tictactoe {
	int size = 3;
	String[][] game = new String[size][size];
	int turn = 0;
	int win = 0;
}

public class _문제04틱택토 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tictactoe t = new Tictactoe();
		for (int i = 0; i < t.size; i++) {
			for (int j = 0; j < t.size; j++) {
				t.game[i][j] = " ";
			}
		}
		boolean run = false;
		while (true) {
			for (int i = 0; i < t.size; i++) {
				for (int j = 0; j < t.size; j++) {
					if (t.game[i][j] == " ") {
						System.out.print("[ ]");
					} else if (t.game[i][j].equals("1")) {
						System.out.print("[X]");
					} else {
						System.out.print("[O]");
					}
				}
				System.out.println();
			}
			if (run) {
				break;
			}
			System.out.println(t.turn % 2 == 0 ? "p1의 차례 : " : "p2의 차례 : ");
			int idx1 = sc.nextInt() - 1;
			int idx2 = sc.nextInt() - 1;
			if (idx1 < 0 || idx2 < 0 || idx1 >= t.size || idx2 >= t.size || t.game[idx1][idx2] != " ") {
				continue;
			}
			t.game[idx1][idx2] = t.turn % 2 == 0 ? "1" : "2";
			
			int cnt1 = 0;
			int cnt2 = 0;
			int cnt3 = 0;
			int cnt4 = 0;
			int cnt5 = 0;
			int cnt6 = 0;
			int cnt7 = 0;
			int cnt8 = 0;
			for (int i = 0; i < t.size; i++) {
				cnt1 = 0;
				cnt2 = 0;
				for (int j = 0; j < t.size; j++) {
					if (t.game[i][j].equals("1")) {
						cnt1++;
					}
					if (t.game[i][j].equals("2")) {
						cnt2++;
					}
				}
				if (cnt3 == 1 || cnt4 == 2) {
					break;
				}
			}
			for (int i = 0; i < t.size; i++) {
				cnt3 = 0;
				cnt4 = 0;
				for (int j = 0; j < t.size; j++) {
					if (t.game[j][i].equals("1")) {
						cnt3++;
					}
					if (t.game[j][i].equals("2")) {
						cnt4++;
					}
				}
				if (cnt3 == 3 || cnt4 == 3) {
					break;
				}
			}
			int k = 0;
			for (int i = 0; i < t.size; i++, k++) {
				if (t.game[k][i].equals("1")) {
					cnt5++;
				}
				if (t.game[k][i].equals("2")) {
					cnt6++;
				}
			}
			k = t.size - 1;
			for (int i = 0; i < t.size; i++, k--) {
				if (t.game[i][k].equals("1")) {
					cnt7++;
				}
				if (t.game[i][k].equals("2")) {
					cnt8++;
				}
			}
			if (cnt1 == 3 || cnt3 == 3 || cnt5 == 3 || cnt7 == 3) {
				System.out.println("p1승리");
				run = true;
			}
			if (cnt2 == 3 || cnt4 == 3 || cnt6 == 3 || cnt8 == 3) {
				System.out.println("p2승리");
				run = true;
			}
			t.turn++;
		}
		sc.close();
	}
}
