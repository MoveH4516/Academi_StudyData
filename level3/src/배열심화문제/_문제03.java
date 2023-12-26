package 배열심화문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제03 {
	public static void main(String[] args) {
	/*
		[문제] 값을 입력받고 삭제 
		[조건] 만약에 같은값이 여러개 있으면 가장 마지막의값 한개만 삭제 후 b 에 순차적으로 저장 
		[예] 5 ==> b [] = {5,2,6,8,6}; 
		[예] 6 ==> b [] = {5,2,6,8,5};
	*/
		Scanner sc = new Scanner(System.in);
		int[] data = { 5, 2, 6, 8, 5, 6 };
		int[] b = null;
		int idx = -1;
		int num = 0;
		while (true) {
			System.out.print("값 입력 : ");
			int input = sc.nextInt();
			for (int i = 0; i < data.length; i++) {
				if (data[i] == input) {
					idx = i;
					break;
				}
			}
			if (idx == -1) {
				System.out.println("일치하는 값이 없습니다.");
			} else {
				num = input;
				break;
			}
		}
		
		for (int i = data.length - 1; i >= 0; i--) {
			if (data[i] == num) {
				data[i] = 0;
				break;
			}
		}
		idx = 0;
		b = new int[data.length - 1];
		for (int i = 0; i < data.length; i++) {
			if (data[i] != 0) {
				b[idx] = data[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(b));
		sc.close();
	}
}
