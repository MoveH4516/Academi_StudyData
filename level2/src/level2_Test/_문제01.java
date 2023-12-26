package level2_Test;

import java.util.Random;
import java.util.Scanner;

public class _문제01 {
	public static void main(String[] args) {
		
		/*
		 * # Up & Down 게임[2단계]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다. 
	     5. 오답을 할때마다 20점 감점한다. 0점 되면 게임 오버로 게임 종료된다 
	     6. 게임 종료 후 성적 출력한다. 처음에 바로 맞추면 100점 
	     
	     
	     걸린시간 : 4분39초46
		 */
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int score = 100;
		int com = rd.nextInt(100)+1;
		System.out.println("com의 숫자 : " + com);
		while (true) {
			
			System.out.print("me의 숫자 : ");
			int me = sc.nextInt();
			
			if (com > me) {
				System.out.println("com이 크다.");
				score -= 20;
			} else if (com < me) {
				System.out.println("com이 작다.");
				score -= 20;
			} else {
				System.out.println("정답");
				System.out.println("스코어 : " + score);
				break;
			}
			
			if (score == 0) {
				System.out.println("패배");
				break;
			}						
		}
		sc.close();
	}
}
