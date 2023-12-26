package 배열심화문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _문제03장바구니 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. 로그인 후 쇼핑 메뉴를 선택
		 		다음과 같은 상품 목록 출력
		 		1 사과 2 바나나 3 딸기
		 	2. 번호를 선택해 상품을 장바구니에 담는다
		 	3. 로그인 회원의 아이디는 cartList 배열의 0열에 저장
		 	4. 해당 회원이 구매한 상품은 cartList 배열의 1열에 저장
		 	5. 장바구니 메뉴를 선택하면, 로그인 한 회원의 구매 물품만 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111", "2222", "3333"};
		
		final int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];
		
		String[] item = {"사과", "바나나", "딸기"};
		
		int log = -1;
		int count = 0;
		
		while (true) {
			System.out.println("[MEGA MART]");
			if (log == -1) {
				System.out.println("[1]로 그 인");
			}
			if (log != -1) {
				System.out.println("[2]로그아웃");
				System.out.println("[3]쇼	핑");
				System.out.println("[4]장바구니");
				System.out.println("[5]전체 구매 목록");
			}
			System.out.println("[0]종	료");
			System.out.println("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if (log == -1 && sel >= 2 && sel <= 4) {
				System.out.println("로그인 후 이용해 주세요");
				continue;
			}
			
			if (sel == 1) {
				boolean pass = true;
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				for (int i = 0; i < idList.length; i++) {
					if (id.equals(idList[i]) && pw.equals(pwList[i])) {
						System.out.println("로그인 성공");
						pass = false;
						log = i;
					}
				}
				if (pass) {
					System.out.println("로그인 실패");
					continue;
				}
			} else if (sel == 2) {
				System.out.println("로그아웃");
				log = -1;
			} else if (sel == 3) {
				System.out.println("==== 쇼핑 ====");
				for (int i = 0; i < item.length; i++) {
					System.out.printf("[%d] %s  ", i + 1, item[i]);
					System.out.println("[0] 종료");
				}
				System.out.print("아이템 번호 입력 : ");
				while (true) {
					int num = sc.nextInt();
					if (num == 0) {
						break;
					}
					if (num < 0 || num > 3) {
						System.out.println("1~3 숫자만 가능합니다.");
						continue;
					}
					System.out.printf(" %s 1개 장바구니에 등록", item[num - 1]);
					cartList[count][0] = idList[log];
					cartList[count][1] = item[num - 1];
					count++;
					System.out.println(Arrays.deepToString(cartList));
				}
			} else if (sel == 4) {
				if (count == 0) {
					System.out.println("장바구니가 비었습니다.");
					continue;
				}
				System.out.printf("==== [%s 장바구니] ====\n", idList[log]);
				int[] index = new int[item.length];	
				String[] cart = new String[count];
				String[] cart2 = new String[count];
				int idx = 0;
				for (String items : item) {
					for (int i = 0; i < count; i++) {
						cart[i] = cartList[i][1];
						cart2[i] = cartList[i][0];
					}
					for (int i = 0; i < count; i++) {
						if (cart[i].equals(items) && cart2[i].equals(idList[log])) {
							index[idx]++;						
						}
					}
					System.out.printf("[%s][%d개]\n", items, index[idx]);
					idx++;
				}
			} else if (sel == 5) {
				System.out.println("==== 전체 구매 목록 ====");
				System.out.println("아이디\t아이템");
				for (String[] cart : cartList) {
					if (cart[0] != null) {
						System.out.printf("%s\t%s\n",cart[0], cart[1]);
					}
				}
			} else  if (sel == 0) {
				System.out.println("시스템 종료");
				break;
			}
		}
		sc.close();
	}
}
