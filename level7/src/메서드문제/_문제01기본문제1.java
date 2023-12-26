package 메서드문제;

class Test01 {
	void printEvenOrOdd(int a) {
		System.out.println("a = " + a);
		if (a % 2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}
	
	void printSum(int x, int y) {
		int sum = 0;
		System.out.printf("%d ~ %d 총합 = ",x ,y);
		if (x > y) {
			for (int i = y; i <= x; i++) {
				sum += i;
			}
		} else {
			for (int i = x; i <= y; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	void printPrimeNums(int num) {
		for (int i = 2; i <= num; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
	}
}

public class _문제01기본문제1 {
	public static void main(String[] args) {
	
		Test01 t = new Test01();
		t.printEvenOrOdd(19);
		t.printEvenOrOdd(20);
		
		t.printSum(1, 10);
		t.printSum(10, 1);
		
		t.printPrimeNums(20);
	}
}
