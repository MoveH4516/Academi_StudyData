package 배열심화문제3;

public class _문제16여행 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	철수는 여행을 떠났다.
		 	8은 철수 7은 벽 0은 이동가능
		 	dir 은 방향 0~3 북동남서
		 	input 1은 전진 2는 좌회전 3은 우회전
		 */
		
		int[][] map = {
				{0,0,0,0,0,0,0},
				{0,7,7,7,7,0,0},
				{0,7,0,0,7,0,0},
				{0,7,0,8,7,0,0},
				{0,0,0,0,7,0,0},
				{0,0,0,0,7,7,0},
				{0,0,0,0,0,0,0},
		};
		String[] dire = {"북", "동", "남", "서"};
		String[] msg = {"전진", "좌회전", "우회전"};
		int dir = 0;
		int[] input = {1, 1, 2, 1, 1, 2, 1, 1, 3, 1, 1};
		String[] draw = {"▲", "▶", "▼", "◀"};
		int idx1 = 3;
		int idx2 = 3;
		int i = 0;
		while (true) {			
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map[j].length; k++) {
					if (map[j][k] == 0) {
						System.out.print(" □ ");
					} else if (map[j][k] == 7) {
						System.out.print(" ■ ");
					} else {
						System.out.print(" " + draw[dir] + " ");
					}
				}
				System.out.println();
			}
			if (i < input.length) {
				System.out.printf("===input : %d msg : %s dir : %s===\n", input[i], msg[input[i] - 1], dire[dir]);
			}
			if (i == input.length) {
				break;
			}
			if (input[i] == 1) {
				int one = idx1;
				int two = idx2;
				if (dir == 0) {
					idx1--;
				} else if (dir == 1) {
					idx2++;
				} else if (dir == 2) {
					idx1++;
				} else if (dir == 3) {
					idx2--;
				}
				if (map[idx1][idx2] == 7 || idx1 < 0 || idx2 < 0 || idx1 >= map.length || idx2 >= map.length) {
					idx1 = one;
					idx2 = two;
					System.out.println("벽에 막혀 이동 불가");
					i++;
					continue;
				} else {
					map[one][two] = 0;
					map[idx1][idx2] = 8;
				}
			} else if (input[i] == 2) {
				dir--;
			} else {
				dir++;
			}
			if (dir == -1) {
				dir = 3;
			}
			if (dir == 4) {
				dir = 0;
			}
			
			i++;
		}
		
	}
}
