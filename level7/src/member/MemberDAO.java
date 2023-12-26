package member;

import java.util.Scanner;

public class MemberDAO {
	Scanner sc;
	Member[] memberList;
	int cnt = 0;
	void init() {
		sc = new Scanner(System.in);
	}
	
	int checkId(String id) {
		for (int i = 0; i < cnt; i++) {
			if (id.equals(memberList[i].id)) {
				return i;
			}
		}
		return -1;
	}
	
	void join() {
		init();
		System.out.println("ID >> ");
		String id = sc.next();
		if (checkId(id) != -1) {
			System.out.println("이미 있는 아이디 입니다.");
			return;
		}
		System.out.println("PW >> ");
		String pw = sc.next();
		System.out.println("name >> ");
		String name = sc.next();
		cnt++;
		Member[] temp = null;
		if (cnt > 1) {
			temp = memberList;
		}
		memberList = new Member[cnt];
		for (int i = 0; i < cnt - 1; i++) {
			memberList[i] = new Member();
			memberList[i] = temp[i];
		}
		memberList[cnt - 1] = new Member();
		memberList[cnt - 1].init(id, pw, name);
	}
	
	void remove() {
		if (cnt == 0) {
			return;
		}
		System.out.println("삭제 ID >> ");
		String id = sc.next();
		if (checkId(id) == -1) {
			System.out.println("일치하는 아이디가 없습니다.");
			return;
		}
		for (int i = checkId(id); i < cnt - 1; i++) {
			memberList[i] = memberList[i + 1];
		}
		cnt--;
		memberList[cnt] = null;
	}
	
	void trans () {
		if (cnt == 0) {
			return;
		}
		System.out.println("로그인 필요");
		System.out.println("ID >> ");
		String id = sc.next();
		System.out.println("PW >> ");
		String pw = sc.next();
		if (checkId(id) == -1 || !pw.equals(memberList[checkId(id)].pw)) {
			System.out.println("로그인 실패");
			return;
		}
		System.out.println("로그인 성공");
		System.out.println("수정할 이름 >>");
		memberList[checkId(id)].name = sc.next();
	}
}
