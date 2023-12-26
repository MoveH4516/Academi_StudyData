package 생성자;

class Ex01 {
	
	Ex01 (){
		System.out.println("생성자 호출");
	}
	
	int a;
	int b;
	String c;
}

public class _01 {
	public static void main(String[] args) {
		
		// 생성자 => 인스턴스를 생성하는 메서드. (constructor)
		// 생성자와 메서드의 공통점
		// 이름을 불러서 호출.
		// 메서드오버로딩 가능.
		
		// 차이점
		// 생성자 : 반드시 클래스 이름과 동일.
		// 생성자를 만들지 않으면 자동으로 컴파일러가 만들어 준다.
		// 생성자는 반드시 클래스 주소값을 리턴한다. (고정)
		// 생성자 오버로딩이 가능
		// 같은 이름의 생성자를(애초에 같은 class 안에 있으면 이름이 전부 같다.)
		// 여러개 만들 수 있다. 단, 메서드와 같이 타입은 달라야 한다. (개수 or 타입)
		Ex01 e = new Ex01(); // 위에서 만들어준 생성자를 통해 "생성자 호출" 출력
		e.a = 1;
		System.out.println(e.a);
		
	}
}
