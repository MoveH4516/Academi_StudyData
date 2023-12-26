package 배열2문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제14삭제원리1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	a 배열 안의 값을 한 개 입력받는다.
		 	b 배열 안에 위에서 입력한 값을 제외하고 복사한다.
		 	단, 없는 값은 예외처리
		 */
		Scanner sc = new Scanner(System.in);
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {0, 0, 0, 0, 0};
		int num = 0;
		int i = 0;
		int index = -1;
		boolean run = true;
		while (run) {
			System.out.print("값 입력 : ");
			num = sc.nextInt();
			for (i = 0; i < a.length; i++) {
				if (num == a[i]) {
					index = i;
					run = false;
					break;
				}
			}
			if (index == -1) {
				System.out.println("입력값 오류");
			}
			
		}
		i = 0;
		for (int j = 0; j < b.length - 1; j++) {
			if (num != a[i]) {
				b[j] = a[i];
				i++;
			} else {
				i++;
				b[j] = a[i];
				i++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
