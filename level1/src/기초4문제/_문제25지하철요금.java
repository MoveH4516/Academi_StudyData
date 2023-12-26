package 기초4문제;

import java.util.Scanner;

public class _문제25지하철요금 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 이용할 정거장 수를 입력받는다.
		 	2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
		 	3. 요금표
		 	1) 1~5 : 500원
		 	2) 6~10 : 600원
		 	3)11~ : 650 ''' + 50 ( 2정거장 마다 +50원 추가)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이용할 정거장 수 : ");
		int station = sc.nextInt();
		int num = (station - 11) / 2;
		int cost11up = 650 + num * 50;
		
		if (station >= 1 && station <= 5) {
			System.out.println("500원");
		} else if (station >= 6 && station <= 10) {
			System.out.println("600원");
		} else if (station >= 11) {
			System.out.println(cost11up + "원");
		}else {
			System.out.println("0보다 큰 수를 입력하세요.");
		}
		sc.close();
	}
}
