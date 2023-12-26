package 기초연습예제;

public class _30B4돈가스 {
	public static void main(String[] args) {
/*
	[문제]
		철수는 20,000원을 가지고 친구 3명과 돈까스를 각각 1개씩 사먹었다.
		계산 후 남은 돈이 2,000원이었다.
		돈까스 1개의 가격은 4,000원 이하인지 여부를
		true 또는 false로 표현하시오.
	[정답]
		false
 */
		
		int money = 20000;
		int friend = 3;
		int restMoney = 2000;
		int count = friend;
		//3 price + 2000 = 20000
		double price = 1.0 * (money - restMoney) / count;
		
		boolean result = price <= 4000;
		
		System.out.println(result);
		
	}
}
