package 예외처리;

// 컴파일 예외 : 문법적인 예외
// 런타임 예외 : 논리적인 예외

public class _01 {
	public static void main(String[] args) {
		
		int num = 10;;
		// 0으로 나눌 수 없기 때문에 문법적으로는 아무런 문제가 없지만
		// 논리적인 문제가 생겨 실행되지 않고 에러가 발생한다.
		
		// 1. try {} => 예외가 발생할 수 있는 코드를 넣어준다.
		// 2. catch(Exception e) {} => 예외가 발생하면 try 코드를 멈추고
		// catch 코드블럭으로 이동한다.
		
		try {
			System.out.println("result = " + num / 0);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없다.");
		}
		// else if 를 사용하듯 try 하나에 catch 를 여러 번 사용할 수 있다.
		// else 처럼 마지막에 finally 를 사용해 무조건 실행되는 코드를 추가할 수 있다.
	}
}
