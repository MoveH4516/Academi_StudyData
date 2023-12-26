package 배열심화문제2;

import java.util.Arrays;

public class _문제16연속빈칸찾기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 배열은 숫자1과 0으로 구성
		 	숫자1은 이미 채워진 자리 0은 비어있는 자리
		 	input 변수 값의 의미는 1부터 시작하는 위치를 의미
		 	연속으로 1로 채울 칸 수를 의미
		 	
		 	input 이 3 인 경우, 3 번째라는 의미로
		 	index 의 값은 2이기 때문에 2부터 3칸이 0 인지를 확인한 후
		 	비어있으면 1로 변경
		 	한 칸이라도 1이면 변경 x
		 */
		
		int[] arr = {0, 1, 0, 0, 0, 1, 0, 0};
		int input = 1;
		boolean check = false;
		for (int j = input - 1; j < 2 * input - 1; j++) {
			if (arr[j] == 1) {
				check = false;
				break;
			} else {
				check = true;
			}
		}
		for (int j = input - 1; j < 2 * input - 1 && check; j++) {
			arr[j] = 1;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
