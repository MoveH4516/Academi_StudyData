package 배열심화문제2;

import java.util.Arrays;

public class _문제18압축풀기 {
	public static void main(String[] args) {
		
		/*
		[문제]
			아래 arr 배열은 압축한 데이터이다
			데이터는 2개씩 짝을 이룬다는 규칙이 있다
			1) 앞의 숫자 : 데이터
			2) 뒤의 숫자 : 개수
			
			ex) {3,4} = 3333
			
			temp 배열을 위 데이터의 크기만큼 생성하고
			각각의 값을 저장 후 출력
		*/
		
		int[][] arr = {
				{3, 2},
				{5, 6},
				{2, 1},
				{4, 3}
		};
		
		int[] temp = null;
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			size += arr[i][1];
		}
		int k = 0;
		temp = new int[size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i][1]; j++) {
				temp[k] = arr[i][0];
				k++;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
