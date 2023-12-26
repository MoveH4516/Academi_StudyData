package 반복문응용문제;

import java.util.Arrays;
import java.util.Scanner;

public class _04배열중복제거1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	값을 입력받아 data 배열에서 해당 값을 제외하고
		 	배열 b에 저장
		 	단, 같은 값이 여러개 있으면 전부 제외.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] data = {5, 2, 6, 8, 5, 6};
		int[] b = {0, 0, 0, 0, 0, 0};
		
		System.out.print("제외할 값 : ");
		int num = sc.nextInt();
		boolean pass = true;
		for (int i = 0; i < b.length; i++) {
			if (num == data[i]) {
				pass = true;
				break;
			} else {				
				pass = false;
			}
		}
		for (int i = 0; i < b.length && pass; i++) {	
			// cnt++; 해주고 data[data.length - cnt] = 0; 처리
			// 한 칸씩 땡겨주는것과 동일하게
			// k = i; k < length - 1; k++ 에서 arr[k] = arr[k+1] 해주기
			for (int j = 0; j < data.length; j++) {
				if (num == data[j]) {
					data[j] = 0;
				}
				if (data[j] != 0) {
					b[i] = data[j];
					data[j] = 0;
					break;
				}
			}			
		}
		if (!pass) {
			System.out.println("일치하는 값이 없습니다.");
		}
		System.out.println(Arrays.toString(b));
		sc.close();
	}
}
