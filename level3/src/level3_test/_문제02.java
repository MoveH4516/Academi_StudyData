package level3_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제02 {
	public static void main(String[] args) {
		/*
		   * 중복숫자 금지 1단계 
		     (1. 배열에 1 ~ 4까지 순서대로 넣는다)
		     (2. 셔플을 해서 랜덤 숫자와 0번 인덱스 값을 100번 섞는다 )	

		     * #  1 to 4
			 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
			 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
			 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
			 * 예)
			 * 4 2 3 1
			 * 입력 : 3
			 * 4 2 3 9
			 * 입력 : 1
			 * 4 9 3 9
			 * ...
			 * 
			 * 걸린시간 : 9분18초13
			 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] array = new int[4];
		int change = 0;
		int k = 1;
		boolean run = true;
		for (int i = 0; i < 4; i++) {
			array[i] = i + 1;
		}
		
		for (int i = 0; i < 100; i++) {
			int mix = rd.nextInt(3) + 1;
			change = array[mix];
			array[mix] = array[0];
			array[0] = change;
		}
		System.out.println(Arrays.toString(array));
		while (run) {
			System.out.print("인덱스 입력 : ");
			int input = sc.nextInt();
			if (array[input] == k) {
				array[input] = 9;
				k++;
				System.out.println(Arrays.toString(array));
			} else {
				System.out.println("틀렸습니다.");
				System.out.println(Arrays.toString(array));
			}
			if (k == 5) {
				break;
			}
		}
		System.out.println("클리어");
		sc.close();
	}
}
