package level3_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제13 {
	public static void main(String[] args) {
		
		/*
		[문제]
			아래 번호를 입력받아, 각 방향으로 0이 아닌 숫자를 모으시오.
			1)left 2)right
			
			예) 1)left
			   arr = {2,3,4,5,0,0,0,0,0}
			
			예) 2)right
			   arr = {0,0,0,0,0,2,3,4,5}
			
	 */
		Scanner sc = new Scanner(System.in);
			
		int[] arr = {0,2,0,3,4,0,0,5,0};	
		int[] array = null;
		int cnt = 0;
		int j = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				cnt++;
			}
		}
		array = new int[cnt];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				array[j] = arr[i];
				j++;
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(array));
		int i = 0;
		int a = arr.length - 1;
		
		while (true) {
			
			System.out.println("1)left");
			System.out.println("2)right");
			System.out.println("0)exit");
					
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel < 0 || sel > 2) {
				System.out.println("0~2 사이의 숫자를 입력하세요");
				continue;
			}
			if (sel == 0) {
				System.out.println("종료");
				break;
			}
			for (int k = 0; k < arr.length; k++) {
				arr[k] = 0;
			}
			for (j = 0; j <= 3; j++) {				
				if (sel == 1) {
					arr[i] = array[j];
				} else if (sel == 2) {
					arr[a] = array[j];
				}	
				i++;
				a--;
			}
			i = 0;
			j = 0;
			a = arr.length - 1;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
