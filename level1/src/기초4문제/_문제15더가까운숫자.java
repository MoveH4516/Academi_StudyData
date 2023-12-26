package 기초4문제;

import java.util.Random;

public class _문제15더가까운숫자 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	랜덤으로 1~150사이의 값을 변수 a,b,c 에 넣고 값을 출력하시오.
		 	그리고 a 와 c 중 어떤 숫자가 b 와 더 가까운지 출력하시오.
		 */
		
		Random rd = new Random();
		int a = rd.nextInt(150) + 1;
		int b = rd.nextInt(150) + 1;
		int c = rd.nextInt(150) + 1;
		System.out.printf("a의 숫자 : %d\n", a);
		System.out.printf("b의 숫자 : %d\n", b);
		System.out.printf("c의 숫자 : %d\n", c);
		
		int diff1 = b - a;
		if(diff1 < 0) {
			diff1 *= -1;
		}
		int diff2 = c - b;
		if(diff2 < 0) {
			diff2 *= -1;
		}
		
		if(diff1 == diff2) {
			System.out.println("a 와 c 가 똑같다.");
		}
		if(diff1 < diff2) {
			System.out.println("a 가 더 가깝다.");
		}
		if(diff2 < diff1) {
			System.out.println("c 가 더 가깝다.");
		}
		
	}
}
