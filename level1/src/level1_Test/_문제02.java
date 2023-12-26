package level1_Test;

public class _문제02 {
	public static void main(String[] args) {
		/*
		[문제 2]
			철수네 반 학생은 16명이다.
			8명은 양로원에 봉사활동을 다녀왔고
			4명은 지하철 봉사활동을 다녀왔다.
			봉사활동을 다녀오지 않은 학생의 비율은 몇% 인지 구하시오.
		[정답]
			25%
			
			3분14초85
	 */
		
		int classMember = 16;
		int yang = 8;
		int station = 4;
		int notVol = classMember - yang - station;
		
		double per = 1.0 * notVol / classMember * 100;
		
		System.out.printf("%.0f%%\n", per);
		
	}
}
