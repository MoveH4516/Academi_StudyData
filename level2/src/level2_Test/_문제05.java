package level2_Test;

import java.util.Random;
import java.util.Scanner;

public class _문제05 {
	public static void main(String[] args) {
		
		/*
		 * # 카카오 택시
		 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
		 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
		 * 3. 메뉴는 아래와 같다.
		 * 		1) 속도설정 : 1~3까지만 가능
		 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
		 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
		 * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 *
		 
		 걸린시간 : 16분41초33
		 */
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int dx = 0;
		int dy = 0;
		int speed = 0;
		int dir = 0;
		int money = 0;
		int total = 0;
		
		boolean run = true;
		
		while (true) {
			if (run) {
				int rand1 = rd.nextInt(21) - 10;
				int rand2 = rd.nextInt(21) - 10;
				x = rand1;
				y = rand2;
				run = false;
			}
			
			System.out.printf("목적지 x : %d y : %d\n",x ,y);
			System.out.printf("현재위치 x : %d y : %d\n",dx ,dy);
			System.out.printf("방향 : %d 속도 : %d\n",dir ,speed);
			System.out.printf("현재요금 : %d 총 수익 : %d\n",money ,total);
			System.out.println("1.속도 2.방향 3.이동 4.종료");
			int sel = sc.nextInt();
			if (sel < 1 || sel > 4) {
				System.out.println("1~4 를 입력하세요.");
				continue;
			}
			if (sel == 1) {
				System.out.print("속도 : ");
				speed = sc.nextInt();
				if (speed < 1 || speed > 3) {
					System.out.println("speed는 1~3만 가능합니다.");
					speed = 0;
					continue;
				}
				
			} else if (sel == 2) {
				System.out.print("방향 : ");
				dir = sc.nextInt();
				if (dir < 1 || dir > 4) {
					System.out.println("dir은 1~4만 가능합니다.");
					dir = 0;
					continue;
				}
				
			} else if (sel == 3) {
				if (dir == 0 || speed == 0) {
					System.out.println("방향과 스피드는 0일 때 움직일 수 없습니다.");
					continue;
				}
				money += speed * 50;
				if (dir == 1) {
					dx += speed;
					
				} else if (dir == 2) {
					dx -= speed;

				} else if (dir == 3) {
					dy -= speed;
	
				} else if (dir == 4) {
					dy += speed;
				
				}
			} else if (sel == 4) {
				System.out.println("시스템 종료");
				break;
			}
			
			if (dx == x && dy == y) {
				System.out.println("목적지 도착");
				total += money;
				money = 0;
				run = true;
			}
		}
		sc.close();
	}
}
