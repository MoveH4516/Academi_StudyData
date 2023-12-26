package level4_test;

import java.util.Arrays;

public class _문제02 {
	public static void main(String[] args) {
		
		/*
		[문제] 성적 순으로 번호를 출력하시오.
		[정답] 1004, 1001, 1002, 1003
		
		10분35초89
	 */
		int[] numList = { 1001, 1002, 1003, 1004 };
		int[] scoreList = { 87, 42, 11, 98 };
		int idx = 0;
		for (int j = 0; j < scoreList.length; j++) {
			int max = 0;
			for (int i = j; i < scoreList.length; i++) {
				if (max < scoreList[i]) {
					max = scoreList[i];
					idx = i;
				}	
			}
			scoreList[idx] = scoreList[j];
			scoreList[j] = max;
			
			int temp = numList[j];
			numList[j] = numList[idx];
			numList[idx] = temp;
		}
		System.out.println(Arrays.toString(scoreList));
		System.out.println(Arrays.toString(numList));
	}
}
