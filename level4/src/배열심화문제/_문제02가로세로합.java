package 배열심화문제;

import java.util.Arrays;

public class _문제02가로세로합 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 배열은 1~9 사이의 숫자가 섞여서 저장 되어 있는 길이가 9인 배열
		 	
		 	arr 배열을 아래와 같이 사각형 모양으로 출력하고,
		 	각 줄의 가로합을 garo 배열에 저장
		 	각 줄의 세로합을 sero 배열에 저장
		 */
		
		int[] arr = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};
		
		int[] garo = {0, 0, 0};
		int[] sero = {0, 0, 0};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
			if (i % 3 == 2) {
				System.out.println();
			}
		} // 이 배열 출력문의 조건을 활용하여 for문 하나만으로도 구하는 것이 가능
		int garoIdx = 0;
		for (int i = 0; i < arr.length; i++) {			
			garo[garoIdx] += arr[i];
			if (i % 3 == 2) {
				garoIdx++;
			}
		}
		System.out.println(Arrays.toString(garo));
		int seroIdx = 0;
		for (int i = 0; i < arr.length; i++) {			
			sero[seroIdx] += arr[i];
			seroIdx++;
			if (i % 3 == 2) {
				seroIdx = 0;
			}
		}
		System.out.println(Arrays.toString(sero));
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3 * i; j < 3 * i + 3; j++) {			
				garo[i] += arr[j];				
			}			
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < arr.length; j += 3) {
				sero[i] += arr[j];
			}
		}		
		System.out.println(Arrays.toString(garo));
		System.out.println(Arrays.toString(sero));
	}
}
