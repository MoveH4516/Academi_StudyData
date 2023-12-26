package level4_test;

public class _문제09 {
	public static void main(String[] args) {
		
		/*
		   [문제]	
			 input 의 배열안의 값들이   array배열의 값들과 일치하고,
			  그순서도 일치하면  true , 아니면 false 출력 	
			  
			예) input1의 값들은  6,1,8  이고 array 의  
				index 5~7(6,1,8) 의 값과 순서가 일치한다.
			결과)  true	
				  	
			예) input2의 값들을 array 배열에 있는값들과 일치하지만, 
			   input2 순서가 6,3 이고, array 의 값은 3,6 으로 순서가 다르다.
			결과) false
		*/

		int array[] = {1,3,3,6,5,6,1,8,9};	
		int input1[] = {6,1,8};
		int input2[] = {6,3};
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < array.length - input1.length; i++) {
			cnt1 = 0;			
			for (int j = 0; j < input1.length; j++) {
				if (array[i + j] == input1[j]) {
					cnt1++;
				}
			}
		}
		for (int i = 0; i < array.length - input2.length; i++) {
			cnt2 = 0;
			for (int j = 0; j < input2.length; j++) {
				if (array[i + j] == input2[j]) {
					cnt2++;
			}
		}
	}
		System.out.println(cnt1 == input1.length ? true : false);
		System.out.println(cnt2 == input2.length ? true : false);
	}
}
