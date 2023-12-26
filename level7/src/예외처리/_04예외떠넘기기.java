package 예외처리;

class Ex01 {
	int sample1(int num, int divider) {
		// 발생하는 에러를 직접 처리할 때
		int result = 0;
		try {
			result = num / divider;
			System.out.printf("%d / %d = ", num, divider);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없다.");
		}
		return result;
	}
	int sample2(int num, int divider) throws Exception {
		int result = 0;
		result = num / divider;
		return result;
	}
}

public class _04예외떠넘기기 {
	public static void main(String[] args) {
		
		Ex01 ex = new Ex01();
		System.out.println(ex.sample1(3, 2));
		
		try {
			int result = ex.sample2(3, 1);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없다.");
		}
		
	}
}
