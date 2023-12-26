package 기초3개념;

public class _06논리연산자 {
	public static void main(String[] args) {
		
		// and, or 인 연사자로 true, false 의 값을 출력
		// && = and (그리고 의 의미)
		// || = or (또는 의 의미)
		// ! = not (반대 의 의미)
		
		// 여러가지 논리자료형을 동시에 비교하고 싶을 때 사용
		
		// ex) 숫자 a가 홀수 이면서 3의 배수인지를 확인하는 경우
		
		int a = 0;
		a = 9;
		boolean result = a % 2 != 0; // true
		boolean result2 = a % 3 == 0; // true
		System.out.println(result && result2); // result, result2 모두 true 이므로 true 가 출력
		// &&는 모두 true 여야 true 출력 하나라도 false 가 나온다면 false 출력
		// ||는 하나라도 true 이면 true 출력 모두 false 여야 false 출력
		result = a % 2 == 0; // false
		System.out.println(result || result2); // result 가 false 이지만 result2가 true 이므로 true 가 출력
		System.out.println(result && result2); // result 가 false 이므로 false 출력
		System.out.println(!result && result2); // result 가 false 이지만 앞에 !가 있으므로 true && true 로 true가 출력
		
		
	}
}
