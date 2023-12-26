package 이차원반복문;

public class _03삼각형그리기 {
	public static void main(String[] args) {
		
		/*
		 [문제1]
		 	#
		 	##
		 	###
		 	
		 [문제2]
		 	###
		 	##
		 	#
		 [문제3]
		 	@##
		 	@@#
		 	@@@
		 [문제4]
		 		#
		 	   ###
		 	  #####
		 */
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("===========");
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("===========");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j <= i) {
					System.out.print("@");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		System.out.println("===========");
		int max = 4;
		for (int i = 1; i <= max; i++) {
			for (int j = max; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("#");
			}			
			System.out.println();
		}
		
	}
}
