package 반복문심화문제;

import java.util.Random;

public class _문제02 {
	public static void main(String[] args) {
		/*
		[문제] 
			10~100사이의 랜덤숫자를 저장하고, 
			그숫자의 약수의개수를 구한다.
			약수의개수가 짝수이면 "짝수"를 출력하고,
			약수의개수가 홀수이면 숫자를 전부 출력한다. 
		[예시]
			49 : 1, 7, 49 : 약수의개수가 홀수이므로 숫자를 전부 출력한다.
			13 : 13, 1 : 13의 경우는 약수의개수가 짝수이므로
			 숫자를 출력하지말고 "짝수"를 출력한다.
		[힌트]
			한번에 해결할수 없다. 
	 */
		
		Random rd = new Random();
		int num = rd.nextInt(91) + 10;
		System.out.println("랜덤 숫자 : " + num);
		int i = 1;
		int cnt = 0;
		boolean run = false;
		while (i <= num) {
			if (num % i == 0) {
				cnt++;
			}
			i++;
		}
		
		if (cnt % 2 == 0) {
			System.out.println("짝수");
		} else {
			run = true;
		}
		i = 1;
		while (run && i <= num) {
			if (num % i == 0) {
				System.out.print(i == num ? i : i + ", ");
			}
			i++;
		}
	}
}
