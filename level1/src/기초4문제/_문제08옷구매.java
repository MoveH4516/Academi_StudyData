package 기초4문제;

public class _문제08옷구매 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	철수는 상점에서 24600원짜리 옷을 구매했다.
		 	500원짜리 동전으로만 옷값을 낸다면,
		 	동전이 몇 개 필요한지 구하시오.
		 */
		
		int coin = 500;
		int price = 24600; 
		int submit = price / coin;
		boolean result = price % coin == 0;
		
		if (result) {
			System.out.println(submit + "개");
		}
		if (!result) {
			System.out.println(submit + 1 + "개");
		}
	}
}
