package 배열1개념;

import java.util.Arrays;
import java.util.Scanner;

public class _11수정삽입원리 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	수정할 인덱스를 입력받고
		 	수정할 값을 입력받아 해당 위치의 값을 수정
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {21, 1, 67, 2, 0};
		int count = 4;
		while (true) {
			System.out.println("1.수정(인덱스)");
			System.out.println("2. 삽입(값)");
			
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.print("인덱스 : ");
				int idx = sc.nextInt();
				if (idx < 0 || idx > count) {
					System.out.println("에러");
					continue;
				}
				System.out.print("값 : ");
				int val = sc.nextInt();
				
				arr[idx] = val;				
			} else if (sel == 2) {
				System.out.print("인덱스 : ");
				int idx = sc.nextInt();
				if (idx < 0 || idx >= count) {
					System.out.println("에러");
					continue;
				}
				System.out.print("삽입 값 : ");
				int value = sc.nextInt();
				if (count == arr.length) {
					System.out.println("삽입할 데이터 공간이 없습니다.");
					continue;
				}
				for (int i = count; i > idx; i--) {
					arr[i] = arr[i - 1];
				}
				arr[idx] = value;
				count++;
			} else {
				System.out.println("종료");
				break;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
