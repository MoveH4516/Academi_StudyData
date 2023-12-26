package 문자열기본문제;

import java.util.Arrays;

public class _문제07형변환1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열에 각 점수를 저장하고 총점 출력
		 	
		 	scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		 */
		
		String str = "11/100/89";
		int[] arr = new int[3];
		String[] arr1 = new String[3];
		int sum = 0;		
		arr1 = str.split("/");
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = Integer.parseInt(arr1[i]);
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총점 : " + sum + "점");
		
		System.out.println("==========================");
		
		int[] scores = {11, 100, 89};
		String text = "";
		
		for (int i = 0; i < scores.length; i++) {
			text = i == scores.length - 1 ? text + String.valueOf(scores[i]) : text + String.valueOf(scores[i]) + "/";
		}
		System.out.println(text);
		
		text = "";
		for (int i = 0; i < scores.length; i++) {
			text = i == scores.length - 1 ? text + scores[i] : text + scores[i] + "/";
		}
		System.out.println(text);
	}
}
