package 반복문3문제;

public class _문제04규칙찾기4 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	10회 반복해서 다음과 같이 출력
		 	
		 	0 0
		 	1 0
		 	2 1
		 	3 1
		 	4 2
		 	5 2
		 	6 3
		 	7 3
		 	8 4
		 	9 4
		 */
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d %d\n",i ,i / 2);
		}
		
	}
}
