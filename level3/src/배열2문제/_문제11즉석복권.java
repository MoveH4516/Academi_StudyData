package 배열2문제;

import java.util.Arrays;
import java.util.Random;

public class _문제11즉석복권 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	숫자 7이 연속 3번 등장하면, "당첨" 출력
		 	
		 	1. 생성
		 	2. 1과 7만 저장
		 	3. 당첨인치 꽝인지 출력
		 */
		Random rd = new Random();
		int[] lotto = new int[7];
		int cnt = 0;
		int j = 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(2);
			if (lotto[i] == 0) {
				lotto[i] = 7;
				cnt++;
			} else {
				cnt = 0;
			}
			if (cnt >= 3) {
				j = 1;
			}
		}
		System.out.println(Arrays.toString(lotto));
		if (j == 1) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
		
		
		
		int[] lotto2 = new int[7];
		cnt = 0;
		j = 0;
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = rd.nextInt(10);
			if (lotto2[i] <= 3) {
				lotto2[i] = 7;
				cnt++;
			} else {
				lotto2[i] = 1;
				cnt = 0;
			}
			if (cnt >= 3) {
				j = 1;
			}
		}
		System.out.println(Arrays.toString(lotto2));
		if (j == 1) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
				
	}
}
