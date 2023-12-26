package 기초연습예제;

public class _19A5우유 {
	public static void main(String[] args) {
	/*
		[문제]
			다음은 오늘 우유상점의 매출결과이다.
			오전에는 전체 우유의 16%를 팔았다.
			오후에는 전체 우유의 15%를 팔았다.
			현재 남은 우유는 345개이다.
			오늘 전체 우유 수를 구하시오.
		[정답]
			500개
	 */	
		
		double milk;
		double morning = 0.16;
		double afternoon = 0.15;
		int restMilk = 345;		
		// milk * (1 - (morning + afternoon)) = restMilk
		milk = restMilk / (1 - (morning + afternoon));
		System.out.printf("%.0f개\n", milk);		
	}
}
