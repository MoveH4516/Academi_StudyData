package member;

import java.util.Scanner;

public class MemberController {
	Scanner sc;
	MemberDAO dao;
	
	void run() {
		init();
		
		while (true) {
			System.out.println("[1]추가 [2]삭제 [3]수정 [4]출력 [0]종료");
			int sel = sc.nextInt();
			if (sel < 0 || sel > 4) continue;
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				dao.join();
			} else if (sel == 2) {
				dao.remove();
			} else if (sel == 3) {
				dao.trans();
			} else if (sel == 4) {
				System.out.printf("%s \t %s \t %s \n", "ID", "PW" ,"name");
				for (int i = 0; i < dao.cnt; i++) {
					dao.memberList[i].printinfo();
				}
			}
			
		}
	}
	void init() {
		sc = new Scanner(System.in);
		dao = new MemberDAO();
	}
	
}
