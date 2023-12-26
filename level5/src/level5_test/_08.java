package level5_test;

public class _08 {
	public static void main(String[] args) {
		
		/*
		 * [달팽이]
		 * 아래와같이 출력하시오.
		 * 
		 * 
		 * 1	2	3	4	5	
		 * 16	17	18	19	6	
		 * 15	24	25	20	7	
		 * 14	23	22	21	8	
		 * 13	12	11	10	9
		 */
		
		int size = 7;
		int[][] arr = new int[size][size];
		int k = 1;
		int idx1 = 0;
		int idx2 = 0;
		int dir = 0;
		while (k <= size * size) {
			arr[idx1][idx2] = k;
			if (dir == 0) {
				idx2++;
				if (idx2 == size - 1 || arr[idx1][idx2 + 1] != 0) {
					dir = 1;
				}
			} else if (dir == 1) {
				idx1++;
				if (idx1 == size - 1 || arr[idx1 + 1][idx2] != 0) {
					dir = 2;
				}
			} else if (dir == 2) {
				idx2--;
				if (idx2 == 0 || arr[idx1][idx2 - 1] != 0) {
					dir = 3;
				}
			} else if (dir == 3) {
				idx1--;
				if (idx1 == 0 || arr[idx1 - 1][idx2] != 0) {
					dir = 0;
				}
			}	
			k++;
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%-3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
