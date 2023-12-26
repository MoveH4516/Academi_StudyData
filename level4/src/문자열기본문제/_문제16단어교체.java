package 문자열기본문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제16단어교체 {
	public static void main(String[] args) {
		/*
		 [문제]
		 	변경하고 싶은 단어를 입력받아
		 	원하는 단어로 교체
		 */
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too short";
		System.out.println(text);
		char[] txt2 = new char[text.length()];
		boolean run = true;
		for (int i = 0; i < text.length(); i++) {
			txt2[i] = text.charAt(i);
		}
		System.out.println(Arrays.toString(txt2));
		
		System.out.print("검색할 단어 입력 : ");
		String word = sc.next();
		
		int idx1 = 0;
		for (int i = 0; i < txt2.length; i++) {
			if (txt2[i] != word.charAt(0)) {
				continue;
			}
			int cnt = 0;
			for (int k = 0; k < word.length(); k++) {
				if (txt2[i + k] == word.charAt(k)) {
					cnt++;
					idx1 = i;
				}
			}
			if (cnt == word.length()) {
				text = "";
				System.out.println("단어 변경 : ");
				String wr = sc.next();
				for (int j = 0; j < idx1; j++) {
					text += txt2[j];
				}
				text += wr;
				for (int j = idx1 + word.length(); j < txt2.length; j++) {
					text += txt2[j];
				}
				run = false;
				break;
			} 
		}
		if (run) {
			System.out.println("일치하는 단어가 없습니다.");
		}
		System.out.println(text);
		sc.close();
		
	}
}
