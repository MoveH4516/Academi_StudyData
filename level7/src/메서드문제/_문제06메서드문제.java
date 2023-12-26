package 메서드문제;

import java.util.Arrays;

class Test08 {
	// 리턴 사용
	int cnt2 (int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	int[] arr1 (int[] arr) {
		int[] arr1 = new int[cnt2(arr)]; // cnt2(arr) 를 활용해서
		int idx = 0;					// cnt2 메서드를 실행한 뒤 cnt 값을 arr1에 
		for (int i = 0; i < arr.length; i++) { // 넣어주는 것이 가능
			if (arr[i] % 4 == 0) {
				arr1[idx++] = arr[i];
			}
		}
		return arr1;
	}
}

class Test09 {
	// 리턴 사용 X
	int cnt;
	int[] arr;
	void count (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
	}
	void array (int[] arr) {
		this.arr = new int[cnt];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				this.arr[idx++] = arr[i];
			}
		}
	}
}
public class _문제06메서드문제 {
	public static void main(String[] args) {
		Test08 t8 = new Test08();
		Test09 t9 = new Test09();
		
		int[] arr = {87, 12, 21, 56, 100};
		int cnt1 = t8.cnt2(arr);
		int[] arr1 = t8.arr1(arr);
		System.out.println(cnt1);
		System.out.println(Arrays.toString(arr1));
		t9.count(arr);
		int cnt2 = t9.cnt;
		System.out.println(cnt2);
		t9.array(arr);
		int[] arr2 = t9.arr;
		System.out.println(Arrays.toString(arr2));
		
	}
}
