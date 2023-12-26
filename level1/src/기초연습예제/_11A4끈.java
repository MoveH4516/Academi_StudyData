package 기초연습예제;

public class _11A4끈 {
	public static void main(String[] args) {
	/*
		[문제]
			끈 5/8m를 모두 사용하여 정사각형 모양 한 개를 만들었다.
			이 정사각형의 한변의 길이는 몇m인지 구하시오.
			단, 소수점 자리는 두 자리까지 구하시오.
		[정답]
			0.16 m
	 */	
		
		double length = 5 / 8.0;
		double one = length / 4.0;
		System.out.printf("%.2fm", one);
		
	}
}
