package 클래스배열문제;

import java.util.Scanner;

class Client {
	String id;
	String name;
}

class ClientDAO {
	Scanner sc = new Scanner(System.in);
	int count;
	int size = 100;
	Client[] cList;
	
	void init() {
		cList = new Client[size];
	}
	void showMenu() {
		System.out.println("[1]추가 [2]삭제 [3]출력 [0]종료");
	}
	int getIdx(String msg, int start, int end) {
		int idx = 0;
		while (true) {
			System.out.println(msg);
			idx = sc.nextInt();
			if (idx < start || idx > end) {
				continue;
			}
			break;
		}
		return idx;
	}
	void access(int sel) {
		if (sel == 1) {
			add();
		} else if (sel == 2) {
			delete();
		} else if (sel == 3) {
			printData();
		}
	}
	void add () {
		while (true) {
			cList[count] = new Client();
			int pass = -1;
			System.out.println("아이디 : ");
			cList[count].id = sc.next();
			for (int i = 0; i < count; i++) {
				if (cList[count].id.equals(cList[i].id)) {
					pass = i;
					break;
				}
			}
			if (pass != -1) {
				System.out.println("중복 아이디 생성 불가");
				continue;
			}
			break;
		}
		System.out.println("이름 : ");
		cList[count].name = sc.next();
		count++;
	}
	void delete() {
		if (count == 0) {
			System.out.println("삭제할 데이터가 없습니다");
			return;
		}
		System.out.println("삭제할 아이디 >>");
		String id = sc.next();
		int pass = -1;
		for (int i = 0; i < count; i++) {
			if (id.equals(cList[i].id)) {
				pass = i;
				break;
			}
		}
		if (pass == -1) {
			System.out.println("일치하는 아이디가 없습니다.");
			return;
		}
		for (int i = pass; i < count - 1; i++) {
			cList[i] = cList[i + 1];
		}
		count--;
		cList[count] = null;
	}
	void printData() {
		if (count == 0) {
			System.out.println("데이터 없음");
			return;
		}
		System.out.println("ID \t 이름");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s \t", cList[i].id);
			System.out.printf("%s \t", cList[i].name);
			System.out.println();
		}
	}
	
	void run() {
		init();
		while (true) {
			showMenu();
			int sel = getIdx("메뉴 선택 >>", 0, 3);
			access(sel);
			if (sel == 0) {
				System.out.println("종료");
				break;
			}
		}
	}
	
}

public class _문제03클래스배열회원관리 {
	public static void main(String[] args) {
		ClientDAO c = new ClientDAO();
		
		c.run();
		
		
	}
}
