package 배열심화문제;

public class _문제04기념일 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	철수와 영희는 3월 3일에 만났다. 철수는 영희와 100일 기념일에
		 	축하파티를 하려고 한다 만난지 100일이 언제 인지 구하시오.
		 	
		 	윤년은 고려하지 않는다.
		 */
		
		int[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int month = 3;
		int day = 3;
		int dayCount = 100;
		dayCount += day;
		
		while (true) {
			if (month > 12) {
				month = 1;
			}
			if (dayCount - monthList[month - 1] > 0) {
				dayCount -= monthList[month - 1];
				month++;
			} else {
				System.out.printf("%d월 %d일",month, dayCount);				
				break;
			}
		}		
	}
}
