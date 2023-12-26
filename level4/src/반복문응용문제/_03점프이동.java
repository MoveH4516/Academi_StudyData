package 반복문응용문제;

import java.util.Random;

public class _03점프이동 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	map 배열은 게임의 지도를 의미
		 	그 값은 추가로 이동할 수 있는 거리를  의미
		 	
		 	player 변수는 map 배열의 현재 위치를 의미
		 	즉, player 는 현재 map 의 0 번째 인덱스에 있다.
		 	
		 	주사위(1~3)를 랜덤으로 저장해, player 의 위치를 출력
		 */
		
		Random rd = new Random();
		int[] map = {0, 3, 0, 3, 0, 0, -1, 1, 0, 0};
		int player = 0;
		
		int dice = rd.nextInt(3) + 1;
		System.out.println("주사위 : " + dice);
		player += dice;
		if (map[player] == 0) {
			System.out.println(player);
		} else {
			while (map[player] != 0) {
				player += map[player];
			}
			System.out.println(player);
		}
		
	}
}
