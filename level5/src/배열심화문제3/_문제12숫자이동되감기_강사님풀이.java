package 배열심화문제3;

import java.util.Scanner;

public class _문제12숫자이동되감기_강사님풀이 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int game[][] = { { 1, 2, 3, 4 }, 
				 { 5, 6, 7, 8 }, 
				 { 9, 10, 11, 12 }, 
				 { 13, 14, 15, 0 } };
		int move[][] = new int[10000][2]; // 플레이어의 좌표기록 0: y 1: x 
		int x = 3;
		int y = 3;

		int size = game.length;
		int cnt =0;
		
		while(true) {
			System.out.println("=============");
			// 화면 출력 
			for(int i =0; i < size; i+=1) {
				for(int k =0; k < size; k+=1) {
					System.out.printf("%-3d" , game[i][k]);
				}
				System.out.println();
			}
			
			System.out.println(" 1) left 2)right 3)up 4)down 5)되감기 0) 종료");
			
			for(int i =0; i < 5;i+=1) {
				System.out.printf("y = %d x = %d %n", move[i][0],move[i][1]);
			}
			
			// 위치기록 
			move[cnt][0]=y;
			move[cnt][1]=x;
			
			int px = x;
			int py = y;
			int sel = sc.nextInt();
			if(sel < 0 || sel > 5) {
				System.out.println("메뉴 선택 오류");
				continue;
			}else if(sel == 0) {
				break;
			}else if(sel == 1) {
				px-=1;
			}else if(sel == 2) {
				px+=1;
			}else if(sel == 3) {
				py-=1;
			}else if(sel == 4) {
				py+=1;
			}else if(sel == 5) {
				// 되감기
				if(cnt == 0) {
					System.out.println("처음턴은 돌아갈 수 없습니다");
					continue;
				}
				py = move[cnt-1][0];
				px = move[cnt-1][1];
				
			}
			
			// 미리 좌표 확인 
			if(px < 0 || px>=size || py <0 || py>=size) {
				System.out.println("이동할 수 없습니다");
				continue;
			}
			
			// 기존위치와 0위치 변경 
			game[y][x] = game[py][px];
			
			// 예측한 위치로 좌표값 업데이트 
			y = py;
			x = px;
			
			game[y][x] = 0;
			
			if(sel != 5) {
				cnt+=1;
			}else {
				move[cnt][0]=0;
				move[cnt][1]=0;
				cnt-=1;
			}
		
			
		}
		sc.close();
	}
}
