package 기초1개념1;

public class _08출력문의종류 {

	public static void main(String[] args) {
		
		//sout.println, print, printf 가 있다. print는 빈 값 허용이 되지 않음
		// printf의 경우 %d(정수) %f(실수) %c(문자 하나) %s(문자 여러개) 를 외부를 통해 값을 넣어 출력
		
		int a = 6;
		System.out.printf("사과 %d개가 있습니다.\n",a);
		System.out.printf("사과 %d개가 있습니다.\n",a + 3);
		System.out.printf("사과 %.2f개가 있습니다.\n",a / 5.0);
		System.out.printf("%s %d개가 있습니다.\n","사과",a); // %값이 여러개 있으면 순서대로 넣어준다.
		
	}

}
