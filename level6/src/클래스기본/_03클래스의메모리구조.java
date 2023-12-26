package 클래스기본;

import java.util.Scanner;

class Sample01 {
	int a;
	int b;
}

public class _03클래스의메모리구조 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Sample01 s = new Sample01();
		
		s = new Sample01();
		s.a = sc.nextInt();
		System.out.println(s.a);
		s = new Sample01();
		System.out.println(s.a);
		sc.close();
		
	}
}
