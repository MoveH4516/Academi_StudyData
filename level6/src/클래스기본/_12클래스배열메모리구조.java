package 클래스기본;

class CC {
	int a;
	int b;
}

public class _12클래스배열메모리구조 {
	public static void main(String[] args) {
		
		CC[] ccList = new CC[3];
		for (int i = 0; i < ccList.length; i++) {
			ccList[i] = new CC();
			ccList[i].a = 10;
			ccList[i].b = 20;
		}
		
		CC cc = ccList[0];
		cc.a = 100;
	}
}
