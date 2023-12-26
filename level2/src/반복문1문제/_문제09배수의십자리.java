package 반복문1문제;

public class _문제09배수의십자리 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	숫자 100이상 900이하인 9의 배수 중에서
		 	10의 자리가 6인 첫 번째 배수를 출력하시오.
		 */
		
		int i = 100;
		
		while (i <= 900) {
			if (i % 9 == 0 && i % 100 / 10 == 6) {				
				break;
			}
			i++;
		}
		System.out.println("정답 " + i);
		
		
		i = 900;
		int j = 0;
		while (i >= 100) {
			if (i % 9 == 0 && i % 100 / 10 == 6) {
				j = i;
			}
			i--;
		}
		System.out.println("정답 " + j);
	}
}
