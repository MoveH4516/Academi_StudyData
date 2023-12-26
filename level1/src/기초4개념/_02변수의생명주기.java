package 기초4개념;

public class _02변수의생명주기 {
	public static void main(String[] args) {
		
		/*
			변수의 생명주기 (scope)
			변수를 선언할 때 만들어 진다.
			{} 안에서 선언된 변수는 {} 안에서만 적용된다.
			즉, } 이후의 코드에서 {} 안에 있는 변수의 메모리 방은 사라진다.
		 */
		
		int num = 10;
		{
			int x = 1;
			System.out.println(x);
		} // {}가 끝났기 때문에 x 변수의 메모리 방은 사라진다.		
		// 여기에서 x 변수를 불러오려 해도 이미 메모리 방이 사라져 에러가 발생한다.
		System.out.println(num); // num 변수는 main 안에서 선언된 변수이므로 유효
		int x = 5; // x 변수의 메모리 방이 사라졌기 때문에 새롭게 x 변수를 선언하는 것이 가능
		System.out.println(x);
	}
}
