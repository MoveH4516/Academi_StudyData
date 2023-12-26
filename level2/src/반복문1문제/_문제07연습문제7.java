package 반복문1문제;

public class _문제07연습문제7 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	조건1 30의 약수를 출력
		 	조건2 그 총합을 계산
		 	조건3 그 개수를 계산
		 */
		
		int i = 1;
		int num = 30;
		int sum = 0;
		int count = 0;
		
		while (i <= num) {
			if (num % i == 0) {
				count++;
				sum += i;
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(count);
	}
}
