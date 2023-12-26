package 반복문2문제;

import java.util.Scanner;

public class _문제11최댓값 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 반복문 안에서 계속해서 값을 입력받는다 (1~1000) 사이의 값
		 	2. 입력받은 숫자 중 가장 큰 숫자를 출력
		 	3. -1000을 입력하면 종료한다.
		 	4. 최댓값을 몇 번째에 입력했는지 출력한다, 최댓값을 중복으로 입력했을 시 첫 번째로
		 	입력한 최댓값의 변수를 출력한다.
		 	5. 반복문을 시작하자마자 종료하면 mot found 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean pass = true;
		int max = 0;
		int cnt = 0;
		int count = 0;
		while (pass) {
			System.out.print("수 입력 : ");
			int num = sc.nextInt();
			if (num < -1000 || num > 1000) {
				System.out.println("-999~1000 사이의 숫자를 입력하세요.");
				continue;
			}
			if (num == -1000 && cnt == 0) {
				System.out.println("not found");
				continue;
			}			
			cnt++;
			if (cnt == 1) {
				max = num;
				count = 1;
				continue;
			}
			if (max < num) {
				max = num;
				count = cnt;
				continue;
			}
			if (num == -1000) {
				System.out.println("반복문을 종료합니다.");
				pass = false;
			}
		}
		System.out.printf("최댓값은 %d이고, %d번 째 수입니다.\n", max, count);
		sc.close();
	}
}
