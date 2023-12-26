package 반복문1개념;

public class _04횟수가없는반복문 {
	public static void main(String[] args) {
		
		/*
		 횟수가 있는 경우 : 초기값, 조건식, 증감식이 필요
		 횟수가 없는 경우 : 들어가는 조건식, 나가는 조건식 필요
		 */
		
		//횟수가 없는 반복문 1 형태
		
		int num = 1;
		boolean run = true;
		
		while (run) {
			System.out.println(num);
			if (num > 10) {
				run = false;
			}
			num += 1;
		} System.out.println(num);
		// 증감에 의해 종료되는 것이 아니라 특정 조건일 경우 논리값을 false 로 바꾸어
		// 무한루프에서 빠져 나가는 방식.
		
		num = 1;
		while(true) {
			System.out.println(num);
			if (num > 10) {
				break; // 이런 방식도 가능
 			}
			num += 1;
		} System.out.println(num);
		
	}
}
