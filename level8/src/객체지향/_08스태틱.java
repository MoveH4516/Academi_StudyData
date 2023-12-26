package 객체지향;

//class Test01{
//	public int a; // 인스턴스 변수
//	static public int b; // 클래스 변수
//}

public class _08스태틱 {
	public static void main(String[] args) {
		
		// 메모리 공간
		// heap stack static
		
		// heap : new 한 모든 것. 갈비지콜렉터(GC)가 쓰레기 값을 자동으로 삭제한다.
		// 사용자가 원할 때 생성하고, 원할 때 삭제할 수 있다.
		
		// stack : 메서드의 메모리방 : 호출한 순서로 스택 알고리즘을 사용해 메모리에 저장.
		// => 맨 처음에 호출한 것이 맨 마지막에 사라진다. (main 함수)
		
		// static : 프로그램이 시작되자 마자 실행되고, 프로그램이 종료되면 삭제된다.
		// => 가장 오래 남아있는 메모리 공간.
		// 같은 인스턴스 변수(객체)는 static 자원을 공유한다.
		
		// 지역변수 : 클래스 안 메서드 안에서 생성된 변수
		// 멤버변수 - 인스턴스변수 (non-static Variable) new 할 때마다 메모리 방에 생성되는 변수.
		// 클래스변수 (static Variable) 프로그램이 시작될 때 미리 생성되는 변수.
		// 인스턴스 객체들이 이 값을 공유한다.

		//Test01 t1 = new Test01();
		//t1.a = 10; // 인스턴스 변수는는 new 를 한 다음 사용된다.
		//Test01.b = 5; // 클래스 변수는 클래스 이름을 통해 바로 사용 가능하다.
		
	}
}
