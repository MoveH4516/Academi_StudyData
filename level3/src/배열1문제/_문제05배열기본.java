package 배열1문제;

public class _문제05배열기본 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	array 의 값을 temp1 에 복사한 후, 모든 값을 출력
		 [문제2]
		 	array 값의 2배를 temp2에 복사한 후, 모든 값을 출력
		 */
		
		int[] array = {10, 20, 30, 40, 50};
		int[] temp1 = new int[5];
		int[] temp2 = new int[5];
		
		for (int i = 0; i < 5; i++) {
			temp1[i] = array[i];
			System.out.print(i + " : " + temp1[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			temp2[i] = array[i] * 2;
			System.out.print(i + " : " + temp2[i] + "  ");
		}
	}
}
