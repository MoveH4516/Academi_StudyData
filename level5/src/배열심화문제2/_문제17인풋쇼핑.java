package 배열심화문제2;

import java.util.Arrays;

public class _문제17인풋쇼핑 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	nameList 배열은 상품의 이름
		 	dataList 는 각각 가격과 상품의 개수
		 	현재 재고 수량은 새우깡 3개 감자깡 1개 고래밥 1개이다.
		 	아래 input 배열은 오늘 주문이 들어온 순서
		 	총 매출 출력
		 */
		
		String[] nameList = {"새우깡", "감자깡", "고래밥"};
		int[][] dataList = {
				{1000, 3},
				{2300, 1},
				{3100, 1}
		};
		int[] input = {1, 2, 2, 0, 0, 2, 1, 1};
		
		int money = 0;
		int[] count = new int[nameList.length];
		for (int i = 0; i < input.length; i++) {
			if (dataList[input[i]][1] > 0) {
				money += dataList[input[i]][0];
				dataList[input[i]][1]--;
				count[input[i]]++;
			}
		}
		for (int i = 0; i < nameList.length; i++) {
			System.out.printf("%s %d개 판매 : %d원\n", nameList[i], count[i], count[i] * dataList[i][0]);
		}
		System.out.println("남은 재고 : " + Arrays.deepToString(dataList));
		System.out.println(money + "원");
	}
}
