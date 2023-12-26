package 메서드문제;

import java.util.Arrays;
import java.util.Scanner;

class Bank {
	Scanner sc = new Scanner(System.in);
	String name = "";
	String[] arAcc = {"1111", "2222", "3333", "", ""};
	String[] arPw = {"1234", "2345", "3456", "", ""};
	int[] arMoney = {87000, 34000, 17500, 0, 0};
	int count = 3;
	int log = -1;
	void one() {
		while (true) {
			if (count == 5) {
				System.out.println("더이상 회원가입이 불가능 합니다.");
				break;
			}
			System.out.println("회원가입");
			System.out.println("계좌 >>");
			String acc = sc.next();
			int idx = -1;
			for (int i = 0; i < count; i++) {
				if (arAcc[i].equals(acc)) {
					idx = i;
					break;
				}
			}
			if (idx != -1) {
				System.out.println("이미 있는 계좌입니다.");
				continue;
			}
			System.out.println("비밀번호 >>");
			String pw = sc.next();
			
			arAcc[count] = acc;
			arPw[count] = pw;
			count++;
			System.out.println(Arrays.toString(arAcc));
			System.out.println(Arrays.toString(arPw));
			break;
		}
	}
	
	void two () {
		if (log == -1) {
			System.out.println("로그인 후 이용하세요");
		} else {
			System.out.println("회원탈퇴");
			int idx = log;
			for (int i = idx; i < count - 1; i++) {
				arAcc[i] = arAcc[i + 1];
				arPw[i] = arPw[i + 1];
			}
			count--;
			arAcc[count] = "";
			arPw[count] = "";
			log = -1;
			System.out.println(Arrays.toString(arAcc));
			System.out.println(Arrays.toString(arPw));
		}
	}

	int login() {
		while (true) {
			if (log != -1) {
				System.out.println("로그아웃 후 이용 가능");
				break;
			}
			System.out.println("계좌 >>");
			String acc = sc.next();
			System.out.println("비밀번호 >>");
			String pw = sc.next();
			for (int i = 0; i < count; i++)  {
				if (arAcc[i].equals(acc) && arPw[i].equals(pw)) {
					log = i;
				}
			}
			if (log != -1) {
				break;
			} else {
				System.out.println("로그인 실패");
				System.out.println("정보가 일치하지 않습니다.");
			}
		}
		return log;
	}
	int logOut() {
		System.out.println("로그아웃");
		log = -1;
		return log;
	}
	
	void deposit() {
		while (true) {
			if (log == -1) {
				System.out.println("로그인 후 이용하세요");
				break;
			}
			System.out.println("금액 입력");
			int cash = sc.nextInt();
			if (cash <= 0) {
				System.out.println("0보다 큰 수를 입력하세요");
				continue;
			}
			arMoney[log] += cash;
			System.out.println(Arrays.toString(arMoney));
			break;
		}
	}
	
	void transfer() {
		while (true) {
			System.out.println("이체할 계좌 >>");
			String acc = sc.next();
			int idx = -1;
			for (int i = 0; i < count; i++) {
				if (acc.equals(arAcc[i])) {
					idx = i;
				}
			}
			if (idx == -1) {
				System.out.println("일치하는 계좌번호가 없습니다.");
				continue;
			}
			if (idx == log) {
				System.out.println("본인 계좌에는 이체할 수 없습니다.");
				continue;
			}
			int cash = 0;
			while (true) {
				System.out.println("이체할 금액 >> ");
				cash = sc.nextInt();
				if (cash <= 0) {
					System.out.println("0보다 큰 금액을 입력하세요");
					continue;
				}
				if (cash > arMoney[log]) {
					System.out.println("금액 초과");
					continue;
				}
				break;
			}
			arMoney[idx] += cash;
			arMoney[log] -= cash;
			System.out.println(Arrays.toString(arMoney));
			break;
		}
	}
	void run() {
		while (true) {
			System.out.println("=== " + name + " ===");
			System.out.println("1.회원가입");
			System.out.println("2.회원탈퇴");
			System.out.println("3.로그인");
			System.out.println("4.로그아웃");
			System.out.println("5.입금하기");
			System.out.println("6.이체하기");
			System.out.println("7.종료");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 7) {
				System.out.println("1~7 사이의 숫자 입력");
				continue;
			}
			if (sel == 7) {
				break;
			} else if (sel == 1) {
				one();
			} else if (sel == 2) {
				two();
			} else if (sel == 3) {
				login();
			} else if (sel == 4) {
				logOut();
			} else if (sel == 5) {
				deposit();
			} else if (sel == 6) {
				transfer();
			}
		}
	}
}

public class _문제10메서드ATM {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.run();
	}
}
