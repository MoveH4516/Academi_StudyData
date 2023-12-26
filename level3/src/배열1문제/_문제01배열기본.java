package 배열1문제;

public class _문제01배열기본 {
	public static void main(String[] args) {
		
		// array => 100 200 300 400 500 저장
		// 4의 배수만 출력.
		// 4의 배수의 개수도 출력
		int[] array = new int[5];
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			array[i] = (i + 1) * 100;
			if(array[i] % 4 ==0) {
				System.out.println(array[i]);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
