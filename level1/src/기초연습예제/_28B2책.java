package 기초연습예제;

public class _28B2책 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 128페이지 책에서 72페이지까지 읽었다.
			지금까지 읽은 페이지는 전체 중 몇% 인지 구하시오.
			단, 소수점 두 자리까지 출력하시오.
		[정답]
			56.25%
	 */	
		
		int total = 128;
		int read = 72;
		double per = 100.0 * read / total;
		
		System.out.printf("%.2f%%\n", per);
		
	}
}
