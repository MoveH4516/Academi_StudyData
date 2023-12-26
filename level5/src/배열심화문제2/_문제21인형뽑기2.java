package 배열심화문제2;

import java.util.Arrays;

public class _문제21인형뽑기2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래에서부터 하나씩 뽑아간다.
		 	아래에서 뽑으면 한 칸씩 아래로 내려온다.
		 	전부 0일 경우 "꽝" 출력
		 */
		

		int[][] machine = {
				{0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3}
		};
		
		String[] nameList = {"호랑이", "곰", "사자", "기린"};
		int[] input = {1,0,0,3,3,4,4};
		int size = input.length;
		int size2 = machine.length - 1;
		int idx= 0;
		
		for (int i = 0; i < size; i++) {
			System.out.println("input : " + input[i]);
			for(int j = 0; j <= size2; j++) {
				System.out.println(Arrays.toString(machine[j]));
			}
			if (machine[size2][input[i]] != 0) {
				idx = machine[size2][input[i]] - 1;
				System.out.println("******" + nameList[idx] + "******");
				System.out.println("---------------");
				machine[size2][input[i]] = 0;
				for (int j = size2; j > 0; j--) {
					machine[j][input[i]] = machine[j - 1][input[i]];
				}
				machine[0][input[i]] = 0;
			} else {
				System.out.println("****** 꽝 ******");
				System.out.println("---------------");
			}
						
		}
	}	
}
