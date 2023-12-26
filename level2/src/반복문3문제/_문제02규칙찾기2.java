package 반복문3문제;

public class _문제02규칙찾기2 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	다음과 같이 출력하시오
		 	
		 	0 0
		 	1 1
		 	2 3
		 	3 6
		 	4 10
		 	5 15
		 	6 21
		 */
		int j = 0;
		for (int i = 0; i < 7; i++) {
			System.out.printf("%d %d\n",i, j += i);			
		}				
	}
}
