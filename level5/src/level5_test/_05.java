package level5_test;

import java.util.Arrays;
import java.util.Random;

public class _05 {
	public static void main(String[] args) {
		
		/*
		[문제]
			복권 1개 당 7칸으로, 총 5개의 복권을 제작하려 한다.
			복권 1줄은 1 또는 7의 랜덤 숫자로 구성되어 있다.
			7이 연속으로 3개이상이면 "당첨"이고, 그 미만은 "꽝" 이다.
			5개 중에 딱 1개만 당첨 복권이고 나머지 4개는 꽝인 복권을
			랜덤으로 생성해서 출력하시오.
			
			예)
				1177117 (꽝)
				1117771 (당첨)
				7171117 (꽝)
				7711771 (꽝)
				7171717 (꽝)
		 */
		Random rd = new Random();
		int[][] lottoSet = new int[5][7];
		int cnt = 0;
		int count = 0;
		int idx = 0;
		while (true) {
			count = 0;
			idx = 0;
			lottoSet = new int[5][7];
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 7; j++) {
					lottoSet[i][j] = rd.nextInt(2) + 1;
				}
			}
			for (int i = 0; i < 5; i++) {
				cnt = 0;
				for (int j = 0; j < 7; j++) {
					if (lottoSet[i][j] == 2) {
						cnt++;
					} else {
						cnt = 0;
					}
					if (cnt == 3) {
						count++;
						idx = i;
						break;
					}
				}
			}
			if (count == 1) {
				break;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (lottoSet[i][j] == 2) {
					lottoSet[i][j] = 7;
				}
			}
			if (i == idx) {
				System.out.println(Arrays.toString(lottoSet[i]) + "당첨");
			} else {
				System.out.println(Arrays.toString(lottoSet[i]) + "꽝");
			}
		}
	}
}
