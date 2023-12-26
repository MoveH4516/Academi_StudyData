package 클래스배열문제;

import java.util.Scanner;

class SeatVO {
	int num;
	boolean check;
	
	void init (int num) {
		this.num = num;
	}
}

class SeatDAO {
	Scanner sc = new Scanner(System.in);
	SeatVO sv = new SeatVO();
	SeatVO[] seatList;
	int size = 8;
	String name;
	int cnt;
	int money;
	
	void init() {
		name = "메가박스";
		inputData();
	}
	void show() {
		System.out.println(name);
		for (int i = 0; i < size; i++) {
			System.out.printf("[%d]", seatList[i].num);
			System.out.print(seatList[i].check ? "■ " : "□ ");
		}
		System.out.println();
	}
	void inputData() {
		seatList = new SeatVO[size];
		for (int i = 0; i < size; i++) {
			seatList[i] = new SeatVO();
			seatList[i].init(i + 1);
		}
	}
	int getIdx (String msg, int start, int end) {
		int idx = 0;
		while (true) {
			System.out.println(msg);
			idx = sc.nextInt() - 1;
			if (idx < start || idx > end) {
				continue;
			}
			break;
		}
		return idx;
	}
	void ticket(int idx) {
		if (seatList[idx].check) {
			System.out.println("이미 예매된 좌석입니다.");
			return;
		} else {
			System.out.println("예매 완료");
			seatList[idx].check = true;
		}
	}
	void run() {
		init();
		while (true) {
			show();
			int idx = getIdx("좌석 선택(9. 종료) >> ", 0, size);
			if (idx == size) {
				System.out.println("종료");
				break;
			}
			ticket(idx);
		}
	}
	
}

public class _문제02클래스배열영화예매 {
	public static void main(String[] args) {
		SeatDAO sdao = new SeatDAO();
		
		sdao.run();
		
	}
}
