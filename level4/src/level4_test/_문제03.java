package level4_test;

import java.util.Arrays;

public class _문제03 {
	public static void main(String[] args) {
		
		/*
		[문제] 
			아래 데이터에서 꼴등을 삭제 후 다시 문자열로 변경하시오.
				1) 문자열을 잘라서 배열에 저장한다.
				2) 배열에서 꼴등을 삭제한다.
				3) 삭제한배열을 다시 문자열로 만든다.
		[정답]
			str = "김철수/87,이영희/95";
		
		7분53초94
		 */

		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] arr1 = str.split(",");
		System.out.println(Arrays.toString(arr1));
		
		int min = Integer.parseInt(arr1[0].substring(4));
		int idx = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (min > Integer.parseInt(arr1[i].substring(4))) {
				min = Integer.parseInt(arr1[i].substring(4));
				idx = i;
			}			
		}
		arr1[idx] = "0";
		System.out.println(Arrays.toString(arr1));
		str = "";
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != "0") {
				str += arr1[i] + " ";
			}
		}
		System.out.println(str);
	}
}
