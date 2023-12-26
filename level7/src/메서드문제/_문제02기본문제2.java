package 메서드문제;

class Test02 {
	void printSum (int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	void print4Sum (int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
	
	void print4Cnt (int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	void printEvenCnt (int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

public class _문제02기본문제2 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		
		int[] arr = {87, 100, 11, 72, 92};
		t.printSum(arr);
		t.print4Sum(arr);
		t.print4Cnt(arr);
		t.printEvenCnt(arr);
	}
}
