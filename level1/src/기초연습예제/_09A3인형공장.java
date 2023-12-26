package 기초연습예제;

public class _09A3인형공장 {
	public static void main(String[] args) {
		/*
		[문제]
			인형 공장에서 인형 100개를 생산하는데 불량을 염두해두고 10개씩 더 만든다.
			인형을 350개 주문받았을 때 인형은 총 몇 개 생산해야 하는가?
		[정답]
			385개
	 */	
		
		int doll = 100;
		int errorPer100 = 10;
		double dollProducePer1 = (doll + errorPer100) / 100.0;		
		int order = 350;
		
		double produce = dollProducePer1 * order;
		System.out.printf("%.0f개", produce);						
	}
}
