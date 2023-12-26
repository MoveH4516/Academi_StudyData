package 콜렉션벡터;

import java.util.Arrays;
import java.util.Vector;

public class _04벡터주의사항 {
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 3, 2, 2, 3, 3, 4, 4, 5, 5, 4};
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 3) {
				cnt++;
				for (int j = i; j < arr.length - cnt; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - cnt] = 0;
				i--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		Vector<Integer> list = new Vector<Integer>();
		for (int num : arr) {
			list.add(num);
		}
		for (int num : list) {
			System.out.print(num + " ");
		}
	}
}
