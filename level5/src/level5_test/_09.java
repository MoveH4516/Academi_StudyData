package level5_test;

import java.util.Scanner;

public class _09 {
	public static void main(String[] args) {
		
		/*
		 * # 콘솔 게시판 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다. 
		 * 2. 현재 페이지 번호에 해당되는 게시글만 볼 수있다.
		 *  3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다. 
	      4. 실제로 배열의 길이가 늘어나고 줄어들어야한다 : 추가 삭제 
		 */
		Scanner sc = new Scanner(System.in);
		
		String[][] board = null;
		int count = 0; // 전체 게시글 수
		int pageSize = 3; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 1; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호
		String[][] copy = null;
		while (true) {
			System.out.print("1.추가 2.삭제 3.보기");
			int choice = sc.nextInt();
			if (choice == 0) {
				break;
			}
			if (choice < 0 || choice > 3) {
				continue;
			}
			if (choice == 1) {
				System.out.print("게시글 제목 : ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("게시글 내용 : ");
				String aa = sc.nextLine();
				count++;
				copy = board;
				board = new String[count][2];
				for (int i = 0; i < count - 1; i++) {
					board[i] = copy[i];
				}
				board[count - 1][0] = title;
				board[count - 1][1] = aa;
				continue;
			} else if (choice == 2) {
				int idx = -1;
				System.out.println("삭제할 게시글 제목 : ");
				sc.nextLine();
				String title = sc.nextLine();
				for (int i = 0; i < count; i++) {
					if (board[i][0].equals(title)) {
						idx = i;
					}
				}
				if (idx == -1) {
					System.out.println("일치하는 제목 없음");
					continue;
				}
				copy = board;
				for (int i = idx; i < count - 1; i++) {
					copy[i] = copy[i + 1];
				}
				count--;
				board = new String[count][2];
				for (int i = 0; i < count; i++) {
					board[i] = copy[i];
				}
			} else if (choice == 3) {
				while (true) {
					pageCount = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
					endRow = startRow + pageSize;
					System.out.println("게시글(" + count + "개)");
					System.out.printf("페이지 (%d / %d)\n", curPageNum, pageCount);
					if (count > 0) {
						for (int i = startRow; i < endRow && i <= count; i++) {
							System.out.printf("[%d] %s\n", i, board[i - 1][0]);
						}
					}
					System.out.print("1. 이전 2. 이후 0. 종료");
					int sel = sc.nextInt();
					if (sel == 0) {
						break;
					}
					if (sel < 0 || sel > 2) {
						continue;
					}
					if (sel == 1) {
						if (curPageNum == 1) {
							continue;
						} else {
							startRow -= pageSize;
							curPageNum--;
						}
					}
					if (sel == 2) {
						if (curPageNum == pageCount) {
							continue;
						} else {
							startRow += pageSize;
							curPageNum++;
						}
					}
				}
			}
		}
		sc.close();
	}
}
