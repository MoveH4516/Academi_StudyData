package 기초3문제;
/*
[문제]
	아래 변수 a, b, c 중에서 a에 가장 큰 수가 저장되어 있는지 확인한다.
	a가 가장 큰 수이면 true를 출력하도록 식을 만드시오.
[정답]
	true
*/
//int a = 6;
//int b = 2;
//int c = 7;
public class _문제05가장큰수 {
	public static void main(String[] args) {
		
		int a = 6;
		int b = 2;
		int c = 7;
		
		boolean result1 = a > b;
		boolean result2 = a > c;
		
		System.out.println(result1 && result2); // a < c 이므로 false 출력
		
		c = 5;
		result2 = a > c;
		System.out.println(result1 && result2); // 6이 가장 큰 수이므로 true 출력
		
	}
}
