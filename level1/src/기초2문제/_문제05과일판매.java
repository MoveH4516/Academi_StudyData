package 기초2문제;
/*
[문제]
	가게에 과일 250개가 있다.
	그중에 오전에 120개가 팔렸고, 오후에는 80개가 팔렸다.
	남은 과일은 전체 과일의 몇 % 인지 구하시오.
[정답]
	20%
*/
public class _문제05과일판매 {
	public static void main(String[] args) {
		
		int fur = 250;
		int mor = 120;
		int aft = 80;
		
		double per = 1.0 * (fur - (mor + aft)) / fur;
		
		System.out.println(String.format("%.0f", per * 100) + "%");
		
	}
}
