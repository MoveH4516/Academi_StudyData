package 배열2문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제23카드맞추기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
		 	2. 1 1 2 2 3 3 4 4 5 5 이 숫자들을 1000번 섞는다
		 	3. 사용자가 인덱스 번호를 2개 입력해서 그 값을 비교한다
		 	4. 두 인덱스 값이 맞으면 back에 해당 숫자를 저장하여
		 		back에 모든 수가 채워지면 게임은 종료
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int change = 0;
		for (int i = 0; i < 1000; i++) {
			int mix = rd.nextInt(10);
			
			change = front[mix];
			front[mix] = front[0];
			front[0] = change;
		}
		System.out.println(Arrays.toString(front));
		
		boolean run = true;
		while (run) {
			for (int i = 0; i < 10; i++) {
				if (back[i] == 0) {
					System.out.print("[]");
				} else {
				System.out.print("[" + back[i] + "]");
				}
			}
			System.out.println();
			System.out.print("인덱스1 : ");
			int idx1 = sc.nextInt();
			System.out.print("인덱스2 : ");
			int idx2 = sc.nextInt();
			
			if (idx1 == idx2) {
				System.out.println("서로 다른 인덱스를 입력하세요");
				continue;
			}
			if (idx1 < 0 || idx2 < 0 || idx1 >= front.length || idx2 >= front.length) {
				System.out.println("인덱스 범위 오류 (0~9)");
				continue;
			}
			if (back[idx1] != 0 || back[idx2] != 0) {
				System.out.println("이미 뒤집어진 카드 입니다.");
				continue;
			}
			for (int i = 0; i < 10; i++) {
				if (back[i] == 0) {
					if (idx1 == i) {
						System.out.print("[" + front[idx1] + "]");
					} else if (idx2 == i) {
						System.out.print("[" + front[idx2] + "]");
					} else {
					System.out.print("[]");
					}
				} else {
					System.out.print("[" + back[i] + "]");
				}
			}
			if (front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
			}

			
			for (int i = 0; i < back.length; i++) {
				if (back[i] != 0) {
					run = false;					
				} else {
					run = true;
					break;
				}
			}
			System.out.println();
			System.out.println("=============================");
		}
		System.out.println("클리어");
		sc.close();
	}
}
