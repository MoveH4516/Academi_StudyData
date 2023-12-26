package 배열심화문제3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제01빙고 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 1~50 의 랜덤숫자를 25개 중복없이 bingo에 저장
		 	2. 행과 열을 입력받아 숫자를선택
		 	3. 가로 세로 대각선으로 한 줄을 선택하면 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int maxNum = 0;
		while (true) {
			System.out.print("빙고 줄 : ");
			maxNum = sc.nextInt();
			if (maxNum > 1 && maxNum < 8) {
				break;
			}
		}
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		int[] arr = new int[50];
		int k = 0;
		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
		}
		for (int i = 0; i < 100; i++) {
			int num = rd.nextInt(arr.length);
			
			int temp = arr[0];
			arr[0] = arr[num];
			arr[num] = temp;
		}
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				bingo[i][j] = arr[k];
				k++;
			}
		}
		for (int i = 0; i < bingo.length; i++) {
			System.out.println(Arrays.toString(bingo[i]));
		}
		int cnt = 0;
		while (true) {
			System.out.print("y축 입력 : ");
			int fIdx = sc.nextInt();
			System.out.print("x축 입력 : ");
			int bIdx = sc.nextInt();
			if (fIdx > maxNum || fIdx < 1 || bIdx > maxNum || bIdx < 1) {
				System.out.println("1~" + maxNum + "사이의 숫자를 입력하세요");
				continue;
			}
			if (mark[fIdx - 1][bIdx - 1] == 1) {
				System.out.println("이미 마크한 숫자입니다.");
				continue;
			}
			mark[fIdx - 1][bIdx - 1] = 1;
			for (int i = 0; i < bingo.length; i++) {
				System.out.println(Arrays.toString(mark[i]));
			}
			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if (mark[i][j] == 0) {
						System.out.printf("[%-3d]", bingo[i][j]);
					} else {
						System.out.print("[ O ]");
					}
					cnt++;
					if (cnt % maxNum == 0) {
						System.out.println();
					}
				}
			}
			boolean pass = false;
			for (int i = 0; i < maxNum; i++) {
				int count1 = 0;
				int count2 = 0;
				for (int j = 0; j < maxNum; j++) {
					if (mark[i][j] == 1) {
						count1++;
					}
					if (mark[j][i] == 1) {
						count2++;
					}
				}
				if (count1 == maxNum || count2 == maxNum) {
					pass = true;
					break;
				}
			}
			int i = 0;
			int count1 = 0;
			int count2 = 0;
			for (int j = maxNum - 1; j >= 0; j--, i++) {
				if (mark[i][j] == 1) {
					count1++;
				}
				if (mark[i][i] == 1) {
					count2++;
				}
				if (count1 == maxNum || count2 == maxNum) {
					pass = true;
				}
			}
			if (pass) {
				System.out.println("빙고");
				break;
			}
		}
		sc.close();
	}
}
