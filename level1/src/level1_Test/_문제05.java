package level1_Test;

import java.util.Scanner;

public class _문제05 {
	public static void main(String[] args) {
		/*
		[문제 5]
		
		    놀이기구 이용제한
		   1. 키를 입력받는다.
		   2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		   3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
		   4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
		     예) 부모님과 함께 오셨나요?(yes:1, no:0)
		 
		 6분22초01
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키 : ");
		int key = sc.nextInt();
		
		if (key >= 120) {
			System.out.println("놀이기구 이용 가능");
		} else if (key < 120 && key > 0) {
			System.out.print("부모님과 함께 오셨나요? : ");
			int pass = sc.nextInt();
			if (pass == 1) {
				System.out.println("부모님과 함께 왔습니다.");
				System.out.println("놀이기구 이용 가능");
			} else if (pass == 0) {
				System.out.println("부모님과 함께 오지 않았습니다.");
				System.out.println("놀이기구 이용 불가능");
			}else {
				System.out.println("0과 1 중에서 선택하세요.");
			}
		} else {
			System.out.println("키를 제대로 입력하세요.");
		}
		sc.close();
	}
}
