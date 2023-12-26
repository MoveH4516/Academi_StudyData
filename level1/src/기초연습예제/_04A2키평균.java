package 기초연습예제;

public class _04A2키평균 {
	public static void main(String[] args) {
		/*
		[문제]
			세 학생의 키는 다음과 같다.
			민수 : 184
			철수 : 165
			영희 : 160
			
			세 학생 키의 평균에서 키가 가장 작은 학생의 차이는 얼마인지 구하시오.
			단, 소수점 두 자리까지 출력하시오.
		[정답]
			9.67
	*/
	
		int minsu = 184;
		int cheolsu = 165;
		int yeonghee = 160;
		int mini = minsu;
		if (mini > cheolsu) {
			mini = cheolsu;
		}
		if (mini > yeonghee) {
			mini = yeonghee;
		}
		double avg = (minsu + cheolsu + yeonghee) / 3.0;
		double result = avg - mini;
		System.out.printf("%.2f", result);
		
	}
}
