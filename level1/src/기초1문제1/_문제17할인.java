package 기초1문제1;
/*
[문제]
	현금이 10,000원 있다.
	1,200원짜리 과자 6개를 구매 후, 거스름돈을 구하시오.
	단, 할인 행사를 해서 과자를 3개 살 때마다 200원씩 할인해준다.
[정답]
	3,200원
*/
public class _문제17할인 {
	public static void main(String[] args) {
		
		//풀이 : 10000원에서 과자의 값을 빼준 뒤 할인된 가격을 더해주는 것
		System.out.println(10000 - 1200 * 6 + 200 * (6 / 3) + "원");
		
	}
}
