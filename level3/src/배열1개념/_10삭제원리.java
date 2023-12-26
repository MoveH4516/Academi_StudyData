package 배열1개념;

import java.util.Arrays;
import java.util.Scanner;

public class _10삭제원리 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {21, 1, 67, 1, 21};
		
		
		int count = 0;
		int round = arr.length - 1;
		int idx = -1;
		while(true) {
			System.out.println("1.삭제(인덱스)");
			System.out.println("2.삭제(값)");
			System.out.println("3.중복삭제(값)");  // [1,67,0,0,0]
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.print("삭제할 인덱스 : ");
				int index = sc.nextInt();
				if (index < 0 || index > round) {
					System.out.println("에러");
					continue;
				}
				for (int i = index; i < arr.length-1; i++) {
					arr[i] = arr[i + 1];
					round--;
				}
				arr[arr.length - 1] = 0;
			} else if (sel == 2) {
				System.out.print("삭제할 값 : ");
				int value = sc.nextInt();
				idx = -1;
				for (int i = 0; i < arr.length; i++) {
					if (value == arr[i] && value != 0) {
						arr[i] = 0;
						idx = i;
					}
				}
				if (idx == -1) {
					System.out.println("에러");
					continue;
				}
				for (int i = idx; i < arr.length-1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = 0;
			} else if (sel == 3) {
				System.out.print("중복 삭제 값 : ");
				int val = sc.nextInt();
				idx = -1;
				for (int i = 0; i < arr.length; i++) {
					if (val == arr[i]) {
						arr[i] = 0;
						idx = i;
					}
				}
				if (idx == -1) {
					System.out.println("에러");
					continue;
				}
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i] == 0 && arr[i + 1] != 0) {
						arr[i] = arr[i + 1];
						arr[i + 1] = 0;
						count++;
					}
					if (count != 0) {
						i = 0;
						count = 0;
					}
				}
			} else {
				System.out.println("종료");
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
