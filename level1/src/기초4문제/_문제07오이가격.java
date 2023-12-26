package 기초4문제;

public class _문제07오이가격 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 마트에서 오이를 3개씩 묶어서 1500원에 판매한다.
		 오이가 14개 필요하다면,
		 필요한 금액을 출력하시오.
		 단, 오이는 묶음으로만 판매한다.
		 */
		
		int set = 3;
		int price = 1500;
		int count = 14;
		int pur = count / set;
		
		boolean purchase = count % set == 0;
		if (purchase) {
			System.out.printf("%d원\n", pur * price);
		}
		if (!purchase) {
			System.out.printf("%d원\n", (pur + 1) * price);
		}
		
	}
}
