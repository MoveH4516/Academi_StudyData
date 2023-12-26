package level2_Test;

public class _문제12 {
	public static void main(String[] args) {
		
		/*
		[문제]
			학교에서 집까지 갈 때 시속 15km로 자전거를 타고 가면
			시속 6km로 걸어가는 것보다 18분 빨리 도착한다고 한다.
			학교에서 집까지의 거리를 구하시오.
		[정답]
			3km
		
		걸린시간 : 3분45초45
	 */
		
		double bikeVel = 15 / 60.0;
		double workVel = 6 / 60.0;
		int time = 1;
		
		while (true) {
			if (bikeVel * time == workVel * (time + 18)) {
				break;
			}
			
			time++;
		}
		double distance = bikeVel * time;
		System.out.printf("%.0fkm", distance);
	}
}
