package 이차원배열문제;

import java.util.Arrays;

public class _문제03기본문제3 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	가로 합 출력
		 	세로 합 출력
		 */
		
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
		};
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		for (int i = 0; i < garo.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				garo[i] += arr[i][j];
			}
		}

		for (int i = 0; i < sero.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sero[i] += arr[j][i];
			}
		}
		System.out.println(Arrays.toString(garo));
		System.out.println(Arrays.toString(sero));
	}
}
