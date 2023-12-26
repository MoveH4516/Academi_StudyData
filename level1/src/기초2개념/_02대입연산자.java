package 기초2개념;

public class _02대입연산자 {
	public static void main(String[] args) {
		
		int num = 6; //변수는 반드시 대입연산자( = ) 을 통해 값이 저장되어야 한다.
		
		System.out.println(num + 1);
		System.out.println(num); // 변수에 저장된 메모리를 가져오는 것.
		
		num = 10;
		
		System.out.println(num + 1);
		System.out.println(num);
		
		num = num + 1;
		System.out.println(num);
	}
}
