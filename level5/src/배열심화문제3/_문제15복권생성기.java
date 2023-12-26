package 배열심화문제3;

import java.util.Arrays;
import java.util.Random;

public class _문제15복권생성기 {
	public static void main(String[] args) {
		/*
		 [문제]
			복권 1개 당 7칸으로 총 5개의 복권을 제작			
			복권 1줄은 1 또는 7의 랜덤 숫자로 구성
			7이 연속으로 3개 이상이면 "당첨" 그 미만은 "꽝"
			5개 중에 딱 1개만 당첨 복권이고 4개는 꽝인 복권을
			랜덤으로 생성해서 출력
		*/
		Random rd = new Random();
		
		int[][] lottoSet = new int[5][7];
		int size = 35;
		int i = 0;
		int j = 0;
		int idx1 = rd.nextInt(5);	
		int rdNum = rd.nextInt(5);
		int cnt = 0;
		int idx2 = 0;
		System.out.println(idx1);
		for (int k = 0; k < size; k++) {
			int num = rd.nextInt(2) + 1;
			lottoSet[i][j] = num;
			if (lottoSet[i][j] == 2) {
				lottoSet[i][j] = 7;
			}
			if (idx1 != i) {
				for (int number = 0; number < lottoSet[i].length - 2; number++) {
					cnt = 0;
					for (int a = 0; a < 3; a++) {
						if (lottoSet[i][number + a] == 7) {
							cnt++;
							idx2 = a;
						}
					}
					if (cnt == 3) {
						lottoSet[i][number + idx2] = 1;
					}				
				}
			}
			if (j == 6) {
				j = -1;
				i++;
			}
			j++;
		}
		for (int a = 0; a < lottoSet.length - 2; a++) {			
			lottoSet[idx1][rdNum + a] = 7;	
		}
		for (int k = 0; k < lottoSet.length; k++) {
			System.out.print(Arrays.toString(lottoSet[k]));
			if (k == idx1) {
				System.out.print("당첨");
			} else {
				System.out.print("꽝");
			}
			System.out.println();
		}
		
	}	
}
