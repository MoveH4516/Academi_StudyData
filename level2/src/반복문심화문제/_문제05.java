package 반복문심화문제;

import java.util.Random;

public class _문제05 {
	public static void main(String[] args) {
		
		/* [문제 ]
		 * 철수는 요즘 주식에 관심을 보이기 시작했다. 
		 * 주식의 상승곡선이 궁금하기 시작했다. 
		 * 최근 관심있는 게임주식을 살펴보기로 했다. 
		 * 꾸준히 상승하는 기간중 가장 긴 기간을 출력해보자. 
		 * [1] 랜덤으로 1~8까지 숫자 10개를 순차적으로 출력한다. 
		 * [2] 랜덤숫자는 주가 수치를 뜻하고 숫자가크면 상승 낮으면 하락이다. 
		 * [예시] 아래와같이 랜덤숫자가 나왔다고하면 4 8 3 2 6 7 4 5 6 1
		 * (1) 처음 4 - 8 은 상승이고 8 다음은 3 이기때문에 최대 상승기간은 1이다. 
		 * (2) 다시 2 - 6 - 7 은 상승이고 7다음은 4이기 때문에 최대상승기간은 2이다. 
		 * (3) 4 - 5 - 6 은 상승이고 6 다음 1이기때문에 최대상승기간은 2이다. 
		 * (4) 같은 수치가 연속이면 상승으로 치지않는다. [정답] 2일
		 */
		
		Random rd = new Random();
		int i = 1;
		int upNum = 0;
		int cnt = 0;
		int result = 0;
		while (i <= 10) {		
			int num = rd.nextInt(8) + 1;
			System.out.printf("랜덤 숫자 : %d\n", num);
			if (i == 1) {
				upNum = num;
			}
			if (upNum < num) {
				upNum = num;
				cnt++;
			} else {
				upNum = num;
				if (result < cnt) { // 3 4 2 ''' 
					result = cnt;
				}
				cnt = 0;
			}			
			i++;
		}
		System.out.println(result);
	}
}
