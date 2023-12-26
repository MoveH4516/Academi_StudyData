package 기초연습예제;

public class _25B2설탕 {
	public static void main(String[] args) {
		/*
		[문제]
			설탕 15kg을 6명에게 똑같이 나누어 주려고 합니다.
			한명씩 차레대로 설탕을 나눠갖는다고 했을 때
			4번째 사람이 받아가면 남은 설탕량은 얼마인지 구하시오.
		[정답]
			5kg
	 */	
		
		int sugar = 15;
		int people = 6;
		double sugPerPeo = 1.0 * sugar / people;
		double result = sugar - 4 * sugPerPeo;
		
		System.out.printf("%.0fkg",result);
		
	}
}
