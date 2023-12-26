package 기타문법;

public class _04dowhile {
	public static void main(String[] args) {
		
		/*
		 do - while
		 무조건 한 번은 실행하는 while 문
		 조건과 상관 없이 무조건 한 번은 실행이 된다.
		 
		 do{}
		 while(조건);
		 */
		int i = 5;
		do {
			System.out.println("do-while");
			i++;
		}
		while (i > 10);
		
		System.out.println(i);
	}
}
