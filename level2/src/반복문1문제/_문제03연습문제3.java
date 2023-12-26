package 반복문1문제;

public class _문제03연습문제3 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	조건1) 1~10까지 반복한다
		 	조건2) 3의 배수일 경우 "안녕"을 출력한다
		 */
		
		int i = 10;
		while (i >= 1) {
			if (i % 3 == 0) {
				System.out.println("안녕");
			} else {
				System.out.println(i);
			}
			i--;
		}
	}
}
