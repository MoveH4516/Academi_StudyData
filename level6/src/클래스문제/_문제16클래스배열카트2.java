package 클래스문제;

import java.util.Scanner;

public class _문제16클래스배열카트2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] uList = {"aaa", "bbb", "ccc"};
		String[] iList = {"사과", "칸초", "귤", "감"};
		int[] iPList = {10000, 2000, 6500, 3300};
		String[] cUIdList = {"aaa", "ccc", "aaa", "bbb", "aaa", "ccc"};
		String[] cIList = {"칸초", "귤", "칸초", "사과", "감", "사과"};
		
		User[] userL = new User[uList.length];
		Item[] itemL = new Item[iList.length];
		Cart[] cartL = new Cart[cUIdList.length];
		int idx = 0;
		for (String s : uList) {
			User u = new User();
			u.id = s;
			userL[idx++] = u;
		}
		for (int i = 0; i < itemL.length; i++) {
			Item it = new Item();
			it.name = iList[i];
			it.price = iPList[i];
			itemL[i] = it;
		}
		for (int i = 0; i < cartL.length; i++) {
			Cart c = new Cart();
			c.itemName = cIList[i];
			c.userId = cUIdList[i];
			cartL[i] = c;
		}
		while (true) {
			System.out.println("[0] 종료\n"
					+ "[1] 전체출력\n"
					+ "[2] 회원 aaa 가 주문한 각 아이템이름과 가격 출력\n"
					+ "[3] 카트내용을 전부 출력(회원 별 아이템 전체와 가격)\n"
					+ "[4] 주문한 아이템 개수가 가장 많은 회원 출력\n"
					+ "[5] 주문한 아이템 총액이 가장 큰 회원 출력");
			int sel = sc.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				System.out.print("회원 아이디 [");
				for (User u : userL) {
					System.out.printf(" %s ",u.id);
				}
				System.out.println("]");
				System.out.println("---------------------------");
				for (Item i : itemL) {
					System.out.printf("%s(%d) ", i.name, i.price);
				}
				System.out.println();
				System.out.println("---------------------------");
				for (Cart c : cartL) {
					System.out.printf("%s --> %s\n", c.userId, c.itemName);
				}
				System.out.println("---------------------------");
			} else if (sel == 2) {
				System.out.println("[aaa]주문");
				for (Cart c : cartL) {
					for (Item i : itemL) {
						if (c.userId.equals("aaa") && c.itemName.equals(i.name)) {
							System.out.printf("%s --> %d원\n", c.itemName, i.price);
						}
					}
				}
				System.out.println("---------------------------");
			} else if (sel == 3) {
				System.out.println("[장바구니 전체]");
				for (Cart c : cartL) {
					for (Item i : itemL) {
						if (c.itemName.equals(i.name)) {
							System.out.printf("%s --> %s %d원\n", c.userId, c.itemName, i.price);
						}
					}
				}
				System.out.println("---------------------------");
			} else if (sel == 4) {
				int max = 0;
				idx = 0;
				int idx2 = 0;
				for (User u : userL) {
					int cnt = 0;
					for (Cart c : cartL) {
						if (u.id.equals(c.userId)) {
							cnt++;
						}
					}
					if (max < cnt) {
						max = cnt;
						idx2 = idx;
					}
					idx++;
				}
				System.out.println("최다 개수 주문 회원 : " + userL[idx2].id);
			} else if (sel == 5) {
				int max = 0;
				idx = 0;
				int idx2 = 0;
				for (User u : userL) {
					int cash = 0;
					for (Cart c : cartL) {
						for (Item i : itemL) {
							if (u.id.equals(c.userId) && c.itemName.equals(i.name)) {
							cash += i.price;
							}
						}
					}
					if (max < cash) {
						max = cash;
						idx2 = idx;
					}
					idx++;
				}
				System.out.println("최대 금액 주문 회원 : " + userL[idx2].id);
			} else {
				continue;
			}
		}
		sc.close();
	}
}
