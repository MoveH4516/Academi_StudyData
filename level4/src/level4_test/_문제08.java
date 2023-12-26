package level4_test;

public class _문제08 {
	public static void main(String[] args) {
		
		/*
		[문제]
			arr1 과 arr2 각각의 값들이 모두 같은지 검사하시오.
			전부 같으면 true, 틀린 값이 하나라도 있으면 false를 출력하시오.
			단, 위치는 달라도 상관없다. 
			중복된값이 있을수있고 하나씩 만 매칭이된다.
	  => 저 말은 배열이 {1,2,3,4,5} / {2,3,1,5,4} 이렇게 한개씩 매칭한다는 소리 

	    arr1 에 1이 2개 2가 2개 3이 2개 
	    arr2 에 1이 2개 2가 2개 3이 2개
	    니깐 ture 

		[정답]
			true
	 */

	    int[] arr1 = {1, 2, 3, 1, 2, 3};
		int[] arr2 = {3, 2, 1, 2, 3, 1};
		int cnt = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr1[i] = 0;
					arr2[j] = 0;
					break;
				}
			}		
		}
		for (int k = 0; k < arr2.length; k++) {
			if (arr2[k] == 0) {
				cnt++;
			}
		}
		System.out.println(cnt == arr1.length ? true : false);		
	}
}
