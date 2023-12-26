package 클래스문제;

import java.util.Arrays;
import java.util.Random;

class OMR {
	int[] answer = {1, 3, 4, 2, 5};
	int[] hgd = new int[5];
	int cnt = 0;
	int score = 0;
}

public class _문제02OMR카드 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	answer 와 hgd 의 값을 비교하여 정답을 맞춘다.
		 	문제당 20점이다.
		 	총 성적을 출력
		 */
		Random rd = new Random();
		OMR card = new OMR();
		int cnt = 0;
		int grade = 0;
		for (int i = 0; i < card.hgd.length; i++) {
			int num = rd.nextInt(5) + 1;
			card.hgd[i] = num;
		}
		for (int i = 0; i < card.answer.length; i++) {
			if (card.hgd[i] == card.answer[i]) {
				cnt++;
			}
		}
		System.out.println(Arrays.toString(card.answer));
		System.out.println(Arrays.toString(card.hgd));
		grade = cnt * 20;
		System.out.println(grade + "점");
	}
}
