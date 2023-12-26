package 배열2문제;

import java.util.Arrays;

public class _문제12사탕줄서기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 배열은 각 병에 들어있는 사탕의 양이다.
		 	사탕의 종류는 전부 다르고 한 사람당 한 병엥서
		 	25개씩 나누어 주려고 한다.
		 	남은 사탕은 옆으로 옮겨서 다른 사람한테 나눠줄 수 있다.
		 	나눠줄 수 있는 사람 수를 사람 수 배열에 저장
		 */
		
		int[] candy = {97, 53, 36, 22};
		int[] people = {0, 0, 0, 0};
		
		for (int i = 0; i < candy.length - 1; i++) {
			candy[i + 1] = candy[i + 1] + candy[i] % 25; 
		}
		System.out.println(Arrays.toString(candy));
		for (int i = 0; i < candy.length; i++) {
			people[i] = candy[i] / 25;
		}
		System.out.println(Arrays.toString(people));
	}
}
