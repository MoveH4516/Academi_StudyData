package level1_Test;

public class _문제01 {
	public static void main(String[] args) {
		/*
		[문제 1]
			철수는 일정한 빠르기로 운동장을 5바퀴 도는데 1시간 15분 20초가 걸렸다.
			7바퀴를 도는데는 얼마나 걸릴지 구하시오.
			(시간 분 초로 표현)
		[정답]
			1시간 45분 28초
			
			11분01초98
	 */
		
		int hour = 1;
		int min = 15;
		int sec = 20;
		int num = 7;
		double time5 = (hour * 3600 + min * 60 + sec) / 5.0;
		double time7 = num * time5;
		System.out.println("철수가 한 바퀴 도는데 걸리는 시간 : " + time5);
		System.out.println("철수가 7바퀴 도는데 걸리는 시간 : " + time7);
		
		int hour7 = (int)time7 / 3600;
		int min7 = (int)time7 % 3600 / 60;
		int sec7 = (int)time7 % 3600 % 60;
		
		System.out.printf("%d시간 %d분 %d초\n", hour7, min7, sec7);
		
	}
}
