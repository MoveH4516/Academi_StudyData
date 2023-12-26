package level2_Test;

public class _문제13 {
	public static void main(String[] args) {
		
		/*
		[문제]
			자전거는 1분에 4칼로리가 소모되고
			줄넘기는 1분에 9칼로리가 소모된다.
			
			철수는 90분 동안 505칼로리를 소모했다.
			철수가 각 운동에서 사용한 시간은 각각 얼마인지 구하시오.
		[정답]
		 	자전거 = 61분
			줄넘기 = 29분
			
		걸린시간 : 1분45초80
	 */
		
		int bike = 4;
		int jul = 9;
		int bikeTime = 90;
		int julTime = 0;
		int cheolCal = 505;
		
		while (bikeTime >= 0) {
			if (bike * bikeTime + jul * julTime == cheolCal) {
				break;
			}		
			bikeTime--;
			julTime++;
		}
		System.out.println("자전거 : " + bikeTime + "분");
		System.out.println("줄넘기 : " + julTime + "분");
	}
}
