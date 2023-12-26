package 반복문1문제;

public class _문제10배수빼기 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	다음 조건이 전부 맞는 수를 출력
		 	조건1) 13이상 100미만의 숫자 중에서 13의 배수를 전부 검사한다.
		 	조건2) 그 중 6번째 배수에서 4번째 배수를 뺀 수를 구한다.
		 */
		 
		int i = 13;
		int count = 0;
		int j = 0;
		int k = 0;
		
		while (i < 100) {
			if (i % 13 == 0) {
				count++;
				if (count == 4) {
					System.out.println(i);
					j = i;
				} else if (count == 6) {
					System.out.println(i);
					k = i;
				}
			}			
			i++;
		}
		int answer = k - j;
		System.out.println("정답 : " + answer);		
	}
}
