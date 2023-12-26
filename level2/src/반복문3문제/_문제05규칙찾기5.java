package 반복문3문제;

public class _문제05규칙찾기5 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	다음과 같이 출력
		 	
		 	0 1
		 	1 2
		 	2 3
		 	3 1
		 	4 2
		 	5 3
		 	6 1
		 	7 2
		 	8 3
		 	9 1
		 */
		int k = 0;
		for (int i = 0; i < 10; i++) {
			k++;
			if (i % 3 == 0) {
				k = 1;
			}
			System.out.printf("%d %d\n",i ,k);
		}		
	}
}
