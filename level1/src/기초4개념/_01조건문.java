package 기초4개념;

public class _01조건문 {
	public static void main(String[] args) {
		
		/*
			코드의 흐름을 제어한다. (제어문의 한 종류)
			조건문 : 건너뛰기 가 가능하다. 원하는 조건일 때 실행이 되도록 코드를 제어한다.
			조건이 참일 때 실행, 거짓일 때 실행되지 않고 건너뛰기.
			
			if (조건) {
				} 
		*/
		
		if (true) {
			System.out.println("true이기 때문에 실행 됩니다.");
		}
		
//		if (false) {
//			System.out.println("false이기 때문에 실행 되지 않습니다.");
//		}
		
		int a = 5;
		int b = 5;
		if (a == b) { // true 이기 때문에 코드 실행
			System.out.println("a와 b는 동일한 값을 갖습니다.");
		}
		
	}
}
