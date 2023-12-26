package 배열심화문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _문제06숫자야구 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1. me 에 1~9 사이의 숫자 3개를 저장한다.
		 	단, 중복된 숫자는 저장할 수 없다.
		 	2. com 과 me 를 비교해 정답을 맞출 때까지 반복.
		 	3. 숫자와 자리가 같으면 strike += 1 숫자만 같고 틀리면 ball += 1 이다.
		 	
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] com = new int[3];
		int[] me = new int[3];
		
		for (int i = 0; i < com.length; i++) {
			com[i] = rd.nextInt(9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}			
		}		
		System.out.println("com : " + Arrays.toString(com));
		int i = 0;
		int s = 0;
		int b = 0;
		while (true) {
			while (i < 3) {
				System.out.print("숫자(1~9) : ");
				me[i] = sc.nextInt();
				if (me[i] < 1 || me[i] > 9) {
					System.out.println("범위 오류");
					continue;
				}
				for (int j = 0; j < i; j++) {
					if (me[i] == me[j]) {
						System.out.println("중복된 값입니다.");
						i--;
						break;
					}
				}
				i++;
			}
			for (int a = 0; a < 3; a++) {
				for (int c = 0; c < 3; c++) {
					if (me[a] == com[c] && a != c) {
						b++;
					}
				}
				if (com[a] == me[a]) {
					s++;
				}
			}						
			if(s != 3) {

				System.out.println("me : " + Arrays.toString(me));
				if (s != 0) {
					System.out.printf("%ds ", s);
				}
				if (b != 0) {
					System.out.printf("%db", b);
				}
				System.out.println();
				i = 0;
				s = 0;
				b = 0;
			} else {
				System.out.println("정답");
				break;
			}
		}
		sc.close();
	}
}
