package 배열1개념;

import java.util.Arrays;
import java.util.Random;

public class _08중복숫자금지2 {
	public static void main(String[] args) {
		
		/*
		 1. 0~4 사이의 숫자를 arr 배열에 저장
		 2. 단, 중복되는 숫자는 없어야 한다.
		 */
		Random rd = new Random();
		boolean[] check = new boolean[5];
		int[] arr = new int[5];
		int i = 0;
		while (true) {
			int index = rd.nextInt(5);
			
			if (!check[index]) {
				arr[i] = index;
				check[index] = true;
				System.out.println(Arrays.toString(check));
				System.out.println(Arrays.toString(arr));
				i++;
			}
			if (i == check.length) {
				break;
			}
		}
		
	}
}
