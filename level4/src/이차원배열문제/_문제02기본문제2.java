package 이차원배열문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제02기본문제2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	인덱스 2개를 입력받아 값 출력
		 	
		 	값을 입력받아 인덱스 2개 출력
		 	
		 	가장 큰 값의 인덱스 2개 출력
		 	
		 	값 2개를 입력받아 값 교체
		 */
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int num = 10;
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {			
				arr[i][j] = num;
				num += 10;
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		int i = 0;
		while (true) {
			System.out.print("인덱스1 : ");
			idx1 = sc.nextInt();
			System.out.print("인덱스2 : ");
			idx2 = sc.nextInt();
			if (idx1 < 0 || idx1 >= arr.length || idx2 < 0 || idx2 >= arr[i].length) {
				System.out.println("인덱스 범위 오류");
				continue;
			}
			System.out.println(arr[idx1][idx2]);
			break;			
		}
		boolean run = true;
		int number = 0;
		while (true) {
			System.out.print("값 입력 : ");
			number = sc.nextInt();
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					if (number == arr[j][k]) {
						idx1 = j;
						idx2 = k;
						run = false;
						break;
					}
				}				
			}
			if (run) {
				System.out.println("일치하는 값이 없습니다.");
				continue;
			} else {
				break;
			}		
		}
		System.out.println(idx1 + " " + idx2);
		
		int max = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr[j].length; k++) {
				if (max < arr[j][k]) {
					max = arr[j][k];
					idx1 = j;
					idx2 = k;
				}
			}			
		}
		System.out.println(idx1 + " " + idx2);
		int number2 = 0;
		idx1 = -1;
		idx2 = 0;
		int idx3 = -1;
		int idx4 = 0;
		while (true) {
			System.out.print("값 입력1 : ");
			number = sc.nextInt();
			System.out.print("값 입력2 : ");
			number2 = sc.nextInt();
			if (number == number2) {
				System.out.println("같은 값끼리는 교체할 수 없습니다.");
				continue;
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					if (number == arr[j][k]) {
						idx1 = j;
						idx2 = k;
					}
					if (number2 == arr[j][k]) {
						idx3 = j;
						idx4 = k;
					}
					if (idx1 != -1 && idx3 != -1) {
						run = false;
						break;
					}
				}				
			}
			if (run) {
				System.out.println("일치하는 값이 없습니다.");
				continue;
			} else {
				int temp = arr[idx1][idx2];
				arr[idx1][idx2] = arr[idx3][idx4];
				arr[idx3][idx4] = temp;
				
				break;
			}
		}
		System.out.println(Arrays.deepToString(arr));
		sc.close();
	}
}
