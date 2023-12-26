package movie;

import java.util.Scanner;

public class UserDAO {
	Scanner sc;
	User[] userList;
	int cnt;
	int idx;
	void init() {
		sc = new Scanner(System.in);
		String userData = "qwer/1234/개동이,asdf/1111/점박이,abcd/2222/바둑이";
		String[] uArr1 = userData.split(",");
		cnt = uArr1.length;
		userList = new User[cnt];
		for (int i = 0; i < cnt; i++) {
			String[] uArr2 = uArr1[i].split("/");
			userList[i] = new User();
			userList[i].id = uArr2[0];
			userList[i].name = uArr2[2];
			userList[i].pw = uArr2[1];
		}
	}
	void login() {
		System.out.println("ID >> ");
		String id = sc.next();
		System.out.println("PW >> ");
		String pw = sc.next();
		if (log(id, pw) != -1) {
			System.out.printf("로그인 성공[%s]%n", userList[log(id, pw)].id);
			idx = log(id, pw);
		} else {
			System.out.println("로그인 실패");
			idx = -1;
		}
	}
	
	int log (String id, String pw) {
		for (int i = 0; i < cnt; i++) {
			if (id.equals(userList[i].id) && pw.equals(userList[i].pw)) {
				return i;
			}
		}
		return -1;
	}
	
	boolean checkId(String id) {
		for (int i = 0; i < cnt; i++) {
			if (id.equals(userList[i].id)) {
				return true;
			}
		}
		return false;
	}
	
	void addId () {
		System.out.println("ID >>");
		String id = sc.next();
		if (checkId(id)) {
			System.out.println("이미 있는 아이디 입니다.");
			return;
		}
		System.out.println("PW >> ");
		String pw = sc.next();
		System.out.println("name >> ");
		String name = sc.next();
		
		User[] temp = userList;
		cnt++;
		userList = new User[cnt];
		for (int i = 0; i < temp.length; i++) {
			userList[i] = new User();
			userList[i] = temp[i];
		}
		userList[cnt - 1] = new User();
		userList[cnt - 1].id = id;
		userList[cnt - 1].pw = pw;
		userList[cnt - 1].name = name;
	}
	
	void logout() {
		idx = -1;
	}
	
}
