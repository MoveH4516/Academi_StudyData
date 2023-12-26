package 클래스기본;

class BB {
	int a;
	int b;
}

public class _11클래스배열메모리구조 {
	public static void main(String[] args) {
		
		BB[] bb = new BB[3];
		for (int i = 0; i < bb.length; i++) {
			bb[i] = new BB();
			bb[i].a = 10;
			bb[i].b = 20;
		}
		
	}
}
