package 배열심화문제;

public class _문제07 {
	public static void main(String[] args) {
		
		/*
		[문제]

		10월 10일날 부터 시작한 우리 수업 11월 30일 까지 총 수업 일수를 구하시오
		11월 30일 요일도 함께 구하시오 

		*/
		
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int startMonth = 10;
		int startDay = 10;
		int endMonth = 11;
		int endDay = 30;
		String weeks[] = { "월", "화", "수", "목", "금", "토", "일" };
		int i = 1;
		int result = months[startMonth - 1] - startDay + 1;
		while (true) {
			if (endMonth - startMonth > i) {
				result += months[endMonth - 1 - i];
				i++;
			} else {
				result += endDay;
			}			
			if (endMonth - startMonth == i) {
				break;
			}		
		}
		System.out.println("11월 30일(" + weeks[result % 7] + ")");
		System.out.println(result);
	}
}
