package 클래스배열문제;

import java.util.Scanner;

class Tic {
	//네모 한 줄
	int[] line = new int[3];
}

class Tictactoe {
	Scanner sc = new Scanner(System.in);
	Tic[] tics;
	int size = 3;
	int turn;
	
	void init () {
		tics = new Tic[size];
		for (int i = 0; i < size; i++) {
			tics[i] = new Tic();
		}
	}
	
	void show () {
		turn();
		System.out.println("p" + turn + "의 차례");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < tics[i].line.length; j++) {
				if (tics[i].line[j] == 0) {
					System.out.print("[ ]");
				} else if (tics[i].line[j] == 1) {
					System.out.print("[O]");
				} else {
					System.out.print("[X]");
				}
			}
			System.out.println();
		}
	}
	
	int getIdx() {
		int idx = 0;
		while (true) {
			idx = sc.nextInt() - 1;
			if (idx < 0 || idx >= size) {
				continue;
			}
			break;
		}
		return idx;
	}
	
	void play() {
		System.out.println("인덱스 선택1 >> ");
		int idx1 = getIdx();
		System.out.println("인덱스 선택2 >> ");
		int idx2 = getIdx();
		
		if (turn == 1) {
			tics[idx1].line[idx2] = 1;
		} else {
			tics[idx1].line[idx2] = 2;
		}
		
	}
	
	void turn() {
		if (turn % 2 == 0) {
			turn = 1;
		} else {
			turn = 2;
		}
	}
	
	void run() {
		init();
		while (true) {
			show();
			play();
		}
	}
}

public class _문제07클래스배열틱택토 {
	public static void main(String[] args) {
		
		Tictactoe t = new Tictactoe();
		
		t.run();
		
	}
}
