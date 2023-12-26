package 배열심화개념;

import java.util.Arrays;

public class _06이차원배열 {
	public static void main(String[] args) {
		
		int[] temp = { 1, 2, 3, 4, 5, 6 };
		
		int[][] arr = new int[2][3]; // 이차원 배열
		
		System.out.println(Arrays.toString(temp)); 
		// 이건 일차원 배열에 사용
		System.out.println(Arrays.deepToString(arr)); 
		// 이차원은 이 함수를 사용해야 함
		// 이차원 배열에 값을 넣어줄 때는 이차원 반복문을 활용해서 넣어줄 수 있다.
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[0].length; k++) {
				arr[i][k] = j;
				j++;
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}
		
	}
}
