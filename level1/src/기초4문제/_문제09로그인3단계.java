package 기초4문제;

import java.util.Scanner;

public class _문제09로그인3단계 {
	public static void main(String[] args) {
		int dbId = 1234;
		int dbPw = 1111;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		int id = sc.nextInt();
		
		if (id == dbId) {
			System.out.print("비밀번호 : ");
			int pw = sc.nextInt();
			boolean check = id != dbId || pw != dbPw;
			if (check) {
			System.out.println("pw가 일치하지 않습니다.");
			System.out.println("로그인 실패");
			}
			if (!check) {
			System.out.println("로그인 성공");
			}
		}
		if ( id != dbId) {
		System.out.println("id가 일치하지 않습니다.");
		System.out.println("로그인 실패");
		}
		sc.close();
	}
}
