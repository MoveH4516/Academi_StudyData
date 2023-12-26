package level1_Test;

import java.util.Random;

public class _문제08 {
	public static void main(String[] args) {
		/*
		[문제 8]
			이번달 1일이 수요일이라고 할 때
			랜덤으로 1 ~ 31을 저장하고 해당 요일을 출력하시오.
			
			예)
				3일  ==> 금요일
			
				월	화	수	목	금	토	일
					    1   2	3 	4 	5
				6	7	8	9	10	11	12
				13	14	15	16	17	18	19
				20	21	22	23	24	25	26
				27	28	29	30	31
			 
			
			8분38초29
	 */	
		
		Random rd = new Random();
		int day = rd.nextInt(31) + 1;		
		int a = day % 7;
		boolean pass = day > 0 && day < 32;
		System.out.printf("오늘 날짜 : %d일\n", day);
		
		if (pass && a == 1) {
			System.out.printf("%d일 수요일\n", day);
		} else if (pass && a == 2) {
			System.out.printf("%d일 목요일\n", day);
		} else if (pass && a == 3) {
			System.out.printf("%d일 금요일\n", day);
		} else if (pass && a == 4) {
			System.out.printf("%d일 토요일\n", day);
		} else if (pass && a == 5) {
			System.out.printf("%d일 일요일\n", day);
		} else if (pass && a == 6) {
			System.out.printf("%d일 월요일\n", day);
		} else if (pass && a == 0) {
			System.out.printf("%d일 화요일\n", day);
		}		
	}
}
