package 배열심화개념;

import java.util.Arrays;

public class _03메모리구조1 {
	/*
	 main 메소드 안에서 소스코드를 작성중
	 메소드 안에서 선언한 변수는 전부 지역변수
	 지역변수 >>> 반드시 초기값이 존재해야 한다.
	 */
	public static void main(String[] args) {
		
		// 데이터 영역 구분
		// 1. 스택(stack) : 메소드의 영역(지역변수)
		// 2. 힙 heap : new 를 한 모든 것의 영역 (참조변소)
		// 3. 스태틱(static) : static 이 붙은 것.
		
		int a = 10;
		int b = 20;
		
		int[] arr = new int[3];
		int[] arr2 = {a, b};
		int[] arr3 = arr;
		
		arr[0] = 10;
		arr[1] = b;
		
		// new 를 선언해준 변수가 arr 과 arr2 이므로 heap에 있는 메모리는 2개이다.
		// arr3 은 new 가 아니기 때문에 main 안에 있는 지역변수 이다.
		// 따라서 arr 배열의 값이 달라지면 arr3 도 똑같이 달라진다.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}
}
