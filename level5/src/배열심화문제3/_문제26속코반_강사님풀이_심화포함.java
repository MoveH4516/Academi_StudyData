package 배열심화문제3;

import java.util.Random;
import java.util.Scanner;

public class _문제26속코반_강사님풀이_심화포함 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		final int SIZE = 9;
		final int MAN = 2;
		final int WALL = 9;
		final int BALL = 3;
		final int GOAL = 7;
		final int FILL = 6;
		final int ROAD = 0;
		
		int[][] map = new int[SIZE][SIZE];
		int ballCnt =0;
		int gameCnt=0;
		
		// 게임 셋팅
		int wallCnt =0;
		while(true) {
			System.out.print("벽갯수 1 -15 입력 >> ");
			wallCnt = sc.nextInt();
			if(wallCnt < 1 || wallCnt >15) {
				System.out.println("갯수 다시 입력");
				continue;
			}
			break;
		}
		// 벽셋팅 
		for(int i =0; i < wallCnt;) {
			int rdY = rd.nextInt(SIZE); // 0 - 8 
			int rdX = rd.nextInt(SIZE); 
			if(map[rdY][rdX]==ROAD) {
				map[rdY][rdX] = WALL;
				i+=1;
			}
		}
		
		int randCnt = rd.nextInt(3)+3; // 0 1 2 // 3 4 5 
		
		// 플레이어 위치 이동 위한 인덱스 
		int x =0;
		int y =0;
		
		boolean goal = false;
		
		for(int i =0; i < randCnt;i+=1) {
			int rdY = rd.nextInt(SIZE); // 0 -8 
			int rdX = rd.nextInt(SIZE); 
			
			if(i >1) {
				rdY = rd.nextInt(SIZE-2)+1; // 0 - 8 // 1 - 7 
				rdX = rd.nextInt(SIZE-2)+1; //1 - 7 
			}
			
			if(map[rdY][rdX]!= ROAD) {
				i-=1;
				continue;
			}
			
			if(i == 0) {
				map[rdY][rdX] = MAN;
				y = rdY;
				x= rdX;
				
			}else if(i == 1) {
				map[rdY][rdX] = GOAL;
			}else { // 2 3 4
				map[rdY][rdX] = BALL;
				ballCnt+=1;
			}
		}
		// 벽근처에 있는지 예외처리 
		for(int i =0; i < SIZE;i+=1) {
			for(int k=0; k < SIZE;k+=1) {
				if(map[i][k] == BALL || map[i][k] == MAN || map[i][k] == GOAL) {
					int data = map[i][k] == BALL? BALL : map[i][k] == MAN? MAN : GOAL;
					
					int yy = i;
					int xx = k;
					int cnt =0; 
					for(int n = -1; n <=1 ;n+=1) {
						for(int j = -1; j <=1 ;j+=1) {
							if(yy+n >= 0 && xx+j >=0 && yy+n< SIZE && xx+j < SIZE && map[yy+n][xx+j]==WALL) {
								cnt+=1;
							}
						}
					}
					
					if(cnt >= 2) {
						while(true) {
							int rdY = rd.nextInt(SIZE);
							int rdX = rd.nextInt(SIZE);
							
							if(data == BALL) {
								rdY = rd.nextInt(SIZE-1-1)+1;
								rdX = rd.nextInt(SIZE-1-1)+1;
							}
							
							if(map[rdY][rdX] != ROAD) {
								continue;
							}
							map[yy][xx] = ROAD;
							map[rdY][rdX] = data;
							i=0;
							break;
						}
					}
					
				}
				
			}
		}
		
				
		// 게임 시작 
		while(true) {
			System.out.println("========== 소코반 ============");
			System.out.printf("gameCnt %d / %d %n" , gameCnt , ballCnt);
			System.out.println("============================");
			
			for(int[] cal : map ) {
				for(int data : cal) {
					if(data == MAN) {
						System.out.print("옷 ");
					}else if(data == WALL) {
						System.out.print("■ ");
					}else if(data == BALL) {
						System.out.print("● ");
					}else if(data == ROAD) {
						System.out.print("+ ");
					}else if(data == GOAL) {
						System.out.print("○ ");
					}else if(data==FILL) {
						System.out.print("◎ ");
					}
				}
				System.out.println();
			}
			if(goal) {
				System.out.println("==== 게임 클리어 ==== ");
				break;
			}
			
			System.out.println("a(왼) d(오) w(위) s(아래) q(종료)");
			String dir = sc.next();
			
			// 플레이어 이동예측
			int yy = y;
			int xx = x;
			
			if(dir.equals("a")) {
				xx-=1;
			}else if(dir.equals("d")) {
				xx+=1;
			}else if(dir.equals("w")) {
				yy-=1;
			}else if(dir.equals("s")) {
				yy+=1;
			}else if(dir.equals("q")) {
				System.out.println("게임 종료");
				break;
			}else{
				continue;
			}
			
			if(yy < 0 || yy >=SIZE || xx >= SIZE || xx < 0 ||map[yy][xx]== WALL || map[yy][xx] == GOAL ) {
				continue;
			}
			// 그다움위치가 공이라면 공과 함께 이동 
			
			if(map[yy][xx] == BALL) {
				int by = yy;
				int bx = xx;
				if(dir.equals("a")) {
					bx-=1;
				}else if(dir.equals("d")) {
					bx+=1;
				}else if(dir.equals("w")) {
					by-=1;
				}else if(dir.equals("s")) {
					by+=1;
				}
				
				if(by <0 || bx <0 || by >=SIZE || bx >=SIZE || map[by][bx] == WALL) {
					continue;
				}
				if(map[by][bx] == BALL) {
					System.out.println("공은 한개씩 이동 가능 합니다");
					continue;
				}
				
				if(map[by][bx] == GOAL) {
					gameCnt+=1;
					if(gameCnt == ballCnt) {
						map[by][bx] = FILL;
						goal = true;
					}else {
						map[by][bx] = GOAL;
					}
				}else {
					// 공 이동 
					map[by][bx]= BALL;
				}
					
			}
			
			//플레이어 이동 
			map[y][x] = ROAD;
			y = yy;
			x = xx;
			map[y][x] = MAN;

			
		}
		sc.close();
	}
}
