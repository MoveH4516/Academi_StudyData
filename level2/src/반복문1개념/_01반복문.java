package 반복문1개념;

public class _01반복문 {
	public static void main(String[] args) {
		
		/*
		 조건문 : 건너뛰기
		 반복문 : 되돌아가기
		 
		 특정 조건 동안 특정 구간을 반복한다.
		 while, for 두 가지가 있다.
		 
		 1. while (조건식) {
		 반복하고자 하는 내용
		 증감
		 }
		 */
		
		// 1~5를 출력하는 반복문
		
		int a = 1;
		
		while (a < 6) {
			System.out.println(a);
			a++;
		}
		// 증감이 없다면 무한루프에 빠지게 된다. 종료를 할 수 있도록 해주어야 한다.
		
		
		
	}
}
