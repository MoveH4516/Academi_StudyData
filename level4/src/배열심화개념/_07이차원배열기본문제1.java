package 배열심화개념;

import java.util.Arrays;

public class _07이차원배열기본문제1 {
	public static void main(String[] args) {
		
		int row = 3;
		int[][] text = new int [row][];
		
		int[] list = {3, 5, 4};
		for (int i = 0; i < text.length; i++) {
			text[i] = new int[list[i]];
			int num = 10;
			for (int j = 0; j < list[i]; j++) {
				text[i][j] = num;
				num += 10;
			}
		}
		System.out.println(Arrays.deepToString(text));
	}
}
