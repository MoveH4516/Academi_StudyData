package 기초2개념;

public class _07변수의종류 {
	public static void main(String[] args) {
		
		// 자료형
		// 정수 : int, long (메모리의 크기가 다르다.) 4byte, 8byte
		// long의 경우 마지막에 L을 붙여준다.(대소문자 모두 가능)
		
		long a = 156252312551231231L;
		
		System.out.println(a);
		
		// 실수 : double, float (메모리의 크기가 다르다.) 8byte, 4byte
		// float의 경우 마지막에 f를 붙여준다.(대소문자 모두 가능)
		
		float f = 5.62231f;
		double d = 1.52223158;
		
		System.out.println(f + d);
		
		//문자 : char String 한 문자, 여러 문자
		
		char c = 'A';
		String s = "AI";
		
		System.out.println(c);
		System.out.println(s);
		
		//논리형 : boolean 참 or 거짓
		
		boolean b = true;
		
		System.out.println(b);
	}
}
