package level7_test;

import java.util.Random;
import java.util.Scanner;

class Word {
	String word;
	int ranPos;
}

class WordDAO {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	boolean[] checkList;
	Word[] list;

	void init() {
		String[] simple = { "java", "jsp", "python", "android", "spring"};
		list = new Word[simple.length];
		int idx = 0;
		for (int i = 0; i < list.length; i++) {
			idx = ran.nextInt(list.length);
			list[i] = new Word();
			list[i].word = simple[idx];
			for (int j = 0; j < i; j++) {
				if (list[j].word.equals(list[i].word)) {
					i--;
					break;
				}
			}
		}
	}
	
	void quiz(Word list) {
		String s = "";
		int idx = ran.nextInt(list.word.length());
		for (int i = 0; i < list.word.length(); i++) {
			if (i == idx) {
				s += "*";
			} else {
				s += list.word.charAt(i);
			}
		}
		System.out.println(s + "를 맞춰주세요.");
	}
	String play() {
		String answer = sc.next();
		return answer;
	}
	boolean check(String answer, Word list) {
		if (answer.equals(list.word)) {
			return true;
		} else {
			return false;
		}
	}
	
	void run() {
		init();
		for (int i = 0; i < list.length; i++) {
			quiz(list[i]);
			String answer = play();
			if (check(answer, list[i])) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
			}
		}
	}
}

public class _03 {
	public static void main(String[] args) {

		WordDAO dao = new WordDAO();
		dao.run();
	}
}
