package 배열심화문제2;

import java.util.Arrays;

public class _문제15같은수합치기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	input 배열의 데이터를 순차적으로 arr 에 저장
		 	만약 저장하려는 수와 그 앞의 수가 서로 같으면 합친다.
		 	마지막 arr 의 값을 출력
		 */
		
		int[] input = {8, 4, 2, 2, 4, 4, 8};
		int[] arr = new int[input.length];
		int[] arr2 = null;
		int cnt = 1;
		int count = 0;
		boolean run = true;
		boolean run2 = false;
		
		arr[0] = input[0];
		int i = 1;
		while (true) {						
			run = true;
			// 같은 수가 있는지 판단하는 과정.
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] == arr[j - 1] && arr[j] != 0) {
					arr[j - 1] += arr[j];
					arr[j] = 0;
					run = false;
					i = j;
				}
			}
			if (run2) {				
				cnt++;
			}
			if (cnt == input.length) {
				run2 = true;
			}
			if (run && !run2) { // input 값을 넣어주는 과정.
				cnt++;			// 같은 수를 계속 판단한 이후에 값을 넣어줘야 함.
				arr[i] = input[cnt - 1];
				i++;
			}
			count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == 0) {
					count++;
				}
			}
			arr2 = new int[arr.length - count];
			for (int k = 0; k < arr2.length; k++) {
				arr2[k] = arr[k];
			}
			System.out.println(Arrays.toString(arr2));
			System.out.println(Arrays.toString(arr));
			
			if (cnt > input.length && run) {
				break;
			}
		}			
	}
}
