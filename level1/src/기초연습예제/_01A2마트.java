package 기초연습예제;

public class _01A2마트 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 현금 10,000원을 가지고 여정 마트에 갔다.
			사과 한 개의 가격은 200원이고, 귤 한 개의 가격은 110원이다.
			사과 3개와 귤 10개를 사려고 한다.
			모두 사면 거스름돈은 얼마인지 구하시오.
		[정답]
			8,300원
	 */	
		
		int cash = 10000;
		int apple = 200;
		int mandarin = 110;
		int applecount = 3;
		int mandarincount = 10;		
		int sum = apple * applecount + mandarin * mandarincount;
		int result = cash - sum;
		
		System.out.println(result + "원");
	}
}
