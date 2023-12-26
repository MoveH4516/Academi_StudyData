package 문자열기본문제;

import java.util.Arrays;

public class _문제10형변환4 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 데이터에서 꼴등을 삭제 후 다시 문자열로 변경
		 		1) 문자열을 잘라서 배열에 저장
		 		2) 배열에서 꼴등 삭제
		 		3) 삭제한 배열을 다시 문자열로 변경
		 */
		
		String str = "김철수/87,이만수/42,이영희/95";
		String[] str1 = str.split(",");
		int [] score = new int[str1.length];
		System.out.println(Arrays.toString(str1));
		for (int i = 0; i < str1.length; i++) {
			score[i] = Integer.parseInt(str1[i].substring(4));
		}
		System.out.println(Arrays.toString(score));
		int min = score[0];
		int minIdx = 0;
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
				minIdx = i;
			}
		}
		str1[minIdx] = "0";
		System.out.println(Arrays.toString(str1));
		String[] copy = str1;
		str1 = new String[copy.length - 1];
		int j = 0;
		for (int i = 0; i < copy.length; i++) {
			if (!copy[i].equals("0")) {
				str1[j] = copy[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(str1));
		str = "";
		for (int i = 0; i < str1.length; i++) {
			str += str1[i] + ",";
		}
		System.out.println("str = " + str.substring(0, str.length() - 1));
	}
}
