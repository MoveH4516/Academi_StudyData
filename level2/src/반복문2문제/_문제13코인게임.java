package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _문제13코인게임 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	내 자금 3500원.
		 	1. 0 또는 1의 랜덤 숫자를 저장한다.
		 	2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 	3. 동전의 앞면을 맞추는 게임이다.
		 	4. 정답을 맞추면 500원 이득
		 		틀리면 700원 손해이다.
		 	5. 게임이 끝날때마다 게임을 계속할지 종료할지 선택한다.(1.yes, 2.no)
		 	6. 게임 종류 후, 남은 자금을 출력하시오.
		 	7. 남은 돈이 0원 미만이면 자동으로 게임 종료 된다.		 	
		 	8. 두 번 연속 정답을 맞출 경우 상금 두 배(1 번씩만 적용)
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);		
		int money = 3500;
		boolean pass = true;
		int cnt = 0;
		while (pass) {
			int coin = rd.nextInt(2);
			System.out.print("정답 입력 : ");
			int ans = sc.nextInt();
			if (ans < 0 || ans > 1) {
				System.out.println("0과 1 중에서 입력하세요.");
				continue;
			}
			if (ans == coin) {
				System.out.println("정답");
				money += 500;
				cnt++;
			} else {
				System.out.println("오답");
				money -= 700;
				cnt = 0;
			}
			if (cnt == 2) {
				System.out.println("2회 연속 정답 상금 2배");
				money += 500;
				cnt = 0;
			}
			
			System.out.println("현재 잔액 : " + money + "원");
			if (money <= 0) {
				System.out.println("잔액이 부족하여 퇴출되었습니다.");
				break;
			}
			
			while (true) {
				System.out.print("게임을 계속 하시겠습니까? : ");
				int start = sc.nextInt();
				if (start < 1 || start > 2) {
					System.out.println("1과 2 중에서 입력하세요.");
					continue;
				} else if (start == 1) {
					System.out.println("게임을 계속 진행합니다.");
					break;
				} else {
					System.out.println("게임을 종료합니다.");
					pass = false;
					break;
				}
			}			
		}
		System.out.println("현재 내 잔액 : " + money + "원");
		sc.close();
	}
}
