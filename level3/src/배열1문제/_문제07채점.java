package 배열1문제;

public class _문제07채점 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	arr 과 answer를 각 자리별로 비교 후,
		 	값이 같으면 temp에 1을 저장하고
		 	값이 다르면 temp에 -1을 저장 후,
		 	temp 배열의 모든 값을 출력하시오.
		 */
		
		int[] arr = {10, 43, 22, 14};
		int[] answer = {10, 42, 21, 14};
		
		int[] temp = new int[4];
		
		for (int i = 0; i < 4; i++) {
			if (arr[i] == answer[i]) {
				temp[i] = 1;
			} else {
				temp[i] = -1;
			}
			System.out.printf("temp[%d] : %d\n",i ,temp[i]);
		}
		
	}
}
