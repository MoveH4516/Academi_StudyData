package level3_test;

import java.util.Arrays;
import java.util.Scanner;

public class _문제10 {
	public static void main(String[] args) {
		
		/*
		[문제]
		 * # 미니마블
		 * 1. 플레이어는 p1과 p2 2명이다.
		 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
		 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
		 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
		 * 4. 먼저 3바퀴를 돌면 이긴다.
		 *    
		 *  [p2]1~3 입력 : 1
		 *  1 2 3 4 5 6 7 8 
		 *  0 1 0 0 0 0 0 0 
		 *  0 0 0 2 0 0 0 0 
		 *  
		 *  [p1]1~3 입력 : 3
		 *  [p1]이 p2를 잡았다!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 0 1 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 *  
		 *  걸린시간 : 28분46초34
		 */
		Scanner sc = new Scanner(System.in);
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
			
		int turn = 0;
		int index = 0;
		int idx1 = 0;	
	    int idx2 = 0;
	    int cnt1 = 0;
	    int cnt2 = 0;
		p1[idx1] = 1;	
	    p2[idx2] = 2;
		
	    while (true) {
	    	System.out.println(Arrays.toString(game));
	    	System.out.println(Arrays.toString(p1));
	    	System.out.println(Arrays.toString(p2));
	    	
	    	if (turn % 2 == 0) {
		    	System.out.printf("[p1]1~3입력 : ");		    
	    	} else {
	    		System.out.printf("[p2]1~3입력 : ");	   
	    	}
	    	index = sc.nextInt();
	    	if ((index < 1 || index > 3) && turn % 2 == 0) {
	    		System.out.println("1~3 사이를 입력하세요.");
	    		continue;
	    	}
	    	if ((index < 1 || index > 3) && turn % 2 != 0) {
	    		System.out.println("1~3 사이를 입력하세요.");
	    		continue;
	    	}
	    	p1[idx1] = 0;
	    	p2[idx2] = 0;
	    	if (turn % 2 == 0) {
	    		idx1 += index;
	    	} else {
	    		idx2 += index;
	    	}
	    	if (idx1 >= 8) {
	    		cnt1++;
	    		idx1 -= 8;
	    	} else if (idx2 >= 8) {
	    		cnt2++;
	    		idx2 -= 8;
	    	}
	    	p1[idx1] = 1;
	    	p2[idx2] = 2;
	    	if (turn % 2 == 0 && idx1 == idx2) {
	    		System.out.println("p1이 p2를 잡았다");
	    		p2[idx2] = 0;
	    		idx2 = 0;
	    		p2[idx2] = 2;
	    	} else if (turn % 2 != 0 && idx1 == idx2) {
	    		System.out.println("p2가 p1을 잡았다");
	    		p1[idx1] = 0;
	    		idx1 = 0;
	    		p1[idx1] = 1;
	    	}
	    	
	    	
	    	
	    	if (cnt1 == 3) {
	    		System.out.println("p1 승리");
	    		break;
	    	} else if (cnt2 == 3) {
	    		System.out.println("p2 승리");
	    		break;
	    	}
	    	turn++;
	    }
	    sc.close();
	}
}
