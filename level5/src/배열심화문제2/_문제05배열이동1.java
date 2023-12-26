package 배열심화문제2;

import java.util.Arrays;

public class _문제05배열이동1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 class1 부터 class5 배열은 각 반의 시험점수를 저장한 것이다.
		 	각 반의 총점이 높은 순서대로 세 반을 뽑아서 win 배열에 저장 후,
		 	win 배열의 모든 내용을 출력.
		 */
		
		int[][] classList = {
				{10, 54, 65, 22, 15},
				{65, 14, 24, 75, 25},
				{50, 45, 25, 87, 49},
				{11, 66, 5, 21, 95},
				{70, 84, 64, 21, 11}
		};
		
		int[][] win = new int[3][];
		
		int[] sum = new int[classList.length];
		
		for (int i = 0; i < classList.length; i++) {
			for (int j = 0; j < classList[i].length; j++) {
				sum[i] += classList[i][j];
			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = i; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					int temp = sum[i];
					sum[i] = sum[j];
					sum[j] = temp;
					
					int[] temp1 = classList[i];
					classList[i] = classList[j];
					classList[j] = temp1;
					
				}
			}
		}
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.deepToString(classList));
		for (int i = 0; i < win.length; i++) {
			win[i] = classList[i];
		}
		System.out.println(Arrays.deepToString(win));
	}
}
