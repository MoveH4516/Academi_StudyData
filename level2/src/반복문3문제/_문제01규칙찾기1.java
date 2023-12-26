package 반복문3문제;

public class _문제01규칙찾기1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	while 문을 사용하여 아래와 같이 출력
		 	
		 	0 0 1
		 	1 2 3
		 	2 4 5
		 	3 6 7
		 	4 8 9
		 */
		
		int i = 0;
		while (i < 5) {
			System.out.printf("%d %d %d\n",i , i * 2, i * 2 + 1);
			i++;
		}
		System.out.println("===================");
		for (i = 0; i < 5; i++) {
			System.out.printf("%d %d %d\n",i , i * 2, i * 2 + 1);
		}		
	}
}
