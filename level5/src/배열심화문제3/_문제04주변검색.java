package 배열심화문제3;

import java.util.Arrays;

public class _문제04주변검색 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 mine 배열의 숫자 0의 자리에
		 	주변 8 방향을 검사 해 9의 개수를 저장하고 출력
		 */
		
		int[][] mine = {
				{0, 9, 0},
				{9, 0, 9},
				{0, 0, 9}
		};
		int size = 3;
		int nine = 9;
//		int cnt = 0;
//		for (int i = 0; i < mine.length; i++) {
//			for (int j = 0; j < mine[i].length; j++) {
//				if (mine[i][j] == 9) {					
//					cnt++;
//				}
//			}
//		}
//		int[][] idx = new int[cnt][2];
//		int num = 0;
//		for (int i = 0; i < mine.length; i++) {
//			for (int j = 0; j < mine[i].length; j++) {
//				if (mine[i][j] == 9) {
//					idx[num][0] = i;
//					idx[num][1] = j;
//					num++;
//				}
//			}
//		}
//		System.out.println(Arrays.deepToString(idx));
//		for (int[] index : idx) {
//			int[] result = new int[9 - cnt];
//			
//			System.out.println(index[0] + " " + index[1]);
//		}
		
		
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (mine[i][j] != 0) {
					continue;
				}
				int count = 0;
				
				for (int y = -1; y <= 1;y++) {
					for (int x = -1; x <= 1; x++) {
						if (x == 0 && y == 0) continue;
						if (y + i >= size || y + i < 0 || x + j >= size || x + j < 0) {
							continue;
						}
						if (mine[y + i][x + j] == nine) {
							count++;
						}
					}
				}
				mine[i][j] = count;
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
		
		
		
	}
}
