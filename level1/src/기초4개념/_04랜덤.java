package 기초4개념;

import java.util.Random;

public class _04랜덤 {
	public static void main(String[] args) {
		
		// Scanner 는 사용자에게 입력값을 받아오는 공장
		Random rand = new Random();
		// random (주사위) 등의 랜덤요소 공장
		
		int dice = rand.nextInt();
		System.out.println(dice); // 랜덤한 정수값이 출력된다. 실행 할 때 마다 값이 변함
		
		int dice2 = rand.nextInt(3); // 0부터 3개의 값을 가져온다는 의미 
		// 0 1 2 총 3개의 값을 dice2가 갖는다.
		System.out.println(dice2);
		// int dice2 = rand.nextInt(n) + 1; 을 해준다면
		// 0~n-1이 아니라 1~n 의 값을 갖도록 응용이 가능하다. -n~n 까지의 값을 갖도록 하기도 가능
		// 랜덤 범위 사용 공식 : 개수 : 끝값 - 시작값 + 1
		// int dice = rand.nextInt(개수) + 시작값;
		
		// 예시문제 랜덤값 150~250 출력
		int num = rand.nextInt(101) + 150;
		System.out.println(num);
		
	}
}
