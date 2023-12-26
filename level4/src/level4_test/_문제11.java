package level4_test;

public class _문제11 {
	public static void main(String[] args) {
		
		 /* [문제]	
		  *  아래 와 같은데이터일때 도서 연체여부 출력(단, 윤년은 계산하지않는다)
	    [정답]   빌린지 12일 연체일이 2일 경과 되었습니다 
		 */

	    int rentalPeriod = 10;
		int [] rentalDay = {2023 , 10, 25};
		int [] today = {2023, 11, 06};
			
		int monthList[] = {31, 28, 31, 30, 31, 31, 30,
					31 , 30 , 31 , 30 , 31};
		int period = 0;
		int month = 0;
		if (today[0] == rentalDay[0] && today[1] == rentalDay[1]) {
			period = today[2] - rentalDay[2];
		} else if (today[0] == rentalDay[0]) {
			for (int i = 0; i < today[1] - rentalDay[1]; i++) {				
				month += monthList[rentalDay[1] - 1];
			} 
			period = month + (today[2] - rentalDay[2]);
		} else if (today[0] != rentalDay[0]) {
			
			for (int i = 0; i < today[1] - rentalDay[1]; i++) {				
				month += monthList[rentalDay[1] - 1];
			}
			
			period = 365 * (today[0] - rentalDay[0]) + month + (today[2] - rentalDay[2]);
		}
		System.out.println("빌린지 " + period + "일");
		if (period > rentalPeriod) {
			System.out.println("연체일 : " + (period - rentalPeriod) + "일 경과");
		} else {
			System.out.println("연체 없음");
		}
	}
}
