package 배열2문제;

import java.util.Arrays;
import java.util.Scanner;

public class _문제20ATM배열컨트롤러 {
	public static void main(String[] args) {
		
		/*
		 1.추가
		 	1) 값을 5개 까지만 저장 가능
		 	2) 중복되는 값은 저장 불가
		 	3) 차례대로 뒤로 저장
		 2. 수정
		 	1) 인덱스를 입력받아 수정
		 	2) 인덱스를 올바르게 입력했는지 검사
		 	3) 중복되는 값으로 수정 불가
		 3. 삭제(값)
		 	1) 삭제할 값을 입력받아 해당 값 삭제
		 	2) 입력받은 값이 올바른지 검사
		 	3) count == 0 이 되면, 더 이상 삭제할 값이 없다는 메세지 출력
		 4. 삽입
		 	1) 삽입할 위치값 입력받기
		 	2) 삽입할 값 입력받기
		 	3) 입력받은 값의 중복검사
		 	4) 5개까지 삽입 가능
		 */
		
		/*
		 1. 회원가입
		 	1) id와 pw를 입력받아 가입
		 	2) 가입 시 돈 1000원이 부여
		 	3) id 중복검사를 진행
		 2. 회원탈퇴
		 	1) 로그인 후에만 이용 가능
		 3. 로그인
		 	1) 로그아웃 상태에서만 이용
		 	2) id와 pw를 입력받아 로그인
		 4. 로그아웃
		 	1) 로그인 후에 이용 가능
		 5. 입금
		 	1) 로그인 후에 이용 가능
		 6. 이체
		 	1) 로그인 후에 이용 가능
		 7. 잔액조회
		 	1) 로그인 후에 이용 가능
		 */
		
		Scanner sc = new Scanner(System.in);
		int max = 5;
		int[] idList = new int[max];
		int[] pwList = new int[max];
		int[] moneyList = new int[max];
		int count = 0;
		int log = -1;
		int idx = 0;
		boolean run = true;
		boolean pass = true;
		while (true) {
			if (log == -1) {
				System.out.println("[로그인 해주세요.]");
				System.out.println("[1]회원가입 [2]로그인 [3]전체회원목록");
			} else {
				System.out.println("[" + log + "]");
				System.out.println("[4]입금 [5]송금 [6]비밀번호 수정 [7]회원탈퇴 [8]로그아웃");
			}
			System.out.println("[0]종료");			
			int sel = sc.nextInt();
			
			if (log == -1 && (sel < 0 || sel > 3)) {
				System.out.println("입력값 오류");
				continue;
			}
			if (log != -1 && sel != 0 && (sel < 4 || sel > 8)) {
				System.out.println("입력값 오류");
				continue;
			}
			
			if (sel == 1) {
				run = true;
				if (count == max) {
					System.out.println("더이상 회원가입이 불가능 합니다.");
					continue;
				}
				System.out.print("사용할 id : ");
				int id = sc.nextInt();
				System.out.print("사용할 pw : ");
				int pw = sc.nextInt();
				
				for (int i = 0; i <= count; i++) {
					if (id == idList[i]) {
						System.out.println("중복된 id 입니다.");
						run = false;
					}
				}
				if (run) {
					idList[count] = id;
					pwList[count] = pw;
					moneyList[count] = 1000;
					count++;
				}				
			} else if (sel == 2) {
				pass = true;
				System.out.print("id : ");
				int id = sc.nextInt();
				System.out.print("pw : ");
				int pw = sc.nextInt();
				
				for (int i = 0; i < count; i++) {
					if (id == idList[i] && pw == pwList[i]) {
						System.out.println("로그인 성공");
						log = id;
						idx = i;
						pass = false;
					}					
				}
				if (pass) {
					System.out.println("로그인 실패");
				}
			} else if (sel == 3) {
				System.out.println("전체 회원 목록");
				System.out.println("\tid\tpw\tmoney");
				for (int i = 0; i < count; i++) {
					System.out.printf("[%d]\t%d\t%d\t%d원\n",i + 1, idList[i], pwList[i], moneyList[i]);
				}
			} else if (sel == 4) {
				System.out.println("입금");
				System.out.print("입금할 금액 : ");
				int cash = sc.nextInt();
				if (cash <= 0) {
					System.out.println("0보다 큰 금액을 입력하세요.");
					continue;
				}
				moneyList[idx] += cash;
				
				System.out.println("입금 후 잔액" + moneyList[idx] + "원");
			} else if (sel == 5) {
				pass = false;
				System.out.println("송금");
				System.out.print("송금받을 회원 : ");
				int acc = sc.nextInt();
				if (log == acc) {
					System.out.println("본인에게 송금할 수 없습니다.");
					continue;
				}
				for (int i = 0; i < count; i++) {
					if (acc == idList[i]) {
						pass = false;
						break;
					} else {
						pass = true;
					}
				}
				if (pass) {
					System.out.println("번호가 일치하지 않습니다.");
					continue;
				}
				System.out.print("송금할 금액 : ");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("0보다 큰 금액을 입력하세요.");
					continue;
				}
				if (money > moneyList[idx]) {
					System.out.println("잔액초과");
					continue;
				}
				for (int i = 0; i < count; i++) {
					if (acc == idList[i]) {
						moneyList[i] += money;
						moneyList[idx] -= money;
					}
				}
			} else if (sel == 6) {
				System.out.println("비밀번호 수정");
				System.out.print("수정할 비밀번호 입력 : ");
				int pw = sc.nextInt();
				
				pwList[idx] = pw;
			} else if (sel == 7) {
				System.out.println("회원 탈퇴");
				idList[idx] = 0;
				pwList[idx] = 0;
				moneyList[idx] = 0;
				log = -1;
				count--;
				for (int i = 0; i < count - 1; i++) {
					if (idList[i] == 0 && idList[i + 1] != 0) {
						idList[i] = idList[i + 1];
						pwList[i] = pwList[i + 1];
						moneyList[i] = moneyList[i + 1];
						idList[i + 1] = 0;
						pwList[i + 1] = 0;
						moneyList[i + 1] = 0;						
					}
				}
				System.out.println(Arrays.toString(idList));
				System.out.println(Arrays.toString(pwList));
				System.out.println(Arrays.toString(moneyList));
			} else if (sel == 8) {
				System.out.println("로그아웃");
				log = -1;
			} else if (sel ==0) {
				System.out.println("종료");
				break;
			}
						
		}
	sc.close();
	}
}
