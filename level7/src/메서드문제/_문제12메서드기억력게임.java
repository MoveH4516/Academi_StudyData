package 메서드문제;

import java.util.Random;
import java.util.Scanner;

class MemoryGame {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	String[] front;
	String[] back = {"!", "!", "@", "@", "#", "#", "$", "$", "%", "%"};
	final int SIZE = 10;
	int cnt;
	
	void inputArr() {
		front = new String[SIZE];
		for (int i = 0; i < 500; i++) {
			int idx = rd.nextInt(SIZE);
			String temp = back[idx];
			back[idx] = back[0];
			back[0] = temp;
		}
	}
	
	void showFirst() {
		for (int i = 1; i <= SIZE; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			System.out.print(back[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			if (front[i] == null) {
				System.out.print("[]\t");
			}
		}
		System.out.println();
	}
	
	int getIdx1 () {
		int idx = 0;
		while (true) {
			System.out.print("인덱스값1 입력 : ");
			idx = sc.nextInt() - 1;
			if (idx < 0 || idx > SIZE) {
				System.out.println("입력 범위 오류");
				continue;
			}
			if (front[idx] != null) {
				System.out.println("이미 오픈된 카드");
				continue;
			}
			break;
		}
		return idx;
	}
	int getIdx2 () {
		int idx = 0;
		while (true) {
			System.out.print("인덱스값2 입력 : ");
			idx = sc.nextInt() - 1;
			if (idx < 0 || idx > SIZE) {
				System.out.println("입력 범위 오류");
				continue;
			}
			if (front[idx] != null) {
				System.out.println("이미 오픈된 카드");
				continue;
			}
			break;
		}
		return idx;
	}
	
	void open(int idx1, int idx2) {
			front[idx1] = back[idx1];
			front[idx2] = back[idx2];
	}
	
	void show() {
		for (int i = 0; i < SIZE; i++) {
			if (front[i] == null) {
				System.out.print("[]\t");
			} else {
				System.out.print(front[i] + "\t");
			}
		}
		System.out.println();
	}
	
	void check(int idx1, int idx2) {
		if (front[idx1].equals(front[idx2])) {
			cnt++;
		} else {
			front[idx1] = null;
			front[idx2] = null;
		}
	}
	
	void run() {
		inputArr();
		showFirst();
		while (true) {
			int idx1 = getIdx1();
			int idx2 = getIdx2();
			if (idx1 == idx2) {
				System.out.println("동일 카드 선택 불가");
				continue;
			}
			open(idx1,idx2);
			show();
			check(idx1, idx2);
			if (cnt == SIZE / 2) {
				System.out.println("게임종료");
				break;
			}
		}
	}
	
}

public class _문제12메서드기억력게임 {
	public static void main(String[] args) {
		
		MemoryGame m = new MemoryGame();
		m.run();
		
	}
}
