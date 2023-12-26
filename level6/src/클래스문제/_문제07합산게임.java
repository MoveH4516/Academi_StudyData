package 클래스문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class AddGame {
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	int total = 0;
}

public class _문제07합산게임 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	더하기 게임
		 	1~10 사이의 랜덤한 값을 중복없이 game 배열에 6개 저장
		 	6개의 배열의 인덱스를 0~5 사이의 랜덤 값 3개를 중복 없이 선택해 그 인덱스의 값의
		 	합을 출력
		 	사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임
		 	
		 	모든 경우의 수를 찾으면 게임 종료
		 	단, 인덱스의 순서만 다른 경우 중복 정답 불가 예외처리
		 	이전 인덱스만 비교하는 것이 아니라 모든 정답 경우의 수를 비교하여
		 	중복 없이 경우의 수를 모두 찾으면 반복문 종료.
		 	
		 */
		
		AddGame g = new AddGame();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int sum = 0;
		int mySum = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = i + 1;
		}
		for (int i = 0; i < 100; i++) {
			int idx = rd.nextInt(10);
			int temp = num[0];
			num[0] = num[idx];
			num[idx] = temp;
		}
		for (int i = 0; i < g.game.length; i++) {
			g.game[i] = num[i];
		}
		System.out.println(Arrays.toString(g.game));
		for (int i = 0; i < g.idx.length; i++) {
			g.idx[i] = rd.nextInt(6);
			for (int j = 0; j < i; j++) {
				if (g.idx[j] == g.idx[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(g.idx));
		for (int i = 0; i < g.idx.length; i++) {
			sum += g.game[g.idx[i]];
		}
		System.out.println("랜덤 세 수의 합 : " + sum);
		int answerSum = 0;
		int answerCnt = 0;
		//세 가지의 숫자를 더하는 것.
		// {1 2 3 4 5 6} 1 2 3 / 1 2 4 / 1 2 5 / 1 2 6
		// 1 3 4 / 1 3 5/ 1 3 6/ 1 4 5/ 1 4 6/ 1 5 6/
		// 2 3 4 / 2 3 5/ '''''
		for (int i = 0; i < g.game.length - 2; i++) {
			for (int j = i + 1; j < g.game.length - 1; j++) {
				for (int k = j + 1; k < g.game.length; k++) {
					answerSum = g.game[i] + g.game[j] + g.game[k];
					if (answerSum == sum) {
						answerCnt++;
					}
				}
			}
		}
		System.out.println("경우의 수 : " + answerCnt);
		int cnt = 0;
		int[][] answerIdx = new int[answerCnt][3];
		for (int i = 0; i < answerCnt; i++) {
			for (int j = 0; j < 3; j++) {
				answerIdx[i][j] = -1;
			}
		}
		int k = 0;
		while (true) {
			System.out.println(Arrays.deepToString(answerIdx));
			System.out.println(Arrays.toString(g.myIdx));
			mySum = 0;
			System.out.println("인덱스 선택 >>");
			for (int i = 0; i < g.myIdx.length; i++) {
				g.myIdx[i] = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (g.myIdx[j] == g.myIdx[i]) {
						System.out.println("중복 인덱스 선택 불가");
						i--;
						break;
					}
				}
			}
			System.out.println("선택한 인덱스 : " + Arrays.toString(g.myIdx));
			for (int i = 0; i < g.myIdx.length; i++) {
				mySum += g.game[g.myIdx[i]];
			}
			int count = 0;
			for (k = 0; k < answerCnt; k++) {
				count = 0;
				for (int i = 0; i < g.myIdx.length; i++) {
					for (int j = 0; j < 3; j++) {
						if (answerIdx[k][j] == g.myIdx[i]) {
							count++;
						}
						// answerIdx = { {1, 5, 3}, { 3, 2, 0} }
						// myIdx = {2, 3, 1}
					}
					if (count == 3) {
						break;
					}
				}
				if (count == 3) {
					break;
				}
			}
			if (count == 3) {
				System.out.println("이미 입력한 정답입니다.");
				continue;
			}
			System.out.println("고른 세 수의 합 : " + mySum);
			if (sum == mySum) {
				System.out.println("정답");
				for (int i = 0; i < 3; i++) {
					answerIdx[cnt][i] = g.myIdx[i];
				}
				cnt++;
			} else {
				System.out.println("오답");
			}
			if (cnt == answerCnt) {
				System.out.println("모든 경우의 수 발견");
				break;
			}
		}
		sc.close();
	}
}
