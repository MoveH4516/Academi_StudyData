package 배열심화개념;

import java.util.Scanner;

public class _05배열컨트롤러2단계 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = null;
		int[] copy = score;
		int count = 0;
		while (true) {
			if (count > 0) {
				for (int i = 0; i < score.length; i++) {					
					System.out.print(score[i] + " ");
				}
			}
			System.out.println();
			System.out.println("[배열 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			System.out.print("메뉴선택 : ");
			int sel = sc.nextInt();
			if (sel < 0 || sel > 4) {
				System.out.println("입력값 오류");
				continue;
			}
			if (sel == 0) {
				System.out.println("시스템 종료");
				break;
			} else if (sel == 1) {
				count++;
				System.out.print("추가할 값 입력 : ");
				int num = sc.nextInt();	
				if (num == 0) {
					System.out.println("0을 입력할 수 없습니다.");
					continue;
				}
				copy = score;
				score = new int[count];
				if (count > 1) {
					for (int i = 0; i < copy.length; i++) {
						score[i] = copy[i];
					}
				}
				score[score.length - 1] = num;								
			} else if (sel == 2) {
				if (count == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
					continue;
				}
				System.out.print("삭제할 인덱스 : ");
				int idx = sc.nextInt();
				if (idx < 0 || idx > score.length - 1) {
					System.out.println("입력값 오류");
					continue;
				}
				for (int i = 0; i < score.length; i++) {
					if (score[i] == score[idx]) {
						score[idx] = 0;					
					} 
				}				
				count--;
				copy = score;
				score = new int[count];
				int j = 0;
				for (int i = 0; i < copy.length; i++) {
					if (copy[i] != 0) {
						score[j] = copy[i];
						j++;
					}
				}				
			} else if (sel == 3) {
				if (count == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
					continue;
				}
				System.out.print("삭제할 값 : ");
				int num = sc.nextInt();	
				
				int cnt = 0;
				int cnt1 = 0;
				for (int i = 0; i < score.length; i++) {
					if (score[i] == num) {
						score[i] = 0;
						cnt++;
					} else {
						cnt1++;
					}
				}
				if (cnt1 == score.length) {
					System.out.println("일치하는 값이 없습니다.");
					continue;
				}
				count -= cnt;
				copy = score;
				score = new int[count];
				int j = 0;
				for (int i = 0; i < copy.length; i++) {
					if (copy[i] != 0) {
						score[j] = copy[i];
						j++;
					}
				}	
			} else if (sel == 4) { // 삽입
				if (count == 0) {
					System.out.println("추가 메뉴를 사용하세요.");
					continue;
				}			
				System.out.print("삽입할 값 입력 : ");
				int num = sc.nextInt();
				if (num == 0) {
					System.out.println("0을 입력할 수 없습니다.");
					continue;
				}
				System.out.print("삽입할 인덱스 입력 : ");
				int idx = sc.nextInt();
				if (idx < 0 || idx > count) {
					System.out.println("인덱스 값 오류");
					continue;
				}
				count++;
				copy = score;
				score = new int[count];
				for (int i = 0; i < copy.length; i++) {
					score[i] = copy[i];
				}
				for (int i = idx; i < score.length - 1; i++) {
					score[i + 1] = score[i];
				}
				score[idx] = num;				
			}			
		}
		
		sc.close();
	}
}
