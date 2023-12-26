package 배열심화문제2;

public class _문제08세로출력 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	yList 의 값들은 data 의 세로 인덱스를 의미
		 	세로줄을 출력
		 */
		int[][] data = {
				{0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3}
		};
		
		int[] yList = {1,3,2,2,0,1};
		
		for (int i = 0; i < yList.length; i++) {
			int idx = yList[i];
			System.out.printf("yList[%d] = %d : ", i, idx);
			for (int j = 0; j < data.length; j++) {				
				System.out.print(data[j][idx] + " ");
			}
			System.out.println();
		}
		
	}
}
