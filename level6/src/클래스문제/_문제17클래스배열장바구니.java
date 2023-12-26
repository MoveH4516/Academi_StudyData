package 클래스문제;

import java.util.Scanner;

public class _문제17클래스배열장바구니 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] uIdList = {"admin", "bbb", "ccc"};
		String[] iList = {"사과", "칸초", "귤", "감"};
		int[] iPList = {10000, 2000, 6500, 3300};
		
		int max = 1000;
		User[] userL = new User[max];
		Item[] itemL = new Item[max];
		Cart[] cartL = new Cart[max];
		int uSize = uIdList.length;
		int iSize = iList.length;
		int cSize = 0;
		for (int i = 0; i < uSize; i++) {
			User s = new User();
			s.id = uIdList[i];
			userL[i] = s;
		}
		for (int i = 0; i < iSize; i++) {
			Item it = new Item();
			it.name = iList[i];
			it.price = iPList[i];
			itemL[i] = it;
		}
		int log = -1;
		while (true) {
			if (log == -1) {
				System.out.println("[1] 로그인 [2] 회원가입");
				int sel = sc.nextInt();
				if (sel < 0 || sel > 2) {
					continue;
				}
				if (sel == 0) {
					break;
				}
				if (sel == 1) {
					System.out.print("ID : ");
					sc.nextLine();
					String id = sc.nextLine();
					if (id.equals(userL[0].id)) {
						log = 0;
					}
					for (int i = 1; i < uSize; i++) {
						if (id.equals(userL[i].id)) {
							log = i;
						}
					}
					if (log == -1) {
						System.out.println("아이디가 일치하지 않습니다.");
						continue;
					}
				} else {
					System.out.println("회원가입");
					System.out.print("ID : ");
					sc.nextLine();
					String id = sc.nextLine();
					int idx = -1;
					for (int i = 0; i < uSize; i++) {
						if (id.equals(userL[i].id)) {
							idx = i;
						}
					}
					if (idx != -1) {
						System.out.println("중복 아이디 생성 불가");
						continue;
					}
					userL[uSize] = new User();
					userL[uSize].id = id;
					uSize++;
					continue;
				}
			}
			if (log == 0) {
				System.out.println("관리자 메뉴");
				System.out.println("[1] 아이템 추가 [2] 아이템 삭제 [3] 최신순(주문정보) [4] 로그아웃");
				int sel = sc.nextInt();
				if (sel < 1 || sel > 4) {
					continue;
				}
				if (sel == 4) {
					log = -1;
				} else if (sel == 1) {
					System.out.print("추가할 아이템 : ");
					sc.nextLine();
					String item = sc.nextLine();
					int idx = -1;
					for (int i = 0; i < iSize; i++) {
						if (itemL[i].name.equals(item)) {
							idx = i;
						}
					}
					if (idx != -1) {
						System.out.println("중복 아이템 추가 불가능");
						continue;
					}
					System.out.print("아이템 가격 : ");
					int price = sc.nextInt();
					itemL[iSize] = new Item();
					itemL[iSize].name = item;
					itemL[iSize].price = price;
					iSize++;
				} else if (sel == 2) {
					if (iSize == 1) {
						System.out.println("삭제할 아이템이 없습니다.");
						continue;
					}
					System.out.print("삭제할 아이템 : ");
					sc.nextLine();
					String item = sc.nextLine();
					int idx = -1;
					for (int i = 0; i < iSize; i++) {
						if (itemL[i].name.equals(item)) {
							idx = i;
						}
					}
					if (idx == -1) {
						System.out.println("일치하는 아이템이 없습니다.");
						continue;
					}
					for (int i = 0; i < cSize; i++) {
						if (cartL[i].itemName.equals(item)) {
							for (int j = i; j < cSize - 1; j++) {
								cartL[j] = cartL[j + 1];
							}
							cSize--;
							cartL[cSize] = null;
							i--;
						}
					}
					for (int i = idx; i < iSize - 1; i++) {
						itemL[i].name = itemL[i + 1].name;
						itemL[i].price = itemL[i + 1].price;
					}
					iSize--;
					itemL[iSize] = null;
				} else if (sel == 3) {
					System.out.println("회원 아이디    상품 이름");
					for (int i = 0; i < cSize; i++) {
						System.out.printf("(%d) %s %s\n", i + 1, cartL[i].userId, cartL[i].itemName);
					}
				}
			} else {
				System.out.println("사용자 메뉴");
				System.out.println("[1] 쇼핑 [2] 주문확인 [3] 탈퇴 [4] 로그아웃");
				int sel = sc.nextInt();
				if (sel < 1 || sel > 4) {
					continue;
				}
				if (sel == 1) {
					for (int i = 0; i < iSize; i++) {
						System.out.printf("(%d) %s %d원\n", i + 1, itemL[i].name, itemL[i].price);
					}
					
					while (true) {
						System.out.print("번호 입력(0 : 뒤로가기) : ");
						int choice = sc.nextInt() - 1;
						if (choice < -1 || choice >= iSize) {
							continue;
						}
						if (choice == -1) {
							break;
						}
						cartL[cSize] = new Cart();
						cartL[cSize].itemName = itemL[choice].name;
						cartL[cSize].userId = userL[log].id;
						cSize++;
						for (int i = 0; i < cSize; i++) {
							System.out.println(cartL[i].itemName + " " + cartL[i].userId);
						}
					}
				} else if (sel == 2) {
					int[] cnt = new int[iSize];
					for (int i = 0; i < cnt.length; i++) {
						for (int j = 0; j < cSize; j++) {
							if (userL[log].id.equals(cartL[j].userId) && itemL[i].name.equals(cartL[j].itemName)) {
								cnt[i]++;
							}
						}
					}
					int sum1 = 0;
					int sum2 = 0;
					System.out.println(userL[log].id + "님의 장바구니");
					for (int i = 0; i < iSize; i++) {
						if (cnt[i] > 0) {
						System.out.printf("%d) %s (%d원)\t%d개\n", i + 1, itemL[i].name, itemL[i].price, cnt[i]);
						sum1 += itemL[i].price * cnt[i];
						sum2 += cnt[i];
						}
					}
					System.out.println("=== 총 " + sum2 + "개 " + sum1 + "원 ===");
				} else if (sel == 3) {
					for (int i = 0; i < cSize; i++) {
						if (cartL[i].userId.equals(userL[log].id)) {
							for (int j = i; j < cSize - 1; j++) {
								cartL[j] = cartL[j + 1];
							}
							cSize--;
							cartL[cSize] = null;
							i--;
						}
					}
					for (int i = log; i < uSize - 1; i++) {
						userL[i] = userL[i + 1];
					}
					uSize--;
					userL[uSize] = null;
					log = -1;
				} else if (sel == 4) {
					log = -1;
				}
			}
		}
		sc.close();
	}
}
