package 문자열기본문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제02끝말잇기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 3글자 단어
		 	2. 끝 단어 입력하면 게임종료
		 	3. 실패시 게임종료
		 */
		
		Scanner sc = new Scanner(System.in);
		String str1 = "자전거";
		String[] words = {};
		String[] copy = null;
		int pass = 0;
		int cnt = 0;
		while (true) {
			System.out.println("제시어 : " + str1);
			System.out.print("입력 : ");
			String str2 = sc.next();
			if (cnt == 0 && str2.equals(str1)) {
				System.out.println("제시어와 같은 단어입니다.");
				continue;
			}
			if (str2.equals("끝")) {
				System.out.println("게임 종료");
				break;
			}
			if (str2.length() != 3) { // 3 대신 final int a = 3; 으로 해주는게 좋음
				System.out.println("3글자 단어만 가능합니다.");
				continue;
			}
			if (cnt > 0) {
				for (int i = 0; i < words.length; i++) {
					if (str2.equals(words[i])) {
						pass = -1;
						break;
					} else {
						pass = 0;
					}
				}
				if (pass == -1) {
					System.out.println("중복된 값이 있습니다.");
					System.out.println(Arrays.toString(words));
					continue;
				}
			}
			cnt++; // str.split(",") 을 사용하여 쉽게 배열을 만들어 줄 수 있다.
			copy = words;
			words = new String[cnt];
			for (int i = 0; i < copy.length; i++) {				
				words[i] = copy[i];
			}
			words[cnt - 1] = str2;
			
			if (str2.charAt(0) == str1.charAt(2)) {
				str1 = str2;
			} else {
				System.out.println("게임 종료");
				break;
			}
		}
		sc.close();
	}
}
