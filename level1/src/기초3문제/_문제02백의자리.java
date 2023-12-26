package 기초3문제;

public class _문제02백의자리 {
	public static void main(String[] args) {
		
		int a = 0;
		a = 12321;
		boolean result = (a % 1000) / 100 == 3;
		System.out.println(result);
		
	}
}
