package level3_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제08 {
	public static void main(String[] args) {
		/*
		[문제]
			1. arr배열에 1~100 사이의 랜덤값 6개를 저장한다.
				예) arr = {7, 45, 3, 6, 7, 1}
			2. 배열의 값을 차례대로 출력한다. 그리고 선택 보기를 출력한다.
				예)
					1번 : 7
					(1)홀 (2) 짝
					
					2번 : 45
					(1)홀 (2) 짝
					...
			3. 제시된 문제가 홀수이면 1, 짝수이면 2를 선택한다.
			4. 6회 반복하고 정답개수를 출력한다.
			
			걸린시간 : 10분22초03
	 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			arr[i] = rd.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번 : " + arr[i]);
			System.out.println("(1)홀 (2)짝");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 2) {
				System.out.println("1과 2 중에서 선택하세요");
				i--;
				continue;
			}
			// 조건식을 arr[i] % 2 == sel % 2 로 해주면 더 깔끔하다.
			if ((arr[i] % 2 != 0 && sel == 1) || (arr[i] % 2 == 0 && sel == 2)) {
				System.out.println("정답");
				cnt++;				
			} else {
				System.out.println("오답");
			}
		}
		System.out.println("맞춘 횟수 : " + cnt);
		sc.close();
	}
}
