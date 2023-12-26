package 기초4개념;

public class _05if의종류 {
	public static void main(String[] args) {
		
		/*
		 	1. if (조건) { }
		 	2. if (조건) { } else { }
		 	3. if (조건) { } else if (조건) { } else if (조건) { } '''
		 	4. if (조건) { } else if (조건) { } else { }
			
			else 는 그렇지 않으면 이라는 의미
		 */
		
		int num = 10;
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		// 정수 num 은 짝수 아니면 홀수 이기 때문에 if (조건)이 참이면 짝수 거짓이면 홀수 출력
		// if (조건)을 다시 해줄 필요 없이 else 를 활용하여 그렇지 않으면을 활용할 수 있다.
		// n개의 조건중 반드시 하나를 실행하고 싶다면 else 를 사용한다.
		// TMI if 의 코드 영역이 한 줄이면 {} 생략 가능
		System.out.println("-----------------------------");
		if (num % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		// 두 줄 이상이라면 영역의 범위가 애매해 지기 때문에 제대로 되지 않아 {}를 사용하는 것이 좋다.
		
	}
}
