package 기초2개념;

public class _08변수값교체 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		System.out.println("a = " + a);
		System.out.printf("a = %d\n", a);
		
		System.out.println("b = " + b);
		System.out.printf("b = %d\n", b);
		
		System.out.printf("a = %d, b = %d\n",a,b);
		
		// 숫자 사용 없이 a값과 b값을 서로 교체하여 출력하는 방법.
		
		int c = a;
		int d = b;
		
		a = d;
		b = c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
