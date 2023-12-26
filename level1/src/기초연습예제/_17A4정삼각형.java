package 기초연습예제;

public class _17A4정삼각형 {
	public static void main(String[] args) {
		/*
		[문제]
			끈 12/9m를 모두 사용하여 정삼각형 모양 한 개를 만들었다.
			이 정삼각형의 한변의 길이를 구하시오.
			단, 소수점 두 자리까지 출력하시오.
		[정답]
			0.44
	 */
		
		double length = 12 / 9.0;
		int side = 3;
		double one = length / side;
		
		System.out.printf("%.2f\n", one);
		
	}
}
