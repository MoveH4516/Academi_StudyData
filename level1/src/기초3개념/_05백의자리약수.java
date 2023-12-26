package 기초3개념;

public class _05백의자리약수 {
	public static void main(String[] args) {
		
		// 어떤 수를 잘게 쪼갤 수 있는 수
		// %를 활용하여 나머지 값이 0이 나오면 그 수는 약수가 된다.
		
		int a = 0;
		a = 12;
		boolean result = a % 4 == 0;
		System.out.println(result); // true가 나오면 4는 a의 약수이다.
		
		int a1 = 3640;
		boolean result2 = 45 % (a1 % 1000 / 100) == 0;
		System.out.println(result2); // 6은 45의 약수가 아니므로 false 출력
		
		a1 = 3340;
		result2 = 45 % (a1 % 1000 / 100) == 0;
		System.out.println(result2); // 5는 45의 약수이므로 true 출력
		
	}
}
