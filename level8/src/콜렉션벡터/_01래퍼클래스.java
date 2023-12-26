package 콜렉션벡터;

public class _01래퍼클래스 {
	public static void main(String[] args) {
		
		// 기본 자료형을 클래스로 만들어 놓은 것. (wrapper class)
		// 원시타입 -> 순수하게 값을 가지고 있다.
		// 참조타입 -> 주소값을 가지고 있다.
		
		int num = 10;		// 순수하게 10이라는 값을 저장
		Integer num2 = 10;  // 주소값을 가지고 있기 때문에 null 값을 넣어줄 수도 있다.
		System.out.println(num + num2);
		
		// Integer.parseInt(null);	int값 반환. 즉, 값을 반환한다.	(int 값)
		// Integer.valueOf(null);	클래스 반환. 즉, 주소값을 반환한다. (Integer값)
		
	}
}
