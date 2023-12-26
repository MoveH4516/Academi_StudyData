package 메서드문제;

import java.util.Random;
import java.util.Scanner;

class WordGame{
	
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
	String[] wordList = {"java", "spring", "jsp", "android", "php"};
	String[] myWord = new String[wordList.length];
	boolean[] checkList;
	int count;
	
	void set() {
		checkList = new boolean[wordList.length];
		System.out.println("타자연습게임");
		System.out.println("1)게임 0)종료");
	}
	
	int[] idx () {
		int[] arr = new int[wordList.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(arr.length);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}
	
	void play() {
		int[] idx = idx();
		for (int i = 0; i < wordList.length; i++) {
			String data = "";
			int num = rd.nextInt(wordList[idx[i]].length());
			for (int j = 0; j < wordList[idx[i]].length(); j++) {
				if (j != num) {
					data += wordList[idx[i]].charAt(j);
				} else {
					data += "*";
				}
			}
			System.out.println(i + 1 + ") " + data + "의 단어를 맞춰보세요");
			String answer = sc.next();
			count++;
			myWord[i] = answer;
			if (answer.equals(wordList[idx[i]])) {
				checkList[i] = true;
			}
		}
		
	}
	
	int getIdx(String msg, int start, int end) {
		int idx = 0;
		while (true) {
			System.out.println(msg);
			idx = sc.nextInt();
			if (idx < start || idx > end) {
				continue;
			}
			break;
		}
		return idx;
	}
	
	void choice (int idx) {
		if (idx == 1) {
			play();
		}
	}
	
	void result() {
		if (count != 5) {
			return;
		}
		System.out.println("----------------------");
		System.out.print("정답 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print("\t" + wordList[i]);
		}
		System.out.println();
		System.out.print("내답 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print("\t" + myWord[i]);
		}
		System.out.println();
		System.out.print("정오표 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print("\t" + checkList[i]);
		}
		System.out.println();
		System.out.println("----------------------");
		System.out.println("-- Game Over --");
		System.out.println("[1]종료 [2]다시하기");
	}
	
	void run () {
		while (true) {
			set();
			int idx = getIdx("메뉴 선택 >> ", 0, 1);
			choice(idx);
			if (idx == 0) {
				System.out.println("종료");
				break;
			}
			result();
			int idx2 = getIdx("메뉴 선택 >> ", 1, 2);
			if (idx2 == 1) {
				System.out.println("종료");
				break;
			}
		}
	}
}

public class _문제15메서드타자게임 {
	public static void main(String[] args) {
		
		WordGame word = new WordGame();
		
		word.run();
		
	}
}
