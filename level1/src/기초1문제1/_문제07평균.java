package 기초1문제1;
/*
[문제]
	총 3과목의 시험을 보았다.
	국어는 84점, 수학은 23점, 과학은 53점을 받았다.
	평균을 구하시오. 
	단, 소수점 두 자리까지 구하시오. 
[정답] 
	53.33
*/
public class _문제07평균 {
	public static void main(String[] args) {
		
		System.out.printf("%.2f\n",(84 + 23 + 53) / 3.0);
		System.out.println(String.format("%.2f", (84 + 23 + 53) / 3.0));
		System.out.println(Math.round((84 + 23 + 53) / 3.0 * 100) / 100.0);
	}
}
