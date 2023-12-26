package level3_test;

import java.util.Arrays;
import java.util.Random;

public class _문제14 {
	public static void main(String[] args) {
		/*
		[문제]
			1. 컴퓨터 랜덤하게 최대값을 고르게 한다.
			2. 정답이면 해당 값을 0으로 변경한다.
			3. 단, 이미 0으로 변경된 위치는 다시 랜덤하게 고르지 못하게 막는다.
			4. arr배열의 모든 값이 0으로 변경되면, 프로그램은 종료된다.
			
			예)
				랜덤 : 3
				11, 87, 42, 0, 24
				
				랜덤 : 3
				이미 선택 완료된 위치입니다.
				
				랜덤 : 0
				11, 87, 42, 0, 24
				(최대값이 아니므로 아무일안생김)
			
	 */
		Random rd = new Random();
		int[] arr = {11, 87, 42, 100, 24};
		int max = 0;
		int i = 0;
		int cnt = 0;
		while (true) {
			while (i < arr.length) {
				if (max < arr[i]) {
					max = arr[i];
				}
				i++;
			}
			int num = rd.nextInt(5);
			System.out.println("랜덤 숫자 : " + num);
			if (arr[num] == 0) {
				System.out.println("이미 선택 완료된 위치입니다.");
				continue;
			}
			if(arr[num] == max) {
				arr[num] = 0;
				i = 0;
				max = 0;
				System.out.println(Arrays.toString(arr));
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) {
					cnt++;
				}
			}
			if (cnt == 5) {
				break;
			} else {
				cnt = 0;
			}
		}
	}
}
