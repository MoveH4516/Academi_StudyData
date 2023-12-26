package 배열심화개념;

import java.util.Arrays;

public class _04깊은복사얕은복사 {
	public static void main(String[] args) {
		
		int[] arr3 = {10, 20, 30, 40};
		int[] temp = arr3;
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(temp));
		// 같은 주소를 공유하기 때문에 한쪽에서 값을 수정하면 다른쪽도 수정됨.
		// 이것이 얕은 복사
		
		// 깊은 복사 => 새로운 주소에 값을 복사
		
		int a = 10;
		int b = a;
		b = 100;
		System.out.println(a);
		System.out.println(b);
		// b 라는 새로운 메모리 방에 a 를 복사한 것이기 때문에
		// a 가 달라진다고 해서 b 도 달라지진 않는다.
		// 선언해준 그 당시에만 같아질 뿐 후에 수정하면 각자 다른 값을 갖는다.
		// 이를 배열에 적용하는 것이 깊은 복사
		
		int[] arr = {10, 20};
		int value = 50;
		int cnt = arr.length;
		
		// 깊은 복사를 하는 법.
		
		int[] copy = arr; // 기존의 주소값을 복사.
		arr = new int[cnt + 1]; // 기존의 길이에서 1 증가한 배열을 '새롭게' 선언.
		System.out.println(Arrays.toString(copy));
		for (int i = 0; i < copy.length; i++) {
			arr[i] = copy[i];
		}
		arr[arr.length - 1] = value;
		System.out.println(Arrays.toString(arr));		
	}
}
