package 객체지향;

import java.util.Calendar;

class Test06{
	private int num = 100;
	private static Test06 instance = new Test06();
	
	public static Test06 getInstance() {
		return instance;
	}
	
	private Test06() {}
	
	public int getNum() {
		return num;
	}
	
}

public class _11싱글톤객체 {
	public static void main(String[] args) {
		
		// 싱글톤 패턴
		// 해당 클래스의 인스턴스를 단 한 번만 생성하게 만드는 것.
		
		// 1. 생성자를 private 으로 만든다. -> 외부 클래스에서 사용 불가
		// 2. 내부에서 객체를 한 개 만든다. (static 으로)
		// -> 해당 클래스 객체를 공유할 수 있다.
		// 3. instance 객체를 캡슐화 한다.
		Test06 t3 = Test06.getInstance();
		System.out.println(t3.getNum());
		
		
		Calendar caledar = Calendar.getInstance();
		System.out.println(caledar);
		
	}
}
