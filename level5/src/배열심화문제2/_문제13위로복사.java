package 배열심화문제2;

import java.util.Arrays;

public class _문제13위로복사 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	배열의 값을 한칸씩 위로 올리고 맨 아래는 "" 으로 채운다.
		 */
		
		 String[][] arr = {

	                { "○", "○", "○","○", "○" },
	                { "▦", "▦", "▦", "▦", "▦" }, 
	                { "♬", "♬", "♬", "♬", "♬" } 
	        }; 
		
		 for (int i = 0; i < arr.length - 1; i++) {
			 arr[i] = arr[i + 1];
		 }
		 arr[arr.length - 1] = new String[arr[0].length];
		 for (int i = 0; i < arr[arr.length - 1].length; i++) {
			 arr[arr.length - 1][i] = "";
		 }
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print("[");
			 for (int j = 0; j < arr[i].length; j++) {
				 System.out.print(j == arr[i].length - 1 ? arr[i][j] : arr[i][j] + ", ");
			 }
			 System.out.println("]");
		 }
		 System.out.println(Arrays.deepToString(arr));
	}
}
