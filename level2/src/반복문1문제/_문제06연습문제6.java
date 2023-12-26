package 반복문1문제;

public class _문제06연습문제6 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	40~100 사이에 5의 배수만 출력한다.
		 	반복문  종료 후 5의 배수 전체 합을 출력
		 */
		
		int i = 40;
		int sum = 0;
		
		while (i <= 100) {
			if (i % 5 == 0) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
