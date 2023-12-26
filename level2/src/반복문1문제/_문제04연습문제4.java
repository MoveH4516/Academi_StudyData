package 반복문1문제;

public class _문제04연습문제4 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 1~15를 출력
		 	2. 5보다 크고 10 보다 작으면서 3의 배수일때는 숫자대신 "안녕" 출력
		 	3. 나머지는 전부 숫자 출력
		 */
		
		int i = 1;
		
		while (i <= 15) {
			if (i > 5 && i < 10 && i % 3 == 0) {
				System.out.println("안녕");
			} else {
				System.out.println(i);
			}
			i++;
		}
		
	}
}
