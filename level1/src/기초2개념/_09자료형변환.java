package 기초2개념;

public class _09자료형변환 {
	public static void main(String[] args) {
		
		//자료의 형태를 변환하는 방법
		
		//자동 형변환
		//실수와 정수의 연산은 자동으로 변환
		System.out.println(10 + 3.0); // 10을 자동으로 double로 형변환이 된다.
		
		//강제 형변환
		System.out.println((int)(10 - 3.0)); // 계산값을 강제로 int로 만들어 준다.
		
		int x = 10;
		double y = 3.2;
		int result = (int)(x + y);
		System.out.println(result); // 소숫점은 아예 사라진다. 13.2가 아닌 13출력
		
		//아스키코드
		char a = 'a';
		char A = 'A';
		System.out.println((int)a);
		System.out.println((int)A);
		//반대로 97, 65를 char 값으로 출력하면 a A가 출력된다.
		
	}
}
