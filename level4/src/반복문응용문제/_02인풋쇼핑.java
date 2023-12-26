package 반복문응용문제;

import java.util.Arrays;

public class _02인풋쇼핑 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 3개의 배열은 각각 다음과 같은 역할을 한다.
		 	nameList = 상품이름
		 	priceList = 상품가격
		 	countList = 상품개수
		 	
		 input 배열은 오늘 주문이 들어온 순서이다.
		 주문이 들어올 때마다 countList 배열의 값을 1 감소 시킨다.
		 총 매출을 출력
		 
		 개수가 0이 되면 판매가 불가능하다.
		 */
		
		String[] nameList = {"새우깡", "감자깡", "고래밥"};
		int[] priceList = {1000, 2100, 3300};
		int[] countList = {3, 1, 1};
		
		int[] input = {1, 2, 2, 0, 0, 2, 1, 1};
		int[] sel = {0, 0, 0};
		int[] result = new int[sel.length];
		int money = 0;
		int cnt = 0;
		
		for (int i = 0; i < nameList.length; i++) {
			cnt = 0;
			for (int j = 0; j < input.length; j++) {
				if (nameList[i] == nameList[input[j]]) {
					cnt++;
				}
			}
			sel[i] = cnt;
			if (countList[i] < sel[i]) {
				result[i] = countList[i];
				countList[i] = 0;
			} else {
				result[i] = sel[i];
				countList[i] -= sel[i];
			}
			money += result[i] * priceList[i];
			
		}
		System.out.println(Arrays.toString(countList));
		System.out.println(Arrays.toString(result));
		System.out.printf("주문은 총 새우깡 %d개, 감자깡 %d개, 고래밥 %d개 들어왔지만\n", sel[0], sel[1], sel[2]);
		System.out.println("재고 수량은 그보다 부족하기 때문에");
		System.out.printf("실제 판매한 품목은 새우깡 %d개, 감자깡 %d개, 고래밥 %d개 이다.\n", result[0], result[1], result[2]);
		
		System.out.println(money + "원");
	}
}
