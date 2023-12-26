package 배열1개념;

public class _01배열기본 {
	public static void main(String[] args) {
		
		/*
		 변수 : 특정한 값을 재사용 하기 위해 메모리 공간에 해당 변수 이름을 저장
		 변수의 한계 : 값을 새롭게 저장하면 기존에 있는 데이터가 사라진다.
		 
		 그 단점을 보완하기 위한 시스템 => 배열
		 
		 배열 : 같은 종류의 데이터를 여러개 저장하기 위한 시스템.
		 */
		
		int[] array = null; // null 은 배열의 초기값 (비어있는 주소값)
		
		array = new int[5]; //정수값이 5개가 들어가는 메모리방을 생성
		System.out.println(array ); // 주소값이 생성되었고, 그 주소값이 출력
		
		System.out.println(array[0]);// array 배열의 첫 번째 방에 있는 값을 출력
		
		
		int[] arrary1 = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arrary1[i] = 10 * (i + 1);
			System.out.println("arrary1[" + i + "] = " + arrary1[i]);
			sum += arrary1[i];
		}
		System.out.println(sum);
	}	
}
