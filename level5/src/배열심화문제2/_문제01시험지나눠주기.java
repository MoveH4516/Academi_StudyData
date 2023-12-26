package 배열심화문제2;

import java.util.Random;

public class _문제01시험지나눠주기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 2차원 배열은 3학년 1반의 학생 수를 표현한 것으로
		 	세로4 가로5의 총 학생 수는 20명이다.
		 	배열 안의 각각의 값들은 각 학생별 시험을 보기위한 필요 페이지 수이다.
		 	학생마다 필요한 페이지 수가 다르다.
		 	
		 	시험지를 인덱스 위치(0, 0) 부터 나눠주려 할 때
		 	지그재그의 형태로 전달하려 한다.
		 	
		 	랜덤으로 학생수를 저장하고
		 	학생별로 필요한 페이지 수의 합을 출력
		 */
		
		Random rd = new Random();
		int[][] arr = {
				{3,1,5,4,1},
				{1,6,4,2,8},
				{2,3,5,5,2},
				{6,1,7,1,2}
		};
		
		int cnt = rd.nextInt(20) + 1;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr[i].length; j++) {
				if (count == cnt) {
					break;
				}
				if (i % 2 == 0) {
					sum += arr[i][j];
					System.out.print(arr[i][j] + " ");
				} else {
					sum += arr[i][arr[i].length - j - 1];
					System.out.print(arr[i][arr[i].length - j - 1] + " ");
				}
				count++;				
			}
		}
		System.out.println();
		System.out.println("랜덤 숫자 : " + cnt);
		System.out.println("페이지 합 : " + sum);
	}
}
