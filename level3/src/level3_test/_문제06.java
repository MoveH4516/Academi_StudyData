package level3_test;

import java.util.Arrays;
import java.util.Random;

public class _문제06 {
	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
		 * 2. 단, 중복되는 숫자는 없어야 한다.
		 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
		 * 
		 * 예)
		 * 랜덤숫자 : 1
		 * check = {true, false, false, false, false}
		 * arr   = {1, 0, 0, 0, 0}

		 * 랜덤숫자 : 3
		 * check = {true, false, false, true, false}
		 * arr   = {1, 3, 0, 0, 0}

		 * 랜덤숫자 : 2
		 * check = {true, false, true, true, false}
		 * arr   = {1, 3, 2, 0, 0}

		 * 랜덤숫자 : 2
		 * check = {true, false, true, true, false}
			
		걸린시간 : 8분03초60
		 */
		Random rd = new Random();
		boolean[] check = new boolean[5];
		int[] arr = new int[5];
		int cnt = 0;
		while (true) {
			int num = rd.nextInt(5);
			System.out.println("랜덤 숫자 : " + num);
			if (check[num] == false) {
				check[num] = true;
				arr[cnt] = num;
				cnt++;
			}
			System.out.println(Arrays.toString(check));
			System.out.println(Arrays.toString(arr));
			if (cnt == 5) {
				break;
			}
		}				
	}
}
