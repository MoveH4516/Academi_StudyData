package 배열심화문제3;

public class _문제13달팽이 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	달팽이 모양처럼 숫자를 차례대로 출력
		 */
		
		int size = 10;
		int[][] num = new int[size][size];
		int idx1 = 0;
		int idx2 = 0;
		int dir = 0;
		for (int i = 1; i <= size * size; i++) {
			num[idx1][idx2] = i;
			if (dir == 0) {
				idx2++;
				if (idx2 == size - 1 || num[idx1][idx2 + 1] != 0) {
					dir = 1;
				}
			} else if (dir == 1) {
				idx1++;
				if (idx1 == size - 1 || num[idx1 + 1][idx2] != 0) {
					dir = 2;
				}
			} else if (dir == 2) {
				idx2--;
				if (idx2 == 0 || num[idx1][idx2 - 1] != 0) {
					dir = 3;
				}
			} else if (dir == 3) {
				idx1--;
				if (idx1 == 0 || num[idx1 - 1][idx2] != 0) {
					dir = 0;
				}
			}						
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%3d",num[i][j]);
			}
			System.out.println();
		}
	}
}
