package level4_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제04 {
	public static void main(String[] args) {
		

	//  값을 입력받고 삭제 
	// 조건) 만약에 같은값이 있으면 전부 삭제 
	// 예) 2 ==> 5,5,6,8,6
	// 예) 5 ==> 6,8,2,6
		
	// 4분39초84
		Scanner sc = new Scanner(System.in);		
		int data[] = {5,5,6,8,2,6};
		
		System.out.print("삭제할 값 : ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == num) {
				data[i] = 0;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(data));
		int[] temp = data;
		data = new int[temp.length - cnt];
		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				data[j] = temp[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(data));
		sc.close();
	}
}
