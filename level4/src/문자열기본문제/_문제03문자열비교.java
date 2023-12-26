package 문자열기본문제;

import java.util.Scanner;

public class _문제03문자열비교 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	equals() 메소드 없이 문자의 일치여부를 비교
		 */
		Scanner sc = new Scanner(System.in);
		String word = "코끼리";
		System.out.println("단어 : "  + word);
		System.out.print("입력 : ");
		String input = sc.next();
		boolean result = false;
		
		if (word.length() != input.length()) {
			System.out.println(result);
		} else {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == input.charAt(i)) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}
