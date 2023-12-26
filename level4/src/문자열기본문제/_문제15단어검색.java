package 문자열기본문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제15단어검색 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 단어를 입력받아 text 변수 문장 속에 해당 단어가 있는지 검색
		 	2. 단어가 존재하면 true
		 		없으면 false 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too short";
		System.out.println(text);
		String[] txt = text.split(" ");
		System.out.println(Arrays.toString(txt));
		
		char[] txt2 = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			txt2[i] = text.charAt(i);
		}
		System.out.println(Arrays.toString(txt2));
		
		System.out.print("검색할 단어 입력 : ");
		String word = sc.next();
		// char 방식은 sc.next();로 해야하고 String 은 nextLine();으로 해야한다.
		for (int i = 0; i < txt2.length; i++) {
			if (txt2[i] != word.charAt(0)) {
				continue;
			}
			int cnt = 0;
			for (int k = 0; k < word.length(); k++) {
				if (txt2[i + k] == word.charAt(k)) {
					cnt++;
				}
			}
			if (cnt == word.length()) {
				System.out.println(true);
				break;
			} 
		}
		
		
		boolean run = true;
		for (int i = 0; i < txt.length; i++) {
			for (int j = 0; j <= txt[i].length() - word.length(); j++) {
				if (txt[i].substring(j,j + word.length()).equals(word)) {
					System.out.println(true);
					run = false;
					break;
				}
			}
			if (i == txt.length - 1 && run)  {
				System.out.println(false);
			}
		}
		sc.close();
	}
}
