package 기초3문제;

public class _문제01방정식부등식문제 {
	public static void main(String[] args) {
		
		/*
		[미지수가 하나인 일차방정식]
		각 방정식의 풀이 과정을 주석으로 표현하시오.
	*/

	int a = 0;
	a = 17;
	boolean result1 = 7 * 2 - a == 3 * -2 - -3;
	// a = 14 + 6 - 3 >> a = 17

    int b = 0;
    b = 10;
    boolean result2 = 7 * 2 - b * 2  < -5;
	// 2b > 14 + 5
    // b > (14 + 5) / 2
    // b > 9.5인 정수 이므로 b >= 10 인 정수
    System.out.println(result1);
    System.out.println(result2);
    
	}
}
