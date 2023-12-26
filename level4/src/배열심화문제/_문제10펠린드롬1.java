package 배열심화문제;

public class _문제10펠린드롬1 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	아래 arr 배열이 팰린드롬인지 아닌지 출력
		 	
		 	팰린드롬이란?
		 	앞에서 읽을 때와
		 	뒤에서 읽을 때 똑같은 숫자가 나오면 팰린드롬
		 */
		
		int[] arr = {1, 5, 4, 5, 3, 2, 2, 3, 5, 4, 5, 1};
		int pass = 0;
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[j]) {
				pass = 0;
			} else {
				pass = 1;
				break;
			}
			j--;
		}
		if (pass == 0) {
			System.out.println("팰린드롬 이다.");
		} else {
			System.out.println("팰린드롬이 아니다.");
		}
	}
}
