package 배열심화문제2;

import java.util.Arrays;

public class _문제14두개뽑아서더하기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열에서 숫자 2개씩 뽑아서 더한 값을
		 	차례대로 result 배열에 저장 후 출력
		 	단, 자기 차례의 인덱스 값은 더하지 않는다.
		 	
		 	그 이후 중복값을 삭제
		 */
		
		int[] arr = {2, 1, 3, 4, 1};
		int[] result = new int[100];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					result[cnt] = arr[i] + arr[j];
					cnt++;
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] == result[j]) {
					result[j] = 0;
				}
			}
		}
		int[] temp = result;
		result = new int[100];
		int k = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				result[k] = temp[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(result));
		
	}
}
