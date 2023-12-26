package 반복문1문제;

public class _문제01연습문제1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	조건1 1~10까지 반복문을 실행하여 숫자 출력
		 	조건2 1~5까지는 "안녕"을 함께출력
		 	조건3 6~10까지는 "잘가"를 함께출력
		 */
		
		int i = 1;
		
		while (i <= 10) {
			if (i <= 5) {
				System.out.println(i + "안녕");
			} else {
				System.out.println(i + "잘가");
			}
			i++;
		}		
	}
}
