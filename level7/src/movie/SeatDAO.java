package movie;

import java.util.Scanner;

public class SeatDAO {
	Seat[] seatList;
	Scanner sc;
	int num;
	void init (int size) {
		sc = new Scanner(System.in);
		seatList = new Seat[size];
		for (int i = 0; i < size; i++) {
			seatList[i] = new Seat();
			seatList[i].number = i + 1;
		}
	}
	
	void show() {
		for (int i = 0; i < seatList.length; i++) {
			System.out.print(" " + seatList[i].number + " ");
		}
		System.out.println();
		for (int i = 0; i < seatList.length; i++) {
			if (!seatList[i].check) {
				System.out.print("[ ]");
			} else {
				System.out.print("[■]");
			}
		}
	}
	
	void reserve(String userId) {
		int sel = sc.nextInt() - 1;
		if (sel < 0 || sel > seatList.length) {
			return;
		}
		if (seatList[sel].check) {
			System.out.println("이미 예매된 좌석입니다.");
			return;
		}
		System.out.println("예매 완료");
		seatList[sel].check = true;
		seatList[sel].userId = userId;
		num = sel;
	}
	
	void printMyTicket(String name) {
		System.out.println(name + "님의 티켓");
		for (int i = 0; i < seatList.length; i++) {
			if (seatList[i].userId != null && seatList[i].userId.equals(name)) {
				System.out.println("좌석 : " + seatList[i].number + "번");
			}
		}
		for (int i = 0; i < seatList.length; i++) {
			if (seatList[i].userId == null) {
				System.out.print("[ ]");
			} else if (seatList[i].userId.equals(name)) {
				System.out.print("[●]");
			} else {
				System.out.print("[ ]");
			}
		}
		System.out.println();
	}
	
	void cancel(String name) {
		int cnt = 0;
		for (int i = 0; i < seatList.length; i++) {
			if (seatList[i].userId != null && seatList[i].userId.equals(name)) {
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("예매된 표가 없습니다.");
			return;
		} else if (cnt == 1) {
			System.out.println("예매 취소 완료");
			seatList[num].userId = null;
			seatList[num].check = false;
		} else {
			System.out.println("취소할 좌석 선택 >> ");
			int seat = sc.nextInt() - 1;
			if (seat < 0 || seat >= seatList.length) {
				return;
			}
			if (seatList[seat].userId == null || !seatList[seat].userId.equals(name)) {
				System.out.println("일치하는 표가 없습니다.");
				return;
			}
			if (seatList[seat].userId.equals(name)) {
				System.out.println("예매 취소 완료");
				seatList[seat].userId = null;
				seatList[seat].check = false;
			}
		}
	}
	
}
