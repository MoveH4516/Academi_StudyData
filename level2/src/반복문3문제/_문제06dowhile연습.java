package 반복문3문제;

public class _문제06dowhile연습 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	조건1 1~10까지 반복문을 실행하여 숫자 출력
		 	조건2 1~5까지는 "안녕"을 함께출력
		 	조건3 6~10까지는 "잘가"를 함께출력
		 */
		
		int i = 1;
		do {
			if (i >= 1 && i <= 5) {
				System.out.printf("%d안녕\n", i);
			} else {
				System.out.printf("%d잘가\n", i);
			}
			i++;
		}
		while (i <= 10);
	}
}
