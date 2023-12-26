package 기초3문제;

public class _문제04일의자리약수 {
	public static void main(String[] args) {
		
		/*
        [문제] 
            아래 변수의 a의 값이 
            1의 자리가 25의 약수이면, true를 출력하시오.
        [정답]
            false
    */
		int a = 123456;
		boolean result = 25 % (a % 10) == 0;
		System.out.println(result); // 6은 25의 약수가 아니므로 false 출력
		
		a = 123455;
		result = 25 % (a % 10) == 0;
		System.out.println(result); // 5는 25의 약수이므로 true 출력
		
		int one = a % 10;
		System.out.println(one); // 일의 자리 출력
		result = 25 % one == 0;
		System.out.println(result); // 이렇게 해도 가능
	}
}
