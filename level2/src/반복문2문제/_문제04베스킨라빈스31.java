package 반복문2문제;

import java.util.Scanner;

public class _문제04베스킨라빈스31 {
	public static void main(String[] args) {
		
		/*
		 * # 베스킨라빈스31
		 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
		 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
		 * 3. br이 31을 넘으면 게임은 종료된다.
		 * 4. 승리자를 출력한다.
		 * 
		 * 예) 
		 * 1턴 : p1(2)	br(2)
		 * 2턴 : p2(1)	br(3)
		 * 3턴 : p1(3)	br(6)
		 * ...
		 */
		Scanner sc = new Scanner(System.in);
		int end = 31;
		int turn = 1;
		int sum = 0;
		while (true) {
			System.out.println("br(" + sum + ")");
			if (sum >= end && turn % 2 != 0) {
				System.out.println("[게임 종료]");
				System.out.println("p1의 승리");
				break;
			} else if (sum >= end && turn % 2 == 0) {
				System.out.println("[게임 종료]");
				System.out.println("p2의 승리");
				break;
			}
			if (turn % 2 != 0) {
				System.out.print("p1의 턴 : ");
				int p1 = sc.nextInt();
				if (p1 > 0 && p1 < 4) {
					sum = sum + p1;
				} else {
					System.out.println("1~3의 숫자를 입력하세요.");
					turn--;
				}
			} else {
				System.out.print("p2의 턴 : ");
				int p2 = sc.nextInt();
				if (p2 > 0 && p2 < 4) {
					sum = sum + p2;
				} else {
					System.out.println("1~3의 숫자를 입력하세요.");
					turn--;
				}
			}			
			turn++;
		}
		sc.close();
	}
}
