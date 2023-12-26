package 배열1개념;

import java.util.Arrays;
import java.util.Random;

public class _07중복숫자금지1 {
	public static void main(String[] args) {
		
		// 중복 숫자 금지 해결하는 3가지
		// [방법 1] 셔플
		// 랜덤으로 중복없이 배열에 저장.
		
		Random rd = new Random();
		
		int[] arr = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < 100; i++) {
			int idx1 = rd.nextInt(4);
			int idx2 = rd.nextInt(4);// 0 1 2 3 배열의 방 번호와 같음
			
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
