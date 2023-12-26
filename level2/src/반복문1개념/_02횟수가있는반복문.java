package 반복문1개념;

public class _02횟수가있는반복문 {
	public static void main(String[] args) {
		
		/*
		 [문제1] 1~4 출력
		 [문제2] 4~1 거꾸로 출력
		 [문제3] 1~4 짝수만 출력
		 
		 반복변수 : 반복 횟수에 영향을 미치는 변수
		 누적변수 : 반복문에 영향을 미치진 않지만 반복문 안에서 계속 누적되는 변수
		 보통 개수, 총합 등에 사용되는 변수로 초기값을 0으로 설정해둔다.
		 
		 */
		int i = 1;
		
		while (i <= 4) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------");
		i = 4;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("--------------------");
		i = 1;
		while (i <= 4) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++; // 증감을 i += 2; 로 해줘도 가능하다.
		}
		
	}
}
