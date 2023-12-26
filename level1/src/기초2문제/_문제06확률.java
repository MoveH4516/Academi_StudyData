package 기초2문제;
/*
[문제1]
	인형 125개가있다. 전체를 100퍼센트라고 했을 때, 
	1퍼센트는 인형 몇 개인지 구하시오.
	
[문제2]
	인형 125개가있다. 인형 1개는 몇 퍼센트인지 구하시오.

[문제3]
	인형 40개가있다. 전체를 100퍼센트라고 했을 때, 
	일퍼센트는 인형 몇 개 인지 구하시오.

[문제4]
	인형 40개가있다. 인형1개는 몇 퍼센트인지 구하시오.
*/
public class _문제06확률 {
	public static void main(String[] args) {
		
		// 125 : x = 100 : 1 >> x = 125 / 100
		int doll = 125;
		double dollPer = doll / 100.0;
		
		System.out.println(dollPer + "개");
		
		// 125 : 1 = 100 : x >> x = 100 / 125
		double dollPer2 = 100.0 / doll;
		
		System.out.println(dollPer2 + "%");
		
		doll = 40;
		dollPer = doll / 100.0;
		// 동일한 방법
		System.out.println(dollPer + "개");
		
		dollPer2 = 100.0 / doll;
		// 동일한 방법
		System.out.println(dollPer2 + "%");
		
	}
}
