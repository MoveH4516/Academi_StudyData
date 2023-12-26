package level1_Test;

import java.util.Random;
import java.util.Scanner;

public class _문제06 {
	public static void main(String[] args) {
		/*
		[문제  6]
			1. 0 또는 1의 랜덤 숫자를 저장한다.
			2. 0은 동전 앞면, 1은 동전의 뒷면이다.
			3. 동전의 앞뒷면을 맞추는 게임이다. 
	                              사용자에게 0.앞면 1.뒷면 입력 받아서 정답, 오답 출력 
	 	
	 	3분40초58
	 */	
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num = rd.nextInt(2);
		System.out.printf("랜덤한 수 : %d\n",num);
		System.out.print("정답 : ");
		int ans = sc.nextInt();
		boolean pass = ans == 0 || ans == 1;
		if (ans == num && pass) {
			System.out.println("정답");
		} else if (ans != num && pass) {
			System.out.println("오답");
		} else {
			System.out.println("0과 1 중에서 선택하세요.");
		}
		sc.close();
	}
}
