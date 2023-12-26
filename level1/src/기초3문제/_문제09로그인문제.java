package 기초3문제;

import java.util.Scanner;

/*
[문제]
	철수는 로그인을 하려고 한다.
	아이디와 비밀번호를 입력받는다.
	아이디와 비밀번호 둘 중 하나만 틀려도 로그인은 실패한다.
	joinId와 joinPw는 철수가 이미 가입한 아이디와 비밀번호이다.
*/
public class _문제09로그인문제 {
	public static void main(String[] args) {
		// 철수가 기존에 가입한 id pw
        int joinId= 1234;
        int joinPw = 4321;
		
        
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        System.out.println("아이디를 입력 하세요 : " + id);
        int password = scan.nextInt();
		System.out.println("비밀번호를 입력 하세요 : " + password);
		boolean result = id == joinId && password == joinPw;
		System.out.println("로그인 여부 : " + result);
		
		scan.close();
	}
}
