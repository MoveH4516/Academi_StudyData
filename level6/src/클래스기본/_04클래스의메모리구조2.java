package 클래스기본;

import java.util.Arrays;

class Sample02 {
	int[] arr = {10, 20, 30, 40, 50};
}

public class _04클래스의메모리구조2 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		Sample02 s4 = new Sample02();
		
		Sample02 temp = s4;
//		s4 = null;
		System.out.println(temp);
		System.out.println(s4);
		s4.arr = arr;
		s4.arr[2] = 2;
		System.out.println(Arrays.toString(temp.arr));
		System.out.println(arr);
		System.out.println(s4);
		System.out.println(Arrays.toString(s4.arr));
		
		
		
	}
}
