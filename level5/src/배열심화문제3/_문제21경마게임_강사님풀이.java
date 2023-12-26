package 배열심화문제3;

import java.util.Random;

public class _문제21경마게임_강사님풀이 {
	public static void main(String[] args) {
		
		int board = 20;
		int size = 5;
		int[][] game = new int[size][board];
		Random rd = new Random();
		int total[] = new int[5]; // 말이동기록 
		int rank[] = new int[5]; // 순위기록 

		int horse = 1; // 말표시 
		// 준비 
		for(int i =0; i < size;i+=1) {
			game[i][0] = horse;
		}
		
		// 게임시작;
		int cnt = 1; // 1등 값을 넣고 cnt+=1 증가
		while(true) {
			System.out.println("RACE >> ");
			//화면 출력
			for(int i =0; i < size;i+=1) {
				for(int k =0; k < board;k+=1) {
					if(game[i][k]==horse&& k == board-1) {
						System.out.print("말__("+rank[i]+")");
					}else if(game[i][k]==horse) {
						System.out.print("말__");
					}else {
						System.out.print("__");
					}
				}
				System.out.println();
			}
			
			// 종료조건
			if(cnt > size) {
				break;
			}
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int temp = cnt;
			
			// 말이동
			for(int i =0; i < size;i+=1) {
				
				// 이미 도착했다면 
				if(total[i] == board-1) {
					continue;
				}
				
				// 도착하지 않았다면 
				int rNum = rd.nextInt(4)+1;
				int px = total[i] + rNum; // 새로운 위치 인덱스 
				
				// 기존 말위치 초기화 
				game[i][total[i]] = 0;
				// 새로운 위치 
				total[i] = px;
				
				         // 19
				if(px >= board-1) { // 도착했다면 
					total[i] = board-1;
					rank[i] = temp;
					cnt+=1;
				}
				
				// 새로운 위치에 말 등록 
				game[i][total[i]] = horse;
				
			}
			
		}
	}
}
