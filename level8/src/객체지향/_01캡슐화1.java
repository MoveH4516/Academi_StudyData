package 객체지향;

class Test01{
	private int a; // main 에서 사용할 수 없다. Test01 클래스 안에서만 사용 가능.
	int b; // 접근 제어자를 표시하는 것이 좋다.
	
	void print() {
		System.out.println(a + " " + b);
	}
}

public class _01캡슐화1 {
	public static void main(String[] args) {
		
		// 접근제어자
		// public default protected private 
		// public : 프로젝트 안에서 어디든 접근 가능
		// 자바 클래스 안에 public 은 단 하나만 가능하다. 2개 이상 못해줌.
		// default : 아무것도 안붙인 class 같은 것이 default 클래스 같은 패키지 안에서만 접근가능
		// protected : 부모 자식 간에만 접근 가능. 
		// private : 본인 클래스 에서만 접근 가능.
		
		Test01 t = new Test01();
		t.print(); // a 를 main 에서 사용할 수 없지만 메서드를 활용해 간접적으로 사용 가능하다.
		
	}
}
