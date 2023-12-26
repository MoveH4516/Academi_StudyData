package 배열1개념;

import java.util.Arrays;

public class _05쉽게출력하기 {
	public static void main(String[] args) {
		
		// Arrays.toString(배열주소) => 쉽게 배열 출력 가능
		
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println(Arrays.toString(arr));
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(array));
		// 반복문을 사용하지 않아도 모든 배열을 출력해 주는 시스템
	}
}
