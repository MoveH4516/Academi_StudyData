package 문자열기본문제;

import java.util.Arrays;

public class _문제08형변환2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	이름은 name 배열에, 성적은 score 배열에 각각 저장 및 출력
		 */
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		int idx = 0;
		for (int i = 0; i < str.length(); i += 7) {
			name[idx] = str.substring(i,i + 3);
			idx++;
		}
		System.out.println(Arrays.toString(name));
		
		idx = score.length - 1;
		for (int i = str.length(); i > 3; i -= 7) {
			score[idx] = Integer.parseInt(str.substring(i - 2, i));
			idx--;
		}
		System.out.println(Arrays.toString(score));
	}
}
