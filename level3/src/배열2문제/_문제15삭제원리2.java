package 배열2문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제15삭제원리2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 c 배열은 번호와 값이 한 쌍인 배열이다.
		 	번호를 하나 입력받아 c배열에 있는 번호이면,
		 	그 번호와 값만 제외하고 d배열에 복사한다.
		 */
		Scanner sc = new Scanner(System.in);
		int[] c = {1001, 40, 1002, 65, 1003, 70};
		int[] d = {0, 0, 0, 0, 0, 0};
		int num = 0;
		int index = -1;
		boolean run = true;
		while (run) {
			System.out.print("번호 : ");
			num = sc.nextInt();
			for (int i = 0; i < c.length; i += 2) {
				if (num == c[i]) {
					index = i;
					run = false;
					break;
				}
			}
			if (index == -1) {
				System.out.println("입력값 오류");
			}
		}
		System.out.println(index);
		int idx = 0;
		for (int i = 0; i < d.length; i++) {
			if (index != i && index != i + 1) {
				d[idx] = c[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(d));
		sc.close();
	}
}
