package level2_Test;

public class _문제11 {
	public static void main(String[] args) {
		
		/*
		[문제]
			철수는 두 번의 시험에서 각각 80점과 72점을 받았다.
			세 번째 시험에서 최소 몇 점 이상을 받아야
			평균 82점 이상이 되는지 구하시오.
		[정답]
			94점
			
		걸린시간 : 1분15초91
	 */

		int score1 = 80;
		int score2 = 72;
		int i = 1;
		double avg = 0;
		while (i <= 100) {
			avg = (score1 + score2 + i) / 3.0;
			if (avg >= 82) {
				break;
			}
			
			i++;
		}
		System.out.println(i + "점");
		
	}
}
