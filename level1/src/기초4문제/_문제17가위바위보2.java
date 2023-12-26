package 기초4문제;

import java.util.Random;
import java.util.Scanner;

public class _문제17가위바위보2 {
	public static void main(String[] args) {
		
		/*
		 가위(0) 바위(1) 보(2) 게임
		 1. com은 랜덤으로 (0~2) 값
		 2. me는 0~2 사이의 숫자를 입력받는다.
		 3. com과 me를 비교해,
		 	1) 비겼다.
		 	2) 내가 이겼다.
		 	3) 내가 졌다. 		를 출력한다.
		 */
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// 가위0 바위1 보2 바위 - 가위 = 1 승리 보 - 바위 = 1 승리 가위 - 보 = -2 승리
		String s;		
		int com = rd.nextInt(3);
		if (com == 0) {
			s = "가위";
		}
		else if (com == 1) {
			s = "바위";
		}else {
			s = "보";
		}		
		System.out.print("가위(0) 바위(1) 보(2) >>");
		int me = sc.nextInt();
		System.out.printf("com의 값 : %s(%d)\n",s,com);		
		System.out.printf("me의 값 : %d\n",me);
		boolean check = me < 0 || me >2;
		
		if (!check && me == com) {
			System.out.println("비겼다.");
		}
		else if (!check && me != com) {
			if (me - com == 1 || me - com == -2) {
				System.out.println("내가 이겼다.");		
			}else {
			System.out.println("내가 졌다.");
			}
		}else {
			System.out.println("0~2의 정수만 입력하시오.");
		}
		sc.close();
	}
}
//else if (!check && com == 0) {
//	if (me == 2) {
//		System.out.println("내가 졌다.");
//	}else {
//		System.out.println("내가 이겼다.");
//	}
//}
//else if (!check && com == 1) {
//	if (me == 0) {
//		System.out.println("내가 졌다.");
//	}else {
//		System.out.println("내가 이겼다.");
//	}
//}
//else if (!check && com == 2) {
//	if (me == 1) {
//		System.out.println("내가 졌다.");
//	}else {
//		System.out.println("내가 이겼다.");
//	}