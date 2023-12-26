package 기초4문제;

import java.util.Random;
import java.util.Scanner;

public class _문제13업다운 {
	public static void main(String[] args) {
		
		Random rd = new Random(); 
		Scanner sc = new Scanner(System.in);
		int com = rd.nextInt(81) + 10;
		System.out.printf("com의 숫자 : %d\n", com);
		System.out.print("me의 숫자 : ");
		int me = sc.nextInt();
		boolean pass = me >=10 && me <=90;
		if (pass) {
			if (me < com) {
				System.out.println("up!");
			}
			if (me > com) {
				System.out.println("down!");
			}
			if (me == com) {
				System.out.println("Bingo!");
			}
		}
		if (!pass) {
			System.out.println("10~90의 정수를 입력하세요.");
		}
		sc.close();
	}
}
