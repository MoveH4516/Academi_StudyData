package level1_Test;

import java.util.Scanner;

public class _문제09 {
	public static void main(String[] args) {
		/*
		[문제 9]
					1. 시험점수를 입력받는다.
					2. 시험점수에 해당하는 학점을 출력한다.
					3. 아래는 점수표이다.
						91 ~ 100점		A학점
						90 ~ 81점		  B학점
						80이하			  재시험
					4. 단, 만점이거나 A학점과 B학점의 일의 자리가 7점 이상이면, +를 추가한다.
					   A학점과 B학점의 일의 자리가 3점 이하이면, -를 추가한다.
					
					예)
						100	  =>		A+
						95    =>    A
						93    =>    A-
						
						87		=>		B+
						85    =>    B
						82		=>		B-
						
						23		=>		재시험
						
						5분35초16
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		boolean pass = false;
		if (score <= 80 && score > 0) {
			System.out.println("재시험");
		} else if (score < 0 || score > 100){
			System.out.println("점수를 제대로 입력하세요.");			
		} else {
			pass = true;
		}
		boolean result1 = score % 10 >= 7 || score % 10 == 0;
		boolean result2 = score % 10 <= 3 && score % 10 != 0;
		boolean result3 = score > 90;
		if (pass && result1) {
			if (result3) {
				System.out.println("A+");
			} else {
				System.out.println("B+");
			}	
		} else if (pass && result2) {
			if (result3) {
				System.out.println("A-");
			} else {
				System.out.println("B-");
			}
		} else if (pass){
			if (result3) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
		
		
		if (score >= 91 && score <= 100) {
			if (score % 10 >= 7 || score == 100) {
				System.out.println("A+");
			} else if (score % 10 <= 3) {
				System.out.println("A-");
			} else {
				System.out.println("A");
			}
		} else if (score >= 81 && score <= 90) {
			if (score % 10 >= 7 || score == 90) {
				System.out.println("B+");
			} else if (score % 10 <= 3) {
				System.out.println("B-");
			} else {
				System.out.println("B");
			}
		} else if (score <= 80 && score > 0) {
			System.out.println("재시험");
		} else if (score < 0 || score > 100){
			System.out.println("점수를 제대로 입력하세요.");
		}
		sc.close();
	}
}
