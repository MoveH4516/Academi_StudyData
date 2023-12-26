package 반복문1문제;

public class _문제12두지점 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	철수네 가족은 x와 y 두 지점을 자전거를 타고 왕복하였다.
		 	갈 때는 시속 15km, 올 때는 시속 12km를 이동하여
		 	총 45분이 걸렸다.
		 	두 지점 x와 y의 각각 소요시간과
		 	왕복으로 이동한 총 거리를 구하시오.
		 */
		
		int i = 45;
		int j = 0;
		double iVel = 15.0 / 60;
		double jVel = 12.0 / 60;
		int x = 0;
		int y = 0;
		
		while (i > 0) {
			if (iVel * i == jVel * j) {
				x = i;
				y = j;				
			}			
			i--;
			j++;
		}
		double distance = iVel * x * 2;
		System.out.println("x에서 이동한 시간 : " + x + "분");
		System.out.println("y에서 이동한 시간 : " + y + "분");
		System.out.printf("왕복 총 거리 : %.0fkm\n", distance);
	}
}
