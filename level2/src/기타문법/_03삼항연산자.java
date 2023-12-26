package 기타문법;

public class _03삼항연산자 {
	public static void main(String[] args) {
		
		/*
		 항이 3 개인 연산자
		 조건 ? 참 : 거짓
		 if else 의 축소버전
		 */
		
		int a = 10;
		int b = 0;
		b = a == 10 ? 1 : -1;
		System.out.println(b);
		System.out.println(b % 2 == 0 ? "짝수" : "홀수");
	}
}
