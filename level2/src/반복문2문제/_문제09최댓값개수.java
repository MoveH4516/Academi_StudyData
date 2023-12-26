package 반복문2문제;

import java.util.Random;

public class _문제09최댓값개수 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	랜덤으로 1~10을 10번 출력하고
		 	가장 큰 수를 출력
		 	가장 큰 수가 여러번 나온 경우
		 	중복 출력된 횟수가 함께 출력
		 */
		
		Random rd =new Random();
		int i = 1;
		int max = 0;
		int cnt = 0;
		while (i <= 10) {
			int num = rd.nextInt(10) + 1;
			System.out.print(num + " ");
			if (max == num) {
				cnt++;
			}	
			if (max < num) {
				max = num;
				cnt = 0;
			} 					
			i++;
		}
		System.out.println();
		System.out.println("가장 큰 수 : " + max);
		System.out.println("중복된 횟수 : " + cnt);
	}
}
