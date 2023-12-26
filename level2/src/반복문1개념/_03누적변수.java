package 반복문1개념;

public class _03누적변수 {
	public static void main(String[] args) {
		
		/*
		 [문제1] 1~10까지의 합을 출력
		 [문제2] 10~1까지의 짝수 개수를 출력
		 */
		
		int i = 1;
		int sum = 0;

		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		int count = 0;
		i = 10;
		
		while (i >= 1) {
			count++;
			i -= 2;
		}
		System.out.println(count);
		
		// sum 과 count 는 반복문에 영향을 주진 않지만
		// 반복되면서 계속 누적되고 있는 변수들이다.
	}
}
