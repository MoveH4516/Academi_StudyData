package 배열심화문제2;

import java.util.Arrays;

public class _문제20인형뽑기1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. machine 배열은 인형뽑기 기계의 데이터이다.
		 	2. 인형의 번호는 다음과 같다.
		 		1 : 호랑이, 2: 곰, 3 : 사자, 4 : 기린
		 		숫자 0은 비어있는 곳을 의미
		 		숫자 0이 아닌 곳은 인형이 있다는 것을 의미
		 		input 데이터는 오늘 손님들이 인형을 선택한 인덱스 번호
		 		세로 단위로 한 라인, 인덱스 번호는 가로로 선택 ( 0 ~ 4 )
		 		인형은 각 라인별 맨 위에서부터 뽑힌다.
		 		세로줄이 전부 0이면 "꽝" 출력
		 		판매된 인형의 이름을 차례대로 출력
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
		int idx = 0;
		for (int k = 0; k < input.length; k++) {
			
			for (int i = 0; i < machine.length; i++) {
				if (machine[i][input[k]] != 0) {
					idx = i;
					break;
				} else {
					idx = -1;
				}
			}
			System.out.println("input : " + input[k]);
			if (idx == -1) {
				System.out.println("******꽝******");
				System.out.println("===============");
				continue;
			}
			System.out.println("******" + nameList[machine[idx][input[k]] - 1] + "******");
			machine[idx][input[k]] = 0;
			for (int i = 0; i < machine.length; i++) {
				System.out.println(Arrays.toString(machine[i]));
			}
			System.out.println("===============");
		}
	}
}
