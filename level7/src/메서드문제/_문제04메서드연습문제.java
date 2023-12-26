package 메서드문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ScoreMg {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	int sum;
	double avg;
	int cnt;
	int max;
	void storageScores(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = rd.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(scores));
	}
	
	void printSumAvg(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = 1.0 * sum / scores.length;
		System.out.printf("총점 : %d 평균 : %.1f\n", sum, avg);
	}
	
	void print60 (int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격자 수 : " + cnt + "명");
	}
	
	void printIndex (int[] scores) {
		while (true) {
			System.out.print("인덱스 입력 : ");
			int idx = sc.nextInt();
			if (idx < 0 || idx >= scores.length) {
				continue;
			}
			System.out.println("성적 : " + scores[idx]);
			break;
		}
	}
	
	void printNum (int[] num, int[] scores) {
		while (true) {
			System.out.print("학번 입력 : ");
			int idx = -1;
			int number = sc.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (number == num[i]) {
					idx = i;
					break;
				}
			}
			if (idx == -1) {
				System.out.println("학번 불일치");
				continue;
			}
			System.out.println("성적 : " + scores[idx]);
			break;
		}
	}
	
	void printMax (int[] num, int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == max) {
				System.out.printf("%d번(%d점)\n", num[i], scores[i]);
			}
		}
	}
}

public class _문제04메서드연습문제 {
	public static void main(String[] args) {
		ScoreMg s = new ScoreMg();
		int[] num = {1001, 1002, 1003, 1004, 1005};
		int[] scores = new int[5];
		
		s.storageScores(scores);
		s.printSumAvg(scores);
		s.print60(scores);
		s.printIndex(scores);
		s.printNum(num, scores);
		s.printMax(num, scores);
	}
}
