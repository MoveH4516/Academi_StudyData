package 기초연습예제;

public class _22A5상점 {
	public static void main(String[] args) {
		/*
		[문제]
			상점에 과일이 250개가 있다.
			그 중에 오전에 84%가 팔렸고 나머지 16%는 오후에 다팔렸다.
			오전에 팔린개수 - 오후에 팔린개수는 얼마인지 구하시오.
		[정답]
			170개
	 */	
		
		int fruit = 250;
		double morning = 0.84;
		double rest = 0.16;
		double morCount = morning * fruit;
		double afterCount = rest * fruit;
		
		System.out.printf("%.0f개\n", morCount - afterCount);
		
	}
}
