package 배열1개념;

public class _03배열종류 {
	public static void main(String[] args) {
		
		// int[] 처럼 double, boolean 등등 사용 가능하다.
		int[] array = new int[3];
		double[] array2 = new double[3];
		boolean[] array3 = new boolean[3];
		
		for	(int i = 0; i < 3; i++) {
			System.out.print(array[i] + " ");			
		}
		System.out.println();
		for	(int i = 0; i < 3; i++) {
			System.out.print(array2[i] + " ");			
		}
		System.out.println();
		for	(int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " ");			
		}
		
	}
}
