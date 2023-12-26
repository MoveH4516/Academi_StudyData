package 객체지향;

class Test02{
	private int a;
	private int b;
	public int result;
	
	public Test02() {
		a = 10;
		b = 20;
		result = a + b;
	}
	
	public Test02(int a, int b, int result) {
		super();
		this.a = a;
		this.b = b;
		this.result = result;
	}



	public int getA() { // 다른 클래스에게 값을 줄 때 사용
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
}

public class _02캡슐화2 {
	public static void main(String[] args) {
		
		Test02 t2 = new Test02();
		System.out.println(t2.result);
		
		// 간접 접근을 하도록 메서드를 만들어 준다.
		
	}
}
