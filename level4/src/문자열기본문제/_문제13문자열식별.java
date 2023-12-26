package 문자열기본문제;

import java.util.Scanner;

public class _문제13문자열식별 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	문자열 속 숫자검사
		 	
		 [심화]
		 	오름차순으로 연속된 숫자가 있는지
		 	내림차순으로 연속된 숫자가 있는지
		 	4개 같은 숫자가 연속으로 있는지
		 */
		
		Scanner sc = new Scanner(System.in);		
		while (true) {
			int cntInt = 0;
			int cntStr = 0;
			int cntEqual = 1;
			int cntIncr = 1;
			int cntDecr	= 1;
			System.out.print("입력 : ");
			String text = sc.next();
			if (text.equals("종료")) {
				System.out.println("시스템 종료");
				break;
			}
			for (int i = 0; i < text.length() - 1; i++) {
				if (text.charAt(i) == text.charAt(i + 1)) {
					cntEqual++;
				}
				if ((int)text.charAt(i) + 1== (int)text.charAt(i + 1)) {
					cntIncr++;
				}
				if ((int)text.charAt(i) - 1== (int)text.charAt(i + 1)) {
					cntDecr++;
				}
			}
			if (cntEqual >= 4) {
				System.out.println("같은 숫자가 연속으로 4개 있으면 안됩니다.");
				continue;
			}
			if (cntIncr >= 4) {
				System.out.println("내림차순으로 연속 4개의 숫자가 있으면 안됩니다.");
				continue;
			}
			if (cntDecr >= 4) {
				System.out.println("오름차순으로 연속 4개의 숫자가 있으면 안됩니다.");
				continue;
			}
			for (int i = 0; i < text.length() - 1; i++) {
				
			}
			// 0 : 48 ~ 9 : 57
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) >= 48 && text.charAt(i) <= 57) {
					cntInt++;
				} else {
					cntStr++;
				}
			}
			if (cntInt == text.length()) {
				System.out.println("숫자만 있다.");
			} else if (cntStr == text.length()) {
				System.out.println("문자만 있다.");
			} else {
				System.out.println("섞여 있다.");
			}
		}
		sc.close();
	}
}
