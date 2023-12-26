package 문자열기본;

import java.util.Arrays;

public class _04문자열함수 {
	public static void main(String[] args) {
		
		String str = "가나다라마바사";
		
		// 1. 문자 하나 추출
		char a = str.charAt(0);
		System.out.println(a);
		// 2. 하나~ 여러개 추출
		String b = str.substring(4); // 입력한 인덱스 부터 끝까지
		System.out.println(b);
		b = str.substring(4,5); // 입력한 인덱스부터 입력한 인덱스 이전까지
		System.out.println(b);
		
		String str1 = null; // 비어있는 주소 => 참조변수에만 사용 가능 (비교 불가)
		String str2 = ""; // 문자열은 비어있지만 주소값은 있는상태
		
		System.out.println(str2.equals(str1)); // 비교할 수 없어서 false 출력
		// str1.equals(str2)가 된다면 에러발생 a / 0 같은 느낌
		
		System.out.println(str2.length() == 0); // 빈 문자열이니? 라는 조건
		System.out.println(str2.isEmpty()); // 위와 같은 의미
		System.out.println(str2.isBlank()); // 공백이니? 라는 조건
		
		// split >> 구분자
		str = "떡볶이,짜장면,치킨,우동,돈까스";
		String[] food = str.split(",");
		System.out.println(Arrays.toString(food));
		
		// trim >> 앞 뒤 공백을 제거해주는 함수
		str = "      hello      world   ";
		System.out.println(str.trim()); // 중간에 있는 공백은 제외
		
		// str.replace("","") 앞에꺼를 뒤에꺼로 바꿔주는 함수
		
		str = "hello B hello";
		System.out.println(str.replace("hello", "A"));
	}
}
