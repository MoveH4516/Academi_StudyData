package 반복문1개념;

import java.util.Scanner;

public class _05로그아웃 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 로그인
		 		- 로그인 후, 재 로그인 불가
		 		- 로그아웃 상태에서만 이용 가능
		 	2. 로그아웃
		 		-로그인 상태에서만 가능
		 	3. 로그인, 로그아웃 관리는 log 변수를 이용한다.
		 	ex) -1(로그아웃), 1111(id1), 2222(id2)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int id1 = 1111;
		int pw1 = 1234;
		
		int id2 = 2222;
		int pw2 = 2345;
		
		int log = -1;
		
		boolean run = true;
		
		while (run) {
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (log == 1111 && sel == 1) {				
				System.out.println("로그아웃 이후에 이용해 주세요.");
				System.out.println("상태 = 1번 회원 로그인 중...");
			} else if (log == 2222 && sel == 1) {
				System.out.println("로그아웃 이후에 이용해 주세요.");
				System.out.println("상태 = 2번 회원 로그인 중...");
			}
			if (sel == 1) {
				if (log == -1 ) {
					System.out.println("로그인");
					System.out.print("ID : ");
					int id = sc.nextInt();
					System.out.print("PW : ");
					int pw = sc.nextInt();
					if (id == id1 && pw == pw1) {
						System.out.println("1번 회원 로그인 성공");
						System.out.println("상태 = 1번 회원 로그인 중...");
						log = 1111;
					} else if (id == id2 && pw == pw2) {
						System.out.println("2번 회원 로그인 성공");
						System.out.println("상태 = 2번 회원 로그인 중...");
						log = 2222;
					} else if ((id != id1 || pw != pw1) || (id != id2 && pw != pw2)) {
						System.out.println("로그인 실패");
						log = -1;
					}
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("로그인 후 사용해 주세요.");					
				} else {
					System.out.println("로그아웃");
					log = -1;
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("번호 입력 오류");
			}			
		}
		sc.close();
	}
}
