package 기초연습예제;

public class _31B4블럭쌓기 {
	public static void main(String[] args) {
	/*
		[문제]
			철수는 2시간 동안 블럭은 231개 쌓았다.
			민수는 1시간 반 동안 블럭을 177개 쌓았다.
			철수가 민수보다 블럭을 쌓는 속도가 더 빠른지 여부를
			true 또는 false로 표현하시오.
		[정답]
			false
	 */	
		
		int cheolB = 231;
		int minsuB = 177;
		int cTime = 2;
		double mTime = 1.5;
		int cTimeMin = cTime * 60;
		double mTimeMin = mTime * 60;
		
		double cVel = 1.0 * cheolB / cTimeMin;
		double mVel = 1.0 * minsuB / mTimeMin;
		
		boolean result = cVel > mVel;
		
		System.out.println(result);
		
	}
}
