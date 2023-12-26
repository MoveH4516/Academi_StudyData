package 클래스기본;

class AA {
	int a;
	int b;
}

public class _10클래스메모리구조 {
	public static void main(String[] args) {
		
		AA aa = new AA();
		aa.a = 10;
		aa = new AA();
		aa.b = 20;
		
	}
}
