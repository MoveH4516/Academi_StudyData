package 이차원반복문;

public class _02구구단 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	구구단 출력
		 */
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("=== " + i + "단 ===");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i ,j, i * j);
			}
		}
		
	}
}
