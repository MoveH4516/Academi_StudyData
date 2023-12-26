package 배열1문제;

import java.util.Scanner;

public class _문제17검색 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	array  배열은 학번과 점수가 한쌍으로 이루어진 데이터이다.
		 	
		 	문제1) 학번을 입력하면 점수 출력
		 	문제2) 점수를 입력하면 학번 출력
		 */
		Scanner sc = new Scanner(System.in);
		int[] array = {1001, 20, 1002, 45, 1003, 54};
			
		System.out.print("학번 : ");
		int num = sc.nextInt();
		if (num != 1001 && num != 1002 && num != 1003) {
			System.out.println("없는 학번 입니다.");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				System.out.printf("점수 : %d\n", array[i + 1]);
			} // 홀수만 비교. i % 2 != 0; 조건식으로
		}	  // array[i] 형태를 해주어야 함. 그러지 않으면 범위 오류 발생.
		System.out.print("점수 : ");
		int score = sc.nextInt();
		if (score != 20 && score != 45 && score != 54) {
			System.out.println("없는 점수 입니다.");
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] == score) {
				System.out.printf("학번 : %d\n", array[j - 1]);
			}
		}
		sc.close();
	}
}
