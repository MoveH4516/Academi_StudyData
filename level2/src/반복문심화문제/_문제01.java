package 반복문심화문제;

public class _문제01 {
	public static void main(String[] args) {
		/*
		 [문제 ]
				철수는 무인도를 사들여 국왕이 되었다.
				철수는 평소 월요일을 싫어해서 주7일을 주6일로 바꾸고 월요일을 삭제했다.
				5월1일이 일요일이라고할때, 
				5월1일부터 5월31일까지 날짜와 요일을 전부 출력해보자.
				
				 
				 [예시]
				 	1 => 일
				 	2 => 화
				 	3 => 수
				 	4 => 목
				 	5 => 금
				 	6 => 토
				 	7 => 일
				 	8 => 화
				 	.......
				 */	
		
		int i = 1;
		System.out.printf("일\t화\t수\t목\t금\t토\n");
		while (i <= 31) {
			
			if (i % 6 == 1) {
				System.out.printf("%d\t", i);
			} else if (i % 6 == 2) {
				System.out.printf("%d\t", i);
			} else if (i % 6 == 3) {
				System.out.printf("%d\t", i);
			} else if (i % 6 == 4) {
				System.out.printf("%d\t", i);
			} else if (i % 6 == 5) {
				System.out.printf("%d\t", i);
			} else if (i % 6 == 0) {
				System.out.printf("%d\n", i);
			}
			
			i++;
		}
		
	}
}
