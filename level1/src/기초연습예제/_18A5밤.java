package 기초연습예제;

public class _18A5밤 {
	public static void main(String[] args) {
		
	/*
		[문제]
			철수가 1시간 40분 동안 일정한 빠르기로 주은 밤의 무게가 11kg이다.
			3분동안 주은 밤은 몇 kg인지 구하시오.
			단, 소수점 두 자리까지 출력하시오.
		[정답]
			0.33 kg
	 */
		
		int hour = 1;
		int min = 40;
		int cheolMin = hour * 60 + min;
		int chestnut = 11;
		int time = 3;
		
		double weightPerMin = 1.0 * chestnut / cheolMin;
		double answer = weightPerMin * time;
		
		System.out.printf("%.2f kg\n", answer);
		
	}
}
