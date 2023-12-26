package 기초연습예제;

public class _29B4농구 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 농구공을 12번 던져서 7번 성공했다.
			영희는 농구공을 17번 던져서 9번 성공했다.
			영희의 성공확률이 철수의 성공확률보다 더 높은지 여부를
			true 또는 false로 표현하시오.
		[정답]
			false
	 */	
		
		int cheol = 12;
		int yeong = 17;
		int cheolclear = 7;
		int yeongclear = 9;
		
		double cheolPer = 100.0 * cheolclear / cheol;
		double yeongPer = 100.0 * yeongclear / yeong;
		
		boolean result = cheolPer < yeongPer;
		
		System.out.println(result);
		
	}
}
