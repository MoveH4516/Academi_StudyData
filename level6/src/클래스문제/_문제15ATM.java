package 클래스문제;

import java.util.Scanner;

class Member {
	int number;
	String id;
	String name;
}

class Account {
	String accNum;
	String password;
	int money;
	String memberId;
}

public class _문제15ATM {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] memData = {
				{"1001", "qwer", "김철수"},
				{"1002", "mmkk11", "이영희"},
				{"1003", "javaking123", "최민수"}
		};
		
		String[][] accData = {
				{"111111111", "1234", "100000", "qwer"},
				{"222222222", "1234", "200000", "mmkk11"},
				{"333333333", "1234", "300000", "mmkk11"},
				{"444444444", "1234", "400000", "javaking123"},
				{"555555555", "1234", "500000", "qwer"},
				{"666666666", "1234", "600000", "qwer"}
		};
		Member[] memArr = new Member[memData.length];
		Account[] accArr = new Account[accData.length];
		while (true) {
			String menu = "";
			menu += "[0] 종료 \n";
			menu += "[1] 위 data 배열들의 값들을 클래스 배열에 저장 후 출력\n";
			menu += "[2] 회원아이디를 입력받고 계좌별 잔액출력\n";
			menu += "[3] 이체계좌와 이체받을 계좌를 입력해서 5000원송금후 전체출력";
			System.out.println(menu);
			int sel = sc.nextInt();
			if (sel == 1) {
				int idx = 0;
				for (String[] s : memData) {
					Member m = new Member();
					m.number = Integer.parseInt(s[0]);
					m.id = s[1];
					m.name = s[2];
					
					memArr[idx++] = m;
				}
				idx = 0;
				for (String[] s : accData) {
					Account a = new Account();
					a.accNum = s[0];
					a.password = s[1];
					a.money = Integer.parseInt(s[2]);
					a.memberId = s[3];
					
					accArr[idx++] = a;
				}
				System.out.println("회원번호\t   아이디       이름");
				for (int i = 0; i < memArr.length; i++) {
					System.out.printf("%-6d %12s %5s\n", memArr[i].number, memArr[i].id, memArr[i].name);
				}
				System.out.println("계좌번호\t  비밀번호   아이디");
				for (int i = 0; i < accArr.length; i++) {
					System.out.printf("%s   %s   %s\n", accArr[i].accNum, accArr[i].password, accArr[i].memberId);
				}
			} else if (sel == 2) {
				System.out.print("회원 아이디 : ");
				sc.nextLine();
				String id = sc.nextLine();
				int idx = -1;
				System.out.println("계좌번호\t  금액");
				for (int i = 0; i < accArr.length; i++) {
					if (accArr[i].memberId.equals(id)) {
						idx = i;
						System.out.printf("%s %d원\n", accArr[i].accNum, accArr[i].money);
					}
				}
				if (idx == -1) {
					System.out.println("일치하는 아이디가 없습니다.");
				}
			} else if (sel == 3) {
				System.out.print("이체 계좌 : ");
				sc.nextLine();
				String acc1 = sc.nextLine();
				int idx = -1;
				for (int i = 0; i < accArr.length; i++) {
					if (accArr[i].accNum.equals(acc1)) {
						idx= i;
					}
				}
				if (idx == -1) {
					System.out.println("계좌번호 오류");
					continue;
				}
				System.out.print("이체 받을 계좌 : ");
				String acc2 = sc.nextLine();
				int idx2 = -1;
				for (int i = 0; i < accArr.length; i++) {
					if (accArr[i].accNum.equals(acc2)) {
						idx2= i;
						if (acc1.equals(acc2)) {
							idx2 = -2;
						}
					}
				}
				if (idx2 == -1) {
					System.out.println("계좌번호 오류");
					continue;
				}
				if (idx2 == -2) {
					System.out.println("동일한 계좌에 이체할 수 없습니다.");
					continue;
				}
				accArr[idx].money -= 5000;
				accArr[idx2].money += 5000;
				System.out.println("계좌번호\t  비밀번호       아이디         금액");
				for (int i = 0; i < accArr.length; i++) {
					System.out.printf("%s   %s   %12s %10d원\n", accArr[i].accNum, accArr[i].password, accArr[i].memberId, accArr[i].money);
				}
			} else if (sel == 0) {
				break;
			} else {
				continue;
			}
		}
		sc.close();
	}
}
