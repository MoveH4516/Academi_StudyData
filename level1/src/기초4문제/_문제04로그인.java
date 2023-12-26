package 기초4문제;

import java.util.Scanner;

public class _문제04로그인 {
	public static void main(String[] args) {
		
		/*
		 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
		 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
		 3. Pw가 트린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
		 4. Id와 Pw가 모두 일치하는 경우, "로그인 성공"이라는 메세지를 출력한다.
		 5. Id와 Pw가 둘다 틀린경우 그리고 둘중 한개라도 틀린경우 "로그인 실패"를 출력한다.
		 */
		
		int dbId = 1234;
		int dbPw = 1111;
		System.out.print("아이디 : ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.print("비밀번호 : ");
		int pw = sc.nextInt();
		boolean check = id != dbId || pw != dbPw;
		
		if (!check) {
			System.out.println("로그인 성공");
		}
		if (check) {
			System.out.println("로그인 실패");
		}
		
//		if (id == dbId) {
//			System.out.print("비밀번호 : ");
//			int pw = sc.nextInt();
//			boolean check = id != dbId || pw != dbPw;
//			if (check) {
//				System.out.println("로그인 실패");
//			}
//			if (!check) {
//				System.out.println("로그인 성공");
//			}
//		}
//		if ( id != dbId) {
//			System.out.println("id가 일치하지 않습니다.");
//		}
		
		sc.close();
		
	}
}
