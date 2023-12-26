package level3_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제05 {
	public static void main(String[] args) {				
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// b배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr 에 없으면 인덱스 대신 -1 저장 
	
		// 예) 10, 20, 10, 1, 50
		//  b ={0,1,0,-1,4}
		
		// 예)  30, 40, 1, 10, 2
		
		// b = {2,3,-1,0,-1}
		// 걸린시간 : 6분13초48
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();
			for (int k = 0; k < b.length; k++) {
				if (input == arr[k]) {
					b[i] = k;
					break;
				} else {
					b[i] = -1;
				}
			}
		}
		System.out.println("b = " + Arrays.toString(b));
		sc.close();
	}
}
