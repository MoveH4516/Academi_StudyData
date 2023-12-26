package 기초4문제;

import java.util.Scanner;

public class _문제03가위바위보 {
	public static void main(String[] args) {
		
		/*
		 가위(0) 바위(1) 보(2) 게임
		 1. com은 바위(1)만 가능하다.
		 2. me는 0~2 사이의 숫자를 입력받는다.
		 3. com과 me를 비교해,
		 	1) 비겼다.
		 	2) 내가 이겼다.
		 	3) 내가 졌다. 		를 출력한다.
		 */
		
		int com = 1;
		System.out.print("입력받은 숫자 : ");
		Scanner sc = new Scanner(System.in);
		int me = sc.nextInt();
		
		if (me == com && me < 3 && me >= 0) {
			System.out.println("비겼다.");
		}
		if (me > com && me < 3 && me >= 0) {
			System.out.println("내가 이겼다.");
		}
		if (me < com && me < 3 && me >= 0) {
			System.out.println("내가 졌다.");
		}
		if (me > 2 || me < 0) {
			System.out.println("0~2의 정수만 입력하시오.");
		}
		// boolean check = me < 3 && me >= 0; 으로 선언을 해주는게 더 깔끔했을 듯.
		sc.close();
	}
}
