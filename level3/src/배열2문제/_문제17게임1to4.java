package 배열2문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제17게임1to4 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1~4 사이의 숫자를 중복없이 저장.
		 	사용자는 1부터 순서대로 해당 위치 값을 입력
		 	정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임 종료
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] arr = new int[4];

		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		int mix = 0;
		int change = 0;
		for (int i = 0; i < 100; i++) {
			mix = rd.nextInt(4);
			change = arr[mix];
			arr[mix] = arr[0];
			arr[0] = change;
		}
		System.out.println(Arrays.toString(arr));
		int cnt = 0;
		int num = 0;
		boolean run = true;
		while (run) {
			System.out.print("번호 : ");
			num = sc.nextInt();
			if (num < 0 || num > 3) {
				System.out.println("입력값 오류");
				continue;
			}
			for (int i = 0; i < arr.length; i++) {
				if (num == i && arr[i] != 9) {
					arr[i] = 9;
					cnt++;
				} else if (num == i && arr[i] == 9) {
					System.out.println("이미 입력된 값입니다.");
				}
			}
			System.out.println(Arrays.toString(arr));
			if (cnt == arr.length) {
				run = false;
			}
		}
		sc.close();
	}
}
