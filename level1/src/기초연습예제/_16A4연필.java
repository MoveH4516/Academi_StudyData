package 기초연습예제;

public class _16A4연필 {
	public static void main(String[] args) {
	/*
		[문제]
			연필 7타를 학생들에게 나눠주려고 한다.
			여학생 2명과 남학생 4명에게 남김없이 똑같이 나누어주면
			한 사람은 연필을 몇자루 가지게 되는지 구하시오.
			(연필 1타는 12자루)
		[정답]
			14자루
	 */	
		
		int pen = 7;
		int totalPen = pen * 12;
		int girl = 2;
		int man = 4;
		int people = girl + man;
		
		System.out.println(totalPen / people + "자루");
		
	}
}
