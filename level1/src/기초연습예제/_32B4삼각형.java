package 기초연습예제;

public class _32B4삼각형 {
	public static void main(String[] args) {
		/*
		[문제]
			가로가 3이고 세로가 6인 삼각형 3개의 넓이의 합이
			가로가 7이고 세로가 9인 사각형 1개의 넓이보다 작은지 여부를
			true 또는 false로 표현하시오.
		[정답]
			true
	 */
	
		int a = 3;
		int b = 6;
		
		double triangle3 = a * b / 2.0 * 3;
		
		int c = 7;
		int d = 9;
		int rectangle = c * d;
		
		boolean result = triangle3 < rectangle;
		
		System.out.println(result);
		
	}
}
