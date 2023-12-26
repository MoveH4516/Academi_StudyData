package 예외처리;

public class _03 {
	public static void main(String[] args) {
		
		// throw new Exception();
		// catch 에 던져주는 역할 예외를 던진다고 생각하면 됨.
		// 인위적으로 예외를 발동시킴.
		
		int[] arr = new int[5];
		int idx = 9;
		
		try {
			if (idx < 0 || idx >= arr.length) {
				throw new Exception("인덱스 값이 이게 뭡니까?");
			}
			System.out.println(arr[idx]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("프로그램 종료");
		}
		
	}
}
