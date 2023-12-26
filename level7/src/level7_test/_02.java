package level7_test;

import java.util.Random;

class Horse {
	String name = "";
	int pos = 0;
	int rank = 0;
	boolean win = false;
}

class Racing {
	Random rd = new Random();
	int size = 4;
	Horse[] horses = new Horse[size];	
	int line = 20;
	int track [][] = new int[size][line];
	int[] idx = new int[size];
	
	void init() {
		for (int i = 0; i < size; i++) {
			track[i][0] = 1;
		}
		for (int i = 0; i < size; i++) {
			horses[i] = new Horse();
			horses[i].name = (char)(97 + i) + "";
		}
	}
	
	void play() {
		track = new int[size][line];
		for (int i = 0; i < size; i++) {
			idx[i] += rd.nextInt(4) + 1;
			if (idx[i] >= line) {
				idx[i] = line - 1;
			}
			track[i][idx[i]] = 1;
		}
	}
	
	void show() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < line; j++) {
				if (track[i][j] == 0) {
					System.out.print("[ ]");
				} else {
					System.out.print("[" + horses[i].name + "]");
					if (track[i][line - 1] != 0) {
						System.out.print("(" + horses[i].rank + "등)");
					}
				}
			}
			System.out.println();
		}
	}
	
	int cnt = 0;
	boolean check() {
		cnt = 0;
		for (int i = 0; i < size; i++) {
			if (track[i][line - 1] != 0) {
				cnt++;
			}
		}
		if (cnt == 4) {
			return true;
		} else {
			return false;
		}
	}
	
	void rank() {
		int ranking = 1;
		for (int i = 0; i < size; i++) {
			ranking = 1 + cnt;
			if (track[i][line - 1] != 0 && horses[i].rank == 0) {
				horses[i].rank = ranking;
			}
		}
	}
	
	void run() {
		init();
		while(true) {
			show();
			System.out.println();
			if (check()) {
				break;
			}
			play();
			rank();
		}
	}
}

public class _02 {
	public static void main(String[] args) {
		
		Racing game = new Racing();
		game.run();
	}
}
