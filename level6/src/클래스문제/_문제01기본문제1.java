package 클래스문제;

class Test01 {
	int[] arr = {87, 100, 11, 72, 92};
}

public class _문제01기본문제1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	전체 합 출력
		 	
		 	4의 배수 합 출력
		 	
		 	4의 배수 개수 출력
		 */
		Test01 t = new Test01();
		
		int sum = 0;
		for (int i = 0; i < t.arr.length; i++) {
			sum += t.arr[i];
		}
		System.out.println(sum);
		
		int sumFour = 0;
		int cnt = 0;
		for (int i = 0; i < t.arr.length; i++) {
			if (t.arr[i] % 4 == 0) {
				sumFour += t.arr[i];
				cnt++;
			}
		}
		System.out.println(sumFour);
		System.out.println(cnt);
	}
}
