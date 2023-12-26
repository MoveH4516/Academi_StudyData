package 배열심화문제2;

import java.util.Arrays;

public class _문제19압축하기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 before 배열은 압축하기 전의 데이터이다.
		 	연속으로 이뤄진 데이터를 모아 압축하려 한다.
		 	
		 	ex ) 3333 => {3,2}
		 */
		
		int[] before = {3, 3, 5, 5, 5, 5, 5, 3, 4, 4, 4};
		int[][] after = new int[4][2];
		int cnt = 1;
		int num = 0;
		int k = 0;	
		for (int i = 0; i < after.length; i++) {
			num = 0;
			cnt = 1;
			boolean check = true;
			for (int j = k; j < before.length - 1; j++) {
				if (before[j] != before[j + 1]) {
					num = before[j];
					k += cnt;
					check = false;
					break;
				} else {
					cnt++;
				}			
			}
			if (check) {
				num = before[k];
			}
			after[i][0] = num;
			after[i][1] = cnt;			
		}
		System.out.println(Arrays.deepToString(after));
	}
}
