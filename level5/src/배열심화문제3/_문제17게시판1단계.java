package 배열심화문제3;

import java.util.Scanner;

public class _문제17게시판1단계 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	게시판 만들기
		 */
		Scanner sc = new Scanner(System.in);
		int count = 14;
		int curPage	= 1;
		int pageCnt = 0;
		int startRow = 1;
		int endRow = 0;
		System.out.print("한페이지에 보여질 게시글 숫자 : ");
		int pageSize = sc.nextInt();
		while (true) {
			pageCnt = count / pageSize + 1;
			endRow = startRow + pageSize - 1;
			if (endRow > 14) {
				endRow = 14;
			}
			System.out.printf("%d : %d (%d/%d)\n",startRow, endRow, curPage, pageCnt);
			for (int i = startRow; i < startRow + pageSize && i <= 14; i++) {
				System.out.printf("(%d)\n", i);			
			}
			System.out.println("[이전 1]");
			System.out.println("[이후 2]");
			System.out.print("선택 : ");
			
			int sel = sc.nextInt();
			if (sel == 0) {
				System.out.println("종료");
				break;
			}
			if (sel < 0 || sel > 2) {
				continue;
			}
			if (sel == 1) {
				if (startRow == 1) {
					continue;
				}
				startRow -= pageSize;
				curPage--;
			} else if (sel == 2) {
				if (curPage == pageCnt) {
					continue;
				}
				startRow += pageSize;
				curPage++;
			}
			
			
		}
		sc.close();
	}
}
