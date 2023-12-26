package 메서드문제;

import java.util.Scanner;

class Theater {
	Scanner sc = new Scanner(System.in);
	int[] seat = new int[10];
	String name;
	int cnt;
	int money;
	void printMenu() {
		System.out.println("[1]예매하기 [2]종료하기");
	}
	int select() {
		int sel;
		while (true) {
			sel = sc.nextInt();
			if (sel < 1 || sel > 2) {
				System.out.println("1 또는 2 선택");
				continue;
			}
			break;
		}
		return sel;
	}
	int[] seats(int sel) {
		while (true) {
			if (sel == 1) {
				System.out.println("좌석 선택(1~10, 0종료) >>");
				int idx = sc.nextInt() - 1;
				if (idx < -1 || idx > 10) {
					System.out.println("1~10사이의 숫자 입력");
					continue;
				}
				if (idx == -1) {
					System.out.println("종료");
					break;
				}
				if (seat[idx] == 0) {
					System.out.println("예매 완료");
					seat[idx] = 1;
					cnt++;
					money = cnt * 12000;
					System.out.print("seat = ");
					for (int i = 0; i < seat.length; i++) {
						System.out.printf("%d ", seat[i]);
					}
					System.out.println();
				} else {
					System.out.println("이미 예매된 좌석입니다.");
					continue;
				}
			} else {
				System.out.println("시스템 종료");
				break;
			}
		}
		return seat;
	}
	
	void print() {
		System.out.println("총 매출액 : " + money + "원");
	}
	
}

public class _문제09메서드영화예매 {
	public static void main(String[] args) {
		
		Theater t = new Theater();
		t.name = "메가박스";
		
		System.out.println(t.name);
		t.printMenu();
		int sel = t.select();
		t.seats(sel);
		t.print();
		// t.run 같은 메서드를 만들어서 main 안에서는 run 메서드만 실행시켜도 되는
		// 식으로 코드를 짜는 것이 보통이다.
		// 점점 main 안에서의 코드가 줄어드는 것이 목표.
	}
}
