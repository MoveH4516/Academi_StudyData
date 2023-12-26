package 배열1개념;

public class _06인덱스연습 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] b = {1, 4, 0};
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(arr[b[i]]);
		}
		
	}
}
