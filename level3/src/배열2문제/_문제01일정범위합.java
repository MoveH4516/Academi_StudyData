package 배열2문제;

import java.util.Scanner;

public class _문제01일정범위합 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	인덱스 2개를 입력받고
		 	작은 인덱스부터 큰 인덱스까지의 값들의 합을 출력.
		 */
		Scanner sc = new Scanner(System.in);
		int[] array = {10, 43, 25, 76, 3, 100, 56};
		
		int index1 = 0;
		int index2 = 0;
		
		System.out.print("첫 번째 인덱스 : ");
		index1 = sc.nextInt();
		System.out.print("두 번째 인덱스 : ");
		index2 = sc.nextInt();
		
		int down = 0;
		int up = 0;
		boolean pass = false;
		if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
			System.out.println("인덱스 범위 오류");
		} else {
			pass = true;
		}
		if (index1 < index2) {
			down = index1;
			up = index2;
		} else {
			down = index2;
			up = index1;
		}
		int sum = 0;
		for (int i = down; i <= up && pass; i++) {
			sum += array[i];
			System.out.print(i == up ? array[i] : array[i] + " + ");
		}
		if (pass) {
			System.out.print(" = " + sum);
		}
		sc.close();
	}
}
