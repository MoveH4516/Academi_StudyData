package 기초2문제;
/*
[문제]
	철수는 자전거를 타고 일정한 빠르기로 7분 동안 23/30km를 갔다.
	철수가 자전거를 타고 1분 동안 간 거리가 몇 km인지 구하시오.
	단, 소수점 두 자리까지 출력하시오.
[정답]
	0.11km
*/
public class _문제08자전거 {
	public static void main(String[] args) {
		
		
		// 7 : 23/30 = 1 : x >> x = 
		double bike7MinDis = 23.0 / 30;
		double bikeVelocity = bike7MinDis / 7;
		int biketime = 1;
		
		System.out.println(String.format("%.2f",bikeVelocity * biketime) + "km");
		
	}
}
