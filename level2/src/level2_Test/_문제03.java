package level2_Test;

import java.util.Scanner;

public class _문제03 {
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
		  
		 
		 걸린시간 : 6분36초59
		 */
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int br = 0;
		while (true) {
			if (i % 2 != 0) {
				System.out.print("p1의 턴 : ");
			} else {
				System.out.print("p2의 턴 : ");
			}
			int player = sc.nextInt();
			
			if (player < 1 || player > 3) {
				System.out.println("1~3의 숫자를 입력하세요.");
				i--;
			} else {
				br += player;
				System.out.println("br = " + br);
			}
			
			if (br >= 31 && i % 2 != 0) {
				System.out.println("p2의 승리");
				break;
			} else if (br >= 31 && i % 2 == 0) {
				System.out.println("p1의 승리");
				break;
			}			
			i++;
		}		
		sc.close();
	}
}
