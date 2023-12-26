package 배열심화문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _문제22쇼핑몰관리자 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	쇼핑몰
		 	1. 카테고리와 아이템을 입력받아
		 	각 행의 첫번째 열에 저장
		 	아이템은 각 행의 두 번째 열에 저장
		 	아이템은 / 구분자로 연결
		 */
		Scanner sc = new Scanner(System.in);
		String data = "과일,사과/포도\n";
			data += "과자,홈런볼/조리퐁\n";
			data += "음료,콜라/사이다/나랑다\n";
			data += "육류,소고기/돼지고기/오리고기/닭고기\n";
		
		String[] item = data.split("\n");
		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int idx = 0;
		for (String s : item) {
			items[idx] = s.split(",");
			idx++;
		}
		System.out.println(Arrays.deepToString(items));
		int itemCount = 0;
		itemCount = 4;
		while (true) {
			System.out.println("[관리자모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]데이터 저장");
			System.out.print(": ");
			int sel = sc.nextInt();
			if (sel < 0 || sel > 4) {
				System.out.println("오류");
				continue;
			}
			if (sel == 1) {
				while (true) {
					for (int i = 0; i < itemCount; i++) {
						System.out.printf("[%2d] %s\n", i + 1, items[i][0]);
					}
					System.out.print("1.추가 2.삭제 3.뒤로가기");
					int choice = sc.nextInt();
					if (choice == 3) {
						break;
					}
					idx = 0;
					if (choice == 1) {
						System.out.print("추가할 카테고리 : ");
						sc.nextLine();
						String cate = sc.nextLine();
						for (int i = 0; i < itemCount; i++) {
							if (cate.equals(items[i][0])) {
								idx = -1;
								break;
							}
						}
						if (idx == -1) {
							System.out.println("중복 카테고리 생성 불가");
							continue;
						}
						itemCount++;
						items[itemCount - 1][0] = cate;
					} else if (choice == 2) {
						idx = -1;
						System.out.print("삭제할 카테고리 : ");
						sc.nextLine();
						String cate = sc.nextLine();
						for (int i = 0; i < itemCount; i++) {
							if (cate.equals(items[i][0])) {
								idx = i;
								break;
							}
						}
						if (idx == -1) {
							System.out.println("일치하는 카테고리가 없습니다.");
							continue;
						}
						for (int i = idx; i < itemCount - 1; i++) {
							items[i][0] = items[i + 1][0];
						}
						items[itemCount - 1][0] = "";
						items[itemCount - 1][1] = "";
						itemCount--;
					}
				}
			} else if (sel == 2) {
				while (true) {
					for (int i = 0; i < itemCount; i++) {
						System.out.printf("[%2d] %s\n", i + 1, items[i][0]);
					}
					System.out.print("카테고리 번호 입력 : ");
					int num = sc.nextInt();
					if (num < 1 || num > itemCount) {
						continue;
					}
					System.out.print("1.추가 2.삭제 3.뒤로가기");
					int choice = sc.nextInt();
					if (choice == 3) {
						break;
					}
					System.out.printf("[ %s ]\n", items[num - 1][0]);
					String[] s = items[num - 1][1].split("/");
					if (!items[num - 1][1].equals("")) {
						for (int i = 0; i < s.length; i++) {
							System.out.printf("(%2d) %s\n", i + 1, s[i]);
						}
					} else {
						System.out.println("아이템 없음.");
					}
					if (choice == 1) {
						idx = 0;
						System.out.print("추가할 아이템 : ");
						sc.nextLine();
						String item1 = sc.nextLine();
						for (int i = 0; i < s.length; i++) {
							if (item1.equals(s[i])) {
								idx = -1;
								break;
							}
						}
						if (idx == -1) {
							System.out.println("중복 아이템 생성 불가");
							continue;
						}
						if (items[num - 1][1].equals("")) {
							items[num - 1][1] = item1;
						} else {
							items[num - 1][1] += "/" + item1;
						}
					} else if (choice == 2) {
						idx = -1;
						System.out.print("삭제할 아이템 : ");
						sc.nextLine();
						String item1 = sc.nextLine();
						for (int i = 0; i < s.length; i++) {
							if (item1.equals(s[i])) {
								idx = i;
								break;
							}
						}
						if (idx == -1) {
							System.out.println("일치하는 아이템이 없습니다.");
							continue;
						}
						s[idx] = "";
						for (int i = idx; i < s.length - 1; i++) {
							s[i] = s[i + 1];
						}
						items[num - 1][1] = "";
						for (int i = 0; i < s.length - 1; i++) {
							if (i == 0) {
								items[num - 1][1] = s[i];
							} else {
								items[num - 1][1] += "/" + s[i];
							}
						}
					}
				}
			} else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.printf("[%2d] %s\t( %s )\n", i + 1, items[i][0], items[i][1]);
				}
			} else if (sel == 4) {
				data = "";
				for (int i = 0; i < itemCount; i++) {
					if (i < itemCount - 1) {
						data += items[i][0] + ",";
						data += items[i][1] + "\n";
					} else {
						data += items[i][0] + ",";
						data += items[i][1];
					}
				}
				System.out.println(data);
			} else {
				break;
			}
		}
		sc.close();
	}
}
