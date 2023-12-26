package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _문제15카카오택시 {
	public static void main(String[] args) {
        /*
        카카오택시
            손님을 태워 목적지까지 이동
            -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정
            메뉴는 다음과 같다
                1) 속도설정 : 1~3까지 가능
                2) 방향설정 : 1 동 2 서 3 남 4 북
                3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
            거리 1칸 당 50원씩 추가되어 도착시 요금 출력
            도착하면 다시 -10~10 사이의 랜덤 목적지가 설정
         */	
		
	    Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int dir = 0;
        int x = 0;
        int y = 0;
        int dx = 0;
        int dy = 0;
        int speed = 0;
        int money = 0;
        int total = 0;
        int midx = 0;
        int midy = 0;

        boolean run = true;

        while (true) {
            while (run) {
                x = rd.nextInt(21) - 10;
                y = rd.nextInt(21) - 10;
                run = false;
            }
            System.out.printf("목적지 : x : %d y : %d\n", x, y);
            System.out.printf("현재위치 : x : %d y : %d\n", dx, dy );
            System.out.printf("방향 : %d 속도 : %d\n", dir, speed);
            System.out.printf("현재 요금 : %d원 전체수익 : %d원\n", money, total);
            System.out.println("1.속도 2.방향 3.이동 4.종료");
            int sel = sc.nextInt();
            if (sel == 1) {
                System.out.print("속도 : ");
                speed = sc.nextInt();
            } else if (sel == 2) {
                System.out.print("방향 : ");
                dir = sc.nextInt();
            } else if (sel == 3) {
                if (dir == 1) {
                    dx += speed;
                    midx = dx;
                } else if (dir == 2) {
                    dx -= speed;
                    midx = dx;
                } else if (dir == 3) {
                    dy += speed;
                    midy = dy;
                } else if (dir == 4) {
                    dy -= speed;
                    midy = dy;
                }
            } else if (sel == 4) {
                System.out.println("시스템 종료");
                break;
            } else {
                System.out.println("1~4의 숫자를 입력하세요");
                continue;
            }
            if (midx < 0) {
                midx *= -1;
            }
            if (midy < 0) {
                midy *= -1;
            }
            int j = 1;
            while (j <= midx) {
                money += 50;
                j++;
            }
            int k = 1;
            while (k <= midy) {
                money += 50;
                k++;
            }

            if (dx == x && dy == y) {
                System.out.println("목적지 도착");
                j = 1;
                k = 1;
                total += money;
                money = 0;
                run = true;
            }
        }
		sc.close();
	}
}
