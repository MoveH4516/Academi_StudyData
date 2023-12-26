package level2_Test;

public class _문제08 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 13살이고 철수의 아버지는 45살이다.
			몇년 후 철수의 아버지는 철수 나이의 3배가 될지 구하시오.
		[정답]
			3년
			
		걸린시간 : 1분31초83
	 */

		int cheol = 13;
		int dad = 45;
		int year = 1;
		
		while (true) {
			if ((cheol + year) * 3 == dad + year) {
				break;
			}		
			year++;
		}
		System.out.println(year + "년");
	}
}
