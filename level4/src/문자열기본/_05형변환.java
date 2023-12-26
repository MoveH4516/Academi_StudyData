package 문자열기본;

public class _05형변환 {
	public static void main(String[] args) {
		
		// 문자열을 형변환 하는 법
		String str = "10";
		int strNum = Integer.parseInt(str); // 문자를 숫자로 변경
		String strNum2 = String.valueOf(100); // 숫자를 문자로 변경
		System.out.println(strNum + 1); // 11
		System.out.println(strNum2 + 1); // 1001
		
		
		
	}
}
