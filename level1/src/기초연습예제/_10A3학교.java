package 기초연습예제;

public class _10A3학교 {
	public static void main(String[] args) {
		/*
		[문제]
			철수는 자전거를 타고 2,300m 떨어진 학교에 갔다.
			학교에서 계단을 지하4층까지 걸어갔다가 올라왔다.
			계단 한 층의 길이는 8m이다.
			다시 철수는 운동장을 3바퀴 돌고 집에왔다.
			운동장 1바퀴는 280m이다.
			철수는 오늘 몇m를 다녀왔는지 구하시오.
		[정답]
			5,504m
	 */	
		
		int school = 2300;
		int floor = 4;
		int length = 8;
		int ground = 280;
		int count = 3;
		
		int totalDistance = 2 * school + 2 * floor * length + ground * count;
		
		System.out.println(totalDistance + "m");
		
	}
}
