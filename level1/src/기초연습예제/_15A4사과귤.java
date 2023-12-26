package 기초연습예제;

public class _15A4사과귤 {
	public static void main(String[] args) {
		/*
		[문제]
			귤 6개의 무게는 840g, 사과 3개의 무게는  750g 이다.
			귤 5개와 사과 4개의 무게를 구하시오.
		[정답]
			1,700g
	 */	
		
		int mandarin = 6;
		int apple = 3;
		double wMandarin = 840.0 / mandarin;
		double wApple = 750.0 / apple;
		
		double mandarin5 = wMandarin * 5;
		double apple4 = wApple * 4;
		
		System.out.printf("%.0fg\n", mandarin5 + apple4);
		
	}
}
