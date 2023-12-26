package 기초3문제;

import java.util.Scanner;

/*
[문제] 
	철수는 국어 80점, 수학 29점을 받았다.
	민수는 국어 76점, 수학 40점을 받았다. 
	두 학생의 점수 차이는 7이거나 -7이다. 

	위 식을 논리연산자로 표현하시오.
*/
public class _문제07점수차이 {
	public static void main(String[] args) {
		
		int cheolKor = 80;
		int cheolMath = 29;
		int minKor = 76;
		int minMath = 40;
		
		int cheolSum = cheolKor + cheolMath;
		int minSum = minKor + minMath;
		
		int diff = cheolSum - minSum;
		
		boolean result = diff == 7 || diff == -7;
		
		System.out.println(result);
		
		// [문제]
		// 점수가 60 이상이고, 100 이하이면 true를 출력
		
		Scanner scan = new Scanner(System.in); // 입력공장
		int score = scan.nextInt(); // 사용자가 직접 숫자를 입력
		
		boolean res = score >= 60 && score <= 100;
		System.out.println(res);
		
		scan.close(); // 입력공장 폐쇄
	}
}
