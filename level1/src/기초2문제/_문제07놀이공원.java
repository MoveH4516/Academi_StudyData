package 기초2문제;
/*
[문제]
	철수는 놀이공원에 갔다.
	놀이공원 입장료는 15,000원이다.
	철수는 특별할인을 받아서 9,000원에 입장했다.
	몇 % 할인받은 것인지 구하시오.
[정답]
	40%
*/
public class _문제07놀이공원 {
	public static void main(String[] args) {
		
		// (비용 - 낸 비용) / 비용 >> 할인율
		int expense = 15000;
		int cheolsuexpense = 9000;
		double sale = 1.0 * (expense - cheolsuexpense) / expense;
		
		System.out.println(String.format("%.0f",sale * 100) + "%");
		
	}
}
