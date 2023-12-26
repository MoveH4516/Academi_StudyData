package 메서드문제;

import java.util.Arrays;

class Return2 {
	
	int[][] run (String[][] data) {
		int cnt = 0;
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i][1]) >= 60) {
				cnt++;
			}
		}
		int[][] arr = new int[cnt][2];
		int idx = 0;
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i][1]) >= 60) {
				arr[idx][0] = Integer.parseInt(data[i][0]);
				arr[idx++][1] = Integer.parseInt(data[i][1]);
			}
		}
		return arr;
	}
	
}

public class _문제07메서드연습문제 {
	public static void main(String[] args) {
		Return2 r = new Return2();
		String[][] data = {
				{"1001", "34"},
				{"1002", "86"},
				{"1003", "81"},
				{"1004", "10"}
		};
		
		int[][] result = r.run(data);
		System.out.println(Arrays.deepToString(result));
	}
}
