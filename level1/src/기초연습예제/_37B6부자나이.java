package 기초연습예제;

public class _37B6부자나이 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 13살이고 철수의 아버지는 45살이다.
			몇년 후 철수의 아버지는 철수 나이의 3배가 될지 구하시오.
		[정답]
			3년
	 */	
		
		int cheol = 13;
		int dad = 45;
		double year = (dad - 3 * cheol) / 2.0;
		
		// (cheol + year) * 3 = (dad + year)
		// 2year = dad - 3cheol
		// year = (dad - 3cheol) / 2
		
		System.out.printf("%.0f년",year);
	}
}
