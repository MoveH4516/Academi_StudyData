package level4_test;

import java.util.Arrays;
import java.util.Random;

public class _문제13 {
	public static void main(String[] args) {
		
		/*
	    [문제]
			랜덤으로 숫자 5개를 저장한다. (1~9사이의 숫자)
			랜덤숫자가 홀수이면 arr배열의 앞에서부터 저장 (단, 모든홀수값은 뒤로 밀어낸다.)
			랜덤숫자가 짝수이면 arr배열의 뒤에서부터 저장(단, 모든 짝수값은 앞으로 밀어낸다.)
			아래 추가 설명을 참고한다. 
			[예시]
		3 ==> arr = {3,0,0,0,0}; // 홀수는 맨앞에 3저장
		 1 ==> arr = {1,3,0,0,0}; // 전의 값(3)을 뒤로 밀어내고 홀수는 맨앞에 1저장
		 2 ==> arr = {1,3,0,0,2}; // 짝수는 맨뒤에 2저장
		6 ==> arr = {1,3,0,2,6}; // 전의 값(2)를 앞으로 밀어내고 짝수는 맨뒤에 6저장
		 7 ==> arr = {7,1,3,2,6}; // 전의 값(1, 3)을 뒤로 밀어내고 맨앞에 7저장 
			 */
		Random rd = new Random();
		int arr[] = new int[5];
		int cnt1 = 0;
		int cnt2 = 0;
		int size = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			int num = rd.nextInt(9) + 1;
		
			if (num % 2 != 0) {
				cnt1++;
				if (arr[0] != 0) {
					for (int j = 0; j < cnt1 - 1; j++) {
						arr[j + 1] = arr[j];						
					}
				}
				arr[0] = num;
			}
			if (num % 2 == 0) {
				cnt2++;
				if (arr[size] != 0) {
					for (int j = size - cnt2 + 1; j < size; j++) {
						arr[j] = arr[j + 1];
					}
				}
				arr[size] = num;
				}
			System.out.println(num);
			System.out.println(Arrays.toString(arr));
			}		
		}		
	}
