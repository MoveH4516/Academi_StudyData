package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _문제10가장큰수위치 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	반복문을 사용하여 1~9를 5번 출력한다.
		 	1. 랜덤 숫자 중 가장 큰 수와 번호를 출려.
		 	(번호는 출력 순서)
		 	2. 가장 큰 수가 여러개 있다면 가장 첫 번째 번호를 출력
		 	
		 	
		 	(심화문제)
		 	무조건 n 번 째 수를 가장 큰 수로 만드는 것.
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int cnt = 0;
		int max = 0;
		boolean pass = true;
		System.out.print("몇 번 째 숫자를 큰 수로 만드시겠습니까? : ");
		int rank = sc.nextInt();
		if (rank > 5 || rank < 0) {
			System.out.println("1~5 사이의 정수를 입력하세요.");
			pass = false;
		}		
		while (pass) {
			while (i <= 5) {
				int num = rd.nextInt(9) + 1;
				System.out.print(num + " ");
				if (max < num) {
					max = num;
					cnt = i;				
				}				
				i++;
			}
			if (cnt != rank) {
				i = 1;
				max = 0;
				System.out.println("");
				continue;
			} else {
				System.out.printf("가장 큰 수 %d은(는) %d번 째 수이다.", max, cnt);
				pass = false;
			}			
		}
		sc.close();
	}
}
