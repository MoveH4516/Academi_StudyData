package 메서드문제;

import java.util.Arrays;
import java.util.Random;

class Omr {
	Random rd = new Random();
	int[] answer = {1, 3, 4, 2, 5};
	int[] ans = new int[5];
	boolean[] check = new boolean[5];
	String[] mark = new String[5];
	int score;
	void printAnswer() {
		System.out.println(Arrays.toString(answer));
	}
	void printRdAnswer () {
		for (int i = 0; i < ans.length; i++) {
			ans[i] = rd.nextInt(5) + 1;
		}
		System.out.println(Arrays.toString(ans));
	}
	void printCheck() {
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == ans[i]) {
				check[i] = true;
			}
			if (check[i]) {
				mark[i] = "O";
				score += 20;
			} else {
				mark[i] = "X";
			}
		}
		System.out.println(Arrays.toString(mark));
		System.out.println("성적 : " + score);
	}
}

public class _문제03메서드OMR {
	public static void main(String[] args) {
		
		Omr o = new Omr();
		o.printAnswer();
		o.printRdAnswer();
		o.printCheck();
		
	}
}
