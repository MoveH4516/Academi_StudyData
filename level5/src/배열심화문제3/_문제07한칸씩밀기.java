package 배열심화문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _문제07한칸씩밀기 {
	public static void main(String[] args) {
		
		/*
		[문제]
			방향을 입력받고 입력받은 방향으로 한 칸씩 민다. 밀린 숫자는 뒤로 붙는다
			방향은 북 동 남 서
			
			북 ==> 위로 한 칸씩 이동 맨 위는 맨 아래로 이동
			동 ==> 오른쪽으로 한 칸씩 이동 맨 오른쪽은 맨 왼쪽으로 이동
		 */
		Scanner sc = new Scanner(System.in);
		String[][] arr = {
				{"#", "@", "#", "@", "#"},
				{"$", "^", "$", "^", "$"},
				{"~", "!", "~", "!", "~"}
		};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		while (true) {
			System.out.print("방향 : ");
			String sel = sc.next();
			
			if (sel.equals("북")) {
				String[] temp = arr[0];
				arr[0] = new String[arr[1].length];
				for (int i = 0; i < arr.length - 1; i++) {					
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
				for (int i = 0; i < arr.length; i++) {
					System.out.println(Arrays.toString(arr[i]));
				}
			} else if (sel.equals("동")) {
				for (int i = 0; i < arr.length; i++) {
					String temp = arr[i][arr[i].length - 1];
					for (int j = arr[i].length - 1; j > 0; j--) {
						arr[i][j] = arr[i][j - 1];
					}
					arr[i][0] = temp;
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(Arrays.toString(arr[i]));
				}
			} else if (sel.equals("남")) {
				String[] temp = arr[arr.length - 1];
				arr[arr.length - 1] = new String[arr[1].length];
				for (int i = arr.length - 1; i > 0; i--) {					
					arr[i] = arr[i - 1];
				}
				arr[0] = temp;
				for (int i = 0; i < arr.length; i++) {
					System.out.println(Arrays.toString(arr[i]));
				}
			} else if (sel.equals("서")) {
				for (int i = 0; i < arr.length; i++) {
					String temp = arr[i][0];
					for (int j = 0; j < arr[i].length - 1; j++) {
						arr[i][j] = arr[i][j + 1];
					}
					arr[i][arr[i].length - 1] = temp;
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(Arrays.toString(arr[i]));
				}
			} else if (sel.equals("종료")){
				System.out.println("종료");
				break;
			} else {
				System.out.println("동 서 남 북 중에서 고르세요");
				continue;
			}
		}
		sc.close();
	}
}
