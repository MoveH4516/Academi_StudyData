package 반복문2문제;

import java.util.Scanner;

public class _문제14ATM4단계 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int db1Id = 1111;
		int db1Pw = 1234;
		int db1Money = 50000;
		int db2Id = 2222;
		int db2Pw = 2345;
		int db2Money = 70000;
		int cash = 0;
		
		boolean run =true;
		boolean error = false;
		boolean err = false;
		
		int log = -1;
		
		
		while (run) {
			
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 조회");
			System.out.println("7. 종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel == 7) {
				System.out.println("시스템 종료");
				break;
			}
			if (sel != 1 && log == -1) {
				System.out.println("로그인 후 이용가능");
				System.out.println("1. 로그인 2. 종료");
				System.out.print("메뉴 선택 : ");
				int cho = sc.nextInt();
				if (cho == 1) {
					sel = 1;
				} else {
					System.out.println("시스템을 종료합니다.");
					break;
				}
			}
			if (sel == 1 && log != -1) {
				System.out.println("로그아웃 후 이용가능");
				continue;
			}
			
			if (sel == 1) {
				System.out.print("ID : ");
				int id = sc.nextInt();
				System.out.print("PW : ");
				int pw = sc.nextInt();
				if (id == db1Id && pw == db1Pw) {
					System.out.println("1번 계정 로그인");
					log = 1111;
				} else if (id == db2Id && pw == db2Pw) {
					System.out.println("2번 계정 로그인");
					log = 2222;
				} else {
					System.out.println("로그인 실패");	
					continue;
				}
			}
			if (sel == 2) {
				System.out.println("로그아웃 되었습니다.");
				log = -1;
			}
			if (sel == 3) {
				System.out.println("입금");
				System.out.print("입금 계좌 : ");
				int id = sc.nextInt();
				if (id == db1Id) {
					System.out.print("입금할 금액 : ");
					int money = sc.nextInt();
					cash = money;
					
				} else {
					System.out.println("계좌번호가 일치하지 않습니다.");
					error = true;
				}
				if (cash <= 0 && !error) {
					System.out.println("0보다 큰 수를 입력해 주세요.");
				} else if (cash > 0 && !error) {
					db1Money += cash;
					System.out.println("입금 후 잔액 : " + db1Money);
				}
				
				log = -1;
			}
			if (sel == 4) {
				System.out.println("출금");
				System.out.print("출금 계좌 : ");
				int id = sc.nextInt();
				if (id == db1Id) {
					System.out.print("출금할 금액 : ");
					int money = sc.nextInt();
					cash = money;					
				} else {
					System.out.println("계좌번호가 일치하지 않습니다.");
					error = true;
				}
				if (cash <= 0 && !error) {
					System.out.println("0보다 큰 수를 입력해 주세요.");
				} else if (cash > 0 && !error && cash <= db1Money) {
					db1Money -= cash;
					System.out.println("입금 후 잔액 : " + db1Money);
				} else if (cash > 0 && !error && cash > db1Money) {
					System.out.println("잔액 초과");
				}				
				log = -1;
			}
			if (sel == 5) {
				System.out.print("나의 계좌번호 : ");
				int acc1 = sc.nextInt();
				System.out.print("상대 계좌번호 : ");
				int acc2 = sc.nextInt();
				if (acc1 != db1Id || acc2 != db2Id) {
					err = true;
				}
			}
			if (err && sel == 5) {
				System.out.println("계좌번호가 일치하지 않습니다.");
				err = false;
			} else if (!err && sel == 5){
				System.out.print("금액을 입력하세요 : ");
				int money = sc.nextInt();
				cash = money;
				if (cash <= 0) {
					System.out.println("0보다 큰 숫자를 입력하세요.");
					
				} else if (cash >= 1000000) {
					System.out.println("한도 초과");
					
				} else if (cash > db1Money) {
					System.out.println("잔액 초과");
					
				} else if (cash > 0 && cash <= db1Money) {
					db1Money -= cash;
					db2Money += cash;
					System.out.println("나의 계좌 : " + db1Money);
					System.out.println("상대 계좌 : " + db2Money);
				}
				log = -1;
			}					
			if (sel == 6) {
				System.out.println("조회");
				System.out.printf("[내 계좌 : %d원 상대 계좌 : %d원]\n", db1Money, db2Money);
				log = -1;
			}
		}
		sc.close();
	}
}
