package 기초연습예제;

public class _05A3공장 {
	public static void main(String[] args) {
		/*
		[문제]
			공장에서 장난감을 1,000개 만들면 불량을 대비해서 30개씩 추가로 만든다고한다.
			장난감 하나를 만드는데 비용이 30원일 때
			정상적인 장난감 10,000개를 만들 때 필요한 총비용을 구하시오.
		[정답]
			309,000원
	 */	
		
		int doll = 1000;
		int errorPer1000 = 30;
		int price = 30;
		int dollProduce = doll + errorPer1000;
		int totaldoll = dollProduce * 10;
		int totalPrice = totaldoll * price;
		
		System.out.println(totalPrice + "원");				
	}
}
