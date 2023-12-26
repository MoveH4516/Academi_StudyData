package 기초2문제;
/*				
[문제1] 
	철수는 870미터를 40분간 걸어갔다. 
	철수의 시속은 얼마인가?
	철수의 분속은 얼마인가?
[문제2]
	철수는 시속 3km의 속도로 37분간 걸어갔다.
	철수가 이동한 거리는 몇km인가?
	철수가 이동한 거리는 몇m인가?
*/
public class _문제03속력 {
	public static void main(String[] args) {
		
		double distance40Min = 870.0;
		int min = 40;
		double distancePerHour = distance40Min / min * 60;
		
		System.out.printf("철수의 시속 %.0fm/hour\n",distancePerHour);
		System.out.printf("철수의 분속 %.2fm/min\n",distance40Min / min);
		
		distancePerHour = 3.0;
		min = 37;
		double distance = distancePerHour * min / 60;
		
		System.out.printf("철수가 이동한 거리는 %.2f km\n", distance);
		System.out.printf("철수가 이동한 거리는 %.0f m\n", distance * 1000);
		
	}
}
