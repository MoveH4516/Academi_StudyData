package 이차원반복문;

import java.util.Arrays;
import java.util.Scanner;

public class _05배열응용문제 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	숫자를 5개 입력받고 arr 배열안에 입력한 값이 있을 때마다
		 	b 배열안에 해당 값의 인덱스를 차례대로 저장하려고 한다.
		 	조건) 만약 입력한 숫자가 arr 에 없으면 인덱스 대신 -1 저장
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		int[] b = new int[5];
		int[] inputs = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("값" + (i + 1) + " : ");
			int input = sc.nextInt();
			inputs[i] = input;
			for (int j = 0; j < arr.length; j++) {
				if (input == arr[j]) {
					b[i] = j;
					break;
				}
				if (input != arr[j]) {
					b[i] = -1;
				}
			}
		}
		System.out.println("inputs : " + Arrays.toString(inputs));
		System.out.println("b : " + Arrays.toString(b));
		sc.close();
	}
}
