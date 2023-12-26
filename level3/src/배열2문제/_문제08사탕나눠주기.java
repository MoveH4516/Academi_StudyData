package 배열2문제;

import java.util.Arrays;

public class _문제08사탕나눠주기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 배열은 각 병에 들어있는 사탕이다.
		 	사탕의 종류는 전부 다르고 한 사람당 한 병에서 25개씩 나눠주려 한다.
		 	남은 사탕은 옆으로 옮기지 않고 한 종류씩만 나눠주려 한다.
		 	나눠줄 수 있는 사람 수를 사람 수 배열에 저장
		 	나눠주고 남은 사탕은 나머지 배열에 순차적으로 저장
		 */
		
		int[] candy = {80, 53, 36, 22};
		int[] people = {0, 0, 0, 0};
		int[] rest = {0, 0, 0, 0};
		
		for (int i = 0; i < candy.length; i++) {
			people[i] = candy[i] / 25;
			rest[i] = candy[i] % 25;
		}
		System.out.println(Arrays.toString(people));
		System.out.println(Arrays.toString(rest));
	}
}
