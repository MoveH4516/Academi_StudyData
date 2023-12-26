package 기초3문제;

public class _문제03십의자리 {
	public static void main(String[] args) {
		
		int a = 0;
		a = 1541;
		boolean result = a % 100 / 10 % 2 != 0;
		System.out.println(result);
	}
}
