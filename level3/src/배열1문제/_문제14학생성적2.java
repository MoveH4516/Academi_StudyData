package 배열1문제;

import java.util.Scanner;

public class _문제14학생성적2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	학번을 입력받아 성적을 출력
		 	단, 없는 학번은 예외 처리.
		 */
		Scanner sc = new Scanner(System.in);
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList = {87, 11, 45, 98, 23};
		System.out.print("학번 : ");
		int input = sc.nextInt();
		if (input < 1001 || input > 1005) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		
		for (int i = 0; i < numberList.length; i++) {
			if (input == numberList[i]) {
				System.out.println("성적 : " + scoreList[i]);
			}
		}
		sc.close();
	}
}
