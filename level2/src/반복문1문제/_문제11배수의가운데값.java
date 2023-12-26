package 반복문1문제;

public class _문제11배수의가운데값 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	1~1000사이의 숫자 중 다음 조건에 맞는 숫자를 출력.
		 	조건) 28의 배수를 출력하는 배수 중 가운데 위치의 값만 출력
		 	가운데가 짝수 자리수이면 뒤에꺼를 가운데로
		 	ex) 배수의 개수 15개 -> 8번 째 배수 출력
		 				 		
		 */
		
		
		int i = 1;
		int count = 0;
		int cnt = 0;
		while (i <= 1000) {
			if (i % 28 == 0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
		if (count % 2 != 0) {
			count += 1;
		}
		System.out.println(count);
		
		// count 의 중간값을 구한 뒤 * 28을 해주면 더 간단하게 해결할 수 있다.
		
		i = 1;
		while (i <= 1000) {
			if (i % 28 == 0) {
				cnt++;
				if (cnt == count / 2) {
				System.out.println("최종답: " + i);
				}
			}
			i++;
		}
	}
}
