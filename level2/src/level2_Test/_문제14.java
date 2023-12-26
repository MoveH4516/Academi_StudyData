package level2_Test;

import java.util.Scanner;

public class _문제14 {
	public static void main(String[] args) {
		
		/*
		[문제 12]
		[ATM로그인실패]
			[1] [1.로그인]  이후
	        새로운매뉴 출력 : [1.잔액확인] [2.로그아웃][0.종료]
			[2] 로그인을 3번실패시 강제종료 시키시오. 
	    [3] 로그인 성공 후 로그인 메뉴 실행하지 않게 하시오 
	    		

		 [1.로그인][0.종료]
		 
		 
		 걸린시간 : 17분42초73
	*/
	    Scanner sc = new Scanner(System.in);
		int log = -1; // 로그아웃 -1 , 로그인 1  
		int dbId = 1111;
		int dbPw = 1234;
		int cnt = 0;
		boolean pass = true;
		boolean run = false;
		while (pass) {
			if (log == -1) {
				System.out.println("[1.로그인][0.종료]");
			}
			int sel = sc.nextInt();
			if (sel < 0 || sel > 1) {
				System.out.println("0 또는 1을 선택하세요.");
				continue;
			}
			if (sel == 0) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.print("ID : ");
				int id = sc.nextInt();
				System.out.print("PW : ");
				int pw = sc.nextInt();
				if (id == dbId && pw == dbPw) {
					System.out.println("로그인 성공");
					
					log = 1;
					cnt = 0;
					run = true;
				} else {
					System.out.println("로그인 실패");
					cnt++;
				}
			}
			if (cnt == 3) {
				System.out.println("로그인 횟수 초과");
				break;
			}
			
			while (run) {
				System.out.println("[1.잔액확인][2.로그아웃][0.종료]");
				int select = sc.nextInt();
				if (select == 1) {
					System.out.println("잔액확인");
					System.out.println("내 계좌 : @@@@원");
				} else if (select == 2) {
					System.out.println("로그아웃");
					log = -1;
					break;
				} else if (select == 0) {
					System.out.println("시스템 종료");
					pass = false;
					break;
				} else {
					System.out.println("0~2 사이의 숫자를 입력하세요.");
				}
			}
		}
		sc.close();
	}
}
