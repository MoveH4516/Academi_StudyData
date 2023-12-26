package 반복문2문제;

import java.util.Random;

public class _문제08자리수출력 {
	public static void main(String[] args) {
		Random rd = new Random();
		int cnt = 0;
		int num = rd.nextInt(99999) + 1;
		
		boolean pass = true;		
		while (pass) {
			if (num > 0) {
				System.out.println(num);
				num = num / 10;
				cnt++;
			} else {
				pass = false;
			}
		}
		System.out.println(num);
		System.out.println(cnt + "자리");
	}
}
