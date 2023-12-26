package 반복문3문제;

public class _문제03규칙찾기3 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	반복문을 사용해서 아래와 같이 출력
		 	
		 	0 30
		 	1 29
		 	2 27
		 	3 24
		 	4 20
		 	5 15
		 	6 9
		 	7 2
		 	8 -6
		 	9 -15
		 */
		
		int j = 30;
		int sum =0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			System.out.printf("%d %d\n",i ,j - sum);
		}
		
	}
}
