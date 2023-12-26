package level1_Test;

import java.util.Random;
import java.util.Scanner;

public class _문제복기03 {
	public static void main(String[] args) {
		/* [ 문제 3 ]
		 * # 가위바위보 게임[2단계] 
	    1. com 랜덤으로 값 0 가위 1 바위 2 보 
	    2. me 입력으로 값 받기
	    3. 둘이 승리 비교 출력하기
	    
	    7분55초33
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();		
		int com = rd.nextInt(3);
		System.out.printf("com의 숫자 : %d\n", com);
		System.out.print("me의 숫자 : ");
		int me = sc.nextInt();
		
		boolean win1 = me == 0 && com == 2;
		boolean win2 = me == 1 && com == 0;
		boolean win3 = me == 2 && com == 1;
		boolean pass = me >=0 && me <= 2;
		
		if ((win1 || win2 || win3) && pass) {
			System.out.println("me가 이겼다.");
		} else if (me == com){
			System.out.println("비겼다.");
		} else if (!pass){
			System.out.println("0~2사이의 정수를 입력하세요.");
		} else {
			System.out.println("com이 이겼다.");
		}
		sc.close();
	}
}
