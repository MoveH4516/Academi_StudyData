package 기초1개념1;

public class _09문자와숫자출력 {
	public static void main(String[] args) {
		
		// 연결연산자 + -> 서로 다른 데이터를 연결해서 출력
		// 위 > 아래, 왼쪽 > 오른쪽
		// 문자가 더 위에 있기 때문에 숫자와 같이 나와도 문자로 출력
		System.out.println("5"+3+4);
		System.out.println("5"+(3+4));
	}
}
