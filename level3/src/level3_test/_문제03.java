package level3_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제03 {
	public static void main(String[] args) {
		
		/*
		 * # 회원가입 
		 * 1. 가입
		 * . 아이디 와 비밀번호를 입력받아 가입
		 * . 아이디 중복검사
		 * 2. 탈퇴
		 * . 아이디 를 입력받아 탈퇴
		 * 
		 * 걸린시간 : 14분21초70
		 */
		Scanner sc = new Scanner(System.in);
		int[] ids = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		int j = 0;
		int cnt = 2;
		boolean pass = true;
		boolean run = true;
		while(run) {			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel < 0 || sel > 3) {
				System.out.println("1~3사이의 숫자만 입력하세요.");
				continue;
			}
			
			if(sel == 1) {
				System.out.print("아이디 입력 : ");
				int id = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (id == ids[i]) {
						System.out.println("중복된 아이디 입니다.");
						pass = false;
						break;
					} else {
						pass = true;
					}
				}
				if (pass) {
					System.out.print("비밀번호 입력 : ");
					int pw = sc.nextInt();
					ids[cnt] = id;
					pws[cnt] = pw;
					cnt++;
					System.out.println("가입 완료");
					System.out.println(Arrays.toString(ids));
					System.out.println(Arrays.toString(pws));
				}
			} else if(sel == 2) {
				System.out.print("탈퇴할 아이디 입력 : ");
				int id = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (id != ids[i]) {
						pass = true;
					} else {
						pass = false;
						j = i;
						break;
					}
				}
				if (pass) {
					System.out.println("일치하는 아이디가 없습니다.");
				} else {
					System.out.println(ids[j] + " 아이디 삭제");
					ids[j] = 0;
					pws[j] = 0;
					cnt--;					
				}
				for (int i = j; i < cnt; i++) {
					ids[i] = ids[i + 1];
					pws[i] = pws[i + 1];
					ids[i + 1] = 0;
					pws[i + 1] = 0;
				}
				System.out.println(Arrays.toString(ids));
				System.out.println(Arrays.toString(pws));
			} else {
				System.out.println("시스템 종료");
				run = false;
			}
		}
		sc.close();
	}
}
