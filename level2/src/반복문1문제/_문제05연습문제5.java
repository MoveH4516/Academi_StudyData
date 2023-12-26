package 반복문1문제;

public class _문제05연습문제5 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1~15 사이의 숫자를 출력
		 [옆으로 출력]
		 	, 를 사용하면서 옆으로 출력
		 */
		
		int i = 1;
		
		while (i < 15) {
			System.out.print(i + ", ");
			i++;
		}
		System.out.print(i);		
	}
}
