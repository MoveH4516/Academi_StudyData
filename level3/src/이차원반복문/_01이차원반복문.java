package 이차원반복문;

public class _01이차원반복문 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	###
		 	###
		 	###
		 	1차원 반복문으로 한 번, 2차원 반복문으로 한 번 해보기
		 */
		 
		for (int i = 1; i < 10; i++) {
			System.out.print("#");
			if (i % 3 == 0) {
				System.out.println();
			}			
		}
		System.out.println("===================");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
}
