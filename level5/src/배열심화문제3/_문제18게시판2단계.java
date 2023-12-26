package 배열심화문제3;

import java.util.Scanner;

public class _문제18게시판2단계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	게시판 만들기 심화단계
		 */
		Scanner sc = new Scanner(System.in);
		
		String[][] board = null;
		int count = 0;
		int curPage	= 1;
		int pageCnt = 0;
		int startRow = 0;
		int endRow = 0;
		int pageSize = 3;
		String[][] copy = null;
		while (true) {
			endRow = startRow + pageSize;
			if (count % pageSize == 0) {
				pageCnt = count / pageSize; 
			} else {
				pageCnt = count / pageSize + 1; 
			}
			System.out.println("게시판 : " + count);
			System.out.println("현재 페이지 : " + curPage);
			if (count > 0) {
				for (int i = startRow; i < endRow && i < count; i++) {
					System.out.printf("(%d)%s\n", i + 1, board[i][0]);
				}
			} else {
				System.out.println(" ");
			}
			System.out.print("[1]이전 ");
			System.out.print("[2]이후 ");
			System.out.print("[3]추가 ");
			System.out.print("[4]삭제 ");
			System.out.println("[5]확인");
			int sel = sc.nextInt();
			if (sel < 0 || sel > 5) {
				continue;
			}
			if (sel == 0) {
				System.out.println("종료");
				break;
			} else if (sel == 1) {
				if (curPage == 1) {
					continue;
				}
				curPage--;
				startRow -= pageSize;
			} else if (sel == 2) {
				if (curPage == pageCnt) {
					continue;
				}
				curPage++;
				startRow += pageSize;
			} else if (sel == 3) {
				count++;
				copy = board;
				board = new String[count][2];
				System.out.print("게시글 제목 : ");
				board[count - 1][0] = sc.next();
				System.out.print("게시글 내용 : ");
				board[count - 1][1] = sc.next();
				if (count > 1) {
					for (int i = 0; i < copy.length; i++) {
						board[i] = copy[i];
					}
				}
			} else if (sel == 4) {
				if (count == 0) {
					System.out.println("삭제할 게시글이 없습니다.");
					continue;
				}
				System.out.print("삭제할 게시글 번호 : ");
				int num = sc.nextInt();
				if (num < 1 || num > count) {
					System.out.println("게시글이 존재하지 않습니다.");
					continue;
				}
				board[num - 1] = null;
				copy = board;
				count--;
				int idx = 0;
				board = new String[count][2];
				if (count > 0) {
					for (int i = 0; i < copy.length; i++) {
						if (copy[i] != null) {
							board[idx] = copy[i];
							idx++;
						}
					}
				}
			} else if (sel == 5) {
				System.out.print("확인할 게시글 번호 : ");
				int num = sc.nextInt();
				if (num < 1 || num > count) {
					System.out.println("게시글이 존재하지 않습니다.");
					continue;
				}
				System.out.printf("%s의 게시글 내용\n%s\n", board[num - 1][0], board[num - 1][1]);
			}
		}
		sc.close();
	}
}
