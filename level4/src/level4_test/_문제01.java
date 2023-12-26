package level4_test;

import java.util.Scanner;

public class _문제01 {
	public static void main(String[] args) {
		/*
		   [문제]
				 * # 단어 교체하기(replace)
				 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
				 * 2. 교체해주는 기능을 구현한다.
				 * 예)
				 * 		Life is too short.
				 * 		변경하고 싶은 단어입력 : Life
				 * 		바꿀 단어입력 : Time
				 * 
				 * 		Time is too short. // 해당 문자 출력 
				 *     // Life 이미 Time 으로 바꿨기때문에 다시 life 입력하면 못찾아야함 
				 */

		Scanner sc = new Scanner(System.in);

		String text = "Life is too short.";
		text = text.substring(0,text.length() - 1);
		System.out.println(text);							
		while (true) {
			boolean run = true;
			char[] txt = new char[text.length()];
			for (int i = 0; i < txt.length; i++) {
				txt[i] = text.charAt(i);
			}
			int idx = 0;
			System.out.print("변경하고 싶은 단어를 입력하세요 : ");
			String word = sc.next();
			for (int i = 0; i < txt.length - word.length() + 1; i++) {
				int cnt = 0;
				if (txt[i] != word.charAt(0)) {
					continue;
				}
				
				for (int j = 0; j < word.length(); j++) {
					if (txt[i + j] == word.charAt(j)) {
						cnt++;
						idx = i;
					}
				}
				
				if (cnt == word.length()) {
					text = "";
					System.out.print("단어 변경 : ");
					String wr = sc.next();
					for (int j = 0; j < idx; j++) {
						text += txt[j];
					}
					text += wr;
					for (int j = idx + word.length(); j < txt.length; j++) {
						text += txt[j];
					}
					run = false;
					break;
				} 
			}
			if (run) {
				System.out.println("일치하는 단어가 없습니다.");
			}
			System.out.println(text);
			System.out.print("종료여부(-1 종료)");
			int num = sc.nextInt();
			if (num == -1) {
				break;
			}
		}
		sc.close();

	}
}
