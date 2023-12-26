package 반복문1문제;

public class _문제13교통카드 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	선호네 반 학생 25명
		 	버스를 탔는데 총 요금이 19400원이다
		 	
		 	교통카드를 사용하면 720원
		 	현금으로 지불하면 1000원
		 	
		 	교통카드를 사용한 학생과 현금을 사용한 학생은 각각 몇 명인지 출력
		 */
		
		int i = 25;
		int j = 0;		
		int card = 720;
		int cash = 1000;
		int total = 19400;
		
		while (i >= 0) {
			if (card * i + cash * j == total) {
				break;
			}
			i--;
			j++;
		}
		System.out.println("카드를 사용한 학생 : " + i + "명");
		System.out.println("현금을 사용한 학생 : " + j + "명");
	}
}
