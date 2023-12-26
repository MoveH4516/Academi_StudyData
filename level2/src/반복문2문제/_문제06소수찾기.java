package 반복문2문제;

import java.util.Scanner;

public class _문제06소수찾기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	정수 한 개를 입력받아
		 	해당 숫자가 소수인지 아닌지 판별한다.
		 	
		 [힌트]
		 	1. 해당 숫자를 1부터 자기 자신까지 나눈다.
		 	2. 나머지가 0일 때마다 카운트를 센다.
		 	3. 그 카운트 값이 2이면 소수이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.print("입력받은 수 : ");
		int num = sc.nextInt();
		int cnt = 0;
		while (i <= num) {
			if (num % i == 0) {
				cnt++;
			}
			i++;
		}
		System.out.print(cnt + " ");
		if (cnt == 2) {
			System.out.println("소수이다.");
		} else {
			System.out.println("소수가 아니다.");
		}
		sc.close();
	}
}
