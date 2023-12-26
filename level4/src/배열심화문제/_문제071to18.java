package 배열심화문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제071to18 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 1 to 18 게임
		 	2. 1부터 차례대로 숫자를 누르는 게임
		 	3. 숫자 1~9는 front 배열에 저장
		 	   숫자 10~18은 back 배열에 저장
		 */
		
		// 상수 => 초기값 설정이 끝나면 재할당 불가능 : 수정 X (대문자로 변수명 사용)
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		final int SIZE = 9; // 상수로 변할 수 없는 값.
		
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];
		for (int i = 1; i <= 18; i++) {
			if (i <= 9) {
				front[i - 1] = i;
			} else {
				back[i - 10] = i;
			}
		}
		for (int i = 0; i < 50; i++) {
			int num = rd.nextInt(9);
			int temp = front[0];
			front[0] = front[num];
			front[num] = temp;
			temp = back[0];
			back[0] = back[num];
			back[num] = temp;
		}
		System.out.println(Arrays.toString(front));
		System.out.println(Arrays.toString(back));
		int game = 1;
		int i = 0;
		int k = 0;
		while (true) {
			for (k = 0; k < SIZE; k++) {
				System.out.print(front[k] == 0 ? " \t" : front[k] + "\t");
				if (k % 3 == 2) {
					System.out.println();
					System.out.println();
				}				
			}
			if (game == 19) {
				System.out.println("클리어");
				break;
			}
			
			System.out.print("값 입력 : ");
			int input = sc.nextInt();
			if (input < 0 || input >= SIZE) {
				System.out.println("입력 범위 오류");
				continue;
			}
			if (front[input] == game && i < SIZE) {
				front[input] = back[i];
				game++;
				i++;
			} 			
			if (front[input] == game && i == SIZE) {
				front[input] = 0;
				game++;
			}
		}
		sc.close();
	}
}
