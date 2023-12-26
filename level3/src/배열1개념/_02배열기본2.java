package 배열1개념;

public class _02배열기본2 {
	public static void main(String[] args) {
		
		// 배열의 길이를 모르는 경우
		int[] array = null;
		int cnt = 5;
		array = new int[cnt];
		
		// 배열의 길이를 아는 경우
		int[] arr = new int[5];
		
		// 배열의 길이와 값 모두 아는 경우
		int[] ar = {10,20,30,40,50};
		// ar[i]에 10 20 30 40 50 순서대로 들어간 것과 같은 의미
		
		System.out.println(array[3]);
		System.out.println(arr[2]);
		System.out.println(ar[4]);
		
	}
}
