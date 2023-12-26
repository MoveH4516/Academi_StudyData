package 객체지향;

import java.lang.reflect.Field;

class Test3{
	private int a;
	private int b;
	private String c;
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public String getC() {
		return c;
	}

	@Override
	public String toString() {
		return "Test3 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public void printAll() {
		
	}
}

public class _10클래스정보 {
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		System.out.println(t3.getClass().getName()); // getclass() <?> 뭐가 올지 아직 모른다는 의미
		System.out.println(t3.getClass().getSimpleName());
		System.out.println(t3.getClass().getPackageName());
		
		Class<?> myClass;
		try {
			myClass = Class.forName(t3.getClass().getName());
//			for (Method method : myClass.getDeclaredFields()) {
//				System.out.println(method.getName());
//			}
			for (Field field : myClass.getDeclaredFields()) {
				System.out.println(field.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
