package 배열심화문제;

import java.util.Arrays;
import java.util.Random;

public class _문제06 {
	public static void main(String[] args) {
		
		/*
		[문제]
			1 ~ 45 사이의 랜덤 값 6개를 lotto배열에 저장한다.
			단, 중복되는 숫자는 없어야 한다.
		 */
		Random rd = new Random();
		
		int[] lotto = new int[6];
		int i = 0;
		while (i < 6) {
			int num = rd.nextInt(45) + 1;
			lotto[i] = num;
			if (i > 0 && lotto[i - 1] == lotto[i]) {
				continue;
			}
			i++;
		}
		System.out.println(Arrays.toString(lotto));
	}
}
