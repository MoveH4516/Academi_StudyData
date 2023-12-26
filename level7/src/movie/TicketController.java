package movie;

import java.util.Scanner;

public class TicketController {
	SeatDAO seatdao;
	UserDAO userdao;
	Scanner sc;
	void init() {
		sc = new Scanner(System.in);
		seatdao = new SeatDAO();
		seatdao.init(10);
		userdao = new UserDAO();
		userdao.init();
	}
	//[1]로그인 [2]회원가입
	//[1] 영화예매 [2] 예매취소 [3] 내 예매목록 [4] 로그아웃
	
	void run () {
		init();
		while (true) {
			System.out.println("[1]로그인 [2]회원가입 [0]종료");
			int sel = sc.nextInt();
			if (sel == 1) {
				userdao.login();
				if (userdao.idx == -1) {
					continue;
				}
				while (true) {
					System.out.println("[1]영화예매 [2]예매취소 [3]내 예매목록 [4]로그아웃");
					int choice = sc.nextInt();
					if (choice == 1) {
						seatdao.show();
						seatdao.reserve(userdao.userList[userdao.idx].id);
					} else if (choice == 2) {
						seatdao.cancel(userdao.userList[userdao.idx].id);
					} else if (choice == 3) {
						seatdao.printMyTicket(userdao.userList[userdao.idx].id);
					} else if (choice == 4) {
						userdao.logout();
						break;
					} else {
						continue;
					}
				}
			} else if (sel == 2) {
				userdao.addId();
			} else if (sel == 0) {
				break;
			} else {
				continue;
			}
		}
	}
	
}
