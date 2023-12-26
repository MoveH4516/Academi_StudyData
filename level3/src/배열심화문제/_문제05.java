package 배열심화문제;

import java.util.Arrays;

public class _문제05 {
	public static void main(String[] args) {
		
		/*
		[문제]
			1. seatList는 현재 영화관 예매상황이다.
			2. seatIndex는 예매하려는 좌석 번호이다.
			3. userList는 회원번호이다.
			
			4. seatIndex와 userList를 가지고 예매 후, 전체 예매상황을 출력하시오.
			5. 좌석이 비어있으면, 예매할 수 있다.
			6. 좌석이 이미 예매 되어있으면 아래 두 가지 조건 중 한 가지를 실행시켜야 한다.
				1) 이미 예매되어있으나, 회원번호가 같으면 예매를 취소하고 0으로 변경한다.
				2) 이미 예매되어있고, 회원번호가 다르면 "x"를 출력한다.
				
				
				예) 1 , 1003 ==> 예매 되어있으나, 1003번이 예매했으므로 예매 취소된다 
		        ==> seatList[] = {1003,0,0,0,1002,0,1001}
		        
		        예) 1 , 1002 ==> 위에서 예매취소했으므로 예매 가능
		 		==> seatList[] = {1003,1002,0,0,1002,0,1001}

				예) 4 , 1005 ==> 예매 되어있고, 회원번호도 다르다 
				==> "x"
		 */

	   	int[] seatList = {1003,1003,0,0,1002,0,1001};		
		int[] seatIndex = {1,1,4};
		int[] userList = {1003,1002,1005};
		
		for (int i = 0; i < userList.length; i++) {
			if (seatList[seatIndex[i]] == 0) {
				seatList[seatIndex[i]] = userList[i];
				System.out.println(Arrays.toString(seatList));
			} else if (userList[i] == seatList[seatIndex[i]]) {
				seatList[seatIndex[i]] = 0;
				System.out.println(Arrays.toString(seatList));
			} else if (userList[i] != seatList[seatIndex[i]]) {
				System.out.println("X");
			}
		}
	}
}
