package 클래스문제;

import java.util.Scanner;

class MathGame {
	int[][] arr = {
			{1, 2, 3},
			{2, 3, 2},
			{10, 20, 1},
			{40, 20, 2}
	};
	int answerCnt = 0;
}

public class _문제06연산자게임 {
	public static void main(String[] args) {
		
	/*
	 [문제]
	 	
	 */
	MathGame e = new MathGame();
	Scanner sc = new Scanner(System.in);
	for(int i =0; i <=e.arr.length;i+=1) {
		
		int x = e.arr[i][0];
		int y = e.arr[i][1];
		int op = e.arr[i][2];
		
		int answer =0;
		if(op == 0) {
			answer = x + y;
		}else if(op == 1) {
			answer = x - y;
		}else if(op == 2) {
			answer = x * y;
		}else if(op == 3) {
			answer = x % y;
		}
		
		System.out.printf("(%d) %d ? %d = %d %n", i+1, x , y , answer);
		System.out.println("---------------");
		System.out.println("[1] + [2] - [3] * [4] % ");
		System.out.println("입력 >>");
		int input = sc.nextInt()-1;
		if(input < 0 || input > 3) {
			System.out.println("입력오류");
			continue;
		}
		System.out.printf("정답은 ==> %d " , (e.arr[i][2]+1));
		
   	if( (x+y == x*y || x-y == x%y) && input%2 == op %2 ) {
			input = op;
		}
		
		if(input == op) {
			System.out.println("[ 정답 ]");
			e.answerCnt+=1;
		}else {
			System.out.println("[ 오답 ]");
		}
		
		
		
		System.out.println();
	}
	System.out.println("-----------");
	System.out.println(" 총 맞춘 갯수 " + e.answerCnt);
	sc.close();
	}
}
