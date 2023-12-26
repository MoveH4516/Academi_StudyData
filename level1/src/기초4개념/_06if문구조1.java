package 기초4개념;

public class _06if문구조1 {
	public static void main(String[] args) {
		
		System.out.println("1.과자 2.음료수 3.라면");
		int select = 2;
		if (select == 1) {
			System.out.println("과자");
		}
		else if (select == 2) {
			System.out.println("음료수");
		}
		else if (select == 3) {
			System.out.println("라면");
		}else {
			System.out.println("오류");
		}
		// if로 여러개를 쓰다가 마지막에 else를 사용하면 마지막 if에만 else가 사용된다.
		// 따라서 if와 else if를 활용하여 마지막 else를 모든 if에 적용이 되도록
		// 해주어야 한다.
	}
}
